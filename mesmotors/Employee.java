package mesmotors;

/**
 * Employee sinifi calisan sinifidir.Kullaniciadi ve sifre özellikleri vardir.
 */
public class Employee {

    private String userName = "ismail";
    private String password = "1234";

    /**
     * Kullanici girisi methodudur.
     * 
     * @param txtUserName kullanici adi ve
     * @param txtPassword sifre parametre alir
     *                    equals() methodu ile alinan degerlerin dogru olup
     *                    olmadigini kontrol eder.
     * @return boolean tipinde dogru ya da yanlis deger dondurur.
     */
    public boolean login(String txtUserName, String txtPassword) {

        if (userName.equals(txtUserName) && password.equals(txtPassword)) {
            return true;
        } else if (!userName.equals(txtUserName) && password.equals(txtPassword)) {
            return false;
        } else if (userName.equals(txtUserName) && !password.equals(txtPassword)) {
            return false;
        } else {
            return false;
        }
    }

    /**
     * @return String kullanici adi döndürülür.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName kullanici adi gönderilen string ifade ile degistirirlir.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return String sifre döndürülür.
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password sifre gönderilen string ifade ile degistirirlir.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
