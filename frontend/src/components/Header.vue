<template>
  <div>
    <div class="momo">
      <b-nav small align="right" style="border-bottom: 1px solid gray" >
        <b-nav-item >로그인</b-nav-item>
        <b-nav-item to="register">회원가입</b-nav-item>
        <b-nav-item-dropdown text="정보 찾기" right>
          <b-dropdown-item href="#" >아이디 찾기</b-dropdown-item>
          <b-dropdown-item href="#">비밀번호 찾기</b-dropdown-item>
        </b-nav-item-dropdown>
      </b-nav>
    </div>
    <div class="logo">
      <b-navbar variant="faded" type="center">
        <b-navbar-brand  href="/">
          <h2>이유식 요리사</h2>
        </b-navbar-brand>
      </b-navbar>
    </div>

    <div class="nav-item">
      <b-nav tabs justified >
          <!--우리가 만들 라우터를 이용하기 위해선 href가 아닌 to로? -->
          <b-nav-item-dropdown text="레시피" right active style="color: black">
            <b-dropdown-item href="#">초기</b-dropdown-item>
            <b-dropdown-item href="#">중기</b-dropdown-item>
            <b-dropdown-item href="#">후기</b-dropdown-item>
          </b-nav-item-dropdown>
          <b-nav-item to="#" active>회원 공유 레시피</b-nav-item>
          <b-nav-item to="#" active>정보</b-nav-item>
          <b-nav-item to="#" active>자유 게시판</b-nav-item>
        </b-nav>
      </div>
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
.momo {
  height: 15px;
}
.logo {
  display: inline-block; /*가운데 정렬*/
  float: none;
}
h2 {
  color: #2F3B52;
  font-weight: 900;
  margin: 2.0rem 0 1.5rem;
}
.nav-item {
  font-weight: 900;
  color: #FFFFFF;
}

</style>
