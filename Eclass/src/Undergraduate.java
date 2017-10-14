/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     
 *
 *    Filename:    Undergraduate.java
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
 *    Create at:   2017年10月14日 下午5:37:00
 *
 *    Revision:
 *
 *    2017年10月14日 下午5:37:00
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName Undergraduate
 * @Description TODO(Undergraduate类继承Student类，新增专业属性)
 * @author zhangsunmeifang
 * @Date 2017年10月14日 下午5:37:00
 * @version 1.0.0
 */
public class Undergraduate extends Student {
	public String specialty;
	public Undergraduate(String name,int age,String education,String specialty){
		super(name,age,education);
		this.specialty=specialty;	
	}
	public void show(){
		super.show();
		System.out.println("专业："+specialty);
	}
}
