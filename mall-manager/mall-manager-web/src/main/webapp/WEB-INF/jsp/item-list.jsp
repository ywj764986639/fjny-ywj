<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品列表</title>
<style type="text/css">
*{
li:text-
}
</style>
</head>
<body>
	<div class="super-theme-example">
		<div style="height: 550px;">
			<table id="dg"></table>
		</div>
		<br /> <br />
		<table id="pg" style="width: 300px"></table>
	</div>
	<script type="text/javascript">
		$('#dg').datagrid({
			url : 'item/getItem',
			fit : true,
			pagination : true,
			fitColumns : true,
			toolbar : [ {
				text : '添加',
				iconCls : 'fa fa-plus',
				handler : function() {
				}
			}, {
				text : '编辑',
				iconCls : 'fa fa-edit',
				handler : function() {
				}
			}, {
				text : '保存',
				iconCls : 'fa fa-save',
				handler : function() {
				}
			}, {
				text : '删除',
				iconCls : 'fa fa-remove',
				handler : function() {
				}
			} ],
			height : 400,
			columns : [ [ {
				field : 'id',
				title : '商品id',
				width : 100,
				align : 'center',
				sortable : true
			}, {
				field : 'title',
				title : '商品标题',
				width : 200,
				align : 'center',
				sortable : true
			}, {
				field : 'sell_point',
				title : '卖点',
				width : 100,
				align : 'center',
				sortable : true
			}, {
				field : 'price',
				title : '价格',
				width : 100,
				align : 'center',
				sortable : true,
				formatter:TT.formatPrice
			},{
				field : 'num',
				title : '库存',
				width : 100,
				align : 'center',
				sortable : true
			},{
				field : 'barcode',
				title : '条形码',
				width : 100,
				align:'center',
				sortable : true
			}, {
				field : 'image',
				title : '图片',
				align : 'center',
				formatter:function(value,row){
					return "<img src ="+value+"  width='200px',height='200px'>"
				}
			},{
				field : 'cid',
				title : '类目',
				width : 100,
				align : 'center'
			},{
				field : 'starus',
				title : '状态',
				width : 100,
				align : 'center',
				formatter:TT.formatItemStatus
			},{
				field : 'created',
				title : '创建时间',
				width : 100,
				align : 'center',
				formatter:TT.formatDateTime
			},{
				field : 'update',
				title : '更新时间',
				width : 100,
				align : 'center',
				formatter:TT.formatDateTime
			}] ]
		});
	</script>
</body>
</html>