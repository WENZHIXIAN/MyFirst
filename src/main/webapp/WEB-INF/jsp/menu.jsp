<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="span10 last">
	<div class="topNav clearfix">
		<ul>
		<c:choose>
			<c:when test="${session.existUser == null}">
			<li id="headerLogin" class="headerLogin" style="display: list-item;">
				<a href="${ pageContext.request.contextPath }/user_loginPage.action">登录</a>|</li>
			<li id="headerRegister" class="headerRegister"
				style="display: list-item;"><a href="${ pageContext.request.contextPath }/user_registPage.action">注册</a>|
			</li>
			</c:when>
			<c:otherwise>
			<li id="headerLogin" class="headerLogin" style="display: list-item;">
				${session.existUser.name}
				|</li>
			<li id="headerLogin" class="headerLogin" style="display: list-item;">
				<a href="#">我的订单</a>
			|</li>
			<li id="headerRegister" class="headerRegister"
				style="display: list-item;"><a href="${ pageContext.request.contextPath }/user_quit.action">退出</a>|
			</li>
			</c:otherwise>
			</c:choose>
		
			<li><a>会员中心</a> |</li>
			<li><a>购物指南</a> |</li>
			<li><a>关于我们</a></li>
		</ul>
	</div>
	<div class="cart">
		<a href="./购物车.htm">购物车</a>
	</div>
	<div class="phone">
		客服热线: <strong>96008/53277764</strong>
	</div>
</div>
<div class="span24">
	<ul class="mainNav">
		<li><a href="./index.action">首页</a> |</li>
		<c:forEach items="${firstcategorys }" var="fc">
		<li><a href="./categorySecond.action?firstcategoryId=${fc.cid }">${fc.cname }</a> |</li>
		</c:forEach>
		

	</ul>
</div>