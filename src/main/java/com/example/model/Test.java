package com.example.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tests")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "test_name", nullable = false, length = 30)
    private String testName;

    @Column(name = "test_creator_username", nullable = false, length = 30)
    private String testCreatorUsername;

    @Column(name = "test_description", length = 240)
    private String testDescription;

    @OneToMany(mappedBy = "test")
    private Set<Question> questions = new LinkedHashSet<>();

    @OneToMany(mappedBy = "test")
    private Set<Attempt> attempts = new LinkedHashSet<>();

    public Set<Attempt> getAttempts() {
        return attempts;
    }

    public void setAttempts(Set<Attempt> attempts) {
        this.attempts = attempts;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestCreatorUsername() {
        return testCreatorUsername;
    }

    public void setTestCreatorUsername(String testCreatorUsername) {
        this.testCreatorUsername = testCreatorUsername;
    }

    public String getTestDescription() {
        return testDescription;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

}