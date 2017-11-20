/******************************************************************
 *
 *    Java Lib For Android, Powered By Shenzhen Jiuzhou.
 *
 *    Copyright (c) 2001-2014 Digital Telemedia Co.,Ltd
 *    http://www.d-telemedia.com/
 *
 *    Package:     homework1
 *
 *    Filename:    AchieveConvert.java
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
 *    Create at:   2017年11月14日 下午8:58:58
 *
 *    Revision:
 *
 *    2017年11月14日 下午8:58:58
 *        - first revision
 *
 *****************************************************************/
package homework1;

import java.util.Scanner;

/**
 * @ClassName AchieveConvert
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author zhangsunmeifang
 * @Date 2017年11月14日 下午8:58:58
 * @version 1.0.0
 */
public class AchieveConvert {
	private char []arrays;  
    String str;  
    //存放将字符串转化成整数后的数组  
    int []num=new int [10];  
    //存放最终结果  
    int result=0;  
    int m=0;  
    int i;  
    
    public void convert(){  
        try{  
            //将str里的字符赋给数组arrays  
            Scanner input=new Scanner(System.in);  
            System.out.println("请输入需要转化的16进制数(应输入0-9或a-z或A-Z中的字符)：");  
            str=input.next();  
            arrays=str.toCharArray();  
            //将数组倒转  
            swap(arrays);  
            //一个字符一个字符地辨认，并将值赋给数组num  
            for(char ch:arrays){  
                num[m++]=recognize(ch);   
            }   
            //所得结果相加  
            for(i=str.length();i>0;i--,m--){  
                //相应位置进行转化，结果相加  
                result+=num[i-1]*Math.pow(16, (i-1));  
            }  
            System.out.println("转化成十进制后的数为：");  
            System.out.println(result);  
        }  
        catch(MyException e){  
            System.out.println(e.toString());  
        }  
  
    }  
    //将单个字符转化为整数  
    public int recognize(char a) throws MyException{  
        int m=0;  
            if(a<48||a>57&a!='a'&a!='b'&a!='c'&a!='d'&a!='e'&a!='f'&a!='A'&a!='B'&a!='C'&a!='D'&a!='E'&a!='F'){  
                throw new MyException(a);  
            }else{  
                switch(a){  
                case '1':  
                    m=1;  
                    break;  
                case '2':  
                    m=2;  
                    break;  
                case '3':  
                    m=3;  
                    break;  
                case '4':  
                    m=4;  
                    break;  
                case '5':  
                    m=5;  
                    break;  
                case '6':  
                    m=6;  
                    break;  
                case '7':  
                    m=7;  
                    break;  
                case '8':  
                    m=8;  
                    break;  
                case '9':  
                    m=9;  
                    break;  
                case 'a':  
                case 'A':  
                    m=10;  
                    break;  
                case 'b':  
                case 'B':  
                    m=11;  
                    break;  
                case 'c':  
                case 'C':  
                    m=12;  
                    break;  
                case 'd':  
                case 'D':  
                    m=13;  
                    break;  
                case 'e':  
                case 'E':  
                    m=14;  
                    break;  
                case 'f':  
                case 'F':  
                    m=15;  
                    break;  
                default:  
                    System.out.println("error");  
                    break;  
  
                }  
            }  
            return m;  
    }  
    //翻转数组中的字符串  
    public static void swap(char strs[]){  
        for(int i=0;i<strs.length/2;i++){  
            char temp=strs[i];  
            strs[i]=strs[strs.length-1-i];  
            strs[strs.length-1-i]=temp;  
        }  
    }  
  
}  
