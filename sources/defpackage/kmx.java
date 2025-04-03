package defpackage;

import android.app.Notification;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmx {
    static Notification.MessagingStyle.Message a(CharSequence charSequence, long j, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
        Notification.MessagingStyle.Message data;
        data = message.setData(str, uri);
        return data;
    }
}
