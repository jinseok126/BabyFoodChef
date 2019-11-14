import Vue from 'vue'
import Router from 'vue-router'
import store from '../store'
import Register from '@/components/Register'
import Login from '@/components/Login'
import MyPage from '@/components/MyPage'

Vue.use(Router)

const rejectAuthUser = (to, from, next) => {
  if (store.state.isLogin === true) {
    alert('이미 로그인하였습니다.')
    next('/')
  } else {
    next()
  }
}
const onlyAuthUser = (to, from, next) => {
  if (store.state.isLogin === false) {
    alert('로그인이 필요합니다.')
    next('/')
  } else {
    next()
  }
}

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/register',
      name: 'Register',
      beforeEnter: rejectAuthUser,
      component: Register
    },
    {
      path: '/login',
      name: 'Login',
      beforeEnter: rejectAuthUser,
      component: Login
    },
    {
      path: '/myPage',
      name: 'MyPage',
      beforeEnter: onlyAuthUser,
      component: MyPage
    }
  ]
})
