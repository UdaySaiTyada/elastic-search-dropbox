package com.borneo.app.mapper;

import java.util.ArrayList;
import java.util.List;

public interface Mapper<Entity, Pojo> {
    Entity toEntity(Pojo pojo);

    Pojo toPojo(Entity entity);

    default List<Entity> toEntities(List<Pojo> pojos) {

        List<Entity> entities = new ArrayList<>();
        for (Pojo pojo : pojos) {
            entities.add(toEntity(pojo));
        }

        return entities;
    }

    default List<Pojo> toPojos(List<Entity> entities) {
        List<Pojo> pojos = new ArrayList<>();
        for (Entity entity : entities) {
            pojos.add(toPojo(entity));
        }
        return pojos;
    }

}
