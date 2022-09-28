<%-- 
    Document   : signup
    Created on : 4 Jul, 2022, 12:51:36 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp</title>

        <link rel = "stylesheet" href = "https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
              integrity = "sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin = "anonymous" >


    </head>


    <body>
        <form method="post" action="index.jsp">
            <section class="vh-100" style="background-color: #eee;">
                <div class="container h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-lg-12 col-xl-11">
                            <div class="card text-black" style="border-radius: 25px;">
                                <div class="card-body p-md-5">
                                    <div class="row justify-content-center">
                                        <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

                                            <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p>

                                            <form class="mx-1 mx-md-4">

                                                <div class="d-flex flex-row align-items-center mb-4">

                                                    <div class="form-outline flex-fill mb-0">
                                                        <label class="form-label">First Name</label>
                                                        <input type="text" name="fName" class="form-control" placeholder = "First Name" required/>

                                                    </div>
                                                </div>
                                                <div class="d-flex flex-row align-items-center mb-4">

                                                    <div class="form-outline flex-fill mb-0">
                                                        <label class="form-label" >Last Name</label>
                                                        <input type="text" name="lName" placeholder = "Last Name" class="form-control" required/>

                                                    </div>
                                                </div>

                                                <div class="d-flex flex-row align-items-center mb-4">

                                                    <div class="form-outline flex-fill mb-0">
                                                        <label class="form-label" >Age</label>
                                                        <input type =number  max=99 min=18 name="age" id="age" class="form-control" placeholder = Age required />

                                                    </div>
                                                </div>
                                                <fieldset class="form-group">
                                                    <div class="row">


                                                        <legend class="col-form-label col-sm-5 pt-0">Gender</legend>
                                                        <div class="col-sm-15">
                                                            <div class="form-check">
                                                                <input class="form-check-input" type="radio" name="gender" value="male" checked>
                                                                <label class="form-check-label">
                                                                    Male
                                                                </label>
                                                            </div>
                                                            <div class="form-check">
                                                                <input class="form-check-input" type="radio" name="gender"  value="female">
                                                                <label class="form-check-label" >
                                                                    Female
                                                                </label>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </fieldset>

                                                <div class="d-flex flex-row align-items-center mb-4">

                                                    <div class="form-outline flex-fill mb-0">
                                                        <label class="form-label" >Mobile</label>
                                                        <input type = tel  name = mobile pattern=[0-9]{10} class="form-control" placeholder = 9876543210 required >

                                                    </div>
                                                </div>


                                                <div class="d-flex flex-row align-items-center mb-4">

                                                    <div class="form-outline flex-fill mb-0">
                                                        <label class="form-label">Your Email</label>
                                                        <input type="email" placeholder = "123@abc.com" name="email" class="form-control" required />

                                                    </div>
                                                </div>

                                                <div class="d-flex flex-row align-items-center mb-4">

                                                    <div class="form-outline flex-fill mb-0">
                                                        <label class="form-label" >Password</label>
                                                        <input type="password" id="password" name="password" class="form-control" placeholder = Password required />

                                                    </div>
                                                </div>

                                                <div class="d-flex flex-row align-items-center mb-4">

                                                    <div class="form-outline flex-fill mb-0">
                                                        <label class="form-label">Repeat your password</label>
                                                        <input type="password" id="confirm_password" name="confirm_password" placeholder = "Confirm Password" class="form-control"  required/>

                                                    </div>
                                                </div>



                                                <div class="form-check d-flex justify-content-center mb-5">
                                                    <input class="" type="checkbox" value="" required >I agree all statements in  <a href="#!">Terms of service</a></input>


                                                </div>
                                                 

                                                <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                                    <button type="submit" onclick=" return Validate()" class="btn btn-primary btn-lg">Register</button>
                                                    
                                                </div>
                                                <div>
                                                    <p> Already have a account? <a href="login.jsp">Login</a></p>
                                                </div>

                                            </form>

                                        </div>
                                        <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

                                            <img src="https://bsmedia.business-standard.com/_media/bs/img/article/2019-09/30/full/1569790979-4055.jpg"
                                                 class="img-fluid" alt="Sample image">

                                        </div>
                                        
                                    </div>
                                    <p class="mt-5 mb-3 text-muted">&copy; IRCTC by Yash Jain</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                
            </section>
        
        <script type="text/javascript">
            function Validate() {
                var password = document.getElementById("password").value;
                var confirmPassword = document.getElementById("confirm_password").value;
                var age = document.getElementById("age").value;
                if (password != confirmPassword) {
                    alert("Passwords do not match.");
                    return false;
                }
                if (age < 18 || age > 99) {
                    alert("Age must be above 18");
                    return false;
                }
                return true;
            }
        </script>
    </body>
</html>
