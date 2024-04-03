package com.example.accessing_data_with_mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author victorljli
 * @date 2023/08/23
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}
