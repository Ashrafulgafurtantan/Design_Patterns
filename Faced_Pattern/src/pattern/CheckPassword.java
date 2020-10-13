package pattern;

public class CheckPassword {
    private String password ="qwert";

    private String getPassword(){
        return  password;
    }

    public  boolean isPasswordAccurate(String p){
        return p.equals(getPassword());
    }
}
