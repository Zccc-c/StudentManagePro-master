// 修改按钮
function update(obj) {
    // 打开修改框架
    document.getElementById('updateBlock').style.display = 'block';
    document.getElementById('totalBackground').style.display = 'block';

    // 获取当前行
    var iTr = obj.parentNode.parentNode;

    // 获取当前行中的所有单元格
    iTds = iTr.getElementsByTagName('td');

    // 将新增框架中的输入框中内容设为当前行对应的内容
    document.getElementById('deptId2').value = iTds[1].innerText;
    document.getElementById('managername2').value = iTds[2].innerText;
    var sex = iTds[3].innerText;
    var selector = document.getElementById("sex2");
    for (var i = 0; i < selector.options.length; i++) {
        if (selector.options[i].value == sex) {
            selector.options[i].selected = true;
            break;
        }
    }
    document.getElementById('managerId2').value = iTds[4].innerText;
    document.getElementById('managerEmail2').value = iTds[5].innerText;

}

// 保存按钮
function preservation() {
    var id = document.getElementById('deptId2').value;
    var name = document.getElementById('managername2').value;

    var sexSelect = document.getElementById('sex2');
    var sexIndex = sexSelect.selectedIndex;
    var sexValue = sexSelect.options[sexIndex].value;

    var age = document.getElementById('managerId2').value;
    var insitute = document.getElementById('managerEmail2').value;
    var data = {};
    data.deptId = id;
    data.managerName = name;
    data.managerGender = sexValue;
    data.managerId = age;
    data.managerEmail = insitute;
    var protocol = window.location.protocol;
    var host = window.location.host;
    var proName = window.location.pathname.split("/")[1];
    var url = protocol + "//" + host + "/" + proName + "/managerController/updateManager";
    if (confirm("确定更新吗？")) {
        $.ajax({
            type : 'post',
            url : url,
            data : data,
            success : function (data) {
                if (data === "success") {
                    alert("更新成功");
                    // 将新内容写入
                    iTds[1].innerText = id;
                    iTds[2].innerText = name;
                    iTds[3].innerText = sexValue;
                    iTds[4].innerText = age;
                    iTds[5].innerText = insitute;
                    // 关闭修改框架
                    document.getElementById('updateBlock').style.display = 'none';
                    document.getElementById('totalBackground').style.display = 'none';
                } else if (data === "error") {
                    alert("更新失败");
                }
            },
            error : function (data) {
                alert("异常情况----" + data);
            }
        });
    }
}

// 修改中的取消按钮
function updateCancel() {
    // 关闭修改框架
    document.getElementById('updateBlock').style.display = 'none';
    document.getElementById('totalBackground').style.display = 'none';
}
