'use strict';

indexApp.controller('NewProtocolController',
    function NewProtocolController($scope, indexData, $location, $log) {
        var protocol = indexData.getNewProtocol();
        protocol.then(
            function (protocol) {
                $location.path('/protocol/' + protocol.id);
            },
            function (response) {
                $log.error('Failed to create protocol');
            })
    });
