<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import = "blog_rss.naver_blog_rss"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>셀렉트 박스</title>

<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.8.3.min.js"></script>
<!-- script type='text/javascript' src="/share/js/jcarousellite-1.8.7.min.js"></script-->
<script type='text/javascript'
	src="http://kswedberg.github.io/jquery-carousel-lite/src/jquery.jcarousellite.js"></script>
</head>
<body>

	<%
	
	System.out.println("111");
	naver_blog_rss blogrss = new naver_blog_rss();

	System.out.println(blogrss.a1);
	%>
	
	<%=blogrss.a1 %>
   



</body>
</html>