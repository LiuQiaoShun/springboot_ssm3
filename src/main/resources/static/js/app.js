var dirId=-1;
var sex=-1;

$(function(){
	var nowURL = window.location.href;
	var container = $('#gra_content');
	
	//按钮单击时执行					     事件源
	$("#info_select a").click(function(event){
		event.preventDefault();
		
		key = $(this).attr("content");
		
		if(key == "dirId"){
			dirId = $(this).attr("value");
		}else if(key == "sex"){
            sex = $(this).attr("value");
		}
		
		$.ajax({
            url: "/getStudent",
            type: 'GET',
            dataType : 'html',
            //http://localhost/8080/getStudent/dirId:dirId
            data: {"dirId":dirId,"sex":sex},
            success : function(data) {
                container.css({
                    opacity : '0.0'
                }).html(data).delay(50).animate({
                    opacity : '1.0'
                }, 300);
            },
            error: function (xhr) { alert('服务器出错，返回内容：' + xhr.responseText) }
        });
	});
});