<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<head>
<title>Sample Cassius MeterWorks - v12</title>

<link rel="stylesheet" href="css/MeterWorks.css" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/gxt-all.css" />
<!-- <link rel="stylesheet" type="text/css" href="css/gxt-gray.css" />-->
<link rel="stylesheet" type="text/css" href="css/xtheme-slate.css" />
<link rel="icon" href="images/gears_tn.png">
</head>

<body>
<!--                                            -->
<!-- This script is required bootstrap stuff.   -->
<!--                                            -->
<script type="text/javascript" language="javascript" src="MySampleApplication/MySampleApplication.nocache.js"></script>


<!-- OPTIONAL: include this if you want history support -->
<iframe id="__gwt_historyFrame" style="width: 0; height: 0; border: 0"></iframe>

<div id="application">
	<div id="header">
		<div id="appIcon">Sample Cassius MeterWorks&nbsp;&nbsp;<img src="./images/gears_tn.png" style="border-width: 0px;" /><br/>
		<%--<span id="version"><script type="text/javascript" src="rpc/version"></script></span></div>--%>
		<div id="userInfo">User: <span class="userName">${currentUsername}</span> &nbsp;&nbsp;[<a href="j_spring_security_logout" style="text-decoration: none; color: #000;">Logout</a>]</div>
	</div>
	<div id="contentPanel">
	</div>
</div>
</body>
</html>
