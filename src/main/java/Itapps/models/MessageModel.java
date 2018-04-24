package Itapps.models;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.Table;
        import javax.persistence.OneToMany;
        import javax.persistence.ManyToOne;
@Entity
@Table(name = "Message")
public class MessageModel {

    @Id
    private int Id;

    @OneToMany(mappedBy = "Sender")
    private UserModel Sender;

    @OneToMany(mappedBy = "Receiver")
    private UserModel Receiver;

    @Column(name = "Message")
    private String Message;

    @Column(name = "Date")
    private long Date;

     public int getMessageId(){return Id;}
     public void setMessageId(int id){this.Id = Id;}

     public UserModel getMessageSender(){return Sender;}
     public void setMessageSender(UserModel Sender){this.Sender = Sender;}

     public UserModel getMessageReceiver(){return Receiver;}
     public void setMessageReceiver(UserModel Receiver){this.Receiver = Receiver;}

     public long getMessageDate(){return Date;}
     public void setMessageDate(long Date){this.Date = Date;}
}
