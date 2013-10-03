indexApp.factory('indexData', function ($resource) {
    return{
        getProtocolList: function(){
            return $resource('/api/protocol').query();
        },
        getProtocol: function (protocolId) {
            return $resource('/api/protocol/:id', {id: '@id'}).get({id: protocolId});
        }
    }
});
