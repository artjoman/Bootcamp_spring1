package lv.artjoms.demo.domain.responses;

public class StudentResponse {
    private String name;
    private int knowledgeLevel;
    private boolean likesCourse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKnowledgeLevel() {
        return knowledgeLevel;
    }

    public void setKnowledgeLevel(int knowledgeLevel) {
        this.knowledgeLevel = knowledgeLevel;
    }

    public boolean isLikesCourse() {
        return likesCourse;
    }

    public void setLikesCourse(boolean likesCourse) {
        this.likesCourse = likesCourse;
    }
}
