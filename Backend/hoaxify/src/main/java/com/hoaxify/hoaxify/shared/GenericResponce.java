package com.hoaxify.hoaxify.shared;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GenericResponce {
    private String message;

    public GenericResponce(String message){
        this.message= message;
    }

}
