<template lang="html">
  <div id="main">
            <div class="container">
                <table class="wrtie_form" width="1170px" cellpadding="0" cellspacing="0">
                    <caption>게시판 글쓰기</caption>
                    <tbody>
                        <tr>
                            <th class="title">제목</th>
                            <td>
                               <select class="select_type">
                                   <option value="">전체</option>
                                   <option value="">이유식</option>
                                   <option value="">육아</option>
                                   <option value="">기타</option>
                               </select>
                               <input type="text" placeholder="제목" />
                            </td>

                        </tr>
                        <tr>
                            <th class="contents">내용</th>
                            <td>
                                <textarea name="" id="" cols="100" rows="10"></textarea>
                            </td>
                        </tr>
                        <tr>
                            <th class="add_file">파일 첨부하기</th>
                            <td><input type="file" /></td>
                            <td>파일 크기 제한 : 10.00MB(허용 확장자 : *.jpeg, *.jpg, *.png, *.gif)</td>
                        </tr>
                    </tbody>
                </table>
                <input type="button" value="등록하기" />
            </div>
        </div>
</template>

<script>
export default {
}
</script>

<style lang="css" scoped>
  .wrtie_form{border:1px solid #eee}
  .wrtie_form caption{position:absolute;top:-9999px;left:-9999px}
  .wrtie_form .title{position:absolute;top:-9999px;left:-9999px}
  .wrtie_form .select_type{width:200px;height:40px}
  .wrtie_form .contents{position:absolute;top:-9999px;left:-9999px}
  .wrtie_form .add_file{position:absolute;top:-9999px;left:-9999px}
</style>
