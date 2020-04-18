<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpringBoot</title>
</head>
<body>



<hr/>
<form method="post" action="/save">
    <input type="hidden" name="id" value="${selectedItem.getId()}">
    <br>Description: <br>
    <input type="text" name="description" value="${selectedItem.getDescription()}">
    <br>Price:<br>
    <input type="text" name="price" value="${selectedItem.getPrice()}">
    <br>Category:<br>
    <input type="text" name="category" value="${selectedItem.getCategory()}">
    <br><br>
    <br>
    <br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
