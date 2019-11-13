import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
// import jwtDecode from 'jwt-decode'

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
    login ({dispatch}, loginObj) {
      axios.post('member/login', loginObj).then(res => {
        let token = res.headers.authorization
        console.log(token)
        if (token == null) {
          console.log('로그인실패')
        } else {
          localStorage.setItem('accessToken', token)
        }
      })
    }
  }
})
