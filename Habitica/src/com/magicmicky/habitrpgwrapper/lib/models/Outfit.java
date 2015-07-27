package com.magicmicky.habitrpgwrapper.lib.models;

import com.habitrpg.android.habitica.HabitDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by viirus on 20/07/15.
 */
@Table(databaseName = HabitDatabase.NAME)
public class Outfit extends BaseModel {


    @Column
    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    String armor, back, body, eyeWear, head, headAccessory, shield, weapon;


    public String getArmor() {return armor;}
    public void setArmor(String armor) {this.armor = armor;}

    public String getBack() {return back;}
    public void setBack(String back) {this.back = back;}

    public String getBody() {return body;}
    public void setBody(String body) {this.body = body;}

    public String getEyeWear() {return eyeWear;}
    public void setEyeWear(String eyeWear) {this.eyeWear = eyeWear;}

    public String getHead() {return head;}
    public void setHead(String head) {this.head = head;}

    public String getHeadAccessory() {return headAccessory;}
    public void setHeadAccessory(String headAccessory) {this.headAccessory = headAccessory;}

    public String getShield() {return shield;}
    public void setShield(String shield) {this.shield = shield;}

    public String getWeapon() {return weapon;}
    public void setWeapon(String weapon) {this.weapon = weapon;}

}