webpackJsonp([1],{"9M+g":function(t,e){},Jmt5:function(t,e){},NHnr:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});s("MU8w"),s("j1ja");var r=s("7+uW"),a=s("Tqaz"),n={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("body",[s("div",{attrs:{id:"wrap"}},[s("header",{attrs:{id:"header"}},[s("div",{staticClass:"container"},[s("div",{staticClass:"top_menu"},[s("router-link",{attrs:{to:"login"}},[t._v("로그인")]),t._v(" "),s("router-link",{attrs:{to:"register"}},[t._v("회원가입")]),t._v(" "),s("a",{attrs:{href:"#"}},[t._v("정보 찾기")])],1),t._v(" "),t._m(0)])]),t._v(" "),t._m(1),t._v(" "),s("footer")])])},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("h1",[e("a",{attrs:{href:"#"}},[this._v("이유식 요리사")])])},function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("main",[s("nav",{staticClass:"gnb"},[s("h2",[t._v("GNB")]),t._v(" "),s("ul",[s("li",[s("a",{attrs:{href:"#"}},[t._v("레시피")]),t._v(" "),s("p",[t._v("레시피 내용")])]),t._v(" "),s("li",[s("a",{attrs:{href:"#"}},[t._v("회원공유레시피")]),t._v(" "),s("p",[t._v("회원공유레시피 내용")])]),t._v(" "),s("li",[s("a",{attrs:{href:"#"}},[t._v("정보")]),t._v(" "),s("p",[t._v("정보 내용")])]),t._v(" "),s("li",[s("a",{attrs:{href:"#"}},[t._v("자유게시판")]),t._v(" "),s("p",[t._v("자유게시판 내용")])])])])])}]};var o={name:"App",components:{Header:s("VU/8")({name:"Header",components:{},data:function(){return{}}},n,!1,function(t){s("X188")},"data-v-494b509d",null).exports}},l={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",{attrs:{id:"app"}},[e("Header"),this._v(" "),e("router-view")],1)},staticRenderFns:[]};var i=s("VU/8")(o,l,!1,function(t){s("cyKA")},null,null).exports,c=s("/ocq"),u={data:function(){return{User:{id:"",password:"",nickName:"",email:""},password2:""}},methods:{userRegister:function(){var t=this,e=!1;this.User.password.length>=6&&this.User.password===this.password2&&(e=!0),e?(console.log(this.User),this.$http.post("user/register",this.User).then(function(){t.$router.push({path:"/"})})):alert("실패")}},computed:{msg1:function(){return""===this.User.password?"":this.User.password.length<6?"6글자 이상 입력하세요.":""},msg2:function(){return""===this.password2?"":this.password2.length<6?"6글자 이상 입력하세요.":this.password2!==this.User.password?"비밀번호가 일치하지 않습니다":"비밀번호와 일치합니다."}}},d={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"form"},[s("b-card",{attrs:{"bg-variant":"light"}},[s("b-form-group",{staticClass:"mb-0",attrs:{"label-cols-lg":"4",label:"회원 가입","label-size":"lg","label-class":"font-weight-bold pt-5"}},[s("b-form-group",{attrs:{"label-cols-sm":"3",label:"아이디:","label-align-sm":"right","label-for":"id"}},[s("b-form-input",{attrs:{id:"id"},model:{value:t.User.id,callback:function(e){t.$set(t.User,"id",e)},expression:"User.id"}})],1),t._v(" "),s("b-form-group",{attrs:{"label-cols-sm":"3",label:"비밀번호:","label-align-sm":"right","label-for":"password"}},[s("b-form-input",{attrs:{id:"password",type:"password"},model:{value:t.User.password,callback:function(e){t.$set(t.User,"password",e)},expression:"User.password"}}),t._v("\n     "+t._s(t.msg1)+"\n   ")],1),t._v(" "),s("b-form-group",{attrs:{"label-cols-sm":"3",label:"비밀번호 확인:","label-align-sm":"right","label-for":"password2"}},[s("b-form-input",{attrs:{id:"password2",type:"password"},model:{value:t.password2,callback:function(e){t.password2=e},expression:"password2"}}),t._v("\n     "+t._s(t.msg2)+"\n   ")],1),t._v(" "),s("b-form-group",{attrs:{"label-cols-sm":"3",label:"닉네임:","label-align-sm":"right","label-for":"nickName"}},[s("b-form-input",{attrs:{id:"nickName"},model:{value:t.User.nickName,callback:function(e){t.$set(t.User,"nickName",e)},expression:"User.nickName"}})],1),t._v(" "),s("b-form-group",{staticClass:"mb-0",attrs:{"label-cols-sm":"3",label:"이메일:","label-align-sm":"right"}},[s("b-form-input",{attrs:{id:"email",type:"email"},model:{value:t.User.email,callback:function(e){t.$set(t.User,"email",e)},expression:"User.email"}})],1),t._v(" "),s("b-button",{staticClass:"button",attrs:{variant:"info"},on:{click:t.userRegister}},[t._v("회원 가입")])],1)],1)],1)},staticRenderFns:[]};var p=s("VU/8")(u,d,!1,function(t){s("XEDR")},"data-v-5c2a98d4",null).exports,m={data:function(){return{id:"",password:""}},methods:{loginBtn:function(t){console.log(t)}}},f={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("b-container",{attrs:{fluid:""}},[s("b-row",{staticClass:"my-1"},[s("b-col",{attrs:{sm:"2"}},[s("label",{attrs:{for:"input-small"}},[t._v("아이디:")])]),t._v(" "),s("b-col",{attrs:{sm:"10"}},[s("b-form-input",{attrs:{size:"sm",placeholder:"아이디를 입력해주세요."},model:{value:t.id,callback:function(e){t.id=e},expression:"id"}})],1),t._v(" "),s("b-col",{attrs:{sm:"2"}},[s("label",{attrs:{for:"input-small"}},[t._v("비밀번호:")])]),t._v(" "),s("b-col",{attrs:{sm:"10"}},[s("b-form-input",{attrs:{size:"sm",placeholder:"비밀번호를 입력해주세요."},model:{value:t.password,callback:function(e){t.password=e},expression:"password"}})],1)],1),t._v(" "),s("b-button",{on:{click:function(e){return t.loginBtn({id:t.id,password:t.password})}}},[t._v("LOGIN")])],1)},staticRenderFns:[]},v=s("VU/8")(m,f,!1,null,null,null).exports;r.default.use(c.a);var b=new c.a({mode:"history",routes:[{path:"/register",name:"Register",component:p},{path:"/login",name:"Login",component:v}]}),_=s("mtWM"),h=s.n(_),g=s("NYxO");r.default.use(g.a);var w=new g.a.Store({state:{},getter:{getToken:function(t){return t.accessToken}},mutations:{login:function(t,e){localStorage.set("accessToken",e),t.accessToken=e},logout:function(t){localStorage.removeItem("accessToken"),t.accessToken=null}},actions:{login:function(t){this.$http.post("user/login",t).then(function(){})}}});s("Jmt5"),s("9M+g");r.default.config.productionTip=!1,r.default.prototype.$http=h.a,r.default.use(a.a),new r.default({el:"#app",router:b,store:w,components:{App:i},template:"<App/>"})},X188:function(t,e){},XEDR:function(t,e){},cyKA:function(t,e){}},["NHnr"]);
//# sourceMappingURL=app.c9988fdd80d58c4c4cee.js.map