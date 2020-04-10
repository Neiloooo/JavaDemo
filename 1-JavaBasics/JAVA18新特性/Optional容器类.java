package JAVA18新特性;

import org.junit.Test;

import java.util.Optional;

/**
 * 一、Optiona容器类说明:
 * Optional类(java.util.Optional)是一个容器类，代表一个值存在或不存在，
 * 原来用null表示一个值不存在，现在Optional可以更好的表达这个概念。
 * 并且可以避免空指针异常。
 *
 * 二、Optional容器类常用方法说明:
 * 常用方法：
 * Optional.of(T t):创建一个Optional实例
 * Optional.empty():创建一个空的Optional实例
 * Optional.ofNullable(T t):若t不为null,创建Optional实例，否则创建空的实例
 * isPresent():判断是否包含值
 * orElse(T t):如果Optional实例包含值，返回该值，否则返回t
 * orElseGet(Supplier s):如果Optional实例包含值，返回该值，否则返回s获取的值
 * map(Function f):如果有值对其处理，并返回成立后的Optional，否则返回Optional.empty()
 * flatMap(Function mapper):与map类似，要求返回值必须是Optional
 */
public class Optional容器类 {
    @Test
    public void test01(){
        //Optional.of(T t):创建一个Optional实例
        Optional<Employee> optional = Optional.of(new Employee());
        Employee employee = optional.get();
        System.out.println(employee);
    }

    @Test
    public void test02(){
        //Optional.ofNullable(T t):若t不为null,创建Optional实例，否则创建空的实例
        Optional<Object> optional = Optional.ofNullable(null);
        //isPresent():判断是否包含值
        if (optional.isPresent()){
            System.out.println("值是:"+optional.get());
        }
        //orElse(T t):如果调用对象包含值，返回该值，否则返回t
        System.out.println(optional.orElse(new Employee("张三",22,  9999.99)));
        //orElseGet(Supplier s):如果调用对象包含值，返回该值，否则返回s获取的值
        Employee o = (Employee) optional.orElseGet(Employee::new);
        System.out.println(o);
    }

    @Test
    public void test03(){
        //map(Function f):如果有值对其处理，并返回成立后的Optional，否则返回Optional.empty()
        Optional<Employee> optional = Optional.of(new Employee("张三", 22, 9999.99));
        Optional<String> optionalS = optional.map(Employee::getName);
        System.out.println(optionalS.get());
        //flatMap(Function mapper):与map类似，要求返回值必须是Optional
        Optional<String> stringOptional = optional.flatMap((e) -> Optional.of(e.getName()));
        System.out.println(stringOptional.get());
    }
}
