package com.galvanize.tmo.paspringstarter;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class Books {
    @Ignore
    Integer id;
    String author;
    String title;
    Integer datePublished;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Integer datePublished) {
        this.datePublished = datePublished;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", datePublished=" + datePublished +
                '}';
    }
}
