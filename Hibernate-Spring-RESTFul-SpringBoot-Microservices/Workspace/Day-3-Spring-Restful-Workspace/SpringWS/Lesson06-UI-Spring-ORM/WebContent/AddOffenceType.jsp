<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" 
    import="org.springframework.context.ApplicationContext, 
    		org.springframework.web.context.support.WebApplicationContextUtils, 
    		oracle.tms.business.RTOOperations,
    		oracle.tms.entities.OffenceEO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ApplicationContext appContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(getServletContext());
	
		RTOOperations rtoOperRef = (RTOOperations)appContext.getBean("rtoBean");
		
		
		// Get the Details from the UI
		Integer givenOffenceID = Integer.parseInt(request.getParameter("offenceId"));
		String givenOffenceType = request.getParameter("offenceType");
		Float givenPenalty = Float.parseFloat(request.getParameter("penalty"));
		String givenVehicleType = request.getParameter("vehicleType");
		
		// Construct EO Out of these Values
		OffenceEO offenceEORef = new OffenceEO(givenOffenceID, givenOffenceType, givenPenalty, givenVehicleType);
		
		// Invokes the Business Logic on the Spring Layer 
		Integer returnedNewOffenceId = rtoOperRef.addOffenceType(offenceEORef);
		
	%>
	
		<% 
			if(returnedNewOffenceId != null) {
		%>
		<h2> Record Inserted Successfully ... ! </h2>
		<%
			}
		%>
</body>
</html>