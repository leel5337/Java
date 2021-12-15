const express = require('express');
const app = express(); // 설치한 라이브러리를 이용해서 새로운 객체를 만드는 것(이해필요x)

app.listen(8080, function(){
    console.log('listening on 8080')
}); //어디에 서버를 열지

app.get('/pet', function(요청, 응답){
    응답.send('펫용품 쇼핑할 수 있는 페이지입니다')
}) // 누군가가 /pet 으로 방문을 하면 pet 관련된 안내문을 띄어준다

app.get('/', function(요청, 응답){
    응답.sendFile(__dirname + '/index.html')
});
