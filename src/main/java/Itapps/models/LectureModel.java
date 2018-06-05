package Itapps.models;

import javax.persistence.*;

  import javax.persistence.Column;
  import javax.persistence.Entity;
  import javax.persistence.Id;
  import javax.persistence.Table;
  import javax.persistence.GeneratedValue;
  import javax.persistence.GenerationType;

@Entity
@Table(name = "Lecture")
public class LectureModel {

    @Id
    @GeneratedValue
    private int Id;

    @Column(name = "Name")
    private String Name;

    @Column(name="Building")
    private int Building;

    @Column(name="Room")
    private String Room;

    @Column(name="Start_time")
    private String Start_time;

    @Column(name="Week")
    private String Week;


    public int getLectureId(){return Id;}
    public void setLectureId(int id){this.Id = Id;}

    public String getLectureName(){return Name;}
    public void setLectureName(String Name){this.Name = Name;}

    public int getLectureBuilding(){return Building;}
    public void setLectureBuilding(int Building){this.Building = Building;}

    public String getLectureRoom(){return Room;}
    public void setLectureRoom(String Room){this.Room = Room;}

    public String getLectureStart_time(){return Start_time;}
    public void setLectureStart_time(String Start_time){this.Start_time = Start_time;}

    public String getLectureWeek(){return Week;}
    public void setLectureWeek(String Week){this.Week = Week;}


}
