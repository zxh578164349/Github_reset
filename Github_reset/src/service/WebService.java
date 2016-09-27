/**
 * 
 */
package service;

/**   
 *    
 * 项目名称：Github_reset   
 * 类名称：WebService   
 * 类描述：   
 * 创建人：Administrator   
 * 创建时间：2016/9/27 上午10:57:41   
 * 修改人：Administrator   
 * 修改时间：2016/9/27 上午10:57:41   
 * 修改备注：   
 * @version    
 *    
 **/
public class WebService{
	private final static String SERSTR="Web Service 測試:";
	
	public String test(String userName){
		return SERSTR+userName;
	}

}
