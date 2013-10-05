'use strict';

indexApp.controller('ProtocolListController',
    function ProtocolListController($scope, indexData, $location){
        $scope.protocolList = indexData.getProtocolList();

        $scope.deleteProtocol = function(protocol){
            indexData.deleteProtocol(protocol);
            $location.path('/protocols/');
        }
    }
);
