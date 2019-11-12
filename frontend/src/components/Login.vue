<template>
  <b-container fluid>
    <b-row class="my-1">
      <b-col sm="2">
        <label for="input-small">아이디:</label>
      </b-col>
      <b-col sm="10">
        <b-form-input v-model="id" size="sm" placeholder="아이디를 입력해주세요."></b-form-input>
      </b-col>
      <b-col sm="2">
        <label for="input-small">비밀번호:</label>
      </b-col>
      <b-col sm="10">
        <b-form-input v-model="password" size="sm" placeholder="비밀번호를 입력해주세요."></b-form-input>
      </b-col>
    </b-row>
  </b-container>
</template>
<script>
export default {
  data () {
    return {
      id: '',
      password: ''
    }
  },
  methods: {
  }
}
</script>
