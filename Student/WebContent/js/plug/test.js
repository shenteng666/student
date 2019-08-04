/**
 * 
 */
// 使编辑窗口显示
function show() {
	// 获取对象

	// 可以通过获取js对象，然后转换成jq对象
	var s = document.getElementById("show");
	var show = $(s);
	// 调用动画方法
	show.fadeToggle(500, function() {

	})
}