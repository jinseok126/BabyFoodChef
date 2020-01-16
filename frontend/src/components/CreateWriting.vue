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
                  <table class="wrtie_form" width="1200px" cellpadding="0" cellspacing="0">
                      <caption class="page_title">글 작성하기</caption>
                      <tbody>
                          <tr>
                              <th class="title">제목</th>
                              <td class="title_area">
                                 <select class="select_type">
                                     <option value="">전체</option>
                                     <option value="">이유식</option>
                                     <option value="">육아</option>
                                     <option value="">기타</option>
                                 </select>
                                 <input type="text" class="title_space" placeholder="제목을 입력해주세요." size="158" />
                              </td>

                          </tr>
                          <tr>
                              <th class="contents">내용</th>
                              <td class="contents_area">
                                  <textarea name="" id="" cols="195" rows="20"></textarea>
                              </td>
                          </tr>
                          <tr>
                              <th class="select_file">파일 첨부하기</th>
                              <td class="select_file_area">
                                  <input type="file" />
                                  <span>파일 크기 제한 : 10.00MB(허용 확장자 : *.jpeg, *.jpg, *.png, *.gif)</span>
                              </td>

                          </tr>
                      </tbody>
                  </table>
                  <div class="_button">
                      <input type="button" class="register_button" value="등록하기" />
                  </div>
              </div>
          </div>
</template>

<script>
export default {
}
</script>

<style>
  #main{clear:both}
  .gnb_sub{height:50px;width:1200px;background:#f8ffeb;margin:0 auto;font-size:16px}
  .gnb_sub li a{float:left;color:#b3b3b3;padding:10px 20px}
  .gnb_sub .message_board a{color:#85b729;font-family:'Noto Sans KR Regular',sans-serif;}
  .wrtie_form{border:1px solid #eee;margin-bottom:20px}
  .wrtie_form .page_title{font-size:30px;font-family:'Noto Sans KR Regular',sans-serif;padding:20px 0}
  .wrtie_form .title{position:absolute;top:-9999px;left:-9999px}
  .wrtie_form .title_area{border-bottom:1px solid #eee}
  .wrtie_form .title_space{padding:10px}
  .wrtie_form .select_type{width:200px;height:40px;padding:10px;border-right:1px solid #eee;}
  .wrtie_form .contents{position:absolute;top:-9999px;left:-9999px}
  .wrtie_form .contents_area textarea{border:none;padding:10px}
  .wrtie_form .select_file{position:absolute;top:-9999px;left:-9999px}
  .wrtie_form .select_file_area{padding:10px;background:#f7f7f7}
  ._button{position:relative}
  .register_button{width:150px;height:50px;background:#85b729;color:#fff;border-radius:5px;cursor:pointer;position:absolute;left:525px;font-size:15px}
  .register_button:hover{background:#6c9f0d}
</style>
