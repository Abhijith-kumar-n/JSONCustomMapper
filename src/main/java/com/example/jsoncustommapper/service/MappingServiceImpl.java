package com.example.jsoncustommapper.service;

import com.example.jsoncustommapper.Repository.MappingRepository;
import com.example.jsoncustommapper.entity.Usermappings;
import com.sun.istack.internal.FinalArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MappingServiceImpl implements MappingService {

    public final Logger logger= LoggerFactory.getLogger(MappingServiceImpl.class);
    @Autowired
    private MappingRepository mappingRepository;
    @Override
    public void savemapping(Usermappings usermappings) {
        logger.debug(">> Sending Data to MONGODB collection: 'mappings'");
        mappingRepository.save(usermappings);
        logger.debug("|| Saved to DB : JSONMapper Collection: mappings");
    }

    @Override
    public String deletemapping(String user) {
        logger.debug(">> Searching for user on MONGODB collection: 'mappings'");
        Usermappings usermap=new Usermappings();
        if(mappingRepository.findById(user)!=null){
            logger.debug("|| Found User");
            logger.debug(">> Deleting User : "+user);
            mappingRepository.deleteById(user);
            return "Success";
        }
        else {
            logger.debug("|| NO User Found");
            return "fail";
        }

    }


    @Override
    public Optional<Usermappings> findbyId(String user) {
        logger.debug(">> Searching for user on MongoDB collection : 'mappings'");
        Optional<Usermappings> usermap= mappingRepository.findById(user);
        if (usermap!=null){

            logger.debug("<< Found User and Receving mapping document from User");
        }
        else{
            logger.debug("|| No user Found");
        }
        return usermap;
    }
}
