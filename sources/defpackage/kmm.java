package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kmm {
    static Notification.Builder a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    static Notification.Builder b(Notification.Builder builder, String str) {
        return builder.setCategory("call");
    }
}
