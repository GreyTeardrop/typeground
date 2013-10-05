'use strict';

var indexApp = angular.module('indexApp', ['ngResource', 'ngRoute']).
    config(function ($routeProvider, $locationProvider) {
        $routeProvider.when('/protocol/:protocolId', {
            templateUrl: '/templates/protocol.jsp',
            controller: 'ProtocolController'
        });
        $routeProvider.when('/protocols', {
            templateUrl: '/templates/protocolList.jsp',
            controller: 'ProtocolListController'
        });
        $routeProvider.when('/new', {
           templateUrl: '/templates/protocol.jsp',
           controller: 'NewProtocolController'

        });
        $locationProvider.html5Mode(true);
    });