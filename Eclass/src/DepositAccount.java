/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     
 *
 *    Filename:    DepositAccount.java
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
 *    Create at:   2017��10��14�� ����4:29:58
 *
 *    Revision:
 *
 *    2017��10��14�� ����4:29:58
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName DepositAccount
 * @Description TODO(ģ�����ж��ڴ��ܣ���Ϊ���ж��ڴ���˻���)
 * @author dell
 * @Date 2017��10��14�� ����4:29:58
 * @version 1.0.0
 */
public class DepositAccount {
	private int userId;				//�˺�
	private String userName;		//�û���
	private double balance;			//���
	static public double annualRate;		//������
	public DepositAccount(int userId,String userName,double balance){	//���캯���������˻�
		this.userId=userId;
		this.userName=userName;
		this.balance=balance;
	}
	public int getuserId(){			//��ѯ�˺�
		return userId;
	}
	public String getuserName(){	//��ѯ�û���
		return userName;
	}
	public double getbalance(){		//��ѯ���
		return balance;
	}
	public static void setannualRate(double a){			//����������
		 annualRate=a;	
	}
	public void Deposit(double b){					//���
		balance+=b;
		System.out.println("�ܴ�����Ϊ��"+balance);
	}
	public double calculateYear(){				//��������Ϣ
		return balance*annualRate;
	}
	public double calculateMonth(){				//��������Ϣ
		return balance*annualRate/12;
	}
}
