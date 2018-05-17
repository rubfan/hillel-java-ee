package ua.od.hillel.springlombokrestcalc.controller.dto;

import java.util.Objects;


public class GreetingDto {

  private long id;
  private String content;

  public GreetingDto(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public GreetingDto() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "GreetingDto{" +
        "id=" + id +
        ", content='" + content + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GreetingDto that = (GreetingDto) o;
    return id == that.id &&
        Objects.equals(content, that.content);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, content);
  }
}
