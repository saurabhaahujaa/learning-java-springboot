<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="org.springframework.context.ApplicationContext, 
    org.springframework.web.context.support.WebApplicationContextUtils,
    oracle.tms.business.RTOOperations,
    oracle.tms.entities.OffenceEO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ApplicationContext appContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
	RTOOperations rtooOperRef=(RTOOperations)appContext.getBean("rtoBean");
	// get details from UI
	Integer givenOffenceID=Integer.parseInt(request.getParameter("offenceId"));
	String givenOffenceType=request.getParameter("offenceType");
	Float givenPenalty=Float.parseFloat(request.getParameter("penalty"));
	String givenVehicleType=request.getParameter("vehicleType");
	
	
	//Construct EO out of these values
	OffenceEO offenceEORef=new OffenceEO(givenOffenceID,givenOffenceType,givenPenalty,givenVehicleType);
	//Invokes the business logic on the spring layer
	Integer returnedNewOffenceID=rtooOperRef.addOffenceType(offenceEORef);
%>

	<% if (returnedNewOffenceID !=null ){
	%>
	<h2>
		Record Inserted Successfully...!
	</h2>
	<%
		} 
	%>
</body>
</html>