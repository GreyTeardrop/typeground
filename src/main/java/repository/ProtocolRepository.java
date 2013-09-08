package repository;

import domain.Protocol;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;
import java.util.UUID;

public class ProtocolRepository {

    ////////////////////////////////////////////////
    // CONSTANTS

    public static final String COLLECTION_NAME = "protocol";

    ////////////////////////////////////////////////
    // ATTRIBUTES

    private MongoTemplate mongoTemplate;

    ////////////////////////////////////////////////
    // METHODS

    public void addProtocol(Protocol protocol) {
        if (!mongoTemplate.collectionExists(Protocol.class)) {
            mongoTemplate.createCollection(Protocol.class);
        }
        protocol.setId(UUID.randomUUID().toString());
        mongoTemplate.insert(protocol, COLLECTION_NAME);
    }

    public List<Protocol> listProtocol() {
        return mongoTemplate.findAll(Protocol.class, COLLECTION_NAME);
    }

    public void deleteProtocol(Protocol protocol) {
        mongoTemplate.remove(protocol);
    }

    public void upateProtocol(Protocol protocol) {
        mongoTemplate.insert(protocol, COLLECTION_NAME);
    }

    ////////////////////////////////////////////////
    // GETTERS AND SETTERS

    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}
