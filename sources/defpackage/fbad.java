package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbad {
    public static Object a(Context context) {
        ComponentCallbacks2 a = fazn.a(context.getApplicationContext());
        boolean z = a instanceof fbas;
        Object[] objArr = {a.getClass()};
        if (z) {
            return ((fbas) a).aX();
        }
        throw new IllegalArgumentException(String.format("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", objArr));
    }
}
