<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
<script
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
	  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<script
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	
	<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css"/>
	
<title>Etisalat Arena</title>
<style>
.t1 {
	border-collapse: collapse;
}

caption {
	align-content: center;
	background: #B1AFCF;
	height:40px;
}

.detailsT, .th, .td {
	
}

.t1, .t2 {
	border: 1px solid black;
	background: #6B8E23;
		margin-top: 10px;
		text-align:left;
		font-size: 15px;

	}
	.pick,.selectp {
	height:30px;
	width: 250px;
font-size: medium;
	}

.full-width {
	margin-left: 20px;
	margin-right: 20px;
}
img{height:150px;
width: 1250px; 
}
.info {
font-family: Arial, Helvetica, sans-serif;
font-size: 10pt;
font-style: normal;
font-weight: bold;
	padding-top: 20px;
		padding-bottom: 20px;
	
	text-align: center;
	margin-left: 400px;
}


select {
    -moz-border-radius: 4px;
    -moz-box-shadow: 1px 1px 5px #cfcfcf inset;
    border: 1px solid #cfcfcf;
    vertical-align: middle;
    background-color:#ffff;
}
option {
    background-color: #fef5e6;
    border-bottom: 1px solid #ebdac0;
    border-right: 1px solid #d6bb86;
    border-left: 1px solid #d6bb86;
      font-size:15px;
    
}
option:hover {
    cursor: pointer;
}
.pick {
    background-color:#ffff;

}
.info2 {
    border: 1px solid black;
	border-collapse: collapse;
	padding-top: 10px;
	text-align: center;
	margin-left: 5	0px;
	font-size: 14px;
}

.button {
background-color: #DEDEDE;

BORDER-RIGHT: #282568 2px solid;
BORDER-BOTTOM: #282568 2px solid;
	height: 30px;
	width: 80px;
	font-size: 15px;
	text-align:center;
}
</style>

<script>
/* $(document).ready(function() {
    $('#example').DataTable();
} ); */

$(document).ready(function() {
    $('#example').DataTable( {
        "lengthMenu": [[20, 50, 100, -1], [20, 50, 100, "All"]]
    } );
} );
	/* function toggle(source) {
		var checkboxes = document.querySelectorAll('input[type="checkbox"]');
		for (var i = 0; i < checkboxes.length; i++) {
			if (checkboxes[i] != source)
				checkboxes[i].checked = source.checked;
		}
	} */
</script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker({ maxDate:-1 });
    ///$("#datepicker").datepicker("setDate", -1)
    $( "#datepicker" ).datepicker({ defaultDate: -1 });
  } );
  </script>
  
</head>
<body>
	<div class="static">
		<div class="full-width">
			<img
				src="${pageContext.request.contextPath}/resources/dist/images/report_banner.jpg"
				class="maghna-bk" />
		</div>
		<!-- <h2>Cus/tomer Care System</h2> -->

		<div class="info">
			<%-- <c:if test="${not empty reqStatus}">

				<p>* Error While getting Data ${reqStatus} *</p>

			</c:if> --%>
			<%
				@SuppressWarnings("unchecked")
				List<IUserDetail> listUserDetails = (List<IUserDetail>) session.getAttribute("listuser");
				List<misuser> listMisDetails = (List<misuser>) request.getAttribute("misuser");
				List<AppStoreAPKDownload> listMisDetails2 = (List<AppStoreAPKDownload>) request.getAttribute("misuser");

				/* IUserDetail objUserDetails=new IUserDetail();
				
				 */
				/* if (listMisDetails != null) {
					out.print(listMisDetails.size());
				} */
			%>
			<c:if test="${error!=null}"><c:out value = "${error}"/></c:if>
			<table class="t1" cellpadding="5" cellspacing="3" >
			<a href="${pageContext.request.contextPath}/logout" style="font-size:20px;right;">Logout</a>
				<form method="post"
					action="${pageContext.request.contextPath}/misdetails">
					<tr>
						<td class="t2"> Partner:</td>
						<td class="t2"><select name="partner" class="selectp" required>
						 <% if((Long)session.getAttribute("cpid")!=null)
						 {
						 %>
						 						 <option value="<%=(Long)session.getAttribute("cpid")%>" selected><%=(String)session.getAttribute("cpname")%></option>
						 
						 <%}else{ %>
								<option value="0">- -All Partners- -</option>
								<% 
									for (IUserDetail objUserDetails : listUserDetails) {
										

										if(Long.valueOf((String)request.getAttribute("partner")!=null?(String)request.getAttribute("partner"):"0")==objUserDetails.getUid())
										{
								%>
								<option value="<%=objUserDetails.getUid()%>" selected><%=objUserDetails.getCompany()%></option>
								<%}else{ %>
								<option value="<%=objUserDetails.getUid()%>"><%=objUserDetails.getCompany()%></option>
								<%
								}}
								%>
                             <% 
                             
                             }%>
						</select></td>
					</tr>
					<!-- <tr>
						<td class="t2">Select Month:</td>
						<td class="t2"><select name="month">
						
								<option value="1">january</option>
								<option value="2">February</option>
								<option value="3">March</option>
								<option value="4">April</option>
								<option value="5">May</option>
								<option value="6">June</option>
								<option value="7">July</option>
								<option value="8">August</option>
								<option value="9">September</option>
								<option value="10">October</option>
								<option value="11">November</option>
								<option value="12">December</option>

						</select></td>
					</tr> -->
					
					<tr>
						<td class="t2" >Report Type:</td>
		<td class="t2">  
<select name="type" class="selectp">
						
								<option value="1"  <%=(String)request.getAttribute("type")!=null?( ((String)request.getAttribute("type")).equals("1")?"selected":""):""%>>Data Usage Report</option>
								<option value="2"  <%=(String)request.getAttribute("type")!=null?( ((String)request.getAttribute("type")).equals("2")?"selected":""):""%>>Download Report</option>
								

						</select>
           </td>
						
					</tr>
					<tr>
						<td class="t2">Select Date:</td>
		<td class="t2">  <input name="dateval" class="pick" type="text" value="<%=(String)request.getAttribute("month")!=null?(String)request.getAttribute("month"):"" %>"  id="datepicker" placeholder="Click Here To Select Date" required/></td>
						
					</tr>



					<tr>
						<td class="t2" colspan="2" style="text-align:right"><input class="button"
							type="submit" value="Submit" /></td>
					</tr>
				</form>
			</table>

		</div>
		<hr />
	</div>
	<%
	if (((String)request.getAttribute("type"))!=null) {

		String type=(String)request.getAttribute("type");
		if(type.equals("1")){
			if (listMisDetails != null) {
		%>
	<div class="info2" >

		<%-- 	<form method="post"
			action="${pageContext.request.contextPath}/getUNSUB"> --%>
		
<p style="color:red">*The Figures Shown Below Is the total data from the 1st till the date selected Above for that Month .<p>
		<table class="display" style="width:100%" id="example">
			<caption>
				<b>Etisalat Arena's reporting Details</b>
			</caption>
<thead>

			<tr>
				<th class="th" style="width: 200px; word-wrap: break-word;">Updated
					Till Below Date</th>
				<th class="th" style="width: 400px; word-wrap: break-word;">App_name</th>
				<th class="th" style="width: 200px; word-wrap: break-word;">Total
					Time Consumed(Seconds)</th>
				<th class="th" style="width: 200px; word-wrap: break-word;">Total
					Data Used(KB)</th>

				<!-- 				<th class="th" style="width: 100px; word-wrap: break-word;">Month</th>
 -->



			</tr>
</thead>
<tbody>


			<%
				for (misuser objMisDetails : listMisDetails) {
			%>
			<tr>
				<td class="td"><%=objMisDetails.getDateTime()%></td>

				<td class="td"><%=objMisDetails.getAppName()%></td>

				<td class="td"><%=objMisDetails.getForegroundTime()%></td>
				<td class="td"><%=objMisDetails.getDataUsed()%></td>
				<%-- <td class="td"><%=objMisDetails.getMonth()%></td> --%>

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
			}
		else if(type.equals("2")){

			if (listMisDetails != null) {
		%>
	<div class="info2" >

		<%-- 	<form method="post"
			action="${pageContext.request.contextPath}/getUNSUB">
			 --%>
		
<!-- <p style="color:red">*The Figures Shown Below Is the total data from the 1st till the date selected Above for that Month .<p> -->
		<table class="display" style="width:100%" id="example">
			<caption>
				<b>Etisalat Arena's reporting Details</b>
			</caption>
<thead>

			<tr>
				<th class="th" style="width: 200px; word-wrap: break-word;">Date</th>
				<th class="th" style="width: 400px; word-wrap: break-word;">App_name</th>
				<th class="th" style="width: 200px; word-wrap: break-word;">Total Downloads</th>
				

				<!-- 				<th class="th" style="width: 100px; word-wrap: break-word;">Month</th>
 -->



			</tr>
</thead>
<tbody>


			<%
				for (AppStoreAPKDownload objMisDetails : listMisDetails2) {
			%>
			<tr>
				<td class="td"><%=objMisDetails.getDateTime()%></td>

				<td class="td"><%=objMisDetails.getAppName()%></td>
				<td class="td"><%=objMisDetails.getStatusCode()%></td>

				<%-- <td class="td"><%=objMisDetails.getDataUsed()%></td> --%>
				<%-- <td class="td"><%=objMisDetails.getMonth()%></td> --%>

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
			
		
			
		}
		
		
	}
		%>
</body>
</html>