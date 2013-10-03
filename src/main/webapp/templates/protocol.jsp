<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container" ng-controller="ProtocolController">
    <form role="form" action="/protocol/save" method="POST">
        <input type="text" class="form-control" name="metaProtocolInfo.name" ng-model="protocol.name"/>
        <textarea name="text" class="form-control" rows="10" ng-model="protocol.text"></textarea><br>

        <button type="submit" class="btn btn-default" ng-click="save(protocol)">Save</button>
    </form>
</div>

