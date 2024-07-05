package com.ac.su.community.attachment;

@Entity
@Getter
@Setter
@ToString
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-incremnet
    @Column(name="attachment_id")
    private Long id;
    private String attachmentName;
    @CreationTimestamp
    private LocalDateTime createdAt; // 생성 날짜
    @ManyToOne
    @JoinColumn(name="post_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Post postId; // 게시글 고유 번호
}