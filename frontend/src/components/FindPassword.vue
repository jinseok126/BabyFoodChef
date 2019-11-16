<template>
  <div>
    <b-alert
    variant="danger"
    style="width: 40rem"
    :show='isNotFound'
    >
    아이디와 이메일를 확인해주세요.
    </b-alert>
    <b-card
    title="비밀번호 찾기"
    style="max-width: 40rem;"
    class="mb-2"
    >
    <b-card-text>
      <b-row class="my-1">
        <b-col sm="2">
          <b-col sm="2">
            <label>아이디:</label>
          </b-col>
          <b-col sm="10">
            <b-form-input v-model="User.id" size="sm" placeholder="아이디를 입력해주세요."></b-form-input>
          </b-col>
          <label>이메일:</label>
        </b-col>
        <b-col sm="10">
          <b-form-input type="email" v-model="User.email" size="sm" placeholder="이메일을 입력해주세요."></b-form-input>
        </b-col>
      </b-row>
      <b-button @click="findByEmail(email)">아이디 찾기</b-button>
    </b-card-text>
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
        email: ''
      }
      isNotFound: false,
      isIdFound: false
    }
  },
  methods: {
    findByEmail (email) {
      axios.get('member/findByEmail/' + email).then((res) => {
        if (res.data === '') {
          this.isEmailNotFound = true
        } else {
          this.id = res.data
        }
      })
    }
  }
}
</script>
<style>
</style>
