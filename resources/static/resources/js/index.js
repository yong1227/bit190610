//IIFE 실습
//()안에 있는 것은 즉시 실행해라.
var app = (function(){
    let init = function(){
        //init 과 login_form은 형제관계라 호출 가능
        login_form();
    }
    let login_form = function(){
        var wrapper = document.querySelector('#wrapper');
        wrapper.innerHTML = '<form >'
        +'  ID:<br>'
        +'  <input type="text" name="id" value="">'
        +'  <br>'
        +'  PASSWORD:<br>'
        +'  <input type="text" name="password" value="">'
        +'  <br><br>'
        +'  <input type="submit"  value="로그인" id=btn>'
        +'  <input type="submit"  value="회원가입" id=btn2>'
        +'</form> ';
            
        //btn은 객체가 된다. 셀렉할 수 있다. id나 class로 셀렉할 수 있으면 컴포넌트가 된다.
        var btn = document.querySelector('#btn');
        //회원가입 창
        var btn2 = document.querySelector('#btn2');

        //로그인 창
        btn.addEventListener('click',function(){
            alert('로그인 성공');
        });
        
        //회원가입 창
        btn2.addEventListener('click',function(){
            wrapper.innerHTML = '<form action="">'
            +'  아이디:<br>'
            +'  <input type="text" name="id" value="">'
            +'  <br>'
            +'  비밀번호:<br>'
            +'  <input type="text" name="password" value="">'
            +'  <br>'
            +'  이름:<br>'
            +'  <input type="text" name="name" value="">'
            +'  <br>'
            +'  주민등록번호:<br>'
            +'  <input type="text" name="ssn" value="">'
            +'  <br>'
            +'  휴대폰 번호:<br>'
            +'  <input type="text" name="phon" value="">'
            +'  <br><br>'
            +'  <input type="submit"  value="확인" id=btn3>'
            +'</form> ';
        });
    // 회원가입 확인 창 객체 생성
        bit3.addEventListener('click',function(){
            
        })
     

    }
    //클로저 : init의 값을 app으로 인식 시키기.
    //json형태로 리턴값 주기
    return {init : init};
})();