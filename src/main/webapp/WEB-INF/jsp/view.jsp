<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SUPERHEROES</title>
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
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>Product Detail</h2>

<table>

    <tr>
        <th>Description</th>
        <td>${selectedItem.getDescription()}</td>
    </tr>
    <tr>
        <th>Price</th>
        <td>${selectedItem.getPrice()}</td>
    </tr>tr>
        <th>Category</th>
        <td>${selectedItem.getCategory()}</td>
    </tr>

</table>
<a href="/">Back</a>

</body>
</html>
