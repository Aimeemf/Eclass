/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     homework2
 *
 *    Filename:    Test1.java
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
 *    Create at:   2017��11��19�� ����4:23:38
 *
 *    Revision:
 *
 *    2017��11��19�� ����4:23:38
 *        - first revision
 *
 *****************************************************************/
package homework2;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 * @ClassName Test1
 * @Description TODO(������һ�仰��������������)
 * @author zhangsunmeifang
 * @Date 2017��11��19�� ����4:23:38
 * @version 1.0.0
 */
public class Test1 {

		public Date change(String date) throws ParseException   //����yyyy/mm/dd����ʽ�������ַ���ת��Ϊ���ڶ���
		{
			DateFormat format=new SimpleDateFormat("yyyy/mm/dd");
			try
			{
				return new Date(format.parse(date).getTime());
			}
			catch(ParseException e)
			{
				e.printStackTrace();
				throw e;
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Test1 except=new Test1();
			System.out.println("������һ�����ڣ����磺2010/01/01):");
			Scanner in=new Scanner(System.in);
			String string=in.nextLine();
			try
			{
				System.out.println(except.change(string));
			}
			catch(ParseException e)
			{
				e.printStackTrace();
				System.out.println("����������ڸ�ʽ����");
			}	
		}
	}
