package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqj {
    public static final long a;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        a = j;
    }
}
