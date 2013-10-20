'use strict';

var indexApp = angular.module('indexApp', ['ngResource', 'ngRoute', 'ui.tinymce']).
    config(function ($routeProvider, $locationProvider) {
        $routeProvider.when('/protocol/:protocolId', {
            templateUrl: '/templates/protocol.html',
            controller: 'ProtocolController'
        });
        $routeProvider.when('/', {
            templateUrl: '/templates/protocolList.html',
            controller: 'ProtocolListController'
        });
        $routeProvider.when('/new', {
            templateUrl: '/templates/protocol.html',
            controller: 'NewProtocolController'

        });
        $locationProvider.html5Mode(true);
    });
