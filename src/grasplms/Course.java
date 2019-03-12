/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grasplms;

import java.util.List;

/**
 *
 * @author Tunde Pablo
 */
class Course {
   String name;
   int maxSize;
   Client owner;
   List<Subject> sujects;
   List<Instructor> instructors;
}
