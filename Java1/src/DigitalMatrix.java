import java.util.Scanner;

/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     
 *
 *    Filename:    DigitalMatrix.java
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
 *    Create at:   2017年9月23日 下午8:05:53
 *
 *    Revision:
 *
 *    2017年9月23日 下午8:05:53
 *        - first revision
 *
 *****************************************************************/

/**
 * @ClassName DigitalMatrix
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author dell
 * @Date 2017年9月23日 下午8:05:53
 * @version 1.0.0
 */
public class DigitalMatrix {

	/**
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入4~10之间的整数：");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int i,j,m;
		int[][] a=new int[x+1][x+1];
		m=1;
		for(i=1;i<=(x+1)/2;i++){
			for(j=i;j<=x+1-i;j++)
				a[j][i]=m++;
			for(j=i+1;j<=x+1-i;j++)
				a[x+1-i][j]=m++;
			for(j=x-i;j>=i;j--)
				a[j][x+1-i]=m++;
			for(j=x-i;j>=i+1;j--)
				a[i][j]=m++;
		}
		for(i=1;i<x+1;i++){
			for(j=1;j<=x;j++)
				System.out.print(a[i][j]+" ");
				System.out.println();
		}
		
	}

}
