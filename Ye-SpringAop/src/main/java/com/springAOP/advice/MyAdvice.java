package com.springAOP.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyAdvice {


    /**
     //ǰ��֪ͨ��Ŀ�귽������֮ǰ����
     //����֪ͨ(��������쳣�������)����Ŀ�귽������֮�����
     //����֪ͨ����Ŀ�귽��֮ǰ��֮�󶼵���
     //�쳣����֪ͨ����������쳣���ͻ����
     //����֪ͨ(�����Ƿ���� �쳣�������)����Ŀ�귽������֮�����
     */
	
	 //ǰ��֪ͨ
    public  void before(){
        System.out.println("����ǰ��֪ͨ");
    }

    //����֪ͨ
    public  void afterReturning(){
        System.out.println("���Ǻ���֪ͨ(�����������쳣)");
    }

    public  Object around(ProceedingJoinPoint point) throws Throwable {

        System.out.println("���ǻ���֪֮ͨǰ����!!");
        Object object = point.proceed(); //����Ŀ�귽��
        System.out.println("���ǻ���֪֮ͨ��Ĳ���!!");

        return  object;
    }

    public  void afterException(){
        System.out.println("�쳣֪ͨ!");
    }

    public  void after(){
        System.out.println("��Ҳ�Ǻ���֪ͨ,���㷽�������쳣Ҳ�����!");
    }

}
