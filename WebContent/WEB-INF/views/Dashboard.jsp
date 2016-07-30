<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>

	<link rel="stylesheet" type="text/css" href="Css/bootstrap.css"/> 
 	<link rel="stylesheet" type="text/css" href="Css/stylesheet.css"/> 
 	<script type="text/javascript" src="Js/bootstrap.js"></script>
	<script type="text/javascript" src="Js/general.js"></script>
	<script type="text/javascript" src="Js/jquery.js"></script>
	<script type="text/javascript" src="Js/login.js"></script>

</head>
<body>
	<div id="header" class="container-fluid">
		<div class="col-sm-1">
			<img src="img/logo.png" style="height: 80px; width: 80px"/>
		</div>
		<div class="col-sm-11">
			<h1 class="text-center">Wee to Customization and Configuration Panel!</h1>
			
			<h2>Welcome ${key}</h2>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="logout.html">Logout</a>
		</div>
	</div>
	<div id="body" class="container-fluid">
		<div id="sidebar-wrapper" class="col-sm-2 lr0pad">
            <ul class="sidebar-nav">
                <li>
                    <a href="#"><span class="glyphicon glyphicon-share"></span> Dashboard</a>
                </li>
                <li>
                    <a href="querymanager/1"><span class="glyphicon glyphicon-ok"></span> Shortcuts</a>
                </li>
                <li>
                    <a href="#"><span class="glyphicon glyphicon-ok"></span> Overview</a>
                </li>
                <li>
                    <a href="#"><span class="glyphicon glyphicon-ok"></span> Events</a>
                </li>
                <li>
                    <a href="#"><span class="glyphicon glyphicon-ok"></span> About</a>
                </li>
                <li>
                    <a href="#"><span class="glyphicon glyphicon-ok"></span> Services</a>
                </li>
                <li>
                    <a href="#"><span class="glyphicon glyphicon-ok"></span> Contact</a>
                </li>
                <li>
                    <a href="#"><span class="glyphicon glyphicon-ok"></span> Services</a>
                </li>
                <li>
                    <a href="#"><span class="glyphicon glyphicon-ok"></span> Contact</a>
                </li>

            </ul>
        </div>
        <div class="col-sm-10">
        	<h1>The content goes here!</h1>
        </div>
	</div>
	<div id="footer" class="container-fluid">
		<center>
			<h3>
				<a href="">Contact us</a>
				<a href="">Privacy Policy</a>
				<a href="">Cookies</a>
				<a href="">Copyright</a>
			</h3>
		</center>
	</div>
</body>

</body>
</html>