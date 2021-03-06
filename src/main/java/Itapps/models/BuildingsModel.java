package Itapps.models;

  import javax.persistence.Column;
  import javax.persistence.Entity;
  import javax.persistence.Id;
  import javax.persistence.Table;
  import javax.persistence.GeneratedValue;
  import javax.persistence.GenerationType;


@Entity
@Table(name = "Buildings")
public class BuildingsModel {

    @Id
    @GeneratedValue
    private int Id;

    @Column(name = "X")
    private float X;

    @Column(name = "Y")
    private float Y;

    @Column(name = "Name")
    private String Name;

public int getBuildingId(){return Id;}
public void setBuildingId(int id){this.Id = Id;}

    public float getBuildingsX(){return X;}
    public void setBuildingsX(float X){this.X = X;}

    public float getBuildingsY(){return Y;}
    public void setBuildingsY(float Y){this.Y = Y;}

    public String getBuildingsName(){return Name;}
    public void setBuildingName(String Name){this.Name = Name;}

}
