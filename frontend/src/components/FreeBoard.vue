<template>
  <div id="main">
           <div class="container">
              <div class="gnb_sub">
                  <ul>
                      <li><a href="#">공지사항</a></li>
                      <li><a href="#">나만의 레시피 공유</a></li>
                      <li class="message_board"><a href="#">자유게시판</a></li>
                  </ul>
               </div>
               <div class="notice_sub_title">
                    <h3>자유게시판</h3>
                    <p>주제와 상관없이 자유롭게 이용이 가능한 게시판 입니다.</p>
               </div>
               <form class="search_form" action="" method="get">
                   <fieldset>
                       <legend>검색</legend>
                       <div class="search_keyword">
                           <select name="" id="">
                               <option value="title_content">제목+내용</option>
                               <option value="title">제목</option>
                               <option value="content">내용</option>
                               <option value="writer">작성자</option>
                           </select>
                           <input type="text" placeholder="검색어를 입력하세요." size=50/>
                           <button type="">검색</button>
                       </div>
                       <div class="option">
                           <select name="" id="">
                               <option value="">전체</option>
                               <option value="">잡담</option>
                               <option value="">육아</option>
                               <option value="">이유식</option>
                               <option value="">정보</option>
                           </select>
                           <select name="" id="">
                               <option value="">최신순</option>
                               <option value="">조회순</option>
                               <option value="">댓글순</option>
                           </select>
                           <button type="button" @click="write">글쓰기</button>
                       </div>
                   </fieldset>
               </form>
               <table class="board_list" width="1200" >
                   <caption>게시판 목록</caption>
                   <colgroup>
                       <col width="70" />
                       <col width="780" />
                       <col width="150" />
                       <col width="120" />
                       <col width="70" />
                   </colgroup>
                   <thead>
                       <tr>
                           <td>번호</td>
                           <td>제목</td>
                           <td>글쓴이</td>
                           <td>작성일</td>
                           <td>조회수</td>
                       </tr>
                   </thead>
                   <tbody>
                      <tr class="_notice">
                         <td class="notice_index" align="center">공지</td>
                         <td><a href="#">공지사항 입니다.</a></td>
                         <td align="center">관리자</td>
                         <td align="center">2019.12.19</td>
                         <td align="center">1234</td>
                      </tr>

                      <tr :key="writing.no" v-for="writing in freeBoard">
                        <td align="center">{{ writing.no }}</td>
                        <td><a href="#">{{ writing.title }}</a></td>
                        <td align="center">{{ writing.writer }}</td>
                        <td align="center">{{ writing.dateCreated }}</td>
                        <td align="center">{{ writing.viewCount }}</td>
                      </tr>
                   </tbody>
               </table>
               <div class="pager">
                   <a href="#">이전</a>
                   <a href="#">다음</a>
               </div>
            </div>
        </div>
</template>

<script>
export default {
  data () {
    return {
      currentPage: 1,
      perPage: 10
    }
  },
  methods: {
    // rowClick(item, index, e){
    //   this.$router.push({
    //     //``와 ''의 차이는?
    //     path: `/board/free/detail/${item.content_id}`
    //   })
    // },
    write () {
      this.$router.push({
        path: '/board/free/create'
      })
    }
  },
  computed: {
    freeBoard () {
      return this.$store.state.freeBoard
    }
  }
}
</script>
<style scoped>
  /*버튼 그림자,a태그 line*/
  .gnb_sub{height:50px;width:1200px;background:#f8ffeb;margin:0 auto;font-size:16px;}
  .gnb_sub li a{float:left;color:#b3b3b3;padding:10px 20px}
  .gnb_sub .message_board a{color:#85b729;font-family:'Noto Sans KR Regular',sans-serif;}
  .main{clear:both}
  .notice_sub_title{text-align:center}
  .notice_sub_title h3{font-size:30px;font-family:'Noto Sans KR Regular',sans-serif;padding:20px 0}
  .notice_sub_title p{font-size:15px;padding-bottom:20px}

  .search_form legend{position:absolute;left:-9999px;top:-9999px}
  .search_keyword{width:1200px;background:#eee;height:100px;text-align:center;line-height:7.5;margin-bottom:10px}
  .search_keyword select{width:180px;padding:9.5px;margin-right:10px;border:1px solid #ddd;font-size:15px}
  .search_keyword input{padding:10px;border:1px solid #ddd;font-size:15px}
  .search_keyword button{width:90px;background:#85b729;color:#eee;padding:10px;font-size:15px;border-radius:5px}
  .option{position:relative;margin-bottom:10px}
  .option select{width:100px;padding:10px;border:1px solid #ddd;margin-right:5px}
  .option button{position:absolute;left:1100px;width:100px;background:#ffa300;border-radius:5px;padding:11px;color:#fff}

  .board_list{border-collapse:collapse;border-spacing:1px;text-align:center;line-height:1.5;border:1px solid #ddd;margin-bottom:10px}
  .board_list caption{position:absolute;left:-9999px;top:-9999px}
  .board_list thead td{font-family:'Noto Sans KR Regular',sans-serif;font-size:14px;padding:10px;border-bottom:1px solid #ddd}
  .board_list tbody td{padding:10px;border-bottom:1px solid #ddd}
  .board_list tbody{text-align:left}
  .board_list ._notice{background:#f7f7f5}
  .board_list .notice_index{text-indent:-9999px;background:url('/static/images/notice_icon.jpg') no-repeat center;}

  .pager{text-align:center}

</style>
