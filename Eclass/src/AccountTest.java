/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     
 *
 *    Filename:    AccountTest.java
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
 *    Create at:   2017年10月14日 下午4:31:46
 *
 *    Revision:
 *
 *    2017年10月14日 下午4:31:46
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName AccountTest
 * @Description TODO(测试输出信息)
 * @author zhangsunmeifang
 * @Date 2017年10月14日 下午4:31:46
 * @version 1.0.0
 */
public class AccountTest {

	/**
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount(1234567890,"zhangsan",5000);		//创建用户
		DepositAccount.setannualRate(0.023);
		System.out.println("账号为:"+saver.getuserId());
		System.out.println("用户名为："+saver.getuserName());
		saver.getbalance();
		saver.Deposit(2000);
		System.out.println("年利息为："+saver.calculateYear());
		System.out.println("月利息为："+saver.calculateMonth());
	}

}
