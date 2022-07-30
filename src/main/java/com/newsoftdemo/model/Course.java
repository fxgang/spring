package com.newsoftdemo.model;

/**
 * @description（类描述）: TODO
 * @projectName（项目名称）: newsoft
 * @package（包）: com.newsoftdemo.model
 * @className（类名称）: Course
 * @author（创建人）: 冯孝刚
 * @createDate（创建时间）: 2022-07-30 22:34
 * @version（版本）: v1.0
 */
public class Course {
    private String name;
    private float score;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public float getScore() {
        return score;
    }
}
