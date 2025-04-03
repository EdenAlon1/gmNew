package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckav {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/ApplicationInfoVerifier");
    private final Context b;

    public ckav(Context context) {
        this.b = context;
    }

    public final boolean a(int i) {
        if (Binder.getCallingUid() == Process.myUid()) {
            return true;
        }
        try {
            if (this.b.getPackageManager().getApplicationInfo("com.google.android.ims", 0).uid == i) {
                if (dkuy.l(this.b)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            ensk g = a.g();
            g.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/rcs/ApplicationInfoVerifier", "isSelfOrCsApk", 40, "ApplicationInfoVerifier.java")).q("Carrier Services is not installed");
            return false;
        }
    }
}
