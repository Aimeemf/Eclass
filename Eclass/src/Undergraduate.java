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
 *    Create at:   2017��10��14�� ����5:37:00
 *
 *    Revision:
 *
 *    2017��10��14�� ����5:37:00
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName Undergraduate
 * @Description TODO(Undergraduate��̳�Student�࣬����רҵ����)
 * @author zhangsunmeifang
 * @Date 2017��10��14�� ����5:37:00
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
		System.out.println("רҵ��"+specialty);
	}
}
