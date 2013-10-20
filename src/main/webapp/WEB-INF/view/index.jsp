<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]> <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" ng-app="indexApp"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title></title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <style>
        body {
            padding-top: 50px;
            padding-bottom: 20px;
        }
    </style>
    <link rel="stylesheet" href="/css/bootstrap-theme.min.css">
    <link rel="stylesheet" href="/css/main.css">

    <script src="/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">typegroud</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="/">Protocols</a></li>
                <li><a href="/new">New</a></li>
            </ul>
            <form class="navbar-form navbar-right">
                <div class="form-group">
                    <input type="text" placeholder="Email" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="Password" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">Sign in</button>
            </form>
        </div>
        <!--/.navbar-collapse -->
    </div>
</div>

<div class="container">
    <ng-view></ng-view>
</div>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/vendor/jquery-1.10.1.min.js"><\/script>')</script>

<script src="/js/vendor/bootstrap.min.js"></script>
<script src="//tinymce.cachefly.net/4.0/tinymce.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.0-rc.2/angular.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.0-rc.2/angular-resource.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.0-rc.2/angular-route.js"></script>
<script src="/js/vendor/angular-ui-tinymce/tinymce.js"></script>

<script src="/js/app.js"></script>
<script src="/js/services/IndexData.js"></script>
<script src="/js/controller/ProtocolListController.js"></script>
<script src="/js/controller/ProtocolController.js"></script>
<script src="/js/controller/NewProtocolController.js"></script>

<script>
    var appConfiguration = {
        'aspects': [
            {'name': 'ЧЛ'},
            {'name': 'БЛ'},
            {'name': 'ЧС'},
            {'name': 'БС'},
            {'name': 'ЧЭ'},
            {'name': 'БЭ'},
            {'name': 'ЧИ'},
            {'name': 'БИ'}
        ]
    };
</script>

</body>
</html>
