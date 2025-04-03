package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvdm {
    public static final String a(evsn evsnVar) {
        evsnVar.getClass();
        int ordinal = evsnVar.ordinal();
        if (ordinal == 1) {
            if (kqq.b()) {
                return "android.permission.POST_NOTIFICATIONS";
            }
            throw new IllegalArgumentException("ANDROID_POST_NOTIFICATIONS should not be used on Android versions before T");
        }
        if (ordinal == 2) {
            return "android.permission.CAMERA";
        }
        if (ordinal == 3) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        Objects.toString(evsnVar);
        throw new IllegalArgumentException("Invalid AndroidPermissionType ".concat(evsnVar.toString()));
    }
}
