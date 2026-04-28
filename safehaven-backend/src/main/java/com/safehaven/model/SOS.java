package com.safehaven.model;
@Entity
@Data
public class SOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String location;
    private String message;
    private LocalDateTime createdAt;
}
