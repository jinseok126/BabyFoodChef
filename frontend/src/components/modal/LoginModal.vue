<template>
<transition name="modal">
  <div class="modal-mask">
    <div class="modal-wrapper">
      <div class="modal-container">
        <div class="modal-default-button">
          <a @click="$emit('close')">닫기</a>
        </div>
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
                      <input type="text" id="uid" placeholder="아이디" size="35" v-model="id" />
                    </p>
                    <p>
                      <label for="pwd">비밀번호</label>
                      <input type="password" id="pwd" placeholder="비밀번호" size="35" v-model="password" />
                    </p>
                  </div>
                  <p class="loginError_msg" v-show="isLoginError">아이디와 비밀번호를 확인하세요.</p>
                  <button type="button" @click="login({id, password})">로그인</button>
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
                  <button type="button" @click="moveRegister">회원가입</button>
                </div>
              </fieldset>
            </form>
          </div>
        </div>
        <div class="copyright">
          <p>Copyright ⓒ 이유식요리사</p>
        </div>
      </div>
    </div>
  </div>
</transition>
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
    ...mapActions(['login']),
    moveRegister () {
      this.$emit('close')
      this.$router.push({
        path: '/register'
      })
    }
  }
}
</script>

<style scoped>
.modal-mask {
  position: fixed;
  z-index: 9998;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, .5);
  /*모달 뒷배경 검게*/
  display: table;
  transition: opacity .3s ease;
}

.modal-wrapper {
  display: table-cell;
  vertical-align: middle;
}

.modal-container {
  width: 700px;
  margin: 0 auto;
  background: #fff;
  padding: 20px 30px;
  border-radius: 2px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, .33);
  transition: all .3s ease;
  font-family: Helvetica, Arial, sans-serif;
}

#header {
  border-bottom: 1px solid #eee;
  margin-bottom: 50px;
  height: 130px
}

#header h1 {
  width: 270px;
  height: 70px;
  margin: 0 auto;
  text-indent: -9999px;
  background: url('/static/images/logo.jpg') no-repeat center;
  padding: 40px
}

#header h1 a {
  height: 100%;
  display: block;
}

/*main*/
#main {
  width: 700px;
  margin: 0 auto;
  border-bottom: 1px solid #eee;
  margin-bottom: 5px
}

.form_wrap {
  width: 370px;
  margin: 0 auto
}

#main legend {
  position: absolute;
  left: -9999px;
  top: -9999px
}

.loginError_msg{
  color:red;
  font-size:14px;
  margin-bottom:10px
}

/*.form_wrap{width:1200px;margin:0 auto}*/
.login .login_wrap {
  ;
  margin-bottom: 5px;
  margin-right: 10px
}

.login label {
  position: absolute;
  left: -9999px;
  top: -9999px
}

.login input {
  border: 1px solid #aeaeae;
  font-size: 16px;
  font-family: 'Noto Sans KR Regular', sans-serif;
  padding: 10px;
  margin-bottom: 10px
}

.login button {
  background: #85b729;
  color: #fff;
  width: 357px;
  height: 50px;
  font-size: 16px;
  font-family: 'Noto Sans KR Regular', sans-serif;
  margin-bottom: 10px;
}

.login button:hover {
  background: #6c9f0d
}

.uid_save {
  ;
  font-size: 16px;
  float: left;
  margin-right: 140px;
  margin-bottom: 20px
}

.uid_save label {
  font-family: 'Noto Sans KR Regular', sans-serif
}

.find_id {
  font-size: 15px;
  float: left;
  font-family: 'Noto Sans KR Regular', sans-serif;
  margin-bottom: 15px
}

.find_id a:hover {
  color: #85b729
}

.join {
  clear: both
}

.join p {
  font-size: 14px;
  color: #939393;
  margin-bottom: 5px
}

.join button {
  width: 130px;
  height: 45px;
  background: #ffa200;
  color: #fff;
  font-family: 'Noto Sans KR Regular', sans-serif;
  font-size: 16px;
  margin-bottom: 50px;
}

.join button:hover {
  background: #ef8700;
}

.copyright {
  font-size: 13px;
  color: #585858;
  text-align: center;
  margin-right: 10px
}

.modal-default-button {
  float: right;
}

/*
 * 애니메이션
 */
.modal-enter {
  opacity: 0;
}

.modal-leave-active {
  opacity: 0;
}

.modal-enter .modal-container,
.modal-leave-active .modal-container {
  -webkit-transform: scale(1.1);
  transform: scale(1.1);
}

.modal-default-button {
  width: 25px;
  height: 25px;
  text-indent: -9999px;
  background: url('/static/images/close_icon.jpg') no-repeat
}

.modal-default-button a {
  display: block;
  height: 100%;
  cursor: pointer;
}
</style>
