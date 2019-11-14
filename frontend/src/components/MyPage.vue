<template>
  <b-button>보내기</b-button>
</template>
<script>
// import { mapState } from 'vuex'

export default {
  data () {
    return {
      token: localStorage.getItem('accessToken')
    }
  },
  methods: {
  }
}
</script>
