package mnm_crm;

/**
 *
 * @author ngarc
 */
public interface Person {
    public String getLastName();
    public String getFirstName();
    public String getEmail();
    public String getPhoneNum();
    public void setLastName(String last);
    public void setFirstName(String first);
    public void setEmail(String em);
    public void setPhoneNum(String phone);

}
