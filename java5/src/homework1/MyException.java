/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     homework1
 *
 *    Filename:    MyException.java
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
 *    Create at:   2017��11��14�� ����9:01:34
 *
 *    Revision:
 *
 *    2017��11��14�� ����9:01:34
 *        - first revision
 *
 *****************************************************************/
package homework1;

/**
 * @ClassName MyException
 * @Description TODO(������һ�仰��������������)
 * @author zhangsunmeifang
 * @Date 2017��11��14�� ����9:01:34
 * @version 1.0.0
 */
public class MyException extends Exception {
	 String msg;  
	    public MyException(char m){  
	        msg="ʮ���������е�"+m+"�ַ����벻����";  
	    }  
	    public String toString(){  
	        return msg;  
	    }  
}
