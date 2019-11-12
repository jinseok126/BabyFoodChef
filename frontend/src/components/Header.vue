<template>
  <body>
      <div id="wrap">
          <header id="header">
              <div class="container">
                  <div class="top_menu">
                      <router-link to="login">로그인</router-link>
                      <router-link to="register">회원가입</router-link>
                      <a href="#">정보 찾기</a>
                  </div>
                  <h1><a href="#">이유식 요리사</a></h1>
              </div>
          </header>
          <main>
              <nav class="gnb">
                  <h2>GNB</h2>
                  <ul>
                      <li><a href="#">레시피</a>
                          <p>레시피 내용</p>
                      </li>
                      <li><a href="#">회원공유레시피</a>
                          <p>회원공유레시피 내용</p>
                      </li>
                      <li><a href="#">정보</a>
                          <p>정보 내용</p>
                      </li>
                      <li><a href="#">자유게시판</a>
                          <p>자유게시판 내용</p>
                      </li>
                  </ul>
              </nav>
          </main>
          <footer></footer>
      </div>
  </body>
</template>

<script>
export default {
  name: 'Header',
  components: {
  },
  data () {
    return {}
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

     /*header*/
     #header{height:175px;background:url("/static/images/top_bg.jpg") repeat-x}
     .container{width:1200px;margin:0 auto}
     .top_menu{text-align:right}
     .top_menu>a{display:inline-block;padding:9px 10px 18px 10px;transition:color 0.3s ease;font-size:15px}
     .top_menu>a:hover{color:#fff}
     #header h1{width:183px;height:118px;background:url("/static/images/cook_logo.jpg") no-repeat;text-indent:-9999px}
     #header h1>a{display:block;height:100%;}

     /*gnb*/
     .gnb{border-top:1px solid #ddd;border-bottom:1px solid #ddd}
     .gnb h2{position:absolute;left:-9999px;top:-9999px;}
     .gnb>ul{width:1200px;margin:0 auto;overflow:hidden}
     .gnb>ul>li{width:299px;height:50px;float:left;font-size:18px;font-family:'Noto Sans KR Regular',sans-serif;text-align:center}
     .gnb>ul>li>a{transition:color 0.3s ease;display:inline-block;padding-top:10px}
     .gnb>ul>li>a:hover{color:#85b729}
     .gnb p{display:none}
</style>
