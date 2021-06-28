package com.atguigu.crowd.test;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.service.api.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author ezuy
 * @date 21/3/21 16:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class CrowdTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminService adminService;

    @Test
    public void testTx() {
        Admin admin = new Admin(null, "jerry", "123456", "杰瑞", "jerry@qq.com", null);
        adminService.saveAdmin(admin);
    }

    @Test
    public void testLog() {

        // 1.获取Logger对象
        Logger logger = LoggerFactory.getLogger(CrowdTest.class);

        // 2.根据不同日志级别打印日志
        logger.debug("debug level");
        logger.debug("debug level");
        logger.debug("debug level");

        logger.info("info level");
        logger.info("info level");
        logger.info("info level");

        logger.warn("warn error");
        logger.warn("warn error");
        logger.warn("warn error");

        logger.error("error level");
        logger.error("error level");
        logger.error("error level");
    }

    @Test
    public void testInsertAdmin() {
        Admin admin = new Admin(null, "tom", "123123", "汤姆", "tom@qq.com", null);
        System.out.println(adminMapper.insert(admin));
    }

    /**
     * 测试数据库连接
     *
     * @throws SQLException
     */
    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

}
