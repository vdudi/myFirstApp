package models;

import play.data.validation.Constraints;

//import scala.collection.immutable.*;
import java.util.*;
import play.data.validation.Constraints.*;
import play.db.ebean.Model;

import javax.persistence.*;

/**
 * Created by vdudi on 7/23/15.
 */

@Entity
public class Task extends Model{
    @Id
    public Long id;

    @Required
    public String label;

    public static Finder<Long,Task> find = new Finder(Long.class, Task.class);

    public static List<Task> all(){
        return find.all();
    }

    public static void create(Task task){
        task.save();
    }

    public static void delete(Long id){
        find.ref(id).delete();
    }
}
