<template>
  <div class="body">
      <div id="wrap">
          <div id="header">
              <div class="container">
                  <div class="top_menu">
                      <router-link to="login" v-show="isLogin===false">로그인</router-link>
                      <router-link to="register" v-show="isLogin===false">회원가입</router-link>
                      <router-link to="myPage" v-show="isLogin">마이페이지</router-link>
                      <button v-show="isLogin" @click="logout">로그아웃</button>
                  </div>
                  <div class="gnb">
                    <h1><router-link to="/">이유식 요리사</router-link></h1>
                    <h2>GNB</h2>
                    <ul>
                      <li class="service"><a href="#">이요 서비스</a>
                        <ul>
                          <li><a href="#">이요 사용법</a></li>
                          <li><a href="#">이유식 정보</a></li>
                          <li><a href="#">사이트맵</a></li>
                        </ul>
                      </li>
                      <li class="recommend"><a href="#">추천식단</a>
                        <ul>
                          <li><a href="#">초기(5~6개월)</a></li>
                          <li><a href="#">중기(7~8개월)</a></li>
                          <li><a href="#">후기(9~11개월)</a></li>
                          <li><a href="#">완료기(12~14개월)</a></li>
                        </ul>
                      </li>
                      <li class="talk"><router-link to="/board/free">맘`s 토크</router-link>
                        <ul>
                          <li><a href="#">공지사항</a></li>
                          <li><a href="#">나만의 레시피 공유</a></li>
                          <li><a href="#">자유 게시판</a></li>
                        </ul>
                      </li>
                      <li class="event"><a href="#">이벤트</a>
                        <ul>
                          <li><a href="#">진행중인 이벤트</a></li>
                          <li><a href="#">종료된 이벤트</a></li>
                          <li><a href="#">당첨자 발표</a></li>
                        </ul>
                      </li>
                    </ul>
                  </div>
              </div>
              <div class="gnb_bg"></div>
          </div>
      </div>
  </div>
</template>

<script>
import { mapState, mapActions } from 'vuex'
export default {
  data () {
    return {}
  },
  computed: {
    ...mapState(['isLogin', 'isLoginError'])
  },
  methods: {
    ...mapActions(['logout'])
  }
}
</script>
<!--scoped = 해당 컴포넌트에만 style 적용 -->
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
     /*header*/
     #header{height:150px;background:url('/static/images/top_bg.jpg') repeat-x}
     .container{width:1200px;margin:0 auto}
     .top_menu{text-align:right;height:42px;}
     .top_menu>a{display:inline-block;color:#fff;font-size:15px;line-height:40px;padding-right:30px}

     /*gnb*/
     .gnb{width:1200px;position:relative;z-index:10}
     .gnb h1{float:left;width:280px;height:80px;background:url('/static/images/logo.jpg') no-repeat;text-indent:-9999px;margin-top:20px}
     .gnb h1>a{display:block;height:100%;}
     .gnb h2{position:absolute;left:-9999px;top:-9999px;}
     .gnb>ul{overflow:hidden}
     .gnb>ul>li>a{float:left;display:block;width:230px;height:70px;font-size:20px;font-family:'Noto Sans KR Regular',sans-serif;text-align:center;line-height:70px;padding:20px 0 20px 0}
     .gnb>ul>li>a:hover{color:#85b729;background:url('/static/images/gnb_m_over_bar.jpg') no-repeat center bottom}

     .gnb ul ul{display:none;z-index:10;width:230px;height:auto;}
     .gnb ul ul li{text-align:center;font-size:17px;padding:10px}
     .gnb .service ul{position:absolute;left:280px;top:109px;}
     .gnb .recommend ul{position:absolute;left:510px;top:109px;}
     .gnb .talk ul{position:absolute;left:740px;top:109px;}
     .gnb .event ul{position:absolute;left:970px;top:109px;}
     .gnb ul ul li a:hover{color:#85b729}

     .gnb_bg{background:#fff;width:100%;height:200px;border-top:1px solid #eee;display:none;position:absolute;left:0;top:150px;z-index:1}
</style>
