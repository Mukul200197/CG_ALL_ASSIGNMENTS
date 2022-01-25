import org.springframework.beans.factory.annotation.Required;

public class Demonstrate {

	private String msg;
	private int msgID;
	
	private ResourceEg recEg;
	public int getMsgID() {
		return msgID;
	}
	public void setMsgID(int msgID) {
		this.msgID = msgID;
	}
	public String getMsg() {
		return msg;
	}
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
