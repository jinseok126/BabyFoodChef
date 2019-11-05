<template>
  <div>
    <div class="logo">
      <b-navbar variant="faded" type="center">
        <b-navbar-brand  href="/">
          <img src="static/images/logo.png" alt="Logo">
        </b-navbar-brand>
      </b-navbar>
    </div>

    <b-navbar toggleable="lg" type="light" variant="info">

      <b-navbar-toggle target="nav_collapse"/>

      <b-collapse is-nav id="nav_collapse">
        <b-navbar-nav>
          <!--우리가 만들 라우터를 이용하기 위해선 href가 아닌 to로? -->
          <b-nav-item-dropdown text="레시피">
            <b-dropdown-item href="#">초기</b-dropdown-item>
            <b-dropdown-item href="#">중기</b-dropdown-item>
            <b-dropdown-item href="#">후기</b-dropdown-item>
          </b-nav-item-dropdown>
          <b-nav-item to="#">회원 공유 레시피</b-nav-item>
          <b-nav-item to="#">정보</b-nav-item>
          <b-nav-item to="#">자유 게시판</b-nav-item>
        </b-navbar-nav>

        <b-navbar-nav class="ml-auto">
          <b-nav-item to="#">로그인</b-nav-item>
          <b-nav-item to="signup">회원가입</b-nav-item>

          <b-nav-item-dropdown text="정보찾기" right>
            <b-dropdown-item href="#">아이디 찾기</b-dropdown-item>
            <b-dropdown-item href="#">비밀번호 찾기</b-dropdown-item>
          </b-nav-item-dropdown>

        </b-navbar-nav>
      </b-collapse>
    </b-navbar>
  </div>
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
.logo {
  display: inline-block; /*가운데 정렬*/
  float: none;
}
</style>
