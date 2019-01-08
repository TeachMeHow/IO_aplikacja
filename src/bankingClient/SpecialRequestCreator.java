public class SpecialRequestCreator implements RequestCreator{
    String complaint;

    boolean create(){return true;}

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
}