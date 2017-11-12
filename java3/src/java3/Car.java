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
 *    Create at:   2017年11月12日 下午7:14:10
 *
 *    Revision:
 *
 *    2017年11月12日 下午7:14:10
 *        - first revision
 *
 *****************************************************************/
package java3;

/**
 * @ClassName Car
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author zhangsunmeifang
 * @Date 2017年11月12日 下午7:14:10
 * @version 1.0.0
 */
public class Car {

	/**
	 * @Description (TODO这里用一句话描述这个方法的作用)
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
		System.out.println("装载的货物总重量为:"+sum);
		
	}

}
