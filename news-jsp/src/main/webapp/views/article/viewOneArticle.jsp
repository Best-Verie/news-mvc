<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <style>

        .article{
            margin-top: 3em;
        }
        .article h4{
            margin-top: 1em;
            font-size: 1.5em;
            font-weight: bold;
            font-style: italic;
        }
        .article p{
            font-size: 1.2em;
            font-style: italic;
            margin-bottom: 0.5em;
            margin-top: 2em;
        }
        .content{
            margin-top: 7em;
            margin-left: 10em;
            margin-right: 10em;
        }

        .btn{
            width: 100%;
            margin-top: 1.4em;
            background: #4361EE;
            border-radius: 10px;
        }
        .comments{
            margin-top: 1.4em;
            margin-left: 10em;
            margin-right: 10em;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
            <div class="col-md-3 col-lg-3">
                <div class="article">
                    <h4 class="text-center">${article.title}</h4>
                    <img class="card-img-top" src="${article.urlToImage}" alt="article image" >
                    <p class="text-center mt-5">${article.description}</p>

                </div>
            </div>
            <div class="col-md-9 col-lg-9">
                <div class="content">
                    <p class="text-center">${article.content}</p>
                    <div class="commentSession">
                        <form action="/articles/saveComment" method="post">
                            <input type="hidden" value="${article.id}" name="articleId">
                            <input type="text" class="form-control" placeholder="Add a comment" name="comment">
                            <input type="submit" value="submit" class="btn">
                        </form>
                    </div>
                </div>

                <div class="comments">
                    <c:forEach items="${comments}" var="comment" >
                        <div class="comment">
                            <p>${comment.comment}</p>
                        </div>
                    </c:forEach>>
<%--                    <jsp:include page="./../comments/allComments.jsp" />--%>
                </div>
    </div>
</div>
</body>
</html>