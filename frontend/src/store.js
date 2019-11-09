import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    userInfo: null,
    isLogin: false,
    isLoginError: false
  },
  mutations: {
    // 로그인이 성공했을 때
    loginSuccess (state, payload) {
      state.isLogin = true
      state.isLoginError = false
      state.userInfo = payload
    },
    // 로그인이 실패했을 때
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
  /* eslint-disable*/
  actions: {
    login ({ dispatch }, loginObj) {
      axios // 로그인 -> 토큰 반환
      .post("https://reqres.in/api/login", loginObj)
      .then(res => { // function으로 하면 메소드 내부를 가리키기 때문에 에로우 펑션으로 전체 인스턴스를 가리켜야한다.
      // 성공시 토큰 반환, 헤더에 토큰을 포함시켜서 유저정보 요청
        let token = res.data.token
        // 토큰을 로컬 스토리지에 저장
        localStorage.setItem("access-token", token)
        dispatch("getMemberInfo")
        .catch(() => {
          alert("이메일과 비밀번호를 확인하세요.")
        })
      })
      .catch(() => {
        alert("이메일과 비밀번호를 확인하세요.")
      })
        // .then(() => {
        //   // 항상 반환
        // })
    },
    logout({commit}) {
      localStorage.removeItem("access-token")
      commit('logout')
      router.push({ name : "home" })
    },
    getMemberInfo({ commit }) {
      // 로컬스토리지의 토큰을 불러옴
      let token = localStorage.getItem("access-token")
      if( token !== null){
        let config = { // 헤더값 설정해주는 개게
          headers: {
            "access-token": token
          }
        }
        //토큰으로 멤버 정보를 반환
        //새로고침 -> 토큰만 가지고 멤버정보를 요청
        axios
        .get("https://reqres.in/api/users/2", config)
        .then(response => {
          let userInfo = {
            id: response.data.data.id,
            first_name: response.data.data.first_name,
            last_name: response.data.data.last_name,
            avatar: response.data.data.avatar
          }
          commit("loginSuccess", userInfo) //response.data.data를 직접 넣어줘도 무방
        })
      }
    }
  },
  modules: {
  }
})
