package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgi implements fgd {
    public static final hrh a = new hrk(fgf.a, fgg.a);
    public final List b;
    public final coc c;
    public AtomicLong d;
    public ffji e;
    public ffjo f;
    public ffjq g;
    public ffix h;
    public ffji i;
    public ffji j;
    private boolean k;
    private final hho l;

    public fgi() {
        this(1L);
    }

    @Override // defpackage.fgd
    public final long a() {
        long andIncrement = this.d.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // defpackage.fgd
    public final cnj b() {
        return (cnj) this.l.a();
    }

    @Override // defpackage.fgd
    public final void c(long j) {
        this.k = false;
        ffji ffjiVar = this.e;
        if (ffjiVar != null) {
            ffjiVar.invoke(Long.valueOf(j));
        }
    }

    @Override // defpackage.fgd
    public final void d(long j) {
        ffji ffjiVar = this.i;
        if (ffjiVar != null) {
            ffjiVar.invoke(Long.valueOf(j));
        }
    }

    @Override // defpackage.fgd
    public final void e() {
        ffix ffixVar = this.h;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
    }

    @Override // defpackage.fgd
    public final void f(ioc iocVar, long j, fdh fdhVar, boolean z) {
        ffjo ffjoVar = this.f;
        if (ffjoVar != null) {
            ffjoVar.a(Boolean.valueOf(z), iocVar, new iak(j), fdhVar);
        }
    }

    @Override // defpackage.fgd
    public final void g(fcv fcvVar) {
        fcs fcsVar = (fcs) fcvVar;
        if (this.c.b(fcsVar.a)) {
            this.b.remove(fcvVar);
            this.c.d(fcsVar.a);
            ffji ffjiVar = this.j;
            if (ffjiVar != null) {
                ffjiVar.invoke(Long.valueOf(fcsVar.a));
            }
        }
    }

    @Override // defpackage.fgd
    public final boolean h(ioc iocVar, long j, long j2, fdh fdhVar, boolean z) {
        ffjq ffjqVar = this.g;
        if (ffjqVar != null) {
            return ((Boolean) ffjqVar.a(Boolean.valueOf(z), iocVar, new iak(j), new iak(j2), false, fdhVar)).booleanValue();
        }
        return true;
    }

    @Override // defpackage.fgd
    public final void i(fcv fcvVar) {
        fcs fcsVar = (fcs) fcvVar;
        if (fcsVar.a == 0) {
            dwv.c("The selectable contains an invalid id: " + fcsVar.a);
        }
        if (this.c.b(fcsVar.a)) {
            dwv.c(a.i(fcvVar, "Another selectable with the id: ", ".selectableId has already subscribed."));
        }
        this.c.f(fcsVar.a, fcvVar);
        this.b.add(fcvVar);
        this.k = false;
    }

    public final List j(ioc iocVar) {
        if (!this.k) {
            List list = this.b;
            final fgh fghVar = new fgh(iocVar);
            ffdx.q(list, new Comparator() { // from class: fge
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Number) ffjm.this.a(obj, obj2)).intValue();
                }
            });
            this.k = true;
        }
        return this.b;
    }

    public final void k(cnj cnjVar) {
        this.l.b(cnjVar);
    }

    public fgi(long j) {
        this.b = new ArrayList();
        int i = cnk.a;
        this.c = new coc((byte[]) null);
        this.d = new AtomicLong(j);
        this.l = new hic(cnk.a(), hla.a);
    }
}
