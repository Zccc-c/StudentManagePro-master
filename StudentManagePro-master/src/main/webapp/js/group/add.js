// 新增按钮
function add() {
    // 打开新增框架
    document.getElementById('addBlock').style.display = 'block';
    document.getElementById('totalBackground').style.display = 'block';
}

function jQSubmit() {
    var data = {};
    data.groupId = document.getElementById('groupId1').value;
    data.deptId = document.getElementById('deptId1').value;
    data.managerId = document.getElementById('managerId1').value;
    data.leaderId = document.getElementById('leaderId1').value;


    //获取url
    var protocol = window.location.protocol;
    var host = window.location.host;
    var proName = window.location.pathname.split("/")[1];
    var url = protocol + "//" + host + "/" + proName + "/groupController/addGroup";

    $.ajax({
        type : 'post',
        url : url,
        data : data,
        success : function (data) {
            if (data === "error") {
                alert("添加失败");
            } else if (data === "success") {
                sumbit();
                alert("添加成功");
            } else if (data === "isExist") {
                alert("学号重复，添加失败");
            }
        },
        error : function (data) {
            alert("异常情况!")
        }
    })
}

// 提交按钮
function sumbit() {
    // 关闭新增框架
    document.getElementById('addBlock').style.display = 'none';
    document.getElementById('totalBackground').style.display = 'none';

    // 写入表单
    // 获取表
    var iTable = document.getElementById('myTable');
    // 获取输入值
    var groupId = document.getElementById('groupId1').value;
    var deptId = document.getElementById('deptId1').value;
    var managerId = document.getElementById('managerId1').value;
    var leaderId = document.getElementById('leaderId1').value;
    var nums = iTable.rows.length;


    // 创建一行tr
    var iTr = document.createElement('tr');

    // 隔行换色
    if (nums % 2 != 0)
    {
        iTr.className = 'mainTbodyTr1';
    }
    else {
        iTr.className = 'mainTbodyTr2';
    }

    // 将tr添加到table中
    iTable.appendChild(iTr);

    var iTd2 = document.createElement('td');
    iTd2.className = "col2";
    iTd2.appendChild(document.createTextNode(nums));
    var iTd3 = document.createElement('td');
    iTd3.className = "col3";
    iTd3.appendChild(document.createTextNode(groupId));
    var iTd7 = document.createElement('td');
    iTd7.className = "col7";
    iTd7.appendChild(document.createTextNode(deptId));
    var iTd8 = document.createElement('td');
    iTd8.className = "col8";
    iTd8.appendChild(document.createTextNode(managerId));
    var iTd9 = document.createElement('td');
    iTd9.className = "col9";
    iTd9.appendChild(document.createTextNode(leaderId));
    var iTd10 = document.createElement('td');
    iTd10.className = "col10";
    var examine = document.createElement('input');
    examine.id = 'examine';
    examine.setAttribute('type','button');
    examine.setAttribute('value','查看');
    examine.setAttribute('onclick','examine(this)');
    var update = document.createElement('input');
    update.id = 'update';
    update.setAttribute('type','button');
    update.setAttribute('value','更新');
    update.setAttribute('onclick','update(this)');
    var del = document.createElement('input');
    del.id = 'delete';
    del.setAttribute('type','button');
    del.setAttribute('value','删除');
    del.setAttribute('onclick','deleteStu(this)');
    iTd10.appendChild(examine);
    iTd10.appendChild(update);
    iTd10.appendChild(del);

    // 将单元格添加到行
    // iTr.appendChild(iTd1);
    iTr.appendChild(iTd2);
    iTr.appendChild(iTd3);
    iTr.appendChild(iTd9);
    iTr.appendChild(iTd7);
    iTr.appendChild(iTd8);
    iTr.appendChild(iTd10);


    // 将新增框架中的输入框值初始化
    document.getElementById('groupId1').value = null;
    document.getElementById('deptId1').value = null;
    document.getElementById('managerId1').value = null;
    document.getElementById('leaderId1').value = null;
    document.getElementById('nums').innerText = nums;

    range();

    var pageNum = document.getElementById('pageNum').innerText;
    pageNum = parseInt(pageNum);
    for (var i=10*pageNum+1; i<=nums; i++) {
        iTable.rows[i].style.display = 'none';
    }
}

// 新增中的取消按钮
function addCancel() {
    // 关闭新增框架
    document.getElementById('addBlock').style.display = 'none';
    document.getElementById('totalBackground').style.display = 'none';
}