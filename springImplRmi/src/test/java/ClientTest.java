import com.jnshu.model.User;
import com.jnshu.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Tom on 2017/5/19.
 */
public class ClientTest {

    public static void main (String [] args)throws NotBoundException,
            java.net.MalformedURLException,
            RemoteException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        BaseService baseService = (BaseService) context.getBean("baseService");



        User user = new User();
        System.out.println(baseService.getHelloword("zhangs9999999999"));
        user.setName("bocosoftbababab");
        user.setAge(33);
        try {
            System.out.println(baseService.getUser(user));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
