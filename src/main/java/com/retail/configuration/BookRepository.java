package com.retail.configuration;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.retail.book.Book;

public interface BookRepository extends MongoRepository<Book, String>{
}