package cn.itcast.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cn.itcast.ssm.dao.UserDaoImpl;
import cn.itcast.ssm.po.User;



@SpringBootApplication
@MapperScan("cn.itcast.ssm.mapper")
public class SpringMybatisTestApplication implements CommandLineRunner {

	@Autowired
	UserDaoImpl ud;
	
    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisTestApplication.class, args);
    }


    @Override
    public void run(String... args) {

        /*
         * Add new users
         */
        System.out.print("hello world\n");
        try{
        	User u = ud.findUserById(1);
        	System.out.println(u.toString());
        }catch(Exception e) {
        	e.printStackTrace();
        }
 //       UserDao userDao = (UserDao) context.getBean("userDao");
       
       
    }
}
