package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amr {
    private final Executor a;
    private final ScheduledExecutorService b;
    private final Handler c;
    private final aky d;
    private final bfx e;
    private final bfx f;

    public amr(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, aky akyVar, bfx bfxVar, bfx bfxVar2) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = handler;
        this.d = akyVar;
        this.e = bfxVar;
        this.f = bfxVar2;
    }

    final amq a() {
        return new ane(this.e, this.f, this.d, this.a, this.b, this.c);
    }
}
