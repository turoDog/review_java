package com.nasus.generic.how;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.generic.how <br/>
 * Date:2019/12/28 21:35 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class EntityTool<T> {

    private T entity;

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }

    public static void main(String[] args) {
        // 创建对象并指定元素类型
        EntityTool<String> stringTool = new EntityTool<>();

        stringTool.setEntity("一个优秀的废人");
        String s = stringTool.getEntity();
        System.out.println(s);


        // 创建对象并指定元素类型
        EntityTool<Integer> integerTool = new EntityTool<>();
        // 此时，如果这里传入的还是 String 类型，那就会在编译期报错
        integerTool.setEntity(10);
        int i = integerTool.getEntity();
        System.out.println(i);
    }
}
