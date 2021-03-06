package repository;

import domain.Protocol;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;
import java.util.UUID;

public class ProtocolRepository {

    ////////////////////////////////////////////////
    // ATTRIBUTES

    private MongoTemplate mongoTemplate;

    ////////////////////////////////////////////////
    // METHODS

    public String addProtocol(Protocol protocol) {
        if (!mongoTemplate.collectionExists(Protocol.class)) {
            mongoTemplate.createCollection(Protocol.class);
        }
        String id = UUID.randomUUID().toString();
        protocol.setId(id);
        protocol.getMetaProtocolInfo().setDateCreated(new DateTime());
        mongoTemplate.insert(protocol);
        return id;
    }

    public List<Protocol> getAll() {
        return mongoTemplate.findAll(Protocol.class);
    }

    public Protocol getById(String id) {
        return mongoTemplate.findById(id, Protocol.class);
    }

    public void deleteProtocol(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        mongoTemplate.remove(query, Protocol.class);
    }

    public void updateProtocol(Protocol protocol) {
        protocol.getMetaProtocolInfo().setDateModified(new DateTime());
        mongoTemplate.save(protocol);
    }

    ////////////////////////////////////////////////
    // GETTERS AND SETTERS

    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}
