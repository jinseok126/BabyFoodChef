<template>
  <div>
    <h1>{{ memberInfo.nickName }}님 환영합니다람쥐며느리</h1>
  </div>
</template>

<script>
import { mapState } from 'vuex'

export default {
  data () {
    return {
    }
  },
  computed: {
    ...mapState(['memberInfo'])
  }
}
</script>
