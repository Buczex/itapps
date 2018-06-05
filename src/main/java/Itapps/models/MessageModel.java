package Itapps.models;

import javax.persistence.*;

@Entity
@Table(name = "Message")
public class MessageModel {

    @Id
    @Column(name = "MessageID")
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long Id;

    @ManyToOne
    @JoinColumn(name = "Sender", referencedColumnName = "UserID")
    private int Sender;

    @ManyToOne
    @JoinColumn(name = "Receiver", referencedColumnName = "UserID")
    private int Receiver;

    @Column(name = "Message")
    private String Message;

    @Column(name = "Date")
    private long Date;

    public long getMessageId(){return Id;}
    public void setMessageId(long id){this.Id = Id;}

    public int getMessageSender(){return Sender;}
    public void setMessageSender(int Sender){this.Sender = Sender;}

    public int getMessageReceiver(){return Receiver;}
    public void setMessageReceiver(int Receiver){this.Receiver = Receiver;}

    public long getMessageDate(){return Date;}
    public void setMessageDate(long Date){this.Date = Date;}

    public void setMessage(String message){Message = message;}
    public String getMessage(){return Message;}
}