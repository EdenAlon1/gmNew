package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmv {
    static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        Notification.MessagingStyle addHistoricMessage;
        addHistoricMessage = messagingStyle.addHistoricMessage(message);
        return addHistoricMessage;
    }
}
