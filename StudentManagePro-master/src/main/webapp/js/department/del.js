function deleteStu(obj) {
    // 获取当前行
    var iTr = obj.parentNode.parentNode;
    // 获取当前行中的所有单元格
    iTds = iTr.getElementsByTagName('td');
    var deptId = iTds[1].innerText;

    //获取url
    var protocol = window.location.protocol;
    var host = window.location.host;
    var proName = window.location.pathname.split("/")[1];
    var url = protocol + "//" + host + "/" + proName + "/departmentController/deleteDepartmentById";

    if (confirm("您确定要删除部门号为 " + deptId + " 的部门吗？")){
        $.ajax({
            type : 'post',
            url : url,
            data : {deptId:deptId},
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