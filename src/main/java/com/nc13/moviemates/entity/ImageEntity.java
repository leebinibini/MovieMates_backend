package com.nc13.moviemates.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@ToString
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name= "images")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originalFileName;
    private String storedFileName;
    private String extension;
    private String uploadPath;
    private String uploadURL;

    private Long movieId;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "post_id")
//    private PostEntity post;
}
