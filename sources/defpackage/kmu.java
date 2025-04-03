package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmu {
    static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        Notification.MessagingStyle addMessage;
        addMessage = messagingStyle.addMessage(message);
        return addMessage;
    }

    static Notification.MessagingStyle b(CharSequence charSequence) {
        return new Notification.MessagingStyle(charSequence);
    }

    static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        Notification.MessagingStyle conversationTitle;
        conversationTitle = messagingStyle.setConversationTitle(charSequence);
        return conversationTitle;
    }
}
