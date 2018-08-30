package cn.hpc.Controller;

import cn.hpc.beans.SysInfo;
import cn.hpc.dbUnit.MyBatisUnit;
import cn.hpc.mapper.SysInfoMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.InputStream;
import java.io.Reader;


@Controller
public class HelloMvc {



    @RequestMapping("/hello")
    public String Hello() throws Exception {

        SqlSession sqlSession= MyBatisUnit.getSession();
        SysInfoMapper mapper = sqlSession.getMapper(SysInfoMapper.class);
        System.out.println("3");
        SysInfo sysInfo = new SysInfo();
        sysInfo.setsKey("test");
        sysInfo.setsValue("123456");
        mapper.insert(sysInfo);
        System.out.println("4");
        sqlSession.commit();
        return "hello";
    }
}
