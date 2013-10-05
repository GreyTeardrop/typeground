indexApp.factory('indexData', function ($resource, $q) {
    var Protocol = $resource('/api/protocol/:id', {id: '@id'});
    return{
        getProtocolList: function () {
            return Protocol.query();
        },
        getProtocol: function (protocolId) {
            return Protocol.get({id: protocolId});
        },
        saveProtocol: function (protocol) {
            return protocol.$save();
        },
        getNewProtocol: function () {
            var deferred = $q.defer();
            Protocol.save(null,
                function (response) {
                    deferred.resolve(response);
                },
                function (response) {
                    deferred.reject(response);
                });
            return deferred.promise;
        }
    };
});
