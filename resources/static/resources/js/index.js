//IIFE 실습
//()안에 있는 것은 즉시 실행해라.
var app = (() => {
    let init = () => {
        //init 과 login_form은 형제관계라 호출 가능
        login_form();
    }

    //login form만들기
    let login_form = () => {
        // wrapper는 DOM 객체
        let wrapper = document.querySelector('#wrapper');
        wrapper.innerHTML = '<form >'
        +'  ID:<br>'
        +'  <input type="text" name="id" >'
        +'  <br>'
        +'  PASSWORD:<br>'
        +'  <input type="text" name="password" >'
        +'  <br><br>'
        +'  <input type="button"  value="로그인" id=login_btn>'
        +'  <input type="button"  value="회원가입" id=join_btn>'
        +'</form> ';

        // 회원가입 버튼을 선택할 수 있게 객체 만들기
        let join_btn = document.querySelector('#join_btn')

        // 옵저버 버튼/ 회원가입 버튼에 이벤트 걸기
        join_btn.addEventListener('click',() => {
            //회원가입 버튼 누르면 회원가입 폼 함수를 실행해줘
            join_form();
        });
    }

    //join form 만들기
    let join_form = () => {
        // wrapper 영역 전체에 보여질 내용 객체 만들기
        let wrapper = document.querySelector('#wrapper')
        wrapper.innerHTML =  '<form >'
        +'  ID:<br>'
        +'  <input type="text" name="id" >'
        +'  <br>'
        +'  PASSWORD:<br>'
        +'  <input type="text" name="password" >'
        +'  <br>'
        +'  NAME:<br>'
        +'  <input type="text" name="password" >'
        +'  <br>'
        +'  주민등록번호:<br>'
        +'  <input type="text" name="password" >'
        +'  <br>'
        +'  휴대폰 번호:<br>'
        +'  <input type="text" name="password" >'
        +'  <br><br>'
        +'  <input type="button"  value="확인" id="join_ok">'
        +'  <input type="button"  value="취소" >'
        +'</form> ';

        //회원가입 확인 버튼 객체 만들기
        let join_ok = document.querySelector('#join_ok')
    
        //확인 창 이벤트 걸기
        join_ok.addEventListener('click',() => {
    
            //로그인 폼으로 가기
            login_form();
        });
    }
        
    //클로저 : init의 값을 app으로 인식 시키기.
    //json형태로 리턴값 주기
    return {init : init};
})();