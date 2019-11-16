<template>
  <div>
    <b-alert
    variant="danger"
    style="width: 40rem"
    :show='isEmailNotFound'
    >
    해당하는 이메일 주소가 없습니다!
    </b-alert>
    <b-card
    title="아이디 찾기"
    style="max-width: 40rem;"
    class="mb-2"
    >
    <b-card-text>
      <b-row class="my-1">
        <b-col sm="2">
          <label>이메일:</label>
        </b-col>
        <b-col sm="10">
          <b-form-input type="email" v-model="email" size="sm" placeholder="이메일을 입력해주세요."></b-form-input>
        </b-col>
        <b-col sm="2">
          <label>{{ id }}</label>
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
      email: '',
      id: '',
      isEmailNotFound: false,
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
