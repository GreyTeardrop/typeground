<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]> <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]> <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" ng-app="mainApp"> <!--<![endif]-->
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
                <li><a href="#stats">Stats</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
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

<div class="jumbotron">
    <div class="container" ng-controller="ProtocolController">
        <form role="form" action="/protocol/save" method="POST">
            <input type="text" class="form-control" name="metaProtocolInfo.name" ng-model="protocol.name"/>
            <textarea name="text" class="form-control" rows="10" ng-model="protocol.text"></textarea><br>

           <button type="submit" class="btn btn-default" ng-click="save(protocol)">Save</button>
        </form>
    </div>
</div>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="/js/vendor/jquery-1.10.1.min.js"><\/script>')</script>

<script src="/js/vendor/bootstrap.min.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.0.7/angular.min.js"></script>
<script src="/js/vendor/angular-resource.min.js"></script>

<script src="/js/main.js"></script>
<script src="/js/app.js"></script>
<script src="/js/controller/ProtocolController.js"></script>
</body>
</html>
