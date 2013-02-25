package com.snda.sysdev.mybatis.test;

import com.snda.sysdev.bean.Parent;
import com.snda.sysdev.mapper.ParentMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author liudong.leo
 * @since 2013-01-28 10:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-*.xml"})
public class MyBatisTest {
    @Resource
    private SqlSessionFactory sqlSessionFactory;

    @Resource
    private ParentMapper parentMapper;

    @Test
    public void selectTest() {
//        SqlSession session = sqlSessionFactory.openSession();
//        List<Parent> parents = new ArrayList<Parent>();
//        for (int i = 0; i < 1000; i++) {
////        HostTask hostTask = (HostTask) session.selectOne("selectHostTask", i);
//            Parent parent = parentMapper.selectParent(i);
//            if (parent != null) {
//                parents.add(parent);
//                System.out.println(parent.getId());
//            }
//        }
//        System.out.println(parents.size());
        Parent parent = parentMapper.selectParent(1);
        System.out.println(parent.getId());
    }

    @Test
    public void insertTest() {
        Parent parent = new Parent();
        parent.setName("Parent2");
        try {
        parentMapper.insertParent(parent);
        } catch(Exception e) {
            System.out.println(e.toString());
        }
        System.out.println(parent.getId());
    }

    @Test
    public void updateTest() {
        Parent parent = parentMapper.selectParent(1);
        parent.setName("Parent3");
        parentMapper.updateParent(parent);
    }
}
