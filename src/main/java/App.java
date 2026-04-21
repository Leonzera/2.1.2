import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean2.getMessage());
        System.out.println(bean.getMessage());
        System.out.println("-----Обьекты одинаковы? " + (bean2 == bean) + "------");

        Cat catBean = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean.getSay());
        Cat catBean2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(catBean2.getSay());
        System.out.println("-------Обьекты одинаковы?  " + (catBean == catBean2) + "------");
    }
}