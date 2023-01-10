package com.gm2.pdv.entity;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {

    private Long id;
    private String name;
    private boolean isEnable;

    public Long getId() {
        return id;
    }


}
