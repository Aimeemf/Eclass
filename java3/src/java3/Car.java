/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     java3
 *
 *    Filename:    Car.java
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
 *    Create at:   2017��11��12�� ����7:14:10
 *
 *    Revision:
 *
 *    2017��11��12�� ����7:14:10
 *        - first revision
 *
 *****************************************************************/
package java3;

/**
 * @ClassName Car
 * @Description TODO(������һ�仰��������������)
 * @author zhangsunmeifang
 * @Date 2017��11��12�� ����7:14:10
 * @version 1.0.0
 */
public class Car {

	/**
	 * @Description (TODO������һ�仰�����������������)
	 * @param args
	 */
	ComputeWeight[] com=new ComputeWeight[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum;
		ComputeWeight[] com=new ComputeWeight[3];
		com[0]=new Television(10,30);
		com[1]=new Computer(5,15);
		com[2]=new WashMachine(5,60);
		sum=com[0].computeWeight()+com[1].computeWeight()+com[2].computeWeight();
		System.out.println("װ�صĻ���������Ϊ:"+sum);
		
	}

}
