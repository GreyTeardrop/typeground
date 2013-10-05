<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="well">
    <div class="row">
        <div class="col-sm-8">
            <div class="panel panel-default">
            <input type="text" class="form-control" name="metaProtocolInfo.name"
            ng-model="protocol.metaProtocolInfo.name" ng-change="saveProtocol(protocol)"/>
            <textarea name="text" class="form-control" rows="10"
                      ng-model="protocol.text" ng-change="saveProtocol(protocol)"></textarea>
            </div>
        </div>
        <div class="col-sm-4">
            <div class="panel panel-success">
                <div class="panel-heading">Aspects</div>
                <ul class="list-group">
                    <li class="list-group-item">БЛ</li>
                    <li class="list-group-item">ЧЛ</li>
                    <li class="list-group-item">ЧС</li>
                    <li class="list-group-item">БС</li>
                    <li class="list-group-item">БЭ</li>
                    <li class="list-group-item">ЧЭ</li>
                    <li class="list-group-item">ЧИ</li>
                    <li class="list-group-item">БИ</li>
                </ul>
            </div>

        </div>
    </div>
</div>
</div>

