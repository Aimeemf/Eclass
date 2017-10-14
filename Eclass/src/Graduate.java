/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     
 *
 *    Filename:    Graduate.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     Digital Telemedia Co.,Ltd
 *
 *    @author:     dell
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年10月14日 下午5:40:00
 *
 *    Revision:
 *
 *    2017年10月14日 下午5:40:00
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName Graduate
 * @Description TODO(Graduate类继承Student类，新增研究方向属性)
 * @author zhangsunmeifang
 * @Date 2017年10月14日 下午5:40:00
 * @version 1.0.0
 */
public class Graduate extends Student {
	public String direction;
	public Graduate(String name,int age,String education,String direction){
		super(name,age,education);
		this.direction=direction;	
	}
	public void show(){
		super.show();
		System.out.println("研究方向："+direction);
	}
}
