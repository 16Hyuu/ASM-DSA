
package Message;
public class Message {
    private String Message;
    private String Country;

    public Message() {
        this.Message="";
    }
    public Message(String Message) {
        this.Message = Message;
    }

    public Message(String Message, String Country) {
        this.Message = Message;
        this.Country = Country;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }
}
