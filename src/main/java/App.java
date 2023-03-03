import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println(bean2 == bean);
        System.out.println(bean == bean2);
        System.out.println(bean);
        System.out.println(bean2);

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.getMessage());
        Cat bean4Cat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        System.out.println(beanCat == bean4Cat);
    }


}