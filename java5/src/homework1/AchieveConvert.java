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
 *    Create at:   2017��11��14�� ����8:58:58
 *
 *    Revision:
 *
 *    2017��11��14�� ����8:58:58
 *        - first revision
 *
 *****************************************************************/
package homework1;

import java.util.Scanner;

/**
 * @ClassName AchieveConvert
 * @Description TODO(������һ�仰��������������)
 * @author zhangsunmeifang
 * @Date 2017��11��14�� ����8:58:58
 * @version 1.0.0
 */
public class AchieveConvert {
	private char []arrays;  
    String str;  
    //��Ž��ַ���ת���������������  
    int []num=new int [10];  
    //������ս��  
    int result=0;  
    int m=0;  
    int i;  
    
    public void convert(){  
        try{  
            //��str����ַ���������arrays  
            Scanner input=new Scanner(System.in);  
            System.out.println("��������Ҫת����16������(Ӧ����0-9��a-z��A-Z�е��ַ�)��");  
            str=input.next();  
            arrays=str.toCharArray();  
            //�����鵹ת  
            swap(arrays);  
            //һ���ַ�һ���ַ��ر��ϣ�����ֵ��������num  
            for(char ch:arrays){  
                num[m++]=recognize(ch);   
            }   
            //���ý�����  
            for(i=str.length();i>0;i--,m--){  
                //��Ӧλ�ý���ת����������  
                result+=num[i-1]*Math.pow(16, (i-1));  
            }  
            System.out.println("ת����ʮ���ƺ����Ϊ��");  
            System.out.println(result);  
        }  
        catch(MyException e){  
            System.out.println(e.toString());  
        }  
  
    }  
    //�������ַ�ת��Ϊ����  
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
    //��ת�����е��ַ���  
    public static void swap(char strs[]){  
        for(int i=0;i<strs.length/2;i++){  
            char temp=strs[i];  
            strs[i]=strs[strs.length-1-i];  
            strs[strs.length-1-i]=temp;  
        }  
    }  
  
}  
