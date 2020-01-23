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
                   <div class="user_image"><img src="" alt="" /></div>
                   <div class="commend_contents">
                       <div>
                           <a href="#">럭스오브레전드</a>
                           <span>2020.01.28. 2:00</span>
                       </div>
                       <div>
                           <p>안녕하세요. 비법이 먼가요???</p>
                       </div>
                   </div>
               </div>
               <div class="commend_ft">
                   <div class="commend_form">
                       <textarea name="" id="" cols="100" rows="3"></textarea>
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

</style>
