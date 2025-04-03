package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euoq implements Executor, dhqs {
    public final dfra a;
    public final Queue b = new ArrayDeque();
    public int c = 0;
    private final Handler d;

    public euoq(dfra dfraVar) {
        this.a = dfraVar;
        this.d = new dgxx(dfraVar.i);
    }

    @Override // defpackage.dhqs
    public final void a(dhre dhreVar) {
        euop euopVar;
        synchronized (this.b) {
            if (this.c == 2) {
                euopVar = (euop) this.b.peek();
                dfwv.i(euopVar != null);
            } else {
                euopVar = null;
            }
            this.c = 0;
        }
        if (euopVar != null) {
            euopVar.a();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}
