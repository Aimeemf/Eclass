/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     
 *
 *    Filename:    TestExtends.java
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
 *    Create at:   2017年10月14日 下午5:41:05
 *
 *    Revision:
 *
 *    2017年10月14日 下午5:41:05
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName TestExtends
 * @Description TODO(测试几个类的数据输出)
 * @author zhangsunmeifang
 * @Date 2017年10月14日 下午5:41:05
 * @version 1.0.0
 */
public class TestExtends {

	/**
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student("张三",16,"高中");
		Undergraduate undergraduate=new Undergraduate("李四",18,"大一","计算机专业");
		Graduate graduate=new Graduate("王明",22,"研一","人工智能");
		System.out.println("==================Student类=================");
		student.show();
		System.out.println("==============Undergraduate类===============");
		undergraduate.show();
		System.out.println("================Graduate类==================");
		graduate.show();
	}

}
