function deleteStu(obj) {
    // 获取当前行
    var iTr = obj.parentNode.parentNode;
    // 获取当前行中的所有单元格
    iTds = iTr.getElementsByTagName('td');
    var id = iTds[4].innerText;

    //获取url
    var protocol = window.location.protocol;
    var host = window.location.host;
    var proName = window.location.pathname.split("/")[1];
    var url = protocol + "//" + host + "/" + proName + "/employeeController/deleteEmployeeById";

    if (confirm("您确定要删除员工号为 " + id + " 的员工吗？")){
        $.ajax({
            type : 'post',
            url : url,
            data : {id:id},
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