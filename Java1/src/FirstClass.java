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
 *    Create at:   2017年9月23日 下午6:10:18
 *
 *    Revision:
 *
 *    2017年9月23日 下午6:10:18
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName FirstClass
 * @Description TODO(一个整数，大于0，不用循环和本地变量，按照n,2n,4n,8n的顺序递增，当值大于5000时，把值按照指定顺序输出来)
 * @author dell
 * @Date 2017年9月23日 下午6:10:18
 * @version 1.0.0
 */
public class FirstClass {

	/**
	 * @Description (TODO这里用一句话描述这个方法的作用)
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
		System.out.println("请输入一个数字：");
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		count(m);
	}
}
