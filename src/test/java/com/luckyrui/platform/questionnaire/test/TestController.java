package com.luckyrui.platform.questionnaire.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class TestController {

	@RequestMapping(value = "test", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> testAction() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("response", "adsfasdfasdf");
		return map;
	}
}
