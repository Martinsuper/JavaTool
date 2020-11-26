package top.younote.tool.image;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collector;

/**
 * @Description:
 * @Author: duanluyao
 * @CreateTime: 2020/11/26 12:29:44
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张四");
        list.add("张一");
        list.add("张a");
        list.add("a张三");
        list.add("爱人");
        list.add("博物");
        list.add("爱物");
        Collator comparator = Collator.getInstance(Locale.CHINA);
        Collections.sort(list,comparator);
        list.forEach(System.out::println);
    }
}
