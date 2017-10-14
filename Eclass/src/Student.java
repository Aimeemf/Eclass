/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     
 *
 *    Filename:    Student.java
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
 *    Create at:   2017年10月14日 下午5:34:54
 *
 *    Revision:
 *
 *    2017年10月14日 下午5:34:54
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName Student
 * @Description TODO(Student类，有姓名，年龄，学历属性，show方法输出信息)
 * @author zhangsunmeifang
 * @Date 2017年10月14日 下午5:34:54
 * @version 1.0.0
 */
public class Student {
	public String name;
	public int age;
	public String education;
	Student(String name,int age,String education){
		this.name=name;
		this.age=age;
		this.education=education;
	}
	public void show(){
		System.out.println("姓名："+name);
		System.out.println("年龄:"+age);
		System.out.println("学历："+education);
	}
}
