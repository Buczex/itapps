package Itapps.models;

import javax.persistence.*;

@Entity
@Table(name = "Message")
public class MessageModel {

    @Id
    @Column(name = "MessegeID")
    @GeneratedValue
    private int Id;

    @ManyToOne
    @JoinColumn(name = "SenderID", referencedColumnName = "UserID")
    private UserModel Sender;

    @ManyToOne
    @JoinColumn(name = "ReceiverID", referencedColumnName = "UserID")
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