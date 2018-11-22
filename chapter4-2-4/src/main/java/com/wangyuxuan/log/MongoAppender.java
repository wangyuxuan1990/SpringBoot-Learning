package com.wangyuxuan.log;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/11/22 14:45
 * @Description:
 */
@Getter
@Setter
public class MongoAppender extends AppenderSkeleton {

    // mongodb的连接客户端
    private MongoClient mongoClient;
    // 记录日志的数据库
    private MongoDatabase mongoDatabase;
    // 记录日志的集合
    private MongoCollection<BasicDBObject> logsCollection;

    // 连接mongodb的串
    private String connectionUrl;
    // 数据库名
    private String databaseName;
    // 集合名
    private String collectionName;

    @Override
    protected void append(LoggingEvent event) {
        if(mongoDatabase == null) {
            MongoClientURI connectionString = new MongoClientURI(connectionUrl);
            mongoClient = new MongoClient(connectionString);
            mongoDatabase = mongoClient.getDatabase(databaseName);
            logsCollection = mongoDatabase.getCollection(collectionName, BasicDBObject.class);
        }
        logsCollection.insertOne((BasicDBObject) event.getMessage());
    }

    @Override
    public void close() {
        if(mongoClient != null) {
            mongoClient.close();
        }
    }

    @Override
    public boolean requiresLayout() {
        return false;
    }
}
