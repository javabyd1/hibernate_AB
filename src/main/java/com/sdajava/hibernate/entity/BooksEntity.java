package com.sdajava.hibernate.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "book", schema = "ksiegarnia")
public class BooksEntity {

    @Column
    private String title;
    @Column
    private String author;
    @Column
    private Date publidhed;
    @Column
    private String isbn;
    @Column
    private String category;
    @Column
    private Integer pageCount;
    @Column
    private String publisher;
    @Column
    private BigDecimal price;
    @Column
    private Integer onStock;
    @Id
    @Column
    private int id;


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

    public Date getPublidhed() {
        return publidhed;
    }

    public void setPublidhed(Date publidhed) {
        this.publidhed = publidhed;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getOnStock() {
        return onStock;
    }

    public void setOnStock(Integer onStock) {
        this.onStock = onStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
