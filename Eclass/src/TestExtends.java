/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     
 *
 *    Filename:    TestExtends.java
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
 *    Create at:   2017��10��14�� ����5:41:05
 *
 *    Revision:
 *
 *    2017��10��14�� ����5:41:05
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName TestExtends
 * @Description TODO(���Լ�������������)
 * @author zhangsunmeifang
 * @Date 2017��10��14�� ����5:41:05
 * @version 1.0.0
 */
public class TestExtends {

	/**
	 * @Description (TODO������һ�仰�����������������)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student("����",16,"����");
		Undergraduate undergraduate=new Undergraduate("����",18,"��һ","�����רҵ");
		Graduate graduate=new Graduate("����",22,"��һ","�˹�����");
		System.out.println("==================Student��=================");
		student.show();
		System.out.println("==============Undergraduate��===============");
		undergraduate.show();
		System.out.println("================Graduate��==================");
		graduate.show();
	}

}
