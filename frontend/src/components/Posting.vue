<template lang="html">
  <div id="main">
    <div class="container">
        <div class="gnb_sub">
            <ul>
                <li><a href="#">공지사항</a></li>
                <li><a href="#">나만의 레시피 공유</a></li>
                <li class="message_board"><a href="#">자유게시판</a></li>
            </ul>
        </div>
        <div class="_wrapper">
           <div class="_hd_writing">
               <h2>
                    <a href="#">집나간 며느리도 돌아오는 우리아이 이유식</a>
                    <span class="_border">|</span>
                    <span class="category">이유식</span>
                    <span class="_date">2020.01.27</span>
               </h2>
               <div class="writer_info">
                    <a href="#" class="member_nick">카르페디엠(iam***)</a>
               </div>
           </div>
           <div class="_bd_writing">
               <div class="_contents">
                   <p>첫 번째 글입니다.</p>
               </div>

           </div>
           <div class="_ft_writing">
               <div class="writing_info">
                   <span>
                       댓글
                       <b>1</b>
                   </span>
                   <span>
                       조회수
                       <b>3</b>
                   </span>
               </div>
           </div>
           <div class="commend_wrapper">
               <div class="commend_bd">
                   <div class="user_image"><img src="/static/images/user_image_icon.png" alt="" /></div>
                   <div class="commend_container">
                       <div class="user_image"></div>
                       <div class="commend_contents">
                           <a href="#">럭스오브레전드</a>
                           <span>2020.01.28. 2:00</span>
                           <p>안녕하세요. 비법이 먼가요???</p>
                       </div>
                   </div>
               </div>
               <div class="commend_ft">
                   <div class="commend_form">
                       <textarea name="" id="" cols="165" rows="3"></textarea>
                       <input type="button" value="등록" />
                   </div>
               </div>
           </div>
        </div>
        <div class="_option">
            <input type="button" value="글쓰기" />
            <input type="button" value="목록" />
        </div>
        <div>
            <table>
                <caption></caption>
                <colgroup>
                    <col width="80">
                    <col width="*">
                    <col width="120">
                    <col width="90">
                </colgroup>
                <tbody>
                    <tr>
                        <td colspan="4" class="board_line"></td>
                    </tr>
                    <tr align="center">
                        <td class="pre_btn"><a href="#">이전글</a></td>
                        <td align="left"><a href="#">공지사항 입니다.</a></td>
                        <td align="left"><a href="#">앙기모찌1</a></td>
                        <td class="_count">2:21</td>
                    </tr>
                    <tr>
                        <td colspan="4" class="board_line"></td>
                    </tr>
                    <tr align="center">
                        <td class="pre_btn"><a href="#">다음글</a></td>
                        <td align="left"><a href="#">두 번째 글입니다.</a></td>
                        <td align="left"><a href="#">앙기모찌2</a></td>
                        <td class="_count">2:25</td>
                    </tr>
                    <tr>
                        <td colspan="4" class="board_line"></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</template>

<script>

</script>

<style scoped>
  .main{clear:both}
  .container{width:1200px;margin:0 auto}
  .gnb_sub{height:50px;width:1200px;background:#f8ffeb;margin:0 auto;font-size:16px;}
  .gnb_sub li a{float:left;color:#b3b3b3;padding:10px 20px}
  .gnb_sub .message_board a{color:#85b729;font-family:'Noto Sans KR Regular',sans-serif;}

  ._wrapper{border:1px solid #eee;}
  ._hd_writing{margin:20px}
  ._hd_writing h2{font-size:15px;border-bottom-style:dashed;border-bottom-width:1px;border-color:rgba(164,164,164,.6);padding-bottom:15px;margin-bottom:10px}
  ._hd_writing h2 a{font-family:'Noto Sans KR Regular',sans-serif;color:#717070;margin-right:2px;}
  ._hd_writing span{font-family:'Noto Sans KR Thin',sans-serif;color:#696868;margin-right:2px;}
  ._hd_writing ._date{float:right}
  .writer_info{height:25px;padding-left:30px;background:url(../images/user_icon.jpg) no-repeat;}
  .writer_info a{color:#686868;}
  ._bd_writing{margin:20px}
  ._contents{height:300px;}
  .writing_info{color:#646363}
  .writing_info b{padding:2px}
  .info_border{padding:2px}

  .commend_wrapper{width:1175px;background:#f7f7f5;margin:0 auto 12.5px;padding:10px}
  .user_image img{float:left}
  .commend_container{}
  .commend_contents a{color:#686868;font-family:'Noto Sans KR Regular',sans-serif;padding:10px;}
  .commend_contents span{text-align:right;color:#b3b3b3}
  .commend_contents p{padding:5px 0}
  .commend_ft{clear:both;overflow:hidden}
  .commend_form textarea{float:left; margin-right:10px;padding:10px;border:1px solid #ddd}
  .commend_form input{width:90px;height:78px;float:left;background-color:#fff;border:1px solid #c9c9c9}
  ._option{clear:both}

</style>
