package defpackage;

import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oka {
    public static final boolean a(int i) {
        return Build.ID != null && Log.isLoggable("Paging", i);
    }

    public static final void b(int i, String str) {
        if (i != 2) {
            Log.d("Paging", str, null);
        } else {
            Log.v("Paging", str, null);
        }
    }
}
