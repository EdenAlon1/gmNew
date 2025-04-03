package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejox implements pqj {
    final Handler a;

    public ejox(Handler handler) {
        this.a = handler;
    }

    @Override // defpackage.pqj
    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    @Override // defpackage.pqj
    public final void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
