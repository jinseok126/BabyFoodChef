<template>
<div>
  <!--fields로 필요한 속성만 보여주기, 컬럼명 변경 -->
  <b-table striped hover :items="freeBoard" :per-page="perPage" :current-page="currentPage" :fields="fields" @row-clicked="rowClick"></b-table>
  <!-- 페이지네이션 -->
  <b-pagination v-model="currentPage" :total-rows="rows" :per-page="perPage" align="center"></b-pagination>
  <b-button>글쓰기</b-button>
</div>
</template>

<script>
import { mapState } from 'vuex'
export default {
  data () {
    return {
      currentPage: 1,
      perPage: 10,
      fields: [{
        key: 'no',
        label: '글번호'
      },
      {
        key: 'title',
        label: '제목'
      },
      {
        key: 'dateCreated',
        label: '작성일'
      },
      {
        key: 'writer',
        label: '글쓴이'
      }
      ],
      ...mapState(['freeBoard'])
    }
  },
  methods: {
    // rowClick(item, index, e){
    //   this.$router.push({
    //     //``와 ''의 차이는?
    //     path: `/board/free/detail/${item.content_id}`
    //   })
    // },
    // writeContent(){
    //    this.$router.push({
    //      path: '/board/free/create'
    //    })
    // }
  },
  computed: {
    rows () {
      return this.freeBoard.length
    }
  }
}
</script>
