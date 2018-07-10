package com.hari.firstapponmac.models.MessageComponents;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Attachment {

    @SerializedName("title")
    String title;
    @SerializedName("subtitle")
    String subTitle;
    @SerializedName("buttons")
    List<Button> buttons;

}
