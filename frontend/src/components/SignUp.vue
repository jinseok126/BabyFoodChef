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
      </b-form-group>
       <b-form-group id="password" label="비밀번호 확인:" label-for="input-3">
       <b-form-input
         id="input-3"
         type="password"
         v-model="password2"
         required
         placeholder=""
       ></b-form-input>
       <h7 v-if="User.password===''"></h7>
       <h7 v-else-if="User.password===password2">비밀번호 일치</h7>
       <h7 v-else>비밀번호가 일치하지 않습니다.</h7>
       </b-form-group>

      <b-form-group id="nickname" label="닉네임:" label-for="input-4">
        <b-form-input
          id="input-4"
          v-model="User.nickname"
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

      <b-button @click="onSubmit" variant="primary">Submit</b-button>
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
        nickname: '',
        email: ''
      },
      password2: ''
    }
  },
  methods: {
    onSubmit () {
      console.log(this.User)
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
