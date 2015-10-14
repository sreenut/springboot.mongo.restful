package com.retail.configuration;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.MongoDbFactory;

import com.mongodb.DB;
import com.retail.book.Book;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

    @Autowired
    public Mongodb mongodb;
    
    @Autowired
    private MongoDbFactory mongo;
    
    @Autowired
    public BookRepository bookRepository;
    
    public static void main(String[] args) throws Exception {

    	SpringApplication.run(Application.class, args);
    }

	public void run(String... arg0) throws Exception {
		logger.info("************ run method ************");
        DB db = mongo.getDb();
        logger.info("mogodb name is {} collections is {}", db.getName(), db.getCollectionNames());
		
        ObjectMapper mapper = new ObjectMapper();
        
		if(null == mongo) logger.info("Mongo is NULL");
    	if(bookRepository != null){
			bookRepository.findAll();
			Book book1=new Book("NBC123", "Spring Framework", "ISBN", "Srini Thota", 500);
			bookRepository.save(book1);
			System.out.println("Book 1 -->" + mapper.writeValueAsString(book1));
			Book book2=new Book("NBC124", "Angular JS", "ISBN", "Gang of Fours", 50);
			bookRepository.save(book2);
			System.out.println("Book2 -->" + mapper.writeValueAsString(book2));
			Book book3=new Book("NBC125", "Mongo DB", "ISBN", "Kenningan Riche", 200);
			bookRepository.save(book3);
			System.out.println("Book 3 -->" + mapper.writeValueAsString(book3));
			Book book4 = new Book("NBC111", "Special", "ISBN", "Sreenut", 250);
			Book book5 = mapper.readValue(mapper.writeValueAsString(book4), Book.class);
    	}else
		{
			logger.info("bookRepository is NULL");
		}
	}
}
