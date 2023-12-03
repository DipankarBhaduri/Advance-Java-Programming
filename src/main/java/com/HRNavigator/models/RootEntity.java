package com.HRNavigator.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RootEntity {

    @Id
    private String _id;
    private String className;
    private String doneByName;
    private String srNumber;
}
