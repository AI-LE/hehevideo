<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.demo.servlet.SaveVideoServlet" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%	String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>layout 后台大布局 - Layui</title>
  <link rel="stylesheet" href="./css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">layui 后台布局</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-bg-cyan">
      <li class="layui-nav-item"><a href="">控制台</a></li>
      <li class="layui-nav-item"><a href="">商品管理</a></li>
      <li class="layui-nav-item"><a href="">用户</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right ">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          贤心
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-cyan ">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree layui-bg-cyan"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">信息管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">信息展示列表</a></dd>
            <dd><a href="javascript:;">列表二</a></dd>
            <dd><a href="javascript:;">列表三</a></dd>
            <dd><a href="">超链接</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">解决方案</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">列表一</a></dd>
            <dd><a href="javascript:;">列表二</a></dd>
            <dd><a href="">超链接</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item"><a href="">云市场</a></li>
        <li class="layui-nav-item"><a href="">发布商品</a></li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">
        <!-- <blockquote class="layui-elem-quote layui-text">
  鉴于小伙伴的普遍反馈，先温馨提醒两个常见“问题”：1. <a href="/doc/base/faq.html#form" target="_blank">为什么select/checkbox/radio没显示？</a> 2. <a href="/doc/modules/form.html#render" target="_blank">动态添加的表单元素如何更新？</a>
</blockquote> -->
              
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
  <legend>视频上传页面</legend>


</fieldset>
      <form class="layui-form" action="SaveVideoServlet">

  <div class="layui-upload">
    <button type="button" class="layui-btn layui-btn-normal" id="test8" style="margin-left: 50px;">选择文件</button>
    <%--<button type="button" class="layui-btn" id="test9">开始上传</button>--%>
  </div>
  <br><br>

  <div class="layui-form-item">
    <label class="layui-form-label">视频标题</label>
    <div class="layui-input-block">
      <input type="text" name="videoName" id="videoName" autocomplete="off" placeholder="请输入视频标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">视频分类</label>
    <div class="layui-input-block">
      <select name="videoTypeId" id="videoTypeId" lay-filter="aihao">
        <option value=""></option>
        <option value="0" selected="">美女</option>
        <option value="1">搞笑</option>
        <option value="2">新闻</option>
        <option value="3">音乐</option>
        <option value="4">旅行</option>
      </select>
    </div>


  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">视频描述</label>
    <div class="layui-input-block">
      <textarea name="videoInfo" id="videoInfo" placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>

  
  <br><br>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" id="ttest"  lay-submit="" lay-filter="demo1">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>

 <%--<div class="layui-upload-drag" id="test10">--%>
    <%--<i class="layui-icon"></i>--%>
    <%--<p>点击上传，或将文件拖拽到此处</p>--%>
  <%--</div>--%>
        <%--<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">--%>
            <%--<legend>选完文件后不自动上传</legend>--%>
        <%--</fieldset>--%>

    </div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>


<script src="./layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
  layui.use('form', function(){
    var form = layui.form;
    //各种基于事件的操作，下面会有进一步介绍
  });

  layui.use(['form', 'layedit', 'laydate'], function(){
    var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

    //日期
    laydate.render({
      elem: '#date'
    });
    laydate.render({
      elem: '#date1'
    });

    //创建一个编辑器
    var editIndex = layedit.build('LAY_demo_editor');

    //自定义验证规则
    form.verify({
      title: function(value){
        if(value.length < 5){
          return '标题至少得5个字符啊';
        }
      }
      ,pass: [
        /^[\S]{6,12}$/
        ,'密码必须6到12位，且不能出现空格'
      ]
      ,content: function(value){
        layedit.sync(editIndex);
      }
    });

    //监听指定开关
    form.on('switch(switchTest)', function(ƒ){
      layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
        offset: '6px'
      });
      layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
    });

    //监听提交
    form.on('submit(demo1)', function(data){
      if (data.field.file == ""){
        alert("未选择文件");
        return false;
      }
      // layer.alert(JSON.stringify(data.field), {
      //   title: '最终的提交信息'
      // })
      // return false;
    });

    //表单初始赋值
    form.val('example', {
      "username": "贤心" // "name": "value"
      ,"password": "123456"
      ,"interest": 1
      ,"like[write]": true //复选框选中状态
      ,"close": true //开关状态
      ,"sex": "女"
      ,"desc": "我爱 layui"
    })


  });
</script>
<script>



layui.use('upload', function(){
  var $ = layui.jquery
  ,upload = layui.upload;

  //选完文件后不自动上传
    upload.render({
        elem: '#test8'
        ,url: '<%=basePath%>UploadHandleServlet'
        ,auto: false
        ,accept:'file'
        //,multiple: true
        ,bindAction: '#ttest'
        ,done: function(res){
          if (res.code ==0){
            alert("文件上传失败！");
          }else{
            alert("文件上传成功");
          }
            console.log(res)
        }
    });

  //拖拽上传
  upload.render({
    elem: '#test10'
    ,url: '<%=basePath%>UploadHandleServlet'
    ,accept:'file'
    ,done: function(res){
      console.log(res)
      if (res.code == 0){
        kevin = 10;
        alert("上传成功");
      }
    }
  });
});
</script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
});
</script>
</body>
</html>