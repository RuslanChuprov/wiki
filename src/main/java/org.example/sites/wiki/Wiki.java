package org.example.sites.wiki;


import org.example.sites.wiki.pages.BeginnerPage;
import org.example.sites.wiki.pages.LoginPage;
import org.example.sites.wiki.pages.ProfilePage;

public class Wiki {         // Base Page класс для класов Page
    public LoginPage loginPage = new LoginPage();
    public ProfilePage profilePage = new ProfilePage();
    public BeginnerPage beginnerPage = new BeginnerPage();
    public Wiki(){

    }
}
