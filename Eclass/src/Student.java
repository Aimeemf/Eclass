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
 *    Create at:   2017��10��14�� ����5:34:54
 *
 *    Revision:
 *
 *    2017��10��14�� ����5:34:54
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName Student
 * @Description TODO(Student�࣬�����������䣬ѧ�����ԣ�show���������Ϣ)
 * @author zhangsunmeifang
 * @Date 2017��10��14�� ����5:34:54
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
		System.out.println("������"+name);
		System.out.println("����:"+age);
		System.out.println("ѧ����"+education);
	}
}
