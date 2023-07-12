<!DOCTYPE html><html>
<head>    <title>Customers</title>
    <style type="text/css">        table {
            border-collapse: collapse;            border-spacing: 0;
            border-color: #ccc;        }
        table td {
            font-family: Arial, sans-serif;            font-size: 14px;
            padding: 10px 5px;            border-style: solid;
            border-width: 1px;            overflow: hidden;
            word-break: normal;            border-color: #ccc;
            color: #333;            background-color: #fff;
        }
        table th {            font-family: Arial, sans-serif;
            font-size: 14px;            font-weight: bold;
            padding: 10px 5px;            border-style: solid;
            border-width: 1px;            overflow: hidden;
            word-break: normal;            border-color: #ccc;
            color: #333;            background-color: #f0f0f0;
        }
    </style></head>
<body>
<h2>Search by name</h2><form action="/api/customers/new" method="get">
    Name: <input type="text" name="name" /><br><br>    <input type="submit" value="Search"/>
    <input type="reset" value="Reset"/></form>
<#if customerName??>
<table>    <tr>
        <th>Name</th>        <th>Email</th>
        <th>Info</th>    </tr>
    <#list customerName as customer>
        <tr>                <td>${customer.ID}</td>
            <td>${customer.name}</td>                <td>${customer.email}</td>
        </tr>        </#list>
    </#if></table><br>
<hr><h4>Customer list</h4>
<table>
    <tr>        <th>Name</th>
        <th>Email</th>        <th>Info</th>
    </tr>    <#if customerList??>
        <#list customerList as customer>        <tr>
            <td>${customer.ID}</td>        <td>${customer.name}</td>
            <td>${customer.email}</td>        <td><a href="/api/customers/${customer.ID}">Customer details</a></td>
        </tr>    </#list>
    </#if></table>
<br><hr>
<h3>Create a new customer</h3>
<form action="/api/customers/" method="post">
    Name: <input type="text" name="name" /><br><br>    Email: <input type="text" name="email" /><br><br>
    Age: <input type="number" name="age" /><br><br>    <input type="submit" value="Add customer"/>
</form>
</body>
</html>