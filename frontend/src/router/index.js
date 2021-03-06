import Vue from 'vue'
import Router from 'vue-router'
import store from '../store'
import Register from '@/components/Register'
import MyPage from '@/components/MyPage'
import Main from '@/components/Main'
import FindId from '@/components/FindId'
import FreeBoard from '@/components/FreeBoard'
import CreateWriting from '@/components/CreateWriting'

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
      path: '/',
      name: 'Main',
      component: Main
    },
    {
      path: '/register',
      name: 'Register',
      beforeEnter: rejectAuthUser,
      component: Register
    },
    {
      path: '/myPage',
      name: 'MyPage',
      beforeEnter: onlyAuthUser,
      component: MyPage
    },
    {
      path: '/findId',
      name: 'FindId',
      beforeEnter: rejectAuthUser,
      component: FindId
    },
    {
      path: '/board/free',
      name: 'FreeBoard',
      component: FreeBoard
    },
    {
      path: '/board/free/create',
      name: 'CreateWriting',
      component: CreateWriting
    }
  ]
})
