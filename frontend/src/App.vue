<template>
  <div id="app">
    <Header />
    <router-view/>
  </div>
</template>

<script>
import Header from '@/components/Header'
export default {
  name: 'App',
  components: {
    Header
  }
}
</script>
<style>
body,h1,h2,h3,h4,h5,h6,p,div,header,main,footer,section,article,nav,ul,li,form,fieldset,legend,label,p,address,table,dl,dt,dd,input,select,textarea,button,figure,figcaption{margin:0;padding:0;font-family:'Noto Sans KR Light',sans-serif}
ul,li{list-style:none}
a{text-decoration:none;color:#222}
a:hover{color:#2698cb}
address{font-style:normal}
form,input,button{vertical-align:middle}
button{cursor:pointer;border:none}
img,fieldset{border:none}
input{border:none;outline:none}

body,input,textarea,select,button,table{font-family:"Noto Sana KR",sans-serif;font-size:13px;line-height:1.5;letter-spacing:-1px;direction:ltr}
</style>
