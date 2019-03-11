/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasplms;

/**
 *
 * @author USER
 */
public class Session {
  int startDate;
  int endDate;
  Instructor instructor;
  Course course;
  Client client; 
  
  public Session(int startDate,int endDate, Instructor instructor, Course course, Client client){
    this.startDate = startDate;
    this.endDate = endDate;
    this.instructor = instructor;
    this.client = client;
    this.course = course;
  }
  public void equal(Session another){
      this.startDate = another.startDate;
      this.endDate = another.endDate;
      this.client = another.client;
      this.instructor = another.instructor;
      this.course = another.course;
  }
}
