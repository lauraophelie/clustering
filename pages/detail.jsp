<% String couleur = (String) request.getAttribute("couleur");%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Details</title>
</head>

<body>
    <h1>Details</h1>
    <p>Couleur : <% out.print(couleur); %></p>
</body>

</html>