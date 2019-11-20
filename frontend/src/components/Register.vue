<template>
<div id="main">
    <form action="" name="join_form" method="post">
        <fieldset>
            <legend class="sign_up_title">회원가입</legend>
            <p class="sign_up_sub_title">이유식 요리사를 100% 즐기는 방법, 가입을 환영합니다!</p>
            <div class="form_wrap">
                <p class="uid">
                    <label for="uid" v-show="User.id == ''">아이디</label>
                    <input type="text" name="uid" id="uid" size="20" v-model="User.id"/>
                    <button type="">중복확인</button>
                </p>
                <div class="pwd_wrap">
                    <p class="pwd">
                        <label for="pwd" v-show="User.password == ''">비밀번호</label>
                        <input type="password" name="pwd" id="pwd" size="59" v-model="User.password"/>
                    </p>
                    <p class="pwd_caution" v-show="msg1.length>0">{{ msg1 }}</p>
                    <p class="repwd">
                        <label for="repwd" v-show="password2 == ''">비밀번호 확인</label>
                        <input type="password" name="repwd" id="repwd" size="59" v-model="password2"/>
                    </p>
                    <p class="pwd_caution" v-show="msg2.length>0">{{ msg2 }}</p>
                </div>
                <p class="nick">
                    <label for="nick" v-show="User.nickName == ''">닉네임</label>
                    <input type="text" name="nick" id="nick" size="20" v-model="User.nickName"/>
                    <button type="">중복확인</button>
                </p>
                <p class="uemail">
                    <label for="email_id" v-show="User.email == ''">이메일</label>
                    <input type="text" name="email_id" id="email_id" size="10" v-model="User.email"/> @
                    <input type="text" name="email_dns" id="email_dns" class="email_dns" size="18" />
                    <select name="sel_dns" id="sel_dns" onchange="">
                        <option value="">직접입력</option>
                        <option value="naver.com">네이버</option>
                        <option value="hanmail.net">다음</option>
                        <option value="gmail.com">구글</option>
                    </select>
                </p>
                <p class="join_button">
                    <button>가입하기</button>
                </p>
            </div>
        </fieldset>
    </form>
</div>
</template>
<script>
import axios from 'axios'
export default {
  data () {
    return {
      User: {
        id: '',
        password: '',
        nickName: '',
        email: ''
      },
      password2: ''
    }
  },
  methods: {
    userRegister () {
      let check = false
      if (this.User.password.length >= 6) {
        if (this.User.password === this.password2) {
          check = true
        }
      }
      if (check) {
        console.log(this.User)
        axios.post('member/register', this.User).then(() => {
          this.$router.push('/', () => {})
        })
      } else {
        alert('실패')
      }
    }
  },
  computed: {
    msg1 () {
      if (this.User.password === '') {
        return ''
      } else if (this.User.password.length < 6 || this.User.password.length > 13) {
        return '최소 6자 이상 13자 이하로 작성해주세요.'
      } else {
        return ''
      }
    },
    msg2 () {
      if (this.password2 === '') {
        return ''
      } else if (this.User.password.length < 6 || this.User.password.length > 13) {
        return '최소 6자 이상 13자 이하로 작성해주세요.'
      } else if (this.password2 !== this.User.password) {
        return '비밀번호가 일치하지 않습니다'
      } else {
        return ''
      }
    }
  }
}
</script>
<style scoped>
body,h1,h2,h3,h4,h5,h6,p,div,header,main,footer,section,article,nav,ul,li,form,fieldset,legend,label,p,address,table,dl,dt,dd,input,select,textarea,button,figure,figcaption{margin:0;padding:0;font-family:'Noto Sans KR Light',sans-serif}

ul,li{list-style:none}
a{text-decoration:none;color:#222}
a:hover{color:#2698cb}
address{font-style:normal}
form,input,button{vertical-align:middle}
button{cursor:pointer}
img,fieldset{border:none}
input{border:none;outline:none}

body,input,textarea,select,button,table{font-family:"Noto Sana KR",sans-serif;font-size:13px;line-height:1.5;letter-spacing:-1px;direction:ltr}

/*main*/
#main{background:#f7f7f5;height:900px;}
.sign_up_title{font-size:36px;font-family:'Noto Sans KR Regular',sans-serif;text-align:center;padding-top:40px}
.sign_up_sub_title{font-size:17px;font-family:'Noto Sans KR Regular',sans-serif;text-align:center;padding-top:10px;margin-bottom:25px}
.form_wrap{position:relative;width:675px;height:550px;background:#fff;margin:0 auto;padding:40px}
.form_wrap label{position:absolute;left:41px;font-size:18px;color:#9e9e9e;font-family:'Noto Sans KR Regular',sans-serif;cursor:text}
.form_wrap input{border-bottom:1px solid #d0d0d0;font-size:18px;font-family:'Noto Sans KR Regular',sans-serif;margin-bottom:15px;padding-top:10px;padding:13px 0px;}
.form_wrap .uid label{top:55px}
.form_wrap .pwd label{top:125px}
.form_wrap .repwd label{top:195px}
.form_wrap .nick label{top:285px}
.form_wrap .uemail label{top:350px}
.form_wrap .email_dns{padding-left:10px}
.form_wrap .uid button{background:#ffa200;border:none;color:#fff;padding:10px 10px;width:100px;border-radius:8px;margin-left:10px}
.form_wrap .uid button:hover{background:#ef8700}
.form_wrap .nick button{background:#ffa200;border:none;color:#fff;padding:10px 10px;width:100px;border-radius:8px;margin-left:10px}
.form_wrap .nick button:hover{background:#ef8700}
.form_wrap .repwd input{margin-bottom:5px}
.form_wrap .pwd_caution{padding-left:25px;height:20px;background:url('/static/images/sign_up_caution.jpg') no-repeat;margin-bottom:10px}
.form_wrap .uemail{margin-bottom:35px}
.form_wrap .uemail select{-webkit-appearance:none;-moz-appearance:none;appearance:none;width:175px;padding:10px;background:url('/static/images/select_icon.jpg') no-repeat 140px 17px;color:#9e9e9e;font-size:17px;font-family:'Noto Sans KR Regular',sans-serif;margin-left:14px}
.form_wrap .join_button{text-align:center}
.form_wrap .join_button button{background:#85b729;border:none;color:#fff;padding:15px 45px;border-radius:8px;font-size:18px;font-family:'Noto Sans KR Regular',sans-serif;}
.form_wrap .join_button button:hover{background:#6c9f0d;}
</style>
