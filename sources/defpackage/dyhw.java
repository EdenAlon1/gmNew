package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhw {
    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void b() {
        a(Looper.getMainLooper() != Looper.myLooper(), "checkWorkerThread failed");
    }
}
