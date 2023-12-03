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
@Document(collection = "modification-log")
public class ModificationLog extends RootEntity{
    private Object originalObject;
    private Object modifiedObject;
}
