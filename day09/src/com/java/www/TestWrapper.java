/*

* ��װ�ࣺ8�ֻ����������ͷֱ��Ӧ��һ���࣬����Ϊ ��װ��
* �����������͡���װ�ࡢString����֮����໥ת��

* */

package com.java.www;

import org.junit.Test;

public class TestWrapper {
    @Test
    public void test1() {
        int i = 10;
        System.out.println(i);
//        System.out.println(i.toString()); // ������������û��toString()����
        boolean b18 = false;

        // ������������ -> ��Ӧ�İ�װ�࣬���ð�װ��Ĺ�����
        Integer i21 = new Integer(i);
        System.out.println(i21.toString());

        Float f = new Float("12.6F");
        System.out.println(f);

//        int i27 = new Integer("11ab"); // ���뱨java.lang.NumberFormatException: For input string: "11ab"
//        System.out.println(i27);

        Boolean b1 = new Boolean("true"); // true
        System.out.println(b1);
        Boolean b2 = new Boolean(false);
        System.out.println(b2);
        Boolean b3 = new Boolean("true100"); // false��ֻҪд�Ĳ���true������false,���������������
        System.out.println(b3);

        Order o1 = new Order();
        System.out.println(o1.status); // null����Ϊ����һ������


    }
}

class Order {
    Boolean status;

}