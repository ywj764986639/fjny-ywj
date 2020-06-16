<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
<style type="text/css">
</style>
</head>
<body>
	<style type="text/css">
.form-item {
	margin-bottom: 15px;
	width: 100%;
	float: left;
}

.form-item>label {
	min-width: 72px;
	display: inline-block;
}

.form-item input, select {
	width: 300px;
}
</style>

	<div class="super-theme-example">
		<form id="itemAddForm" method="post">
			<div class="form-item">
				<label for="" class="label-top">商品标题：</label> <input id="title"
					name="title" class="easyui-textbox" prompt="请输入商品名"
					data-options="required:true">
			</div>
			<div class="form-item">
				<label for="" class="label-top">商品卖点：</label> <input id="sellPoint"
					name="sellPoint" class="easyui-textbox"
					data-options="iconCls:'fa fa-user',iconAlign:'left'"
					prompt="请输入商品名称">
			</div>
			<div class="form-item">
				<label for="" class="label-top">商品价格：</label> <input type="text" name="price"
					class="easyui-numberbox" data-options="min:0" />
			</div>
			<div class="form-item">
				<label for="" class="label-top">库存数量：</label> <input type="text" name="num"
					class="easyui-numberbox" data-options="min:0" />
			</div>
			<div class="form-item">
				<label for="" class="label-top">条形码：</label> <input type="text" name="barcode"
					class="easyui-numberbox" data-options="required:true" />
			</div>
			<div class="form-item">
				<label for="" class="label-top">文件选择：</label> <input
					class="easyui-filebox"
					data-options="buttonText:'上传图片',buttonIcon:'fa fa-upload'">
			</div>
			<div>
				<a href="javascript:void(0)" class="easyui-linkbutton warning" onclick="clearForm()">取消</a>
				<a href="javascript:void(0)" class="easyui-linkbutton success" onclick="submitForm()">添加</a>
			</div>


		</form>
	</div>
	<script type="text/javascript">
		function submitForm(){
			if(!$('#itemAddForm').form('validate')){
				$.messager.alert('提示','表單還未填寫完成');
				return;
			}
			
			alert($("#itemAddForm").serialize());
			$.post("/item/save",$("#itemAddForm").serialize(), function(data){
				if(data.status == 200){
					$("#dgTbItem").datagrid("reload");
					$.messager.alert('操作成功','恭喜你添加产品成功','warning',function(){
						$('#item-list').cilck();
					});
				}
			});
		}
		
		function clearForm(){
			$('#itemAddForm').form('reset');
		}
	</script>
</body>
</html>