package Itapps.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "User")
public class UserModel {

    @Id
    private int Id;
    @Column(name = "Password")
    private String Password;
    @Column(name = "Name")
    private String Name;

    public int getUserId(){return Id;}
    public void setUserId(int id){this.Id = Id;}

    public String getUserPassword(){return Password;}
    public void setUserPassword(String Password){this.Password = Password;}

    public String getUserName(){return Name;}
    public void setUserName(String Name){this.Name = Name;}

}
