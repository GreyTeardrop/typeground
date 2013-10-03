indexApp.factory('indexData', function ($resource) {
    return{
        getProtocolList: function(){
            return $resource('/api/protocol').query();
        }
    }
});
