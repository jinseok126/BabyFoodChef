<template>
  <!--<div>
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
</div>-->
  <div id="wrap">
        <div class="container">
            <div id="header">
                <h1><a href="#">이유식 요리사</a></h1>
            </div>
            <div id="main">
                <div class="form_wrap">
                    <form action="" name="login_form">
                        <fieldset>
                            <legend>로그인</legend>
                            <div class="login">
                                <div class="login_wrap">
                                    <p>
                                        <label for="uid">아이디</label>
                                        <input type="text" id="uid" placeholder="아이디" size="30" />
                                    </p>
                                    <p>
                                        <label for="pwd">비밀번호</label>
                                        <input type="password" id="pwd" placeholder="비밀번호" size="30" />
                                    </p>
                                </div>
                                <button type="">로그인</button>
                            </div>
                            <p class="uid_save">
                                <input type="checkbox" id="uid_save" />
                                <label for="uid_save">아이디 저장</label>
                            </p>
                            <p class="find_id">
                                <a href="#">아이디/비밀번호 찾기</a>
                            </p>
                            <div class="join">
                                <p>회원이 아니신가요? 지금 가입하시고 이유의 다양한 서비스를 이용해보세요!</p>
                                <button type="">회원가입</button>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
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
<style>
body{background:#eee;min-height:100%}
/*wrap*/
#wrap{width:700px;margin:0 auto;background:#fff;min-height:100%}
/*header*/
#header h1{width:600px;height:70px;text-indent:-9999px;background:url('/static/images/logo.jpg') no-repeat center;padding:40px}
#header h1 a{height:100%;display:block}

/*main*/
#main{width:400px;margin:0 auto;}
#main legend{position:absolute;left:-9999px;top:-9999px}
/*.form_wrap{width:1200px;margin:0 auto}*/
.login .login_wrap{;margin-bottom:5px;margin-right:10px}
.login label{position:absolute;left:-9999px;top:-9999px}
.login input{border:1px solid #aeaeae;font-size:18px;font-family:'Noto Sans KR Regular',sans-serif;padding:10px;margin-bottom:10px}
.login button{background:#85b729;color:#fff;width:355px;height:50px;font-size:18px;font-family:'Noto Sans KR Regular',sans-serif;margin-bottom:10px}
.login button:hover{background:#6c9f0d}
.uid_save{;font-size:16px;float:left;margin-right:140px;margin-bottom:10px}
.uid_save label{font-family:'Noto Sans KR Regular',sans-serif}
.find_id{font-size:15px;float:left;font-family:'Noto Sans KR Regular',sans-serif;margin-bottom:15px}
.find_id a:hover{color:#85b729}
.join{clear:both}
.join p{font-size:14px;color:#939393;margin-bottom:5px}
.join button{width:150px;height:50px;background:#ffa200;color:#fff;font-family:'Noto Sans KR Regular',sans-serif;font-size:16px}
.join button:hover{background:#ef8700}
</style>
