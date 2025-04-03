package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pup implements pvi, qay {
    public static final String a = ppt.d("DelayMetCommandHandler");
    public final Context b;
    public final int c;
    public final pxs d;
    public final puu e;
    public final pvn f;
    public int g;
    public final Executor h;
    public final Executor i;
    public PowerManager.WakeLock j;
    public boolean k;
    public final psb l;
    public final ffsd m;
    public volatile ffud n;
    private final Object o;

    public pup(Context context, int i, puu puuVar, psb psbVar) {
        this.b = context;
        this.c = i;
        this.e = puuVar;
        this.d = psbVar.a;
        this.l = psbVar;
        pws pwsVar = puuVar.e.l;
        qbc qbcVar = puuVar.j;
        this.h = qbcVar.a;
        this.i = qbcVar.d;
        this.m = qbcVar.b;
        this.f = new pvn(pwsVar);
        this.k = false;
        this.g = 0;
        this.o = new Object();
    }

    public final void a() {
        synchronized (this.o) {
            if (this.n != null) {
                this.n.t(null);
            }
            this.e.c.a(this.d);
            PowerManager.WakeLock wakeLock = this.j;
            if (wakeLock != null && wakeLock.isHeld()) {
                ppt.c().a(a, "Releasing wakelock " + this.j + "for WorkSpec " + this.d);
                this.j.release();
            }
        }
    }

    @Override // defpackage.qay
    public final void b(pxs pxsVar) {
        ppt c = ppt.c();
        String str = a;
        Objects.toString(pxsVar);
        c.a(str, "Exceeded time limits on execution for ".concat(pxsVar.toString()));
        this.h.execute(new pun(this));
    }

    @Override // defpackage.pvi
    public final void e(pyj pyjVar, pva pvaVar) {
        if (pvaVar instanceof puy) {
            this.h.execute(new puo(this));
        } else {
            this.h.execute(new pun(this));
        }
    }
}
