package site.it4u;

import org.junit.Test;

import java.util.ArrayList;

/**
 * java10 支持var声明变量
 */
public class VarTest {

    @Test
    public void test1() {
        var list = new ArrayList<String>();
        list.add("steven");
        list.add("tom");
        list.add("betty");
        list.stream().forEach(System.out::println);
        for (var i = 0; i < list.size(); i ++) {
            System.out.println(list.get(i));
        }
    }
}