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
 *    Description: TODO(��һ�仰�������ļ���ʲô)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     Digital Telemedia Co.,Ltd
 *
 *    @author:     dell
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017��10��14�� ����5:40:00
 *
 *    Revision:
 *
 *    2017��10��14�� ����5:40:00
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName Graduate
 * @Description TODO(Graduate��̳�Student�࣬�����о���������)
 * @author zhangsunmeifang
 * @Date 2017��10��14�� ����5:40:00
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
		System.out.println("�о�����"+direction);
	}
}
