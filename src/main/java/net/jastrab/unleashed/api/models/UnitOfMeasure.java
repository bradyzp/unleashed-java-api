package net.jastrab.unleashed.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jastrab.unleashed.api.http.SimpleResource;

import java.util.Objects;
import java.util.UUID;

public final class UnitOfMeasure implements SimpleResource {
    private final UUID guid;
    private final String name;

    @JsonCreator
    private UnitOfMeasure(@JsonProperty("Guid") UUID guid,
                          @JsonProperty("Name") String name) {
        this.guid = guid;
        this.name = name;
    }

    public UUID getGuid() {
        return guid;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBasePath() {
        return "/UnitOfMeasures";
    }

    @Override
    public String toString() {
        return "UnitOfMeasure{" +
                "guid='" + guid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitOfMeasure that = (UnitOfMeasure) o;
        return guid.equals(that.guid) &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guid, name);
    }
}
