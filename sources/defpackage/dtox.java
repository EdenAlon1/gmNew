package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtox {
    public static final dtov a = new dtov();
    public static final Thread b;
    public static dtot c;

    static {
        Thread thread = Looper.getMainLooper().getThread();
        thread.getClass();
        b = thread;
    }
}
