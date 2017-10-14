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
 *    Create at:   2017年10月14日 下午4:29:58
 *
 *    Revision:
 *
 *    2017年10月14日 下午4:29:58
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName DepositAccount
 * @Description TODO(模拟银行定期存款功能，此为银行定期存款账户类)
 * @author dell
 * @Date 2017年10月14日 下午4:29:58
 * @version 1.0.0
 */
public class DepositAccount {
	private int userId;				//账号
	private String userName;		//用户名
	private double balance;			//余额
	static public double annualRate;		//年利率
	public DepositAccount(int userId,String userName,double balance){	//构造函数，创建账户
		this.userId=userId;
		this.userName=userName;
		this.balance=balance;
	}
	public int getuserId(){			//查询账号
		return userId;
	}
	public String getuserName(){	//查询用户名
		return userName;
	}
	public double getbalance(){		//查询余额
		return balance;
	}
	public static void setannualRate(double a){			//设置年利率
		 annualRate=a;	
	}
	public void Deposit(double b){					//存款
		balance+=b;
		System.out.println("总存款余额为："+balance);
	}
	public double calculateYear(){				//计算年利息
		return balance*annualRate;
	}
	public double calculateMonth(){				//计算月利息
		return balance*annualRate/12;
	}
}
