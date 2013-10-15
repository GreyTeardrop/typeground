'use strict';

var indexApp = angular.module('indexApp', ['ngResource', 'ngRoute', 'angular-redactor']).
    config(function ($routeProvider, $locationProvider) {
        $routeProvider.when('/protocol/:protocolId', {
            templateUrl: '/templates/protocol.jsp',
            controller: 'ProtocolController'
        });
        $routeProvider.when('/', {
            templateUrl: '/templates/protocolList.jsp',
            controller: 'ProtocolListController'
        });
        $routeProvider.when('/new', {
            templateUrl: '/templates/protocol.jsp',
            controller: 'NewProtocolController'

        });
        $locationProvider.html5Mode(true);
    })
    .directive("redactor", function () {
        return {
            require: '?ngModel',
            link: function ($scope, elem, attrs, controller) {

                controller.$render = function () {

                    elem.redactor({
                        keyupCallback: function () {
                            $scope.$apply(controller.$setViewValue(elem.getCode()));
                        },
                        execCommandCallback: function () {
                            $scope.$apply(controller.$setViewValue(elem.getCode()));
                        }
                    });

                    elem.setCode(controller.$viewValue);
                };
            }
        };
    });
