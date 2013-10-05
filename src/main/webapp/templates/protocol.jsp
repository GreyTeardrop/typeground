<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="page-header">
    <form role="form">
        <input type="text" class="form-control" name="metaProtocolInfo.name"
               ng-model="protocol.metaProtocolInfo.name" ng-change="saveProtocol(protocol)"/><br>
        <textarea name="text" class="form-control" rows="10"
                  ng-model="protocol.text" ng-change="saveProtocol(protocol)"></textarea><br>
    </form>
</div>

