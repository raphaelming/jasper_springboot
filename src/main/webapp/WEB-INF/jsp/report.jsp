<%--
  Created by IntelliJ IDEA.
  User: iminhyeog
  Date: 2019-01-15
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
<div>
    <a href="/report/viewer">Generate Product Report</a><br><br>
    <a href="" onclick="openNewWindowForJasperWithCharts();">Generate Product Report(pdf)</a><br><br>
    <button id="test">test button</button><br><br>
</div>
<div id = "pdf">
    <%--<iframe src="/student/grd" width="800", height="800", name="testing"></iframe>--%>
</div>



</body>
<script language="JavaScript">
    console.log('script loaded')
    var pdfList = document.getElementById('pdf')
    var str = ''
    var frame = document.getElementById('frame')
    function innerHtmlAction(){
        console.log('inner')
        pdfList.innerHTML = str;
    }
    function openNewWindowForJasperWithCharts(){
        var url  = "/report/pdf";
        var strWindowFeatures = "menubar=no,location=no,width=800,height=500";
        window.open(url,"_blank", "location=0,height=500,width=800");
    }
    $('#test').on('click', function () {
        console.log('button click')
        str += '<iframe src="/student/grd" width="800", height="800, name="testing", id="frame">'+'</iframe>'
        innerHtmlAction()
    })

</script>

</html>
