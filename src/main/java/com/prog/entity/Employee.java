package com.prog.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
@Component
public class Employee {
    int id;
    String name;
    Address address;
}
