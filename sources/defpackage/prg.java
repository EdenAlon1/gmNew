package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prg implements pqj {
    private final Handler a = kqv.a(Looper.getMainLooper());

    @Override // defpackage.pqj
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.pqj
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
