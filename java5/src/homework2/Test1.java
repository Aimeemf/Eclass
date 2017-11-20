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
 *    Create at:   2017年11月19日 下午4:23:38
 *
 *    Revision:
 *
 *    2017年11月19日 下午4:23:38
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
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author zhangsunmeifang
 * @Date 2017年11月19日 下午4:23:38
 * @version 1.0.0
 */
public class Test1 {

		public Date change(String date) throws ParseException   //将“yyyy/mm/dd”形式的日期字符串转化为日期对象
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
			System.out.println("请输入一个日期（例如：2010/01/01):");
			Scanner in=new Scanner(System.in);
			String string=in.nextLine();
			try
			{
				System.out.println(except.change(string));
			}
			catch(ParseException e)
			{
				e.printStackTrace();
				System.out.println("您输入的日期格式不对");
			}	
		}
	}
