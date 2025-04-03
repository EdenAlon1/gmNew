package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogf {
    public emxc a;
    public eogh b;
    private emxc c;
    private final emyv d;

    public eogf() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.c = emuxVar;
        this.d = emyv.b;
        this.b = eogi.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eogi a(emyl emylVar, eofx eofxVar, emxg emxgVar) {
        boolean z = true;
        if (!this.a.g() && !this.c.g()) {
            z = false;
        }
        emxf.m(z, "Either executor or scheduledExecutorService needs to be set.");
        return new eogi(emylVar, eofxVar, emxgVar, (Executor) this.a.a(this.c).c(), this.c.g() ? this.c.c() : eogg.a, this.d, this.b);
    }

    public final void b(ScheduledExecutorService scheduledExecutorService) {
        this.c = emxc.j(scheduledExecutorService);
    }
}
