<template>
  <div class="hello">
    <h1 v-for="user in users" :key="user.id">{{user.name}} : {{user.phoneNumber}}</h1>
    <h2>데헷</h2>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      users: []
    }
  },
  created () {
    this.$http.get('/users').then((resp) => {
      console.log(resp)
      this.users = resp.data.response
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
