
function data_create(){
    alert("저장");

    let name = $("#name").val();
    let phone = $("#phone").val();
    let memo = $("#memo").val();

    $.ajax({    //비동기
        url : "create",//통신경로
        method : "post",//통신방식
        data:{"name":name,"phone":phone,"memo":memo},//통신데이터
        success : function(re){//통신응답
            alert("RESTFUL create 통신");
        }
    });
}

function data_read(){
    alert("호출");
    $.ajax({
            url : "read",
            method : "get"
            success : function(re){
                alert("RESTFUL read 통신");
            }
        });
}

function data_update(){
    alert("수정");
    $.ajax({
            url : "update",
            method : "put",
            success : function(re){
                alert("RESTFUL update 통신");
            }
        });
}

function data_delete(){
    alert("삭제");
    $.ajax({
            url : "delete",
            method : "delete"
            success : function(re){
                alert("RESTFUL delete 통신");
            }
        });
}