'use strict';

indexApp.controller('IndexController',
    function IndexController($scope, indexData){
        $scope.protocolList = indexData.getProtocolList();
    }
);
