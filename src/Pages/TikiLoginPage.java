package Pages;

public class TikiLoginPage {
    //public static String DangNhap1 = "//div[@id=\"header-user\"]//b[contains(.,'Đăng nhập')]";
    public static String DangNhap1 = "//div[@id=\"__next\"]//span[contains(.,'Đăng nhập')]";
    //public static String DangNhap2 = "//li[@id='login_link']";
    public static String DangNhap2 = "//button[text()='Đăng nhập']";
    //public static String txtEmail = "//input[@id='popup-login-email']";
    public static String txtEmail = "//*[@id=\"email\"]";
    //public static String txtPass = "//input[@id='login_password']";
    public static String txtPass = "//input[@id='password']";
    //public static String btnLogin = "//button[@id=\"login_popup_submit\"]";
    public static String btnLogin = "/html/body/div[4]/div/div/div/div[2]/div[2]/form/div[3]/button[1]";
}
