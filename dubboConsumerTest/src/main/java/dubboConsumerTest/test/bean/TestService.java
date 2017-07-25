package dubboConsumerTest.test.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.paywe.fos.api.dto.ApiResult;
import cn.paywe.fos.api.service.remote.IXPaymentChannelService;

/** 
* @author: lzw
* @email:372777648@qq.com
* @create：2017年7月25日 下午3:25:40 
* @version:1.0
* @description:
*/
@Service
public class TestService implements ITestService {
	@Autowired
	private IXPaymentChannelService paymentChannelService;
	
	static {
		System.out.println("create-----------------------------------------------");
	}
	
	public ApiResult testMethed(){
		return paymentChannelService.getLatestChannelList("2017-7-7");
	}

}
