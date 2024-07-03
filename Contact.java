package com.example.sharingapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.util.UUID;

/**
 * Contact class
 */


public class Contact {

  private String username;
  private String email;
  private String userID;

  public Contact(String username, String email, String userID) {
    this.username = username;
    this.email = email;
    this.userID = userID;

    if (userID == null) {
      setuserID();
    } else {
      updateUserID(userID);
    }
  }

  public String getUserID() {
    return this.userID;
  }

  public void setUserID() {
    this.userID = UUID.randomUUID().toString();
  }

  public void updateUserID(String userID) {
    this.userID = userID;
  }

  public void setUsername(String username) {
    this.username = username;
  }
  
  public String getUsername() {
    return username;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
}
