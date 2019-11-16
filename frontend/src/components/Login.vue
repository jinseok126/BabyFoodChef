<template>
  <div>
    <b-alert
    variant="danger"
    style="width: 40rem"
    :show='isLoginError'
    >
    아이디와 비밀번호를 확인하세요.
    </b-alert>
    <b-card
    title="LOGIN"
    style="max-width: 40rem;"
    class="mb-2"
    >
    <b-card-text>
      <b-row class="my-1">
        <b-col sm="2">
          <label>아이디:</label>
        </b-col>
        <b-col sm="10">
          <b-form-input v-model="id" size="sm" placeholder="아이디를 입력해주세요."></b-form-input>
        </b-col>
        <b-col sm="2">
          <label>비밀번호:</label>
        </b-col>
        <b-col sm="10">
          <b-form-input type="password" v-model="password" size="sm" placeholder="비밀번호를 입력해주세요."></b-form-input>
        </b-col>
      </b-row>
      <b-button @click="login({id, password})">LOGIN</b-button>
      <b-button>회원가입</b-button>
      <b-button>아이디찾기</b-button>
      <b-button>비밀번호 찾기</b-button>
    </b-card-text>
  </b-card>
  </div>
</template>
<script>
import { mapActions, mapState } from 'vuex'

export default {
  data () {
    return {
      id: '',
      password: ''
    }
  },
  computed: {
    ...mapState(['isLoginError'])
  },
  methods: {
    ...mapActions(['login'])
  }
}
</script>
