<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr><td>图书名称</td><td>图书作者</td><td>价格</td></tr>
    <#if books ??&&(books?size>0)>
        <#list books as book>
            <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
            </tr>
        </#list>
    </#if>
</table>
</body>
</html>