<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <h2 class="h2">Protocol list</h2>
    <ul>
        <li ng-repeat="protocol in protocolList">
            <a href="#/protocol/{{protocol.id}}">{{protocol.metaProtocolInfo.name}}</a>
        </li>
    </ul>
</div>
