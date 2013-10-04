'use strict';

indexApp.controller('ProtocolController',
    function ProtocolController($scope, indexData, $routeParams) {
        $scope.protocol = indexData.getProtocol($routeParams.protocolId);

        $scope.saveProtocol = function(protocol){
            indexData.saveProtocol(protocol);
        }

    }
);
