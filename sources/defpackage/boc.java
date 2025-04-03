package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boc {
    public final bnv a;
    final bct b;
    public bob c;

    public boc(bct bctVar, bnv bnvVar) {
        this.b = bctVar;
        this.a = bnvVar;
    }

    public final bob a(boa boaVar) {
        final bnr bnrVar;
        Rect f;
        biw.b();
        this.c = new bob();
        bmd bmdVar = (bmd) boaVar;
        Iterator it = bmdVar.b.iterator();
        while (true) {
            bnrVar = bmdVar.a;
            if (it.hasNext()) {
                bou bouVar = (bou) it.next();
                bob bobVar = this.c;
                Rect d = bouVar.d();
                int b = bouVar.b();
                boolean g = bouVar.g();
                Matrix matrix = new Matrix(bnrVar.b);
                Matrix d2 = bix.d(new RectF(d), bix.g(bouVar.e()), b, g);
                matrix.postConcat(d2);
                ksw.a(bix.o(bix.h(d, b), false, bouVar.e()));
                if (bouVar.h()) {
                    ksw.b(bouVar.d().contains(bnrVar.d), String.format("Output crop rect %s must contain input crop rect %s", bouVar.d(), bnrVar.d));
                    f = new Rect();
                    RectF rectF = new RectF(bnrVar.d);
                    d2.mapRect(rectF);
                    rectF.round(f);
                } else {
                    f = bix.f(bouVar.e());
                }
                Rect rect = f;
                bgq f2 = bnrVar.g.f();
                f2.d(bouVar.e());
                bobVar.put(bouVar, new bnr(bouVar.c(), bouVar.a(), f2.a(), matrix, false, rect, bnrVar.i - b, -1, bnrVar.e != g));
            } else {
                try {
                    break;
                } catch (awm e) {
                    avw.d("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
                }
            }
        }
        this.a.a(bnrVar.a(this.b));
        Iterator it2 = this.c.entrySet().iterator();
        while (it2.hasNext()) {
            final Map.Entry entry = (Map.Entry) it2.next();
            b(bnrVar, entry);
            ((bnr) entry.getValue()).e(new Runnable() { // from class: bnw
                @Override // java.lang.Runnable
                public final void run() {
                    boc.this.b(bnrVar, entry);
                }
            });
        }
        final bob bobVar2 = this.c;
        bnrVar.l.add(new ksp() { // from class: bnx
            @Override // defpackage.ksp
            public final void accept(Object obj) {
                axr axrVar = (axr) obj;
                for (Map.Entry entry2 : bobVar2.entrySet()) {
                    int a = axrVar.a() - ((bou) entry2.getKey()).b();
                    if (((bou) entry2.getKey()).g()) {
                        a = -a;
                    }
                    RectF rectF2 = bix.a;
                    ((bnr) entry2.getValue()).k(bix.b(a), -1);
                }
            }
        });
        return this.c;
    }

    public final void b(bnr bnrVar, Map.Entry entry) {
        bnr bnrVar2 = (bnr) entry.getValue();
        bkj.i(bnrVar2.d(((bou) entry.getKey()).a(), new asw(bnrVar.g.c(), ((bou) entry.getKey()).d(), bnrVar.c ? this.b : null, ((bou) entry.getKey()).b(), ((bou) entry.getKey()).g()), null), new bnz(this, bnrVar2), bjm.a());
    }

    public final void c() {
        this.a.g();
        biw.c(new Runnable() { // from class: bny
            @Override // java.lang.Runnable
            public final void run() {
                bob bobVar = boc.this.c;
                if (bobVar != null) {
                    Iterator it = bobVar.values().iterator();
                    while (it.hasNext()) {
                        ((bnr) it.next()).g();
                    }
                }
            }
        });
    }
}
