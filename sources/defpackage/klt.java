package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class klt {
    static Bundle a(Notification.Action action) {
        return action.getExtras();
    }

    static RemoteInput[] b(Notification.Action action) {
        return action.getRemoteInputs();
    }
}
