<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <script src="https://code.jquery.com/jquery-2.2.4.js"></script>
    <title>과제</title>
    <style type='text/css'>
        textarea {
            vertical-align: top;
        }
    </style>
</head>
<body>
    <div>
        <label for="inputValue">입력</label>
        <textarea  textarea id="inputValue" name="inputValue" cols="100" rows="10" ></textarea>
    </div><br/>
    <div>
        <label for="condition">출력묶음 조건</label>
        <input type="text" id="condition" name="condition" placeholder="condition" value="1">
        <button id="btn">출력</button>
    </div><br/>

    <div>
        <label for="share">몫: </label>
        <label id="share"></label>
    </div>
    <div>
        <label for="balance">나머지: </label>
        <label id="balance"></label>
    </div><br/>

<script type="text/javascript">
    $(document).ready(function(){
        //
        $('#btn').click(function(){
            //
            var inputValue = $('#inputValue').val();
            var condition = $('#condition').val();

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
            //
            $.ajax({
                url: '${pageContext.request.contextPath}/outputs?inputValue=' + encodeURIComponent(inputValue) + '&condition=' + condition,
                type: 'GET',
                dataType: 'json',
                success: function(data) {
                    $('#share').text(data.share);
                    $('#balance').text(data.balance);
                },
                complete: function(){}
                ,error: function(data, status, err) {}
            });
        }
    });

</script>
</body>
</html>