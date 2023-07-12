<!DOCTYPE html><html>
<head>    <title>Customer Info</title>
</head>
<body>
<a href="/api/customers/">Home page</a>
<h4>Customer info</h4><b>ID: </b>${customer.ID}<br>
<b>name: </b>${customer.name}<br><b>email: </b>${customer.email}<br>
<b>age:  </b>${customer.age}<br><br>
<form action="/api/customers/delete/${customer.ID}" method="post">
    <input type="submit" value="Delete customer" onclick="return confirm('Do you really want to delete ${customer.name}?')"/></form>


<hr><h4>Update a new customer</h4>
<form action="/api/customers/update/${customer.ID}" method="post">
    Name: <input type="text" name="name" value="${customer.name}" /> <br><br>
    Email: <input type="text" name="email" value="${customer.email}" /> <br><br>
    Age: <input type="number" name="age" value="${customer.age}" /> <br><br>
    <input type="submit" value="Add customer"/>
</form>


</body>
</html>