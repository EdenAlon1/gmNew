package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkwa {
    public static dkwa a;
    private final Context b;

    public dkwa(Context context) {
        this.b = context;
    }

    public static dkwa a() {
        dkwa dkwaVar = a;
        if (dkwaVar != null) {
            return dkwaVar;
        }
        throw new IllegalStateException("WakeLockThreadFactory was not initialized");
    }

    public final Thread b(String str, Runnable runnable, long j) {
        return new dkvz(str, this.b, runnable, j);
    }
}
