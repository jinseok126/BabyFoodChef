import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
import jwtDecode from 'jwt-decode'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    userInfo: null,
    isLogin: false,
    isLoginError: false
  },
  mutations: {
    loginSuccess (state, payload) {
      state.isLogin = true
      state.isLoginError = false
      state.userInfo = payload
    },
    loginError (state) {
      state.isLogin = false
      state.isLoginError = true
    },
    logout (state) {
      state.isLogin = false
      state.isLoginError = false
      state.userInfo = null
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
        }
      })
    },
    getMemberInfo ({ commit }) {
      let token = localStorage.getItem('accessToken')
      if (token !== null) {
        let decodeToken = jwtDecode(token)
        axios
          .get('member/findById/' + decodeToken.sub)
          .then(response => {
            let userInfo = {
              nickName: response.headers.nickname
            }
            commit('loginSuccess', userInfo)
          })
      }
    }
  }
})
