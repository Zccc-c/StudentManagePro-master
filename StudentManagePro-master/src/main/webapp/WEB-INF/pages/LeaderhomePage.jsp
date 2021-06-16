<%@ page import="java.util.List" %>
<%@ page import="pers.kuroko.entity.Student" %>
<%@ page import="pers.kuroko.entity.Leader" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>领导者管理系统</title>
    <link rel="stylesheet" href="<%= basePath%>css/main.css" type="text/css">
    <link rel="stylesheet" href="<%= basePath%>css/button.css" type="text/css">
    <link rel="stylesheet" href="<%= basePath%>css/add.css" type="text/css">
    <link rel="stylesheet" href="<%= basePath%>css/update.css" type="text/css">
    <link rel="stylesheet" href="<%= basePath%>css/examine.css" type="text/css">
    <link rel="stylesheet" href="<%= basePath%>css/del.css" type="text/css">
    <script src="<%= basePath%>js/leader/add.js" type="text/javascript"></script>
    <script src="<%= basePath%>js/leader/update.js" type="text/javascript"></script>
    <script src="<%= basePath%>js/leader/examine.js" type="text/javascript"></script>
    <script src="<%= basePath%>js/reRange.js" type="text/javascript"></script>
    <script src="<%= basePath%>js/flip.js" type="text/javascript"></script>
    <script src="<%= basePath%>js/leader/del.js" type="text/javascript"></script>
    <script src="<%= basePath%>js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <script>
        $(function () {
            range();
        });
    </script>
</head>

<body>
<div id="total">
    <div id="top">
        <div class="headerLine">——————————————</div>
        <div id="header">领导者管理系统</div>
        <div class="headerLine">——————————————</div>
    </div>

    <div id="second">
        <button id="add" onclick="add()">新增</button>
    </div>

    <div id="main">
        <table cellspacing="0px" id="myTable">
            <thead>
            <tr>
<%--                <th class="col1"><input type="checkbox" onclick="checkAll(this)"/></th>--%>
                <th class="col2">序号</th>
                <th class="col3">组号</th>
                <th class="col4">姓名</th>
                <th class="col11" width="80px">性别</th>
                <th class="col9">领导者号</th>
                <th class="col5">邮箱</th>
                <th class="col10">操作</th>
            </tr>
            </thead>
            <tbody>
            <%
                int i = 0;
                List<Leader> leaders = (List<Leader>) request.getAttribute("leaders");
            %>
            <%
                for (Leader leader : leaders) {
                    i++;
                    if (i % 2 != 0) {
            %>
                <tr class="mainTbodyTr1">
             <%
                    } else {
              %>
                    <tr class="mainTbodyTr2">
              <%
                    }
              %>
<%--                    <td class="col1"><input type="checkbox" name="item" /></td>--%>
                    <td class="col2"><%=i%></td>
                    <td class="col3"><%=leader.getGroupId()%></td>
                    <td class="col4"><%=leader.getLeaderName()%></td>
                <td class="col11"><%=leader.getLeaderGender()%></td>
                <td class="col9"><%=leader.getLeaderId()%></td>
                    <td class="col5"><%=leader.getLeaderEmail()%></td>
                    <td class="col10">
                        <input id="examine" type="button" value="查看" onclick="examine(this)">
                        <input id="update" type="button" value="更新" onclick="update(this)">
                        <input id="delete" type="button" value="删除" onclick="deleteStu(this)">
                    </td>
                </tr>
            <%
                }
            %>
            </tbody>
        </table>
    </div>

    <div id="final">
        <p>第</p>
        <p id="pageNum">1</p>
        <P>页，共</P>
        <p id="nums">0</p>
        <p>条，(每页显示10条)</p>
        <button id="next" onclick="next()">下一页</button>
        <button id="previous" onclick="previous()">上一页</button>
    </div>

</div>

<div id="totalBackground"></div>

<div id="addBlock" style="height: 440px">
    <div id="addHeader">新增领导者信息</div>
    <div id="addMain">
        <table id="addMessageTable">
            <tr>
                <td class="addTableTd1">组号</td>
                <td class="addTableTd2"><input type="text" id="groupId1" /></td>
            </tr>
            <tr>
                <td class="addTableTd1">姓名</td>
                <td class="addTableTd2"><input type="text" id="leadername1" /></td>
            </tr>
            <tr>
                <td class="addTableTd1">性别</td>
                <td class="addTableTd2">
                    <select id="sex1">
                        <option value="男" selected>男</option>
                        <option value="女">女</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="addTableTd1">领导者号</td>
                <td class="addTableTd2"><input type="text" id="leaderId1" /></td>
            </tr>
            <tr>
                <td class="addTableTd1">邮箱</td>
                <td class="addTableTd2"><input type="text" id="leaderEmail1" /></td>
            </tr>

        </table>
    </div>
    <div style="text-align: right; height: 35px; padding-top: 0px; padding-right: 120px">
        <button id="submit" onclick="jQSubmit()">提交</button>
        <button id="addCancel" onclick="addCancel()">取消</button>
    </div>
</div>

<div id="updateBlock">
    <div id="updateHeader">修改领导者信息</div>
    <div id="updateMain">
        <table id="updateMessageTable">
            <tr>
                <td class="updateTableTd1">组号</td>
                <td class="updateTableTd2"><input type="text" id="groupId2" readonly /></td>
            </tr>
            <tr>
                <td class="updateTableTd1">姓名</td>
                <td class="updateTableTd2"><input type="text" id="leadername2" /></td>
            </tr>
            <tr>
                <td class="updateTableTd1">性别</td>
                <td class="updateTableTd2">
                    <select id="sex2">
                        <option value="男" selected>男</option>
                        <option value="女">女</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td class="updateTableTd1">领导者号</td>
                <td class="updateTableTd2"><input type="text" id="leaderId2" /></td>
            </tr>
            <tr>
                <td class="updateTableTd1">邮箱</td>
                <td class="updateTableTd2"><input type="text" id="leaderEmail2" /></td>
            </tr>
        </table>
    </div>
    <div style="text-align: right; height: 35px; padding-top: 35px; padding-right: 120px">
        <button id="preservation" onclick="preservation()">保存</button>
        <button id="updateCancel" onclick="updateCancel()">取消</button>
    </div>
</div>

<div id="examineBlock">
    <div id="examineHeader">查看领导者信息</div>
    <div id="examineMain">
        <table id="examineMessageTable">
            <tr>
                <td class="examineTableTd1">组号</td>
                <td class="examineTableTd2"><input type="text" id="groupId3" readonly="readonly" /></td>
            </tr>
            <tr>
                <td class="examineTableTd1">姓名</td>
                <td class="examineTableTd2"><input type="text" id="leadername3" readonly="readonly" /></td>
            </tr>
            <tr>
                <td class="examineTableTd1">性别</td>
                <td class="examineTableTd2"><input type="text" id="sex3" readonly="readonly" /></td>
            </tr>
            <tr>
                <td class="examineTableTd1">领导者号</td>
                <td class="examineTableTd2"><input type="text" id="leaderId3" readonly /></td>
            </tr>
            <tr>
                <td class="examineTableTd1">邮箱</td>
                <td class="examineTableTd2"><input type="text" id="leaderEmail3" readonly="readonly" /></td>
            </tr>
        </table>
    </div>
    <div style="text-align: right; height: 35px; padding-top: 5px; padding-right: 20px">
        <button id="examineCancel" onclick="examineCancel()">取消</button>
    </div>
</div>
</body>
</html>

