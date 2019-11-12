import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'
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
    login1 (state, payload) {
      localStorage.set('accessToken', payload)
      state.accessToken = payload
    },
    logout (state) {
      localStorage.removeItem('accessToken')
      state.accessToken = null
    }
  },
  actions: {
    login ({dispatch}, loginObj) {
      console.log(loginObj)
      axios.post('user/login', loginObj).then(res => {})
    }
  }
})
