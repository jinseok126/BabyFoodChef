import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
import jwtDecode from 'jwt-decode'
import router from './router'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    memberInfo: null,
    isLogin: false,
    isLoginError: false,
    isTrustToken: false
  },
  mutations: {
    loginSuccess (state, payload) {
      state.isLogin = true
      state.isLoginError = false
      state.memberInfo = payload
    },
    loginError (state) {
      state.isLogin = false
      state.isLoginError = true
    },
    logout (state) {
      state.isLogin = false
      state.isLoginError = false
      state.memberInfo = null
    }
  },
  actions: {
    login ({dispatch, commit}, loginObj) {
      axios.post('member/login', loginObj).then(res => {
        let token = res.headers.token
        if (token === null) {
          commit('loginError')
        } else {
          localStorage.setItem('accessToken', token)
          dispatch('getMemberInfo')
          router.push({
            path: '/'
          })
        }
      })
    },
    getMemberInfo ({ dispatch, state, commit }) {
      let token = localStorage.getItem('accessToken')
      if (token !== null) {
        let decodeToken = jwtDecode(token)
        axios
          .get('member/findById/' + decodeToken.sub)
          .then(response => {
            let memberInfo = {
              id: decodeToken.sub,
              nickName: response.headers.nickname
            }
            commit('loginSuccess', memberInfo)
          })
        axios.defaults.headers.common['Authorization'] = token
        axios.defaults.headers.common['MemberId'] = decodeToken.sub
        dispatch('checkToken')
      }
    },
    logout ({ commit }) {
      localStorage.removeItem('accessToken')
      commit('logout')
      // 메인에서 메인으로 갈 때
      router.push('/', () => {})
    },
    checkToken ({ dispatch }) {
      axios.get('member/validateToken').then((result) => {
        if (result.headers.tokenvalid === 'expired') {
          dispatch('logout')
        }
      })
    }
  }
})
