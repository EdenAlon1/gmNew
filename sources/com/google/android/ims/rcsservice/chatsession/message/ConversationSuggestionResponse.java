package com.google.android.ims.rcsservice.chatsession.message;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationSuggestionResponse {
    public String displayText;
    public String postBackData;
    public ConversationSuggestionResponseType type;

    /* compiled from: PG */
    public enum ConversationSuggestionResponseType {
        UNKNOWN,
        REPLY,
        ACTION
    }
}
