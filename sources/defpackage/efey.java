package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efey implements erqj {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ emyg c;
    final /* synthetic */ effb d;
    final /* synthetic */ Integer e;
    final /* synthetic */ effc f;

    public efey(effc effcVar, AtomicBoolean atomicBoolean, Set set, emyg emygVar, effb effbVar, Integer num) {
        this.a = atomicBoolean;
        this.b = set;
        this.c = emygVar;
        this.d = effbVar;
        this.e = num;
        this.f = effcVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (this.a.get()) {
            this.b.size();
            this.c.a(effc.a);
            return;
        }
        this.b.size();
        effb effbVar = this.d;
        synchronized (effbVar.c) {
            enip.o(effbVar.b);
        }
        effc.a.convert(this.e.intValue(), this.f.g);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
    }
}
