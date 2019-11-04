<template>
  <div class="form">
    <h1>회원 가입</h1>
    <b-form>
      <b-form-group id="id" label="아이디:" label-for="input-1">
        <b-form-input
          id="input-1"
          v-model="User.id"
          required
          placeholder=""
        ></b-form-input>
      </b-form-group>

      <b-form-group id="password" label="비밀번호:" label-for="input-2">
        <b-form-input
          id="input-2"
          v-model="User.password"
          type="password"
          required
          placeholder=""
        ></b-form-input>
        {{msg1}}
      </b-form-group>
       <b-form-group id="password" label="비밀번호 확인:" label-for="input-3">
       <b-form-input
         id="input-3"
         type="password"
         v-model="password2"
         required
         placeholder=""
       ></b-form-input>
       {{msg2}}
       </b-form-group>

      <b-form-group id="nickName" label="닉네임:" label-for="input-4">
        <b-form-input
          id="input-4"
          v-model="User.nickName"
          required
          placeholder=""
        ></b-form-input>
      </b-form-group>

      <b-form-group id="email" label="이메일:" label-for="input-5">
        <b-form-input
        id="input-5"
        v-model="User.email"
        type="email"
        required
        placeholder=""
        ></b-form-input>
      </b-form-group>

      <b-button @click="signUp" variant="info">회원 가입</b-button>
    </b-form>
  </div>
</template>
<script>
export default {
  data () {
    return {
      User: {
        id: '',
        password: '',
        nickName: '',
        email: ''
      },
      password2: '',
      check: false
    }
  },
  methods: {
    signUp () {
      let check = false
      if (this.User.password.length >= 6) {
        if (this.User.password === this.password2) {
          check = true
        }
      }
      if (check) {
        console.log(this.User)
        this.$http.post('user/signUp', this.User).then()
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
</style>
