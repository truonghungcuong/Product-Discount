<%--
  Created by IntelliJ IDEA.
  User: Laptop
  Date: 3/9/2022
  Time: 10:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/display-discount" method="post">
    <input type="text" name="description" placeholder="Mô tả sản phẩm">
    <input type="text" name="price" placeholder="Giá sản phẩm">
    <input type="text" name="discount" placeholder="Chiết khấu sản phẩm">
    <button>Calculate discount</button>
  </form>
  </body>
</html>
