<template>
  <div id="main">
    <!--main_image-->
    <div class="main_images">
      <ul>
        <li class="main_image_01"><a href="#"></a></li>
      </ul>
    </div>
    <div class="contents_wrap">
        <!--board-->
        <div class="board">
            <h2>게시판</h2>
            <div class="notice">
                <h3 clsss="sel"><a href="#">공지사항</a></h3>
                <table width="600">
                    <caption>공지사항</caption>
                    <colgroup>
                        <col width="440" />
                        <col width="160" />
                    </colgroup>
                    <tbody>
                        <tr>
                            <td><a href="#">세 번째 게시물입니다.</a></td>
                            <td align="center">2020.01.07</td>
                        </tr>
                        <tr>
                            <td><a href="#">두 번째 게시물입니다.</a></td>
                            <td align="center">2020.01.07</td>
                        </tr>
                        <tr>
                            <td><a href="#">세 번째 게시물입니다.</a></td>
                            <td align="center">2020.01.07</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="free_board">
                <h3><a href="#">자유게시판</a></h3>
                <table width="600">
                    <caption>자유게시판</caption>
                    <colgroup>
                        <col width="440" />
                        <col width="160" />
                    </colgroup>
                    <tbody>
                        <tr>
                            <td><a href="#">세 번째 게시물입니다.</a></td>
                            <td align="center">2020.01.07</td>
                        </tr>
                        <tr>
                            <td><a href="#">두 번째 게시물입니다.</a></td>
                            <td align="center">2020.01.07</td>
                        </tr>
                        <tr>
                            <td><a href="#">세 번째 게시물입니다.</a></td>
                            <td align="center">2020.01.07</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <!--recommend_meal-->
        <div class="recommend_meal">
            <h2>추천식단</h2>
            <ul>
                <li>초기(5~6개월)</li>
                <li>중기(7~8개월)</li>
                <li>후기(9~11개월)</li>
                <li>완료기(12~24개월)</li>
            </ul>
        </div>
        <!--our_recipe_share-->
        <div class="our_recipe_share">
            <h2>나만의 레시피 공유</h2>
            <p></p>
            <ul>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
            </ul>
            <a href="#">이전보기</a>
            <a href="#">다음보기</a>
        </div>
    </div>
  </div>
</template>
<script>
</script>
<style scoped>
  /*main*/
  #main{}
    /*main_image*/
  .main_images{}
  .main_images .main_image_01{width:100%;height:400px;background:url('/static/images/main_image_01.jpg') no-repeat center}
  .main_images .main_image_01 a{display:block;height:100%;}
    /*board*/
  .contents_wrap{width:1200px;margin:0 auto}
  .board{float:left;width:600px;height:340px;border:1px solid #eee;position:relative}
  .board h2{position:absolute;left:-9999px;top:-9999px}
  .board .notice{}
  .board .sel{background:#fff;font-family:'Noto Sans KR Regular',sans-serif;}
  .board div{width:100px;position:absolute;left:0;top:60px;}
  .notice h3{width:100px;float:left;position:absolute;top:-60px;left:0;font-family:'Noto Sans KR Regular',sans-serif;}
  .free_board h3{width:100px;float:left;position:absolute;top:-60px;left:100px;font-family:'Noto Sans KR Regular',sans-serif;}
  caption{position:absolute;left:-9999px;top:-9999px}
  .free_board table{display:none}
  /*recommend_meal*/
  .recommend_meal{float:left;width:550px;height:335px;}
  /*our_recipe_share*/
  .our_recipe_share{clear:both}
</style>
