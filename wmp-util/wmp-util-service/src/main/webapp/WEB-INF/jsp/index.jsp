<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
   <%-- <script src="../js/jquery3-1-1.js"></script>--%>
    <script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
    <title>과제</title>
</head>
<body>
<div>
    입력<textarea id="inputValue" cols="100" rows="10"></textarea>
    <br>
    출력묶음 조건 <input type="text" id="condition">
    <br>
    <button id="btn">출력</button>
    <br>
    몫: <label id="share"></label>
    <br>
    나머지: <label id="balance"></label>
</div>

<script type="text/javascript">
    $(document).ready(function(){
        //
        $('#btn').click(function(){
            var inputValue = $("#inputValue").val();
            var condition = $("#condition").val();

            if(inputValue === ""){
                alert("문자를 입력해주세요.")
                return ;
            }

            var regNumber = /^[0-9]*$/;
            if(condition === "" || !regNumber.test(condition)) {
                alert('숫자만 입력해주세요.');
                return;
            }

            getOutputs(inputValue, condition);
        });

        function getOutputs(inputValue, condition){
            $.ajax({
                url: '${pageContext.request.contextPath}/outputs?inputValue=' + inputValue + '&condition=' + condition,
                type: 'GET',
                dataType: 'json',
                success: function(data) {
                    $("#share").text(data.share);
                    $("#balance").text(data.balance);
                },
                complete: function(){
                }
                ,error: function(data, status, err) {
                }
            });
        }
    });

</script>
</body>
</html>