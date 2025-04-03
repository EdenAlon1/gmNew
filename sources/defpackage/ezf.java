package defpackage;

import android.graphics.Rect;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezf extends fal {
    public fas a;
    private ffud c;
    private fgcl d;

    private final void m(ffji ffjiVar) {
        fai faiVar = this.b;
        if (faiVar == null) {
            return;
        }
        this.c = faiVar.z ? ffqy.d(faiVar.D(), null, ffsm.d, new fah(faiVar, new eze(ffjiVar, this, faiVar, null), null), 1) : null;
    }

    public final fgcl a() {
        fgcl fgclVar = this.d;
        if (fgclVar != null) {
            return fgclVar;
        }
        if (!eyx.a) {
            return null;
        }
        fgcl e = fgcu.e(1, 0, 3, 2);
        this.d = e;
        return e;
    }

    @Override // defpackage.fal, defpackage.jvn
    public final void b(iam iamVar) {
        Rect rect;
        fas fasVar = this.a;
        if (fasVar != null) {
            fasVar.k = new Rect(ffln.b(iamVar.b), ffln.b(iamVar.c), ffln.b(iamVar.d), ffln.b(iamVar.e));
            if (!fasVar.i.isEmpty() || (rect = fasVar.k) == null) {
                return;
            }
            fasVar.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // defpackage.fal, defpackage.jvn
    public final void c() {
        m(null);
    }

    @Override // defpackage.jvn
    public final void d(jvu jvuVar, juw juwVar, ffji ffjiVar, ffji ffjiVar2) {
        m(new eyy(jvuVar, this, juwVar, ffjiVar, ffjiVar2));
    }

    @Override // defpackage.fal
    public final void e() {
        fgcl a = a();
        if (a != null) {
            a.h(ffcu.a);
        }
    }

    @Override // defpackage.jvn
    public final void f() {
        ffud ffudVar = this.c;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.c = null;
        fgcl a = a();
        if (a != null) {
            a.e();
        }
    }

    @Override // defpackage.jvn
    public final void g(jvu jvuVar, jvu jvuVar2) {
        fas fasVar = this.a;
        if (fasVar != null) {
            boolean z = true;
            if (jpm.h(fasVar.g.c, jvuVar2.c) && ffkj.e(fasVar.g.d, jvuVar2.d)) {
                z = false;
            }
            fasVar.g = jvuVar2;
            int size = fasVar.i.size();
            for (int i = 0; i < size; i++) {
                fau fauVar = (fau) ((WeakReference) fasVar.i.get(i)).get();
                if (fauVar != null) {
                    fauVar.a = jvuVar2;
                }
            }
            fak fakVar = fasVar.l;
            synchronized (fakVar.a) {
                fakVar.h = null;
                fakVar.j = null;
                fakVar.i = null;
                fakVar.k = null;
                fakVar.l = null;
            }
            if (ffkj.e(jvuVar, jvuVar2)) {
                if (z) {
                    fag fagVar = fasVar.m;
                    int d = jpm.d(jvuVar2.c);
                    int c = jpm.c(jvuVar2.c);
                    jpm jpmVar = fasVar.g.d;
                    int d2 = jpmVar != null ? jpm.d(jpmVar.b) : -1;
                    jpm jpmVar2 = fasVar.g.d;
                    fagVar.b(d, c, d2, jpmVar2 != null ? jpm.c(jpmVar2.b) : -1);
                    return;
                }
                return;
            }
            if (jvuVar != null && (!ffkj.e(jvuVar.a(), jvuVar2.a()) || (jpm.h(jvuVar.c, jvuVar2.c) && !ffkj.e(jvuVar.d, jvuVar2.d)))) {
                fag fagVar2 = fasVar.m;
                fagVar2.a().restartInput(fagVar2.a);
                return;
            }
            int size2 = fasVar.i.size();
            for (int i2 = 0; i2 < size2; i2++) {
                fau fauVar2 = (fau) ((WeakReference) fasVar.i.get(i2)).get();
                if (fauVar2 != null) {
                    jvu jvuVar3 = fasVar.g;
                    fag fagVar3 = fasVar.m;
                    if (fauVar2.d) {
                        fauVar2.a = jvuVar3;
                        if (fauVar2.c) {
                            fagVar3.a().updateExtractedText(fagVar3.a, fauVar2.b, fav.a(jvuVar3));
                        }
                        jpm jpmVar3 = jvuVar3.d;
                        int d3 = jpmVar3 != null ? jpm.d(jpmVar3.b) : -1;
                        jpm jpmVar4 = jvuVar3.d;
                        fagVar3.b(jpm.d(jvuVar3.c), jpm.c(jvuVar3.c), d3, jpmVar4 != null ? jpm.c(jpmVar4.b) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.fal, defpackage.jvn
    public final void h(jvu jvuVar, jvj jvjVar, jpg jpgVar, ffji ffjiVar, iam iamVar, iam iamVar2) {
        fas fasVar = this.a;
        if (fasVar != null) {
            fak fakVar = fasVar.l;
            synchronized (fakVar.a) {
                fakVar.h = jvuVar;
                fakVar.j = jvjVar;
                fakVar.i = jpgVar;
                fakVar.k = iamVar;
                fakVar.l = iamVar2;
                if (fakVar.c || fakVar.b) {
                    fakVar.a();
                }
            }
        }
    }
}
