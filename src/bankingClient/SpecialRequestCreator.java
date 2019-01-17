package bankingClient;
public class SpecialRequestCreator implements RequestCreator{
    String complaint;

    public boolean create(){return true;}

    /**
     * @return the complaint
     */
    public String getComplaint() {
        return complaint;
    }

    /**
     * @param complaint the complaint to set
     */
    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

	@Override
	public boolean isVerified() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setVerified(boolean isVerified) {
		// TODO Auto-generated method stub
		
	}
}