<%--
  Created by IntelliJ IDEA.
  User: son
  Date: 04/12/2021
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Employee</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1>Add New Employee</h1>
    <div class="row">
        <div class="col-6">
            <form method="post" action="add">
                <div class="mb-3">
                    <label for="fullname" class="form-label">Full Name</label>
                    <input type="text" class="form-control" name="fullname" id="fullname" required>
                </div>
                <div class="mb-3">
                    <label for="bday" class="form-label">Birthday</label>
                    <input type="text" class="form-control" name="bday" id="bday" required>
                </div>
                <div class="mb-3">
                    <label for="address" class="form-label">Address</label>
                    <input type="text" class="form-control" name="address" id="address" required>
                </div>
                <div class="mb-3">
                    <label for="position" class="form-label">Position</label>
                    <input type="text" class="form-control" name="position" id="position" required>
                </div>
                <div class="mb-3">
                    <label for="department" class="form-label">Department</label>
                    <input type="text" class="form-control" name="department" id="department" required>
                </div>
                <button type="submit" class="btn btn-success">Submit</button>
                <button type="reset" class="btn btn-warning" onclick="return confirm('This will reset the form, continue ?');">Reset</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
