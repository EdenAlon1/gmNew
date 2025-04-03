package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvai extends BroadcastReceiver {
    public volatile boolean b;
    public volatile boolean c;
    public volatile boolean d;
    private static final enru e = enru.c("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor");
    public static final dvai a = new dvai();

    private dvai() {
    }

    public static boolean b() {
        if (!dvac.a || Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.os.storage.StorageManager");
            try {
                Method method = cls.getMethod("inCryptKeeperBounce", new Class[0]);
                if (method == null) {
                    ((enrr) ((enrr) e.j()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", 190, "UserUnlockMonitor.java")).q("Cannot find StorageManager.inCryptKeeperBounce()");
                    return false;
                }
                try {
                    Object invoke = method.invoke(cls, new Object[0]);
                    boolean z = invoke != null && ((Boolean) invoke).booleanValue();
                    if (z) {
                        ((enrr) ((enrr) e.h()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", 198, "UserUnlockMonitor.java")).q("Device in crypt keeper bounce state.");
                    }
                    return z;
                } catch (Exception e2) {
                    ((enrr) ((enrr) ((enrr) e.j()).g(e2)).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", (char) 202, "UserUnlockMonitor.java")).q("Failed to invoke StorageManager.inCryptKeeperBounce()");
                    return false;
                }
            } catch (NoSuchMethodException e3) {
                ((enrr) ((enrr) ((enrr) e.j()).g(e3)).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", (char) 185, "UserUnlockMonitor.java")).q("Cannot find StorageManager.inCryptKeeperBounce()");
                return false;
            }
        } catch (ClassNotFoundException e4) {
            ((enrr) ((enrr) ((enrr) e.j()).g(e4)).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "inCryptKeeperBounce", (char) 177, "UserUnlockMonitor.java")).q("Cannot find android.os.storage.StorageManager");
            return false;
        }
    }

    public final void a(Context context) {
        if (this.d) {
            context.unregisterReceiver(this);
            this.d = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        enru enruVar = e;
        ((enrr) ((enrr) enruVar.h()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "onReceive", 123, "UserUnlockMonitor.java")).t("onReceive(): %s", intent);
        if (this.b) {
            a(context);
            return;
        }
        if ("android.intent.action.USER_UNLOCKED".equals(intent.getAction())) {
            this.b = !b();
            if (!this.b) {
                ((enrr) ((enrr) enruVar.h()).h("com/google/android/libraries/inputmethod/userunlock/UserUnlockMonitor", "onReceive", 135, "UserUnlockMonitor.java")).q("Received ACTION_USER_UNLOCKED under crypt keeper bounce state.");
            } else {
                a(context);
                duyb.d(dvaj.a);
            }
        }
    }
}
