package com.retail.configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.retail.configuration.Application;
import com.retail.configuration.Mongodb;

/**
 * Created by caojianfeng on 4/29/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class MongodbTest {

    @Autowired
    public Mongodb mongodb;

    @BeforeClass
    public static void beforeclass() {
    }

    @Test
    public void testConnection() throws Exception {
        mongodb.connection();
    }

    @Test
    public void testFindall() throws Exception {
        mongodb.findall();
    }

    @Test
    public void testFindone() throws Exception {
        mongodb.findone();

    }

    @Test
    public void testInsert() throws Exception {
        mongodb.insert();
    }

    @Test
    public void testBatchInsert() throws Exception {
        mongodb.batchInsert();
    }

    @Test
    public void testDelete() throws Exception {
        mongodb.delete();
    }

    @Test
    public void testUpdate() throws Exception {
        mongodb.update();
    }

    @Test
    public void testUpdateOrModify() throws Exception {
        mongodb.updateOrModify();
    }
}
