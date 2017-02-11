//package impl;
//
//import com.reapal.model.TbUser;
//import com.reapal.service.impl.ITbUserService;
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.Date;
//
///**
//* TbUserServiceImpl Tester.
//*
//* @author <Authors name>
//* @since <pre>���� 11, 2017</pre>
//* @version 1.0
//*/
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring/spring.xml"})
//
//public class TbUserServiceImplTest {
//
//    @Autowired
//    private ITbUserService iTbUserService;
//
//@Before
//public void before() throws Exception {
//}
//
//@After
//public void after() throws Exception {
//}
//
//
//@Test
//    public void testInsert() {
//
//    TbUser t = new TbUser();
//    t.setKeyId("1");
//    t.setName("jack");
//    t.setCreateBy("admin");
//    t.setCreateBy("1");
//    t.setCreateDate(new Date());
//    iTbUserService.insert(t);
//    }
//
//
//}
