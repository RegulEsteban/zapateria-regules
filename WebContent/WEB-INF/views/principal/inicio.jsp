<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>.:: Bienvenido ::.</title>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/THEME/ducksboard/dist/jquery.gridster.css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/THEME/ducksboard/libs/style.css">
	</head>
	<body>
		<div role="main">	
		    <section class="demo">
		        <div class="gridster">
		          <ul>
		            <li data-row="1" data-col="1" data-sizex="2" data-sizey="1"><a href="login.do">Login</a></li>
		            <li data-row="3" data-col="1" data-sizex="1" data-sizey="1"></li>
		
		            <li data-row="3" data-col="2" data-sizex="2" data-sizey="1"></li>
		            <li data-row="1" data-col="2" data-sizex="2" data-sizey="2"></li>
		
		            <li class="try" data-row="1" data-col="4" data-sizex="1" data-sizey="1" data-max-sizex="1" data-max-sizey="1"></li>
		            <li data-row="2" data-col="4" data-sizex="2" data-sizey="1"></li>
		            <li data-row="3" data-col="4" data-sizex="1" data-sizey="1"></li>
		
		            <li data-row="1" data-col="5" data-sizex="1" data-sizey="1"></li>
		            <li data-row="3" data-col="5" data-sizex="1" data-sizey="1"></li>
		
		            <li data-row="1" data-col="6" data-sizex="1" data-sizey="1"></li>
		            <li data-row="2" data-col="6" data-sizex="1" data-sizey="2"></li>
		          </ul>
		        </div>
		    </section>
	    </div>
	    <script src="<%=request.getContextPath()%>/THEME/ducksboard/libs/jquery-1.7.2.min.js" type="text/javascript"></script>
		<script src="<%=request.getContextPath()%>/THEME/ducksboard/dist/jquery.gridster.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$(function(){ //DOM Ready
				$(".gridster ul").gridster({
		        	widget_margins: [10, 10],
		        	widget_base_dimensions: [140, 140]
	    		});
			});
		</script>
	</body>
</html>