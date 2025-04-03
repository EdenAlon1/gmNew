package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knf {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        Notification.Action.Builder authenticationRequired;
        authenticationRequired = builder.setAuthenticationRequired(z);
        return authenticationRequired;
    }
}
