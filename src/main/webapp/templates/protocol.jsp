<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="page-header" ng-submit="saveProtocol(protocol)">
    <form role="form">
        <input type="text" class="form-control" name="metaProtocolInfo.name" ng-model="protocol.metaProtocolInfo.name"/>
        <textarea name="text" class="form-control" rows="10" ng-model="protocol.text"></textarea><br>

        <button type="submit" class="btn btn-default">Save</button>
    </form>
</div>

