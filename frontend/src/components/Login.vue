<template>
  <div>
    <b-container fluid>
      <b-row class="my-1">
        <b-col sm="2">
          <label for="input-default">아이디:</label>
        </b-col>
        <b-col sm="10">
          <b-form-input
          placeholder="아이디를 입력하세요"
          v-model="id"
          ></b-form-input>
        </b-col>
      </b-row>
      <b-row class="my-1">
        <b-col sm="2">
          <label for="input-default">비밀번호:</label>
        </b-col>
        <b-col sm="10">
          <b-form-input
           type="password"
           placeholder="비밀번호를 입력하세요"
           v-model="password"
           ></b-form-input>
        </b-col>
      </b-row>
      <b-button-group>
      <b-button @click="login">로그인</b-button>
      <b-button to="register">회원가입</b-button>
      <b-button>아이디 찾기</b-button>
      <b-button>비밀번호 찾기</b-button>
    </b-button-group>
    </b-container>
  </div>

</template>
<script>
export default {
  data () {
    return {
      id: null,
      password: null
    }
  },
  computed: {
  },
  methods: {
    login () {
      console.log(this.id, this.password)
    }
  }
}
</script>
