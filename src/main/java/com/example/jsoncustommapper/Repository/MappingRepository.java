package com.example.jsoncustommapper.Repository;

import com.example.jsoncustommapper.entity.Usermappings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MappingRepository extends MongoRepository<Usermappings,String> {
}
