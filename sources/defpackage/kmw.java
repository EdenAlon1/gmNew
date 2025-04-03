package defpackage;

import android.app.Notification;
import android.app.Person;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmw {
    static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
        Notification.MessagingStyle groupConversation;
        groupConversation = messagingStyle.setGroupConversation(z);
        return groupConversation;
    }
}
