<%-- 
    Document   : index
    Created on : 5 Jul, 2022, 12:42:09 AM
    Author     : HP
--%>

<%@page import="DAO.passengerDAO"%>
<%@page import="model.Passenger"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>IRCTC</title>
       
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="./css/styles1.css">
    </head>
    <body style="background-image: url(https://thebrandhopper.com/wp-content/uploads/2021/01/Indian-Railway-Catering-and-Tourism-Corporation.png)">
       <a class="btn btn-info" href="login.jsp">Back</a>
        <%
            String fName=null;
             fName = request.getParameter("fName");
            String lName = request.getParameter("lName");
            String age = request.getParameter("age");
            String mobile = request.getParameter("mobile");
            String pass=request.getParameter("password");
           
            int intAge=0;
            double doubleMobile=0;
            //not parsed directly as they can be null, because this page is action of two pages= login and signup and then csn give number format exception
            if(age!=null && mobile!=null){
                intAge= Integer.parseInt(age);
                doubleMobile= Double.parseDouble(mobile);
                 
            }
            String gender = request.getParameter("gender");
            String email = request.getParameter("email");
            
           //login email and loginpass are email and password from login page
            String loginEmail= request.getParameter("loginEmail");
             String loginPass= request.getParameter("loginPass");
            
         

            Passenger p = new Passenger();
            passengerDAO pd = new passengerDAO();
            p.setFirstName(fName);
            p.setLastName(lName);
            p.setAge(intAge);
            p.setMobile(doubleMobile);
            p.setEmail(email);
            p.setGender(gender);
                             

            if (  pd.login(email, pass) || pd.signUp(p, pass) || pd.login(loginEmail, loginPass) ) {
           //  second or condition because if user refreshes the page after signup
             
        %>
    <center>
        <div class="indexLinks">
        <a class="btn btn-info" href="BookTickets.html">Book Tickets</a>
       
        <a class="btn btn-info" href="TrainDetails.html">Train between Stations</a>
      
        <a class="btn btn-info" href="BookingDetails.html">Booking Details</a>
     
        <a class="btn btn-info" href="cancelBooking.html">Cancel Booking</a>
        
      
        </div>
    </center>
  <!--this else if condition is for signup page invalid-->
    <% } else if(fName!=null) { %>
    <script>
        alert("Email already exists");
    </script>
<!--this else condition is for login page invalid-->
       <% } else{%>
        <script>
        alert("Invalid Credentials");
    </script>
    <% }%>

    <center> 
    <footer> <p class="mt-5 mb-3 text-muted">&copy; IRCTC by Yash Jain</p></footer>
    </center>

</body>
</html>


