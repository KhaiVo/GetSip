package com.example.dell.getsip.Models;

import android.location.Location;
import android.media.Image;

import java.util.ArrayList;

/**
 * Created by DELL on 2/21/2017.
 */

public class Customer {
    public int userID;
    public String userName;
    public String email;
    public Location currentLocation;
    public ArrayList<Integer> favShopList;
    public ArrayList<Integer> nearbyShops;
    public Image useImage;
    public SubscriptionDetails subscription;
    public ArrayList<Transaction> transactionHistory;
}
