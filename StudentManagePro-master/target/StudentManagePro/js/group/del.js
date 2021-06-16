function deleteStu(obj) {
    // 获取当前行
    var iTr = obj.parentNode.parentNode;
    // 获取当前行中的所有单元格
    iTds = iTr.getElementsByTagName('td');
    var groupId = iTds[1].innerText;

    //获取url
    var protocol = window.location.protocol;
    var host = window.location.host;
    var proName = window.location.pathname.split("/")[1];
    var url = protocol + "//" + host + "/" + proName + "/groupController/deleteGroupById";

    if (confirm("您确定要删除组为 " + groupId + " 的小组吗？")){
        $.ajax({
            type : 'post',
            url : url,
            data : {groupId:groupId},
            success : function (data) {
                if (data === "success") {
                    alert("删除成功");
                    iTr.remove();
                    range();
                } else if (data === "error") {
                    alert("删除失败");
                }
            },
            error : function (data) {
                alert("异常情况----" + data);
            }
        });
    }
}