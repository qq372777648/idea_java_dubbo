package dubboConsumerTest.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.paywe.fos.api.dto.ApiResult;
import dubboConsumerTest.test.bean.ITestService;

/** 
* @author: lzw
* @email:372777648@qq.com
* @create：2017年7月25日 下午3:30:13 
* @version:1.0
* @description:
*/

@RequestMapping("/api")
@RestController
public class TestController {
	@Autowired
	private ITestService testService;
	
   @RequestMapping(method={RequestMethod.GET})
   public ApiResult api(String data){
	   return testService.testMethed();
   }
}
