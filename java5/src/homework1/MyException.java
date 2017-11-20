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
 *    Create at:   2017年11月14日 下午9:01:34
 *
 *    Revision:
 *
 *    2017年11月14日 下午9:01:34
 *        - first revision
 *
 *****************************************************************/
package homework1;

/**
 * @ClassName MyException
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author zhangsunmeifang
 * @Date 2017年11月14日 下午9:01:34
 * @version 1.0.0
 */
public class MyException extends Exception {
	 String msg;  
	    public MyException(char m){  
	        msg="十六进制数中的"+m+"字符输入不合理";  
	    }  
	    public String toString(){  
	        return msg;  
	    }  
}
