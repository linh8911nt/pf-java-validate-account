public class ValidateAccountTest {
    private static ValidateAccount accountExample;
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123_abc" };
    public static final String[] invalidAccount = new String[] { "@", "12345", "Abc123_" };

    public static void main(String args[]) {
        accountExample = new ValidateAccount();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validateAccount(account);
            System.out.println("Account " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validateAccount(account);
            System.out.println("Email " + account +" is valid: "+ isvalid);
        }
    }
}
