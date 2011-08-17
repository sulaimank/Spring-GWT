<%
	boolean failedLogin = false;
	boolean logoutSuccess = false;
	boolean timeout = false;
	String message = null;

	if(request.getParameter("login") != null && request.getParameter("login").equals("failed")) {
		failedLogin = true;
	} else if(request.getParameter("logout") != null && request.getParameter("logout").equals("success")) {
		logoutSuccess = true;
	} else if(request.getParameter("timeout") != null) {
        timeout = true;
    }
%>
<html>
  <head>
  	<title>Welcome to Cassius MeterWorks v12</title>
    <%--<script type="text/javascript" language="javascript" src="meterworks/meterworks.nocache.js"></script>--%>
  	<link rel="icon" href="images/gears_tn.png">
  	<link rel="stylesheet" href="css/MeterWorks.css" type="text/css" />
  </head>
  <body bgcolor="#6b869f">
  <div id="loginTopSpacer"></div>
  <div id="mainLogin">
	  <div id="login">
		  <div id="loginHeading">
		  	Cassius Meter Works
		  </div>
		  <div id="loginForm">
		  	<form action="j_spring_security_check" method="POST">
	  	    	<table>
	  	    		<%
	  	    			if(failedLogin) {
	  	    		%>
			  	    		<tr>
			  	    			<td colspan="2" style="font-size: 12px; text-align: center; color: #FFF;">
			  	    				You entered an invalid username/password
			  	    			</td>
			  	    		</tr>
			  	    <%
			  	    	} else if(logoutSuccess) {
			  	    %>
			  	    		<tr>
			  	    			<td colspan="2" style="font-size: 12px; text-align: center; color: #FFF;">
			  	    				You have been successfully logged out
			  	    			</td>
			  	    		</tr>
	                <%
	                    } else if(timeout) {
	                %>
	                        <tr>
	                            <td colspan="2" style="font-size: 12px; text-align: center; color: #FFF;">
	                                Your session timed out - please login again
	                            </td>
	                        </tr>
	                <%
	                    }
	                %>
	  	    		<tr>
	  	    			<td style="text-align: right; color: #FFF;">
	  	    				Username:
	  	    			</td>
						<td style="text-align: right;">
	  	    				<input type="text" size="15" name="j_username" value="" />
	  	    			</td>
	  	    		</tr>
	  	    		<tr>
	  	    			<td style="text-align: right; color: #FFF;">
	  	    				Password:
	  	    			</td>
						<td style="text-align: right;">
	  	    				<input type="password" size="15" name="j_password" value="" />
	  	    			</td>
	  	    		</tr>
	  	    		<tr>
	  	    			<td style="width: 50%;">&nbsp;</td>
						<td style="text-align: right;">
	  	    				<input type="submit" value="Submit" />
	  	    			</td>
	  	    		</tr>
	  	    	</table>
	  	    	</form>
		  </div>
		  <div id="loginImage">
		  	<img src="./images/gears_sm.png"/>
		  </div>
	  </div>
	  </div>
  </body>
</html>