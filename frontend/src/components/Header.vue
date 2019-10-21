<template>
  <div style="background-color: #fdd696">
    <div class="logo">
      <b-navbar variant="faded" type="center">
        <b-navbar-brand  href="#">
          <img src="static/images/logo.png" alt="Logo">
        </b-navbar-brand>
      </b-navbar>
    </div>

    <b-navbar toggleable="lg" type="dark" variant="dark">

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
          <b-nav-form>
            <b-form-input size="sm" class="mr-sm-2" placeholder="아이디"></b-form-input>
            <b-form-input size="sm" class="mr-sm-2" placeholder="비밀번호"></b-form-input>
            <b-button size="sm" class="my-2 my-sm-0" type="submit">로그인</b-button>
          </b-nav-form>

          <b-nav-item to="#">회원가입</b-nav-item>

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
