package Guis;

import javax.swing.*;
import java.awt.*;

public class LoginGuis extends PrincipalGui{
    public LoginGuis(){
        super("login");
    }

    @Override
    protected void addGuiComponents() {
        JLabel bankAppLabel = new JLabel("Login");
        bankAppLabel.setBounds(0,20,super.getWidth(), 40);
        bankAppLabel.setFont(new Font("dialog", Font.BOLD, 33));
        bankAppLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(bankAppLabel);

        JLabel userNameLabel = new JLabel("UserName");
        userNameLabel.setBounds(20,120, getWidth() - 30, 24);
        userNameLabel.setFont(new Font("dialog", Font.PLAIN,20));
        add(userNameLabel);

        JTextField usernameFIeld = new JTextField();
        usernameFIeld.setBounds(20,160, getWidth()- 50,40);
        usernameFIeld.setFont(new Font("dialog", Font.PLAIN, 28));
        add(usernameFIeld);

        //passwords
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(20,240, getWidth() - 30, 24);
        passwordLabel.setFont(new Font("dialog", Font.PLAIN,20));
        add(passwordLabel);

        JPasswordField passwordFIeld = new JPasswordField();
        passwordFIeld.setBounds(20,280, getWidth()- 50,40);
        passwordFIeld.setFont(new Font("dialog", Font.PLAIN, 28));
        add(passwordFIeld);

        JButton loginBtn = new JButton("loggin");
        loginBtn.setBounds(20,470, getWidth() - 50, 40);
        loginBtn.setFont(new Font("dialog", Font.BOLD,20));
        add(loginBtn);

        JLabel registerLabel = new JLabel("<html><a href= \"#\">Don't have an account? Regiter Here</a></html>");
        registerLabel.setBounds(0,520, getWidth() - 10, 30);
        registerLabel.setFont(new Font("dialog", Font.PLAIN,20));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(registerLabel);

    }
}
