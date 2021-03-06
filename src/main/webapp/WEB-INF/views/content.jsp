<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.oredoo.entity.IUserDetail"%>
<%@ page import="com.oredoo.entity.misuser"%>
<%@ page import="com.oredoo.entity.AppStoreAPKDownload"%>




<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MIS-Interface</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" />
<!--===============================================================================================-->
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/images/icons/favicon.ico" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/util.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/main.css">
<!--===============================================================================================-->

<title>MIS Usage Portal</title>
<style>
.col, .col-1, .col-10, .col-11, .col-12, .col-2, .col-3, .col-4, .col-5,
	.col-6, .col-7, .col-8, .col-9, .col-auto, .col-lg, .col-lg-1,
	.col-lg-10, .col-lg-11, .col-lg-12, .col-lg-2, .col-lg-3, .col-lg-4,
	.col-lg-5, .col-lg-6, .col-lg-7, .col-lg-8, .col-lg-9, .col-lg-auto,
	.col-md, .col-md-1, .col-md-10, .col-md-11, .col-md-12, .col-md-2,
	.col-md-3, .col-md-4, .col-md-5, .col-md-6, .col-md-7, .col-md-8,
	.col-md-9, .col-md-auto, .col-sm, .col-sm-1, .col-sm-10, .col-sm-11,
	.col-sm-12, .col-sm-2, .col-sm-3, .col-sm-4, .col-sm-5, .col-sm-6,
	.col-sm-7, .col-sm-8, .col-sm-9, .col-sm-auto, .col-xl, .col-xl-1,
	.col-xl-10, .col-xl-11, .col-xl-12, .col-xl-2, .col-xl-3, .col-xl-4,
	.col-xl-5, .col-xl-6, .col-xl-7, .col-xl-8, .col-xl-9, .col-xl-auto {
	position: relative;
	width: 100%;
	min-height: 1px;
	padding-right: 15px;
	padding-left: 15px;
	float: left;
}

th {
	text-align: center;
}

img {
	height: 150px;
	width: 1250px;
}

.info {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 10pt;
	font-style: normal;
	font-weight: bold;
	padding-top: 10px;
	padding-bottom: 10px;
	text-align: center;
	margin-left: 20px;
}

option:hover {
	cursor: pointer;
}

.pick {
	background-color: #ffff;
}

input {
	border: 1px solid black;
}

.info2 {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 10px;
	text-align: center;
	margin: 20px;
	font-size: 14px;
}

.button {
	background-color: #DEDEDE;
	BORDER-RIGHT: #282568 2px solid;
	BORDER-BOTTOM: #282568 2px solid;
	height: 30px;
	width: 80px;
	font-size: 15px;
	text-align: center;
}

.header {
	overflow: hidden;
	background-color: #719e19;
	padding: 20px 10px;
	height: 90px;
}

.text {
	font-size: 27px;
	margin-left: 10px;
	color: white;
}

.header-right {
	float: right;
}

.header a.active {
	background-color: white;
	color: #719e19;
}

.header a {
	float: left;
	color: black;
	text-align: center;
	padding: 12px;
	text-decoration: none;
	font-size: 18px;
	line-height: 25px;
	border-radius: 4px;
}

#load {
	width: 100%;
	height: 100%;
	position: fixed;
	z-index: 9999;
	background:
		url("${pageContext.request.contextPath}/images/icons/giphy2.gif")
		no-repeat center center rgba(0, 0, 0, 0.25)
}
</style>

<script>
	/* $(document).ready(function() {
	 $('#example').DataTable();
	 } ); */

	$(document).ready(function() {
		$('#example').DataTable({
			"lengthMenu" : [ [ 20, 50, 100, -1 ], [ 20, 50, 100, "All" ] ]
		});
	});
	/* function toggle(source) {
		var checkboxes = document.querySelectorAll('input[type="checkbox"]');
		for (var i = 0; i < checkboxes.length; i++) {
			if (checkboxes[i] != source)
				checkboxes[i].checked = source.checked;
		}
	} */
</script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			maxDate : 0
		});
		///$("#datepicker").datepicker("setDate", -1)
		$("#datepicker").datepicker({
			defaultDate : 0
		});
	});
</script>
<script>
	$(function() {
		$("#datepicker2").datepicker({
			maxDate : 0
		});
		///$("#datepicker").datepicker("setDate", -1)
		$("#datepicker2").datepicker({
			defaultDate : 0
		});
	});
</script>
<script>
	function showDiv(divId, element) {
		document.getElementById(divId).style.display = element.value == 1 ? 'block'
				: 'none';
	}
	document.onreadystatechange = function() {
		var state = document.readyState
		if (state == 'interactive') {
			document.getElementById('contents').style.visibility = "hidden";
		} else if (state == 'complete') {
			setTimeout(
					function() {
						document.getElementById('interactive');
						document.getElementById('load').style.visibility = "hidden";
						document.getElementById('contents').style.visibility = "visible";
					}, 1000);
		}
	}
</script>

</head>
<body>
	<%-- <spring:eval
		expression="@environment.getProperty('server.context-path')"
		var="contextUrl" /> --%>
	<div id="load"></div>

	<div id="contents">

		<div class="static">
			<div class="header">
				<!--   <img class="logo" src="/PartnerReportingInterface/resources/img/EtisalatArenaLogo.png">
 -->
				<span class="text">Welcome To Usage Reports</span>
				<div class="header-right">
					<a class="active" href="${pageContext.request.contextPath}/logout">Logout</a>
				</div>
			</div>

			<%
				@SuppressWarnings("unchecked")
			List<IUserDetail> listUserDetails = (List<IUserDetail>) session.getAttribute("listuser");
			List<misuser> listMisDetails = new ArrayList<misuser>();

			if( request.getAttribute("misuser")!=null){
				 listMisDetails = (List<misuser>) request.getAttribute("misuser");

			}
			//List<AppStoreAPKDownload> listMisDetails2 = (List<AppStoreAPKDownload>) request.getAttribute("misuser");

			if (listMisDetails != null && listMisDetails.size() > 0) {
				long sec = (Long) request.getAttribute("totalUsage") != null ? (Long) request.getAttribute("totalUsage") : 0L;
				Date d = new Date(sec * 1000L);
				SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
				df.setTimeZone(TimeZone.getTimeZone("GMT"));
				String time = df.format(d);
				//System.out.println(""+time);
			%>
			<br />
			<p style="font-size: 20px; float: right">
				Total Usage:<%=time%></p>
			<br />
			<%
				}
			%>
		</div>

		<hr />
		<%
			/* 	Integer type = (Integer) request.getAttribute("type");
			if (type==1) { */

		if (listMisDetails != null && listMisDetails.size() > 0) {
		%>
		<div class="info2" id="content">

			<%-- 	<form method="post"
			action="${pageContext.request.contextPath}/getUNSUB"> --%>

			<!-- <p style="color: red">*The Figures Shown Below Is the total data
			from the 1st till the date selected Above for that Month .
		<p> -->
			<p style="font-size: 25px; float: center">
				Content Level Usage for
				<%=listMisDetails.get(0).getDateTime()%></p>
			<br />
			<table class="display" style="width: 100%" id="example">
				<caption>
					<b>Reporting Details</b>
				</caption>
				<thead>

					<tr>
						<th class="th" style="width: 200px; word-wrap: break-word;">Partner
							Name</th>
						<th class="th" style="width: 400px; word-wrap: break-word;">App
							Name</th>
						<%-- 					<%if(((Integer) request.getAttribute("content"))==2){ %>
 --%>
						<!-- <th class="th" style="width: 400px; word-wrap: break-word;">Content
						Name</th> -->

						<%-- 					<% }%>
 --%>
						<th class="th" style="width: 400px; word-wrap: break-word;">Content-name</th>
						<th class="th" style="width: 400px; word-wrap: break-word;">Content
							Type</th>
						<th class="th" style="width: 200px; word-wrap: break-word;">Time
							Consumed</th>
						<!-- <th class="th" style="width: 200px; word-wrap: break-word;">Total
						Data Used(KB)</th> -->

						<!-- 				<th class="th" style="width: 100px; word-wrap: break-word;">Month</th>
 -->



					</tr>
				</thead>
				<tbody>


					<%
						for (misuser objMisDetails : listMisDetails) {
						long sec2 = objMisDetails.getForegroundTime() != null ? objMisDetails.getForegroundTime() : 0L;
						Date d2 = new Date(sec2 * 1000L);
						SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
						df.setTimeZone(TimeZone.getTimeZone("GMT"));
						String time2 = df.format(d2);
						/* String sDate1 = objMisDetails.getDateTime();
						Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
						
						SimpleDateFormat df_time = new SimpleDateFormat("dd-MM-yyyy");
						String time_date = df_time.format(date1); */
					%>
					<tr>
						<td class="td"><%=objMisDetails.getDateTime()%></td>

						<td class="td"><%=objMisDetails.getAppName()%></td>

						<%-- 	<%if(((Integer) request.getAttribute("content"))==2){ %>
					<td class="td"><%=objMisDetails.getMonth()%></td>

					<% }%> --%>
						<td class="td"><%=objMisDetails.getPackageName()%></td>

						<td class="td"><%=objMisDetails.getType() == 1 ? "Game" : (objMisDetails.getId() == 2 ? "Video/Stream" : "Music/Stream")%></td>


						<td class="td"><%=time2%></td>



					</tr>
					<%
						}
					%>
				</tbody>

			</table>

			<!-- 		</form>
 -->
		</div>
		<%
			}
		%>
	</div>
</body>
</html>