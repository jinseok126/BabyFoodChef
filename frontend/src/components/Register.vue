<template>
  <div class="form">
    <b-card bg-variant="light">
      <b-form-group
      label-cols-lg="4"
      label="회원 가입"
      label-size="lg"
      label-class="font-weight-bold pt-5"
      class="mb-0"
      >
     <b-form-group
       label-cols-sm="3"
       label="아이디:"
       label-align-sm="right"
       label-for="id"
     >
       <b-form-input id="id" v-model="User.id"></b-form-input>
     </b-form-group>

     <b-form-group
       label-cols-sm="3"
       label="비밀번호:"
       label-align-sm="right"
       label-for="password"
     >
       <b-form-input id="password" v-model="User.password" type="password"></b-form-input>
       {{msg1}}
     </b-form-group>

     <b-form-group
       label-cols-sm="3"
       label="비밀번호 확인:"
       label-align-sm="right"
       label-for="password2"
     >
       <b-form-input id="password2" v-model="password2" type="password"></b-form-input>
       {{msg2}}
     </b-form-group>

     <b-form-group
       label-cols-sm="3"
       label="닉네임:"
       label-align-sm="right"
       label-for="nickName"
     >
       <b-form-input id="nickName" v-model="User.nickName"></b-form-input>
     </b-form-group>

     <b-form-group
       label-cols-sm="3"
       label="이메일:"
       label-align-sm="right" class="mb-0"
     >
     <b-form-input id="email" v-model="User.email" type="email"></b-form-input>
     </b-form-group>
     <b-button class="button" @click="userRegister" variant="info">회원 가입</b-button>
   </b-form-group>
  </b-card>
  </div>
</template>
<script>
import axios from 'axios'
export default {
  data () {
    return {
      User: {
        id: '',
        password: '',
        nickName: '',
        email: ''
      },
      password2: ''
    }
  },
  methods: {
    userRegister () {
      let check = false
      if (this.User.password.length >= 6) {
        if (this.User.password === this.password2) {
          check = true
        }
      }
      if (check) {
        console.log(this.User)
        axios.post('member/register', this.User).then(() => {
          this.$router.push('/', () => {})
        })
      } else {
        alert('실패')
      }
    }
  },
  computed: {
    msg1 () {
      if (this.User.password === '') {
        return ''
      } else if (this.User.password.length < 6) {
        return '6글자 이상 입력하세요.'
      } else {
        return ''
      }
    },
    msg2 () {
      if (this.password2 === '') {
        return ''
      } else if (this.password2.length < 6) {
        return '6글자 이상 입력하세요.'
      } else if (this.password2 !== this.User.password) {
        return '비밀번호가 일치하지 않습니다'
      } else {
        return '비밀번호와 일치합니다.'
      }
    }
  }
}
</script>
<style scoped>
.form {
  border: 1px solid black;
  margin-top: 50px;
  margin-bottom: 50px;
  margin-right: 150px;
  margin-left: 150px;
}
.button {
  margin-top: 20px;
  margin-left: 180px;
}
</style>
