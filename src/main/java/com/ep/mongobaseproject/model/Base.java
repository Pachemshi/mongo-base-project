package com.ep.mongobaseproject.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Data
@RequiredArgsConstructor
@Document("base")
public class Base {

    /** MongoDB id value:
     * should be a String or BigInteger;
     */

    @Id
    private String id;

    @NonNull
    private String data;

    @Override
    public String toString() {
        return "Base{" +
                "id='" + id + '\'' +
                ", message='" + data + '\'' +
                '}';
    }
}
