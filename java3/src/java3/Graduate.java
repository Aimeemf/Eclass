/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     java3
 *
 *    Filename:    Graduate.java
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
 *    Create at:   2017��11��12�� ����9:50:37
 *
 *    Revision:
 *
 *    2017��11��12�� ����9:50:37
 *        - first revision
 *
 *****************************************************************/
package java3;

/**
 * @ClassName Graduate
 * @Description TODO(������һ�仰��������������)
 * @author zhangsunmeifang
 * @Date 2017��11��12�� ����9:50:37
 * @version 1.0.0
 */
public class Graduate implements StudentManageInterface, TeacherManageInterface {
	String name,sex;
	int age;
	double fee,pay;
	public Graduate(String name,String sex,int age)
	{
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	@Override
	public void setPay(double pay) {
		// TODO Auto-generated method stub
		this.pay=pay;
	}
	@Override
	public double getPay() {
		// TODO Auto-generated method stub
		return pay;
	}
	@Override
	public void setFee(double fee) {
		// TODO Auto-generated method stub
		this.fee=fee;
	}

	@Override
	public double getFee() {
		// TODO Auto-generated method stub
		return fee;
	}
	public static void main(String[] args){
		Graduate gr=new Graduate("zhangsan","��",19);
		gr.setFee(4500);
		gr.setPay(1000);
		if(gr.getPay()*8-gr.getFee()<2000)    //���������-��ѧ��<2000,����Ҫ����,һ�깤�ʰ�8������
			System.out.println("provide a loan");
		else
			System.out.println("����Ҫ���");	
	}

}
