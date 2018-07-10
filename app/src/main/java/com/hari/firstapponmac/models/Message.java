package com.hari.firstapponmac.models;

import com.google.gson.annotations.SerializedName;
import com.hari.firstapponmac.models.MessageComponents.Answer;

import java.util.List;

public class Message {

    @SerializedName("dialog-id")
    String dialogId;
    @SerializedName("account")
    String account;
    @SerializedName("mid")
    String mid;
    @SerializedName("message-type")
    String messageType;
    @SerializedName("timestamp")
    String timeStamp;
    @SerializedName("state-id")
    String stateId;
    @SerializedName("app_dialog_id")
    String appDialogId;
    @SerializedName("action")
    String action;
    @SerializedName("answers")
    List<Answer> answers;

}
