'use strict';

var indexApp = angular.module('indexApp', ['ngResource', 'ngRoute']).
    config(function ($routeProvider) {
        $routeProvider.when('/protocol/:protocolId', {
            templateUrl: '/templates/protocol.jsp',
            controller: 'ProtocolController'
        });
        $routeProvider.when('/protocols', {
            templateUrl: '/templates/protocolList.jsp',
            controller: 'IndexController'
        });
        $routeProvider.when('/new', {
           templateUrl: '/templates/protocol.jsp',
           controller: 'NewProtocolController'

        });
    });