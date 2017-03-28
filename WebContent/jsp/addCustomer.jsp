<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=true"> </script>
<script type="text/javascript">
	//alert("here");
  var geocoder;
        var map;        
        function codeAddress() {
            geocoder = new google.maps.Geocoder();
            var address =document.cust.pin.value;
            geocoder.geocode({ 'address': address }, function (results, status) {
                if (status == google.maps.GeocoderStatus.OK) {                       

                    for (var component in results[0]['address_components']) {
                        for (var i in results[0]['address_components'][component]['types']) {
                            if (results[0]['address_components'][component]['types'][i] == "administrative_area_level_1") {
                                state = results[0]['address_components'][component]['long_name'];
                                document.cust.state.value=state;
                                city=results[0]['address_components'][1]['long_name'];
                                document.cust.city.value=city;
                            }
                        }
                    }                                           
                } else {
                    alert('Invalid Zipcode');
                }
            });
        }       



</script>

</head>
<body>
<%String msg=(String)request.getAttribute("msg");%>
<div align="right">
<%if(msg.equals("Operator")){ %>
<h3>Welcome Operator</h3>
<%}%>
<%if(msg.equals("Customer")){ %>
<h3>Welcome Customer</h3>
<%}%>
<%if(msg.equals("Admin")){ %>
<h3>Welcome Admin</h3>
<%}%>
</div>
<div align="center">Customer Registration</div>
<hr><div>
<form name="cust" action="<%=request.getContextPath()%>/InfinityController?actionCheck=addCustomer" method="post">
<table align="center">
<tr><td><label>First Name</label></td>
<td><input type="text" name="fname"/></td></tr>
<tr><td><label>Last Name</label></td>
<td><input type="text" name="lname"/></td></tr>
<tr><td><label>Email ID</label></td>
<td><input type="text" name="email"/></td></tr>
<tr><td><label>Mobile No</label></td>
<td><input type="text" name="mob"/></td></tr>
<tr><td><label>Address1</label></td>
<td><input type="text" name="add1"/></td></tr>
<tr><td><label>Address2</label></td>
<td><input type="text" name="add2"/></td></tr>
<tr><td><label>Landmark</label></td>
<td><input type="text" name="land"/></td></tr>
<tr><td><label>Pincode</label></td>
<td><input type="text" name="pin" onblur="codeAddress()"/></td></tr>
<tr><td><label>City</label></td>
<td><input type="text" name="city"/></td></tr>
<tr><td><label>State</label></td>
<td><input type="text" name="state"/></td></tr>
<%if(msg.equals("Operator")||msg.equals("Admin")){ %>
<tr><td><label>Operator ID</label></td>
<td><input type="text" name="oid"/></td></tr>
<tr><td><label>Operator Name</label></td>
<td><input type="text" name="oname"/></td></tr>
<tr><td><label>Retailer ID</label></td>
<td><input type="text" name="rid"/></td></tr>
<tr><td><label>Retailer Name</label></td>
<td><input type="text" name="rname"/></td></tr>
<%}%>
<tr><td></td><td><input type="submit" value="SUBMIT" style="width:70px"/>
<input type="reset" value="RESET" style="width:70px"/></td></tr>
</table>
</form>
</div>
</body>
</html>