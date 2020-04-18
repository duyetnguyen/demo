<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
            width: 150px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>Grocery Store</h2>

<table>
    <tr>
        <th>Description</th>
        <th>Price</th>
        <th>Category</th>
        <th>Action</th>
    </tr>
    <c:forEach var = "listitem" items = "${productlist}">
        <tr>
            <td>${listitem.getDescription()}</td>
            <td>${listitem.getPrice()}</td>
            <td>${listitem.getCategory()}</td>
            <td>
                <a href="/view/${listitem.getId()}">View</a>
                <a href="/edit/${listitem.getId()}">Edit</a>
                <a href="/delete/${listitem.getId()}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<br>
<form method="post" action="/save">
    <input type="hidden" name="id" value="">
    Description:<br>
    <input type="text" name="description">
    <br>
    Price:<br>
    <input type="text" name="price" >
    <br>
    Category:<br>
    <input type="text" name="category" >
    <br>
    <br>
    <br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
