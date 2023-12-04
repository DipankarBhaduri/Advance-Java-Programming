package com.HRNavigator.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "curd-handler-properties")
public class CurdHandlerProperties extends RootEntity {
    private String type;
    private String curdValue;
}