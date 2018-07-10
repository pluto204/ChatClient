package com.hari.firstapponmac.models.MessageComponents;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Answer {
    @SerializedName("type")
    String type;
    @SerializedName("answer-id")
    String answerId;
    @SerializedName("text")
    String text;
    @SerializedName("attachments")
    List<Attachment> attachments;
}
