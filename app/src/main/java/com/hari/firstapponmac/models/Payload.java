package com.hari.firstapponmac.models;

import com.google.gson.annotations.SerializedName;

public class Payload {
    @SerializedName("state-id")
    String stateId;
    @SerializedName("content")
    String content;
}
