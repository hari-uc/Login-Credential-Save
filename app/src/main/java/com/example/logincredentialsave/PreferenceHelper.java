//package com.agrotech.karyfresh.Database;
package com.example.logincredentialsave;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {

    final String INTRO = "INTRO";
    final String USERNAME = "username";
    final String EMAIL = "email";
    final String MOBILE = "mobile";
    final String ID = "id";

    final String PASSRESET = "passreset";


    final String ID_noshop = "id_noshop";

    final String PINCODE = "pincode";
    final String ADDRESS = "address";
    final String ADDRESS_SEL = "address_sel";
    final String ADDRESS_selID = "address_selid";

    final String SHOPCODE = "shop_code";

    final String CATID = "catid";

    final String SlotCode = "slotCode";
    final String SlotTime = "slotTime";
    final String SlotDate = "slotDate";
    final String DeliveryCharge = "deliveryCharge";
    final String DeliveryAddress = "deliveryAddress";
    final String GrandTotal = "grandTotal";
    final String CheckOutBtn = "checkOutBtn";
    final String AddID = "AddID";
    final String easteroffer = "easteroffer";
    final String Offercode = "offercode";

    final String Offercode_id = "offercode_id";
    final String OrderTotal = "orderTotal";

    final String Walletvalue = "walletvalue";
    final String Walletvalue_id = "walletvalue_id";

    final String discountvalue = "discountvalue";


    final String OrderTotal_delivery = "orderTotaldelivery";
    final String slot_id = "slotid";














    SharedPreferences sharedPreferences;
    Context context;

    public PreferenceHelper(Context context){
        sharedPreferences = context.getSharedPreferences("Shared",
                Context.MODE_PRIVATE);
        this.context = context;
    }


    public void putcat_code(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(CATID, loginorout);
        editor.commit();
    }

    public String getcat_code(){
        return sharedPreferences.getString(CATID, "");
    }




    public void putpincode(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PINCODE, loginorout);
        editor.commit();
    }

    public String getpincode(){
        return sharedPreferences.getString(PINCODE, "");
    }



    public void putshop_code(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SHOPCODE, loginorout);
        editor.commit();
    }

    public String getshop_code(){
        return sharedPreferences.getString(SHOPCODE, "");
    }


    public void puteasteroffer(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(easteroffer, loginorout);
        editor.commit();
    }

    public String geteasteroffer(){
        return sharedPreferences.getString(easteroffer, "");
    }



    public void putAddress(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(ADDRESS, loginorout);
        editor.commit();
    }

    public String getAddress(){
        return sharedPreferences.getString(ADDRESS, "");
    }


    public void putselAddress(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(ADDRESS_SEL, loginorout);
        editor.commit();
    }

    public String getselAddress(){
        return sharedPreferences.getString(ADDRESS_SEL, "");
    }


    public void putAddress_selid(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(ADDRESS_selID, loginorout);
        editor.commit();
    }

    public String getAddress_selid(){
        return sharedPreferences.getString(ADDRESS_selID, "");
    }








    public void putIsLogin(boolean loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(INTRO, loginorout);
        editor.commit();
    }





    public boolean getIsLogin(){
        return sharedPreferences.getBoolean(INTRO, false);
    }




    public void putUsername(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(USERNAME, loginorout);
        editor.commit();
    }







    public void putpassreset(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(PASSRESET, loginorout);
        editor.commit();
    }

    public String getpassrest(){
        return sharedPreferences.getString(PASSRESET, "");
    }


    public void putId(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(ID, loginorout);
        editor.commit();
    }

    public String getId(){
        return sharedPreferences.getString(ID, "");
    }



    public String getUsername(){
        return sharedPreferences.getString(USERNAME, "");
    }

    public void putEmail(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(EMAIL, loginorout);
        editor.commit();
    }

    public String getEmail(){
        return sharedPreferences.getString(EMAIL, "");
    }

    public void putMobile(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(MOBILE, loginorout);
        editor.commit();
    }

    public String getMobile(){
        return sharedPreferences.getString(MOBILE, "");
    }





    public void putSlotId(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(slot_id, loginorout);
        editor.commit();
    }

    public String getSlotId(){
        return sharedPreferences.getString(slot_id, "");
    }







    public void putSlotCode(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SlotCode, loginorout);
        editor.commit();
    }

    public String getSlotCode(){
        return sharedPreferences.getString(SlotCode, "");
    }


    public void putSlotTime(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SlotTime, loginorout);
        editor.commit();
    }

    public String getSlotTime(){
        return sharedPreferences.getString(SlotTime, "");
    }

    public void putoffercode(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Offercode, loginorout);
        editor.commit();
    }

    public String getoffercode(){
        return sharedPreferences.getString(Offercode, "");
    }

    public void putoffercode_id(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Offercode_id, loginorout);
        editor.commit();
    }

    public String getoffercode_id(){
        return sharedPreferences.getString(Offercode_id, "");
    }

    public void putSlotDate(String slotDate){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SlotDate, slotDate);
        editor.commit();
    }

    public String getSlotDate(){
        return sharedPreferences.getString(SlotDate, "");
    }

    public void putDeliveryCharge(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(DeliveryCharge, loginorout);
        editor.commit();
    }

    public String getDeliveryCharge(){
        return sharedPreferences.getString(DeliveryCharge, "");
    }

    public void putDeliveryAddress(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(DeliveryAddress, loginorout);
        editor.commit();
    }

    public String getDeliveryAddress(){
        return sharedPreferences.getString(DeliveryAddress, "");
    }



    public void putdiscountvalue(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(discountvalue, loginorout);
        editor.commit();
    }

    public String getdiscountvalue(){
        return sharedPreferences.getString(discountvalue, "");
    }


    public void putwalletvalue(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Walletvalue, loginorout);
        editor.commit();
    }

    public String getwalletvalue(){
        return sharedPreferences.getString(Walletvalue, "");
    }


    public void putwalletvalue_id(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(Walletvalue_id, loginorout);
        editor.commit();
    }

    public String getwalletvalue_id(){
        return sharedPreferences.getString(Walletvalue_id, "");
    }


    public void putorderTotal_delivery(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(OrderTotal_delivery, loginorout);
        editor.commit();
    }

    public String getorderTotal_delivery(){
        return sharedPreferences.getString(OrderTotal_delivery, "");
    }


    public void putorderTotal(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(OrderTotal, loginorout);
        editor.commit();
    }

    public String getorderTotal(){
        return sharedPreferences.getString(OrderTotal, "");
    }

    public void putGrandTotal(String loginorout){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(GrandTotal, loginorout);
        editor.commit();
    }

    public String getGrandTotal(){
        return sharedPreferences.getString(GrandTotal, "");
    }

    public void putCheckOutBtn(String checkBtn){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(CheckOutBtn, checkBtn);
        editor.commit();
    }

    public String getCheckOutBtn(){
        return sharedPreferences.getString(CheckOutBtn, "");
    }

    public void putAddID(String addId){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(AddID, addId);
        editor.commit();
    }

    public String getAddID(){
        return sharedPreferences.getString(AddID, "");
    }

}
//
//import android.content.Context;
//import android.content.SharedPreferences;
//
//public class PreferenceHelper {
//
//    final String INTRO = "INTRO";
//    final String USERNAME = "username";
//    final String EMAIL = "email";
//    final String MOBILE = "mobile";
//    final String ID = "id";
//
//    final String ID_noshop = "id_noshop";
//
//    final String PINCODE = "pincode";
//    final String ADDRESS = "address";
//
//    final String CATID = "catid";
//
//    final String SlotTime = "slotTime";
//    final String DeliveryCharge = "deliveryCharge";
//    final String DeliveryAddress = "deliveryAddress";
//    final String GrandTotal = "grandTotal";
//    final String CheckOutBtn = "checkOutBtn";
//    final String AddID = "AddID";
//
//    SharedPreferences sharedPreferences;
//    Context context;
//
//    public PreferenceHelper(Context context){
//        sharedPreferences = context.getSharedPreferences("Shared",
//                Context.MODE_PRIVATE);
//        this.context = context;
//    }
//
//
//    public void putcat_code(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(CATID, loginorout);
//        editor.commit();
//    }
//
//    public String getcat_code(){
//        return sharedPreferences.getString(CATID, "");
//    }
//
//
//
//
//    public void putpincode(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(PINCODE, loginorout);
//        editor.commit();
//    }
//
//    public String getpincode(){
//        return sharedPreferences.getString(PINCODE, "");
//    }
//
//    public void putAddress(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(ADDRESS, loginorout);
//        editor.commit();
//    }
//
//    public String getAddress(){
//        return sharedPreferences.getString(ADDRESS, "");
//    }
//
//
//    public void putIsLogin(boolean loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putBoolean(INTRO, loginorout);
//        editor.commit();
//    }
//
//
//
//
//
//    public boolean getIsLogin(){
//        return sharedPreferences.getBoolean(INTRO, false);
//    }
//
//
//
//
//    public void putUsername(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(USERNAME, loginorout);
//        editor.commit();
//    }
//
//
//
//    public void putId(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(ID, loginorout);
//        editor.commit();
//    }
//
//    public String getId(){
//        return sharedPreferences.getString(ID, "");
//    }
//
//    public void putId_noshop(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(ID_noshop, loginorout);
//        editor.commit();
//    }
//
//    public String getId_noshop(){
//        return sharedPreferences.getString(ID_noshop, "");
//    }
//
//
//    public String getUsername(){
//        return sharedPreferences.getString(USERNAME, "");
//    }
//
//    public void putEmail(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(EMAIL, loginorout);
//        editor.commit();
//    }
//
//    public String getEmail(){
//        return sharedPreferences.getString(EMAIL, "");
//    }
//
//    public void putMobile(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(MOBILE, loginorout);
//        editor.commit();
//    }
//
//    public String getMobile(){
//        return sharedPreferences.getString(MOBILE, "");
//    }
//
//
//    public void putSlotTime(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(SlotTime, loginorout);
//        editor.commit();
//    }
//
//    public String getSlotTime(){
//        return sharedPreferences.getString(SlotTime, "");
//    }
//
//    public void putDeliveryCharge(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(DeliveryCharge, loginorout);
//        editor.commit();
//    }
//
//    public String getDeliveryCharge(){
//        return sharedPreferences.getString(DeliveryCharge, "");
//    }
//
//    public void putDeliveryAddress(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(DeliveryAddress, loginorout);
//        editor.commit();
//    }
//
//    public String getDeliveryAddress(){
//        return sharedPreferences.getString(DeliveryAddress, "");
//    }
//
//    public void putGrandTotal(String loginorout){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(GrandTotal, loginorout);
//        editor.commit();
//    }
//
//    public String getGrandTotal(){
//        return sharedPreferences.getString(GrandTotal, "");
//    }
//
//    public void putCheckOutBtn(String checkBtn){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(CheckOutBtn, checkBtn);
//        editor.commit();
//    }
//
//    public String getCheckOutBtn(){
//        return sharedPreferences.getString(CheckOutBtn, "");
//    }
//
//    public void putAddID(String addId){
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(AddID, addId);
//        editor.commit();
//    }
//
//    public String getAddID(){
//        return sharedPreferences.getString(AddID, "");
//    }
//
//}
