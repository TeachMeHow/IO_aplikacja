package bankingClient;
public interface RequestCreator{
    boolean isVerified=false;

    boolean create();

    /**
     * @return the isVerified
     */
    public boolean isVerified();

    /**
     * @param isVerified the isVerified to set
     */
    public void setVerified(boolean isVerified);
}