/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     java3
 *
 *    Filename:    Television.java
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
 *    Create at:   2017年11月12日 下午7:01:42
 *
 *    Revision:
 *
 *    2017年11月12日 下午7:01:42
 *        - first revision
 *
 *****************************************************************/
package java3;

/**
 * @ClassName Television
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author zhangsunmeifang
 * @Date 2017年11月12日 下午7:01:42
 * @version 1.0.0
 */
public class Television implements ComputeWeight {

	int mount;
	double weight;
	Television(int mount,double weight)
	{
		this.mount=mount;
		this.weight=weight;
	}
	public void setmount(int mount)
	{
		this.mount=mount;
	}
	@Override
	public double computeWeight() {
		// TODO Auto-generated method stub
		return mount*weight;
	}

}
