package com.ohm.test.answer;

import java.time.LocalDateTime;
import com.ohm.test.user.SiteUser;
import org.springframework.data.annotation.CreatedDate;

import com.ohm.test.question.Question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import jakarta.persistence.ManyToMany;


@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    @CreatedDate
    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
    
    @ManyToOne
    private SiteUser author;
    
    private LocalDateTime modifyDate;
    

    @ManyToMany
    Set<SiteUser> voter;
}