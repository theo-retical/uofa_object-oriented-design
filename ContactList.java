package com.example.sharingapp;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * ItemList class
 */

public class ContactList {
  
  private static ArrayList<Contact> contacts;
  private String FILENAME = "contacts.json";

  public ContactList() {
    contacts = new ArrayList<Contact>();
  }

  public void setContacts(ArrayList<Contact> contact_list) {
    contacts = contact_list;
  }

  public ArrayList<Contact> getContacts() {
    return contacts;
  }

  public void addContact(Contact contact) {
    contacts.add(contact);
  }

  public void removeContact(Contact contact) {
    contacts.remove(contact);
  }

  public Contact getContact(int index) {
    return contacts.get(index);
  }

  public ArrayList<String> getContactNames() {
    ArrayList<String> names = new ArrayList<String>();
    for (Contact contact : contacts) {
      names.add(contact.getUsername());
    }
    return names;
  }

  public int getSize() {
    return contacts.size();
  }

  public int getIndex(Contact contact) {
    int pos = 0;
    for (Contact c : contacts) {
      if(c.getUserID().equals(contact.getUserID())) {
        return pos;
      }
      pos++;
    }
    return -1;
  }

  public boolean hasContact(Contact contact) {
    return contacts.contains(contact);
  }

  public Contact getContactByUsername(String username) {

    for (Contact contact : contacts) {
      if(contact.getUsername().equals(username)) {
        return contact;
      }
    }
    return null;
  }

  public boolean isUsernameAvailable(String username) {

    for (Contact contact : contacts) {
      if(contact.getUsername().equals(username)) {
        return false;
      }
    }
    return true;
  }

  public void loadContact(Context context) {
    try {
      FileInputStream fis = context.openFileInput(FILENAME);
      InputStreamReader isr = new InputStreamReader(fis);
      Gson gson = new Gson();
      Type listType = new TypeToken<ArrayList<Contact>>(){}.getType();
      contacts = gson.fromJson(isr, listType); // temp
      fis.close();
    } catch (FileNotFoundException e) {
      contacts = new ArrayList<Contact>();
    } catch (IOException e) {
      contacts = new ArrayList<Contact>();
    }
  }

  public void saveContact(Context context) {
    try {
      FileOutputStream fos = context.openFileOutput(FILENAME, Context.MODE_PRIVATE);
      OutputStreamWriter osw = new OutputStreamWriter(fos);
      Gson gson = new Gson();
      gson.toJson(contacts, osw);
      fos.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
