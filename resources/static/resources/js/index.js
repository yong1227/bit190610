//IIFE 실습
//()안에 있는 것은 즉시 실행해라.
// = 할당 연산자 썼다. init 도 기능이니까 app은 할당연산자 사용해서 속성으로 기능을 받았다.
var app = (() => {
    let $wrapper;
    let init = () => {
        $wrapper = document.querySelector('#wrapper');
        //init 과 login_form은 형제관계라 호출 가능
        login();
    }

    //login form만들기
    let login = () => {
        $wrapper.innerHTML = app.login_form();

        // 회원가입 버튼을 선택할 수 있게 객체 만들기
        let join_btn = document.querySelector('#join_btn')

        // 옵저버 버튼/ 회원가입 버튼에 이벤트 걸기
        join_btn.addEventListener('click',() => {
            //회원가입 버튼 누르면 회원가입 폼 함수를 실행해줘
            join_form();
        });

        let login_btn = document.querySelector('#login_btn');
        login_btn.addEventListener('click',(e)=>{
            e.preventDefault();
            alert('로그인 버튼 클릭');
            // count();
            // 로그인 input 값 받기
            // textbox안에 있는 값을 받아오는 것
            id=document.getElementById('customerId').value;
            pass=document.getElementById('password').value;


            let data = {password:pass};
            let json = JSON.stringify(pass);


            let xhr = new XMLHttpRequest();
            xhr.open('GET','customers/'+id,true);
            xhr.setRequestHeader('Contect-type','application/json;charset=utf-8;')
            xhr.onload=()=>{
                if(xhr.readyState===4 && xhr.status===200){
                    if(xhr.responseText){
                        $wrapper.innerHTML = app.mypage();
                    }else{
                        alert('로그인 실패');
                        $wrapper.innerHTML = app.login_form();
                    }
                }
            };
            xhr.send(json);
        });
    }

    let count =() => {
        //xhr 인스턴스 만들기
        let xhr = new XMLHttpRequest();
        method = 'GET';
        //count url을 사용한다.
        url='count';
        //메소드와 url을 열고
        xhr.open(method,url,true);
        //함수 데이터가 변환할 준비가 됐다.
        xhr.onreadystatechange=()=>{
            // 준비상태가 정상, 정상이면
            if(xhr.readyState===4 && xhr.status === 200){
                //수행할 내용
                alert('성공');
                let wrapper = document.querySelector('#wrapper');
                wrapper.innerHTML = ' 총 고객수 : <h1>'+xhr.responseText+'</h1>'
            }
        }
        //준비상태 끝나면 보낸다.
        xhr.send();
    }

    //join form 만들기
    let join_form = () => {
        $wrapper.innerHTML = app.join_form();

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

//app 영역 바깥에 만들어야 한다.
  // 로그인 성공시
app.mypage= () => {
    // let wrapper = document.querySelector('#wrapper');
    //  wrapper.innerHTML = 
    return '<h1>마이페이지</h1>';
};

// 회원가입폼 
app.join_form = () =>{
    // wrapper 영역 전체에 보여질 내용 객체 만들기
    return  '<form >'
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
};

//로그인 폼
app.login_form=()=>{
    // wrapper는 DOM 객체
    return '<form >'
    +'  ID:<br>'
    +'  <input type="text" name="customerId" id="customerId">'
    +'  <br>'
    +'  PASSWORD:<br>'
    +'  <input type="text" name="password" id="password">'
    +'  <br><br>'
    +'  <input type="button"  value="로그인" id=login_btn>'
    +'  <input type="button"  value="회원가입" id=join_btn>'
    +'</form> ';
};