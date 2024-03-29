package com.project.shoppingmall.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wishlist_id")
    private Long wishlistId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member memberId;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item itemId;
}