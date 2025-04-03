package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgb {
    private static dkgb a;

    private dkgb() {
    }

    public static final void a(Context context, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.ims.provisioning.engine.update_provisioning_status_key", i - 1);
        djtb.c(context, 11, bundle);
    }

    public static synchronized void b() {
        synchronized (dkgb.class) {
            if (a == null) {
                a = new dkgb();
            }
        }
    }
}
