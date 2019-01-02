package priv.rlliu.dubbo.service.api;

import priv.rlliu.dubbo.service.vo.RecVo;
import priv.rlliu.dubbo.service.vo.ReqVo;

/**
 * 
 * @Description: dubbo 服务API 
 * @author Martin
 * @date 2019年1月2日 下午9:34:09
 */
public interface IDubboServiceApi {
	
	/**
	 * 
	 * @Description: dubbo测试接口
	 * @param reqVo
	 * @return
	 * @author Martin
	 * @date 2019年1月2日 下午9:35:36
	 */
	RecVo dubboTest(ReqVo reqVo);
	
}
