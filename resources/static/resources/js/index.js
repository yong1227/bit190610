// use
var app =  {
    $wrapper :  $wrapper = document.querySelector('#wrapper'),
    init : init,
    mypage : mypage,
    login_form : login_form,
    join_form : join_form,
    join : join,
    count : count
};

    function init (){
        $wrapper.innerHTML = app.login_form();
        let join_btn = document.querySelector('#join-btn');
        join_btn.addEventListener('click',()=>{
            $wrapper.innerHTML = app.join_form();
            document.getElementById('confirm-btn')
            .addEventListener('click', e=>{
                e.preventDefault();
                alert('조인버튼 클릭');
                app.join();
            });
        });
        let login_btn = document.querySelector('#login-btn');
        login_btn.addEventListener('click',e=>{
            e.preventDefault();
            alert('로그인 버튼 클릭');
            id = document.getElementById('customerId').value;
            pass = document.getElementById('password').value;
            let xhr = new XMLHttpRequest();
            xhr.open('GET', 'customers/'+id+'/'+pass, true);
            xhr.onload=()=>{
                if(xhr.readyState=== 4 && xhr.status === 200){
                    if(xhr.responseText){
                        $wrapper.innerHTML = app.mypage();
                    }else{
                        $wrapper.innerHTML = app.login_form();
                    }
                }
            };
            xhr.send();
        });
    }
    function join(){
        let xhr = new XMLHttpRequest();
        let data = {
            customerId : document.getElementById('customerId').value, 
            customerName : document.getElementById('customerName').value,
            password : document.getElementById('password').value
        };
        xhr.open('post','customers',true);
        xhr.setRequestHeader('Content-type','application/json; charset=utf-8')
        xhr.onload=()=>{
            if(xhr.readyState===4 && xhr.status===200){
                let d = xhr.responseText;
                alert('회원가입 성공'+d.result);
            }else{
                alert('회원가입 실패');
            }
        }
        xhr.send(JSON.stringify(data));
    }
    function count (){
        let xhr = new XMLHttpRequest();
        xhr.open('GET', 'customers/count', true);
        xhr.onload=()=>{
            if(xhr.readyState===4 && xhr.status === 200){
                alert('성공');
                let wrapper = document.querySelector('#wrapper');
                wrapper.innerHTML = '총 고객수 : <h1>'+xhr.responseText+'</h1>'
            }
        }
    }


function mypage (){
    return '<h1>마이페이지</h1> ';
};

function login_form(){
    return '<form action="/action_page.php">'
    +'  First name:<br>'
    +'  <input type="text" id="customerId" name="customerId">'
    +'  <br>'
    +'  Last name:<br>'
    +'  <input type="text" id="password" name="password">'
    +'  <br><br>'
    +'  <input id="login-btn" type="button" value="LOGIN">'
    +'  <input id="join-btn" type="button" value="JOIN">'
    +'</form> ';
};
function join_form(){
    return '<form>아이디<br>'
    +'	<input type="text" name="id" id="customerId"><br>'
    +'	비밀번호<br>'
    +'	<input type="password" name="password" id="password"><br>'
    +'	이름<br>'
    +'	<input type="text" name="name" id="customerName"><br>'
    +'	<br><br>'
    +'	<input id="confirm-btn" type="submit" value="확인">'
    +'	<input id="cancel-btn" type="reset" value="취소">'
    +'</form>';
}