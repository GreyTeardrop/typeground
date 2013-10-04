indexApp.factory('indexData', function ($resource, $log) {
    var Protocol = $resource('/api/protocol/:id', {id: '@id'});
    return{
        getProtocolList: function () {
            return Protocol.query();
        },
        getProtocol: function (protocolId) {
            return Protocol.get({id: protocolId});
        },
        saveProtocol: function(protocol) {
            protocol.$save();
        }
    };
});
