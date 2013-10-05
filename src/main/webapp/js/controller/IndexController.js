'use strict';

indexApp.controller('IndexController',
    function IndexController($scope, indexData, $location){
        $scope.protocolList = indexData.getProtocolList();

        $scope.deleteProtocol = function(protocol){
            indexData.deleteProtocol(protocol);
            $location.path('/protocols/');
        }
    }
);
