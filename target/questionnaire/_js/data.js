/**
 * 
 */

var Data = (function($, window) {
	return {
		getData : function(url) {
			var rs = null;
			$.ajax({
				type : "POST",
				url : CONFIG_ROOT + url,
				dataType : "json",
				async : false,
				success : function(data) {
					if (data.code === 1) {
						alert(data.msg);
					} else {
						console.log(data);
						rs = data;
					}
				},
				error : function(XMLHttpRequest, textStatus, errorThrown) {
					alert(errorThrown);
				}
			});
			return rs
		}

	}

})(jQuery, window);