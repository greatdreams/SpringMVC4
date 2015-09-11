<%-- 
    Document   : form.jsp
    Created on : Mar 11, 2015, 6:10:24 PM
    Author     : greatdreams
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<ol class="breadcrumb">
    <li class="active"><a href="#">Home</a></li>
</ol>
<div class="container">
	<div>
		<form class='form' action="/springmvc4/feedback" method="post">
			<label for='username'>用户名</label>
			<input class='form-control' type='text' name='username' value='王华伟'/>
			<br/>
			<label for='comment'>评论</label>
			<br/>
			<textarea class='form-control' name='comment' col='50' row='3'>
				这是一条中文评论
			</textarea>
			<br/>
			<input class='form-control btn btn-primary' type='submit' name='submit' value='提交' />
		</form>
	</div>
</div>