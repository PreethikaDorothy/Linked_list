package TokenBuckeFilter;

public class Packet {
private int requiredToken;
private static int packetId=0;
public Packet(int requiredToken)
{
	this.setPacketId(packetId++);
	this.setRequiredToken(requiredToken);
	}
public int getPacketId() {
	return packetId;
}

public void setPacketId(int packetid) {
	this.packetId = packetid;
}

public int getRequiredToken() {
	return requiredToken;
}

public void setRequiredToken(int requiredToken) {
	this.requiredToken = requiredToken;
}

}
