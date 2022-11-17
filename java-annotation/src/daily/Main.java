package daily;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("daily.InitDemo");
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            boolean isInitMethod = method.isAnnotationPresent(InitMethod.class);
            if (isInitMethod) {
                method.invoke(clazz.getConstructor(new Class[0]).newInstance(new Object[]{}), new Object[]{});
            }
        }
    }
}
