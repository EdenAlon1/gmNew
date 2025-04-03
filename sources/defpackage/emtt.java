package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emtt {
    public static final emyv a;

    static {
        emyv emtsVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            emtsVar = new emtr();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            emtsVar = new emts();
        }
        a = emtsVar;
    }
}
