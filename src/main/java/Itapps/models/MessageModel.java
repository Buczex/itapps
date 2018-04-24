package Itapps.models;

import javax.persistence.*;

@Entity
@Table(name = "Message")
public class MessageModel {

    @Id
    @Column(name = "MessageID")
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int Id;

    @ManyToOne
    @JoinColumn(name = "Sender", referencedColumnName = "UserID")
    private UserModel Sender;

    @ManyToOne
    @JoinColumn(name = "Receiver", referencedColumnName = "UserID")
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

    public void setMessage(String message){Message = message;}
    public String getMessage(){return Message;}
}