<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%	String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript">
        $(function() {
            $.ajax({
                type:"get",  //请求方式
                url: "FindAllVideoServlet",     //请求地址
                data: {},
                cache: false,   //去除缓存
                async : false,   //同步
                dataType: "JSON",
                success: function (data ,textStatus, jqXHR)
                {
                    //请求成功之后，后台数据赋值给data参数
                    alert("保存成功")
                    viewList(data.video);
                },
                error:function (XMLHttpRequest, textStatus, errorThrown) {
                    //请求失败之后执行这个
                    alert("请求为空或用户已存在");
                    /* alert(textStatus);
                    alert(errorThrown); */
                }
            });
        });

        function viewList(dd){
                var url="http://39.97.101.71/";
                var html = '';

                for(var i = 0; i < dd.length; i++){
                    html += '<video controls><source id="'+dd[i].url+'" src='+url + dd[i].url + '/></video>';
                }
                $('body').empty().append(html);//数据绑定
        }
    </script>
</head>
<body>

asdf

</body>
</html>
