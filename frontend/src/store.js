import Vue from 'vue'
import Vuex from 'vuex'
// import jwtDecode from 'jwt-decode'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    // accessToken: localStorage.get('accessToken')
  },
  getter: {
    getToken (state) {
      return state.accessToken
    }
  },
  mutations: {
    login (state, payload) {
      localStorage.set('accessToken', payload)
      state.accessToken = payload
    },
    logout (state) {
      localStorage.removeItem('accessToken')
      state.accessToken = null
    }
  },
  actions: {
    login (payload) {
      this.$http.post('user/login', payload).then(() => {})
    }
  }
})
