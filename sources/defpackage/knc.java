package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class knc {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Action c(Notification.Action.Builder builder) {
        return builder.build();
    }
}
