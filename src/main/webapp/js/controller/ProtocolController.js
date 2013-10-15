'use strict';

indexApp.controller('ProtocolController',
    function ProtocolController($scope, indexData, $routeParams, $timeout, $log) {
        $scope.protocol = indexData.getProtocol($routeParams.protocolId);

        var saveTimeout;
        $scope.saveProtocol = function (protocol) {
            $timeout.cancel(saveTimeout);
            saveTimeout = $timeout(function () {
                indexData.saveProtocol(protocol)
                    .then(function (protocol) {
                        $log.info("Protocol saved");
                    },
                    function (response) {
                        $log.error("Failed to save protocol");
                    });
            }, 1000)
        };
    });
