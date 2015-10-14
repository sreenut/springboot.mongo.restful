package com.retail.configuration;

import com.mongodb.DB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

@Component
public class Mongodb {

    private static Logger logger = LoggerFactory.getLogger(Mongodb.class);

    @Autowired
    private MongoDbFactory mongo;

    //connection
    public void connection() {
        DB db = mongo.getDb();
        logger.info("mogodb name is {} collections is {}", db.getName(), db.getCollectionNames());
    }

    //find
    public void findall() {

    }

    public void findone() {

    }

    //insert
    public void insert() {

    }

    public void batchInsert() {

    }


    //delete
    public void delete() {

    }

    //update
    public void update() {

    }

    public void updateOrModify() {

    }
}
