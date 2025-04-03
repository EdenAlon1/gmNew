package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofk {
    public final okl a;
    public final ffsd b;
    public final ofg c;
    public final oio d;
    private final ffsk e;
    private final oin f;
    private final ffsd g;
    private final AtomicBoolean h;
    private final oiz i;

    public ofk(ffsk ffskVar, oin oinVar, okl oklVar, ffsd ffsdVar, ffsd ffsdVar2, ofg ofgVar, oiz oizVar) {
        oklVar.getClass();
        this.e = ffskVar;
        this.f = oinVar;
        this.a = oklVar;
        this.b = ffsdVar;
        this.g = ffsdVar2;
        this.c = ofgVar;
        this.i = oizVar;
        this.h = new AtomicBoolean(false);
        this.d = new ofh(this);
    }

    private final void f(ofz ofzVar, oke okeVar) {
        ffqy.d(this.e, this.g, null, new ofj(this, okeVar, ofzVar, null), 2);
    }

    public final void a() {
        this.h.set(true);
    }

    public final void b(ofz ofzVar, oki okiVar) {
        if (e()) {
            return;
        }
        if (!this.c.k(ofzVar, okiVar)) {
            this.d.b(ofzVar, okiVar.b.isEmpty() ? ofw.a : ofw.b);
            return;
        }
        int ordinal = ofzVar.ordinal();
        if (ordinal == 1) {
            d();
        } else {
            if (ordinal != 2) {
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            c();
        }
    }

    public final void c() {
        oiz oizVar = this.i;
        Object obj = (!oizVar.e || oizVar.c > 0) ? ((oki) ffdx.P(oizVar.a)).d : null;
        if (obj != null) {
            this.d.b(ofz.c, ofv.a);
            f(ofz.c, new okb(obj, this.f.a, true));
        } else {
            ofz ofzVar = ofz.c;
            oki okiVar = oki.a;
            b(ofzVar, okh.a());
        }
    }

    public final void d() {
        oiz oizVar = this.i;
        Object obj = (!oizVar.e || oizVar.b + oizVar.d > 0) ? ((oki) ffdx.K(oizVar.a)).c : null;
        if (obj != null) {
            this.d.b(ofz.b, ofv.a);
            f(ofz.b, new okc(obj, this.f.a, true));
        } else {
            ofz ofzVar = ofz.b;
            oki okiVar = oki.a;
            b(ofzVar, okh.a());
        }
    }

    public final boolean e() {
        return this.h.get();
    }
}
