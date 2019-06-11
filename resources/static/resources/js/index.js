alert('자바스크리브 연결 성공!!');

var wrapper = document.querySelector('#wrapper');
wrapper.innerHTML = '<h1>SPA 시작</h1>'
+'<div class=target>삭제할 내용</div>'
+'<button id="btn">지워버리자</button>'
+'<button id="btn2">추가하자</button>';

var btn = document.querySelector('#btn');
//btn은 객체가 된다. 셀렉할 수 있다. id나 class로 셀렉할 수 있으면 컴포넌트가 된다.
var target = document.querySelector("#target");

btn.addEventListener('click',function(){
    // alert('지울꺼야');
    // wrapper.innerHTML = '<h1>SPA 시작</h1>'+'<button id="btn">지워버리자</button>';
    target.innerHTML = '';
});
var btn2 = document.querySelector('#btn2');

//target 글자를 다시 넣기
btn2.addEventListener('click',function(){
    var temp = document.createTextNode('새로 추가됨');
    target.appendChild(temp);
});


