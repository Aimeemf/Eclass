import java.util.Scanner;

/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     
 *
 *    Filename:    FirstClass.java
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
 *    Create at:   2017��9��23�� ����6:10:18
 *
 *    Revision:
 *
 *    2017��9��23�� ����6:10:18
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName FirstClass
 * @Description TODO(һ������������0������ѭ���ͱ��ر���������n,2n,4n,8n��˳���������ֵ����5000ʱ����ֵ����ָ��˳�������)
 * @author dell
 * @Date 2017��9��23�� ����6:10:18
 * @version 1.0.0
 */
public class FirstClass {

	/**
	 * @Description (TODO������һ�仰�����������������)
	 * @param args
	 */
	public static void count(int n){
		System.out.println(n);
		if(n<=5000){
			n*=2;
			count(n);
			n/=2;
		}
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ�����֣�");
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		count(m);
	}
}
