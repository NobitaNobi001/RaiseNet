<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <base href="http://${pageContext.request.serverName }:${pageContext.request.serverPort }/"/>
    <script type="text/javascript" src="./jquery/jquery-2.1.1.min.js"></script>
</head>
<body>
<a href="test/ssm.html">测试SSM整合环境</a>

<br/>
<button id="btn1">test1</button>
<button id="btn2">test2</button>
</body>
<script type="text/javascript">
    $(function () {
        $("#btn1").click(function () {
            $.ajax({
                url: "send/array/one.html",
                type: "post",
                data: {
                    "array": [5, 8, 12]
                },
                dataType: "text",
                success: function (response) {

                },
                error: function (response) {

                }
            })
        });
    });
</script>
</html>
