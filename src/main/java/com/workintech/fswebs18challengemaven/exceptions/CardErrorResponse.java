package com.workintech.fswebs18challengemaven.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardErrorResponse{
    private Integer status;
    private String message;
    private Long timestamp;

    public CardErrorResponse(String message) {
        this.message = message;
    }
}
