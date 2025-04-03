package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfbt {
    public final ffsk a;
    public final ConcurrentHashMap b;
    public final fgcq c;
    private final fgcl d;

    public cfbt(ffsk ffskVar) {
        ffskVar.getClass();
        this.a = ffskVar;
        this.b = new ConcurrentHashMap();
        fgcl d = fgcu.d(0, Alert.DURATION_SHOW_INDEFINITELY, 2);
        this.d = d;
        this.c = new fgcn(d);
    }

    public final void a(long j) {
        kfb c;
        fgcl fgclVar = this.d;
        Long valueOf = Long.valueOf(j);
        fgclVar.h(valueOf);
        cfbs cfbsVar = (cfbs) this.b.remove(valueOf);
        if (cfbsVar == null || (c = cfbsVar.c()) == null) {
            return;
        }
        c.d();
    }

    public final void b(long j, ceyt ceytVar) {
        kfb c;
        ceytVar.getClass();
        cfbs cfbsVar = (cfbs) this.b.remove(Long.valueOf(j));
        if (cfbsVar == null || (c = cfbsVar.c()) == null) {
            return;
        }
        c.b(ceytVar);
    }
}
