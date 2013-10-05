'use strict';

indexApp.controller('ProtocolController',
    function ProtocolController($scope, indexData, $routeParams, $timeout) {
        $scope.protocol = indexData.getProtocol($routeParams.protocolId);

        var saveTimeout;
        $scope.saveProtocol = function (protocol) {
            $timeout.cancel(saveTimeout);
            saveTimeout = $timeout(function () {
                $scope.protocol = indexData.saveProtocol(protocol);
            }, 1000)
        };
    });
