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
 *    Create at:   2017��10��14�� ����4:31:46
 *
 *    Revision:
 *
 *    2017��10��14�� ����4:31:46
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName AccountTest
 * @Description TODO(���������Ϣ)
 * @author zhangsunmeifang
 * @Date 2017��10��14�� ����4:31:46
 * @version 1.0.0
 */
public class AccountTest {

	/**
	 * @Description (TODO������һ�仰�����������������)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepositAccount saver=new DepositAccount(1234567890,"zhangsan",5000);		//�����û�
		DepositAccount.setannualRate(0.023);
		System.out.println("�˺�Ϊ:"+saver.getuserId());
		System.out.println("�û���Ϊ��"+saver.getuserName());
		saver.getbalance();
		saver.Deposit(2000);
		System.out.println("����ϢΪ��"+saver.calculateYear());
		System.out.println("����ϢΪ��"+saver.calculateMonth());
	}

}
