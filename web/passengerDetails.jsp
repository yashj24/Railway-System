<%-- 
    Document   : passengerDetails
    Created on : 21 Jun, 2022, 5:23:56 PM
    Author     : HP
--%>
<%@page import="DAO.passengerDAO"%>
<%@ page session = "true" %>
<%@page import="model.Passenger"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Passenger/s</title>

    



        <link rel = "stylesheet" href = "https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
              integrity = "sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin = "anonymous" >
        <link rel="stylesheet" href="./css/styles3.css">
    </head>
    <body style = "background-color: #EEEEEE" >
        <form action = ConfirmDetailsServlet onsubmit="checkCaptcha" method = "post" >
            <%
             String captcha= passengerDAO.generateCaptchaString();
                String trainNo = request.getParameter("trainNo");
                int num = Integer.parseInt(request.getParameter("num"));
                session.setAttribute("trainNo", trainNo);
                session.setAttribute("num", num);
                
                for (int i = 1; i <= num; i++) {
                    out.println("<center>");
                    out.println("<h1>Passenger " + i + " Details</h1>");
                    out.println("</center>");
                    
                    
            %>

            <div class = "form-row" >
                <div class = "form-group col-md-6" >
                    <label for = "inputEmail4" > First Name * </label>
                    <% out.println("<input type =text class = form-control name=fname" + i + " id=fname placeholder = \"First-Name\" required >"); %>
                </div>
                <div class = "form-group col-md-6" >
                    <label for = "" > Last Name * </label>

                    <% out.println("<input type =text class = form-control name = lname" + i + "  id =fname placeholder =Last-Name required >"); %>
                </div>
            </div>


            <div class = "form-row" >

                <div class = "form-group col-md-6" >
                    <label for = "inputEmail4" > Age * </label>
                    <% out.println("<input type =number min=3 max=99 class = form-control name =age" + i + " id = age placeholder = Age required >");  %>
                </div>

            </div>

            <fieldset class="form-group">
                <div class="form-row">
                    <legend class="col-form-label col-sm-2 pt-0">Gender *</legend>
                    <div class="col-sm-10">
                        <div class="form-check">
                             <%  out.println("<input class=form-check-input type=radio name=gender"+i+"  value=female checked>"); %>
                            <label class="form-check-label" for="gridRadios1">
                                Female
                            </label>
                        </div>
                        <div class="form-check">
                            <%  out.println("<input class=form-check-input type=radio name=gender"+i+"  value=male>"); %>
                            <label class="form-check-label" for="gridRadios2">
                                Male
                            </label>
                        </div>
                     
                    </div>
                            
                </div>
            </fieldset>
            <div class = "form-row" >
                <div class = "form-group col-md-6" >
                    <label for = "inputEmail4" > Email * </label>
                    <% out.println("<input type = email class = form-control name =email" + i + " id = email placeholder = Your-Registered-Email required >"); %>
                </div>
                <div class = "form-group" >
                <label> Mobile Number * </label>
                <% out.println("<input type = tel class = form-control name = mobile" + i + " id = mobile pattern=[0-9]{10} placeholder = Mobile required >"); %>
            </div>
               
            </div>
            <div class = "form-group" >
                <label for = "inputAddress" > Address * </label>
                <% out.println("<input type =text class =form-control name = address" + i + " id = address placeholder = 1234-Main-St required >"); %>
            </div>
            

            <div class = "form-row" >
                <div class = "form-group col-md-6" >
                    <label for = "inputCity" > City * </label>
                    <% out.println("<input type = text class = form-control name = city" + i + " id = city required >"); %>
                </div>
                <div class = "form-group col-md-4" >
                    <label for = "inputState" > State * </label>
                    <% out.println("<select id = state name = state" + i + " class = form-control required >"); %>
                    <option selected > Choose... </option>
                    <option value = "Andhra Pradesh" > Andhra Pradesh </option>
                    <option value = "Andaman and Nicobar Islands" > Andaman and Nicobar Islands </option>
                    <option value = "Arunachal Pradesh" > Arunachal Pradesh </option>
                    <option value = "Assam" > Assam </option>
                    <option value = "Bihar" > Bihar </option>
                    <option value = "Chandigarh" > Chandigarh </option>
                    <option value = "Chhattisgarh" > Chhattisgarh </option>
                    <option value = "Dadar and Nagar Haveli" > Dadar and Nagar Haveli </option>
                    <option value = "Daman and Diu" > Daman and Diu </option>
                    <option value = "Delhi" > Delhi </option>
                    <option value = "Lakshadweep" > Lakshadweep </option>
                    <option value = "Puducherry" > Puducherry </option>
                    <option value = "Goa" > Goa </option>
                    <option value = "Gujarat" > Gujarat </option>
                    <option value = "Haryana" > Haryana </option>
                    <option value = "Himachal Pradesh" > Himachal Pradesh </option>
                    <option value = "Jammu and Kashmir" > Jammu and Kashmir </option>
                    <option value = "Jharkhand" > Jharkhand </option>
                    <option value = "Karnataka" > Karnataka </option>
                    <option value = "Kerala" > Kerala </option>
                    <option value = "Madhya Pradesh" > Madhya Pradesh </option>
                    <option value = "Maharashtra" > Maharashtra </option>
                    <option value = "Manipur" > Manipur </option>
                    <option value = "Meghalaya" > Meghalaya </option>
                    <option value = "Mizoram" > Mizoram </option>
                    <option value = "Nagaland" > Nagaland </option>
                    <option value = "Odisha" > Odisha </option>
                    <option value = "Punjab" > Punjab </option>
                    <option value = "Rajasthan" > Rajasthan </option>
                    <option value = "Sikkim" > Sikkim </option>
                    <option value = "Tamil Nadu" > Tamil Nadu </option>
                    <option value = "Telangana" > Telangana </option>
                    <option value = "Tripura" > Tripura </option>
                    <option value = "Uttar Pradesh" > Uttar Pradesh </option>
                    <option value = "Uttarakhand" > Uttarakhand </option>
                    <option value = "West Bengal" > West Bengal </option>
                    </select>
                </div>
                    
                        



            </div>




            <%  };%>

            <br >
            <br >
            <center >
                 <div class = "form-group " >
                     <div class = "form-group col-md-6 " >
                        
                             
                    <%  out.println("<p class=captcha >"+ captcha +"</p>"); %>
                    
                    <%  out.println("<input type=hidden id=captchaGenerated value="+ captcha +" >"); %>
                    
                    <% out.println("<input type=text id=captchaByUser placeholder=captcha  required >"); %>
                    
                   
                </div>
                </div>
                
                
                
                
                <div class = "form-group" >
                    <div class = "form-check" >
                        <input class = "form-check-input" type = "checkbox" id = "gridCheck" required >
                        <label class = "form-check-label" for = "gridCheck" >
                            I guarantee that the above information is correct.
                        </label>
                    </div>
                </div>
               
                    <button type = "submit" onclick="return checkCaptcha()" class = "btn btn-warning" > Submit Details </button>
            </center>
        </form>
                    
                    
            <script type="text/javascript">
            function checkCaptcha() {
                var captchaGenerated = document.getElementById("captchaGenerated").value;
                var captchaByUser = document.getElementById("captchaByUser").value;
               
                if (captchaGenerated != captchaByUser) {
                    alert("Captcha does not match");
                    return false;
                }
                
                return true;
               
            }
        </script>
    </body>
</html>
