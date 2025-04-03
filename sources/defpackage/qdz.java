package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdz implements qdw, qem, qec {
    float a;
    private final String b;
    private final boolean c;
    private final qje d;
    private final cno e = new cno();
    private final cno f = new cno();
    private final Path g;
    private final Paint h;
    private final RectF i;
    private final List j;
    private final qer k;
    private final qer l;
    private final qer m;
    private final qer n;
    private qer o;
    private qfj p;
    private final qdb q;
    private final int r;
    private qer s;
    private qeu t;
    private final int u;

    public qdz(qdb qdbVar, qci qciVar, qje qjeVar, qin qinVar) {
        Path path = new Path();
        this.g = path;
        this.h = new qdq(1);
        this.i = new RectF();
        this.j = new ArrayList();
        this.a = 0.0f;
        this.d = qjeVar;
        this.b = qinVar.f;
        this.c = qinVar.g;
        this.q = qdbVar;
        this.u = qinVar.h;
        path.setFillType(qinVar.a);
        this.r = (int) (qciVar.a() / 32.0f);
        qer a = qinVar.b.a();
        this.k = a;
        a.h(this);
        qjeVar.k(a);
        qer a2 = qinVar.c.a();
        this.l = a2;
        a2.h(this);
        qjeVar.k(a2);
        qer a3 = qinVar.d.a();
        this.m = a3;
        a3.h(this);
        qjeVar.k(a3);
        qer a4 = qinVar.e.a();
        this.n = a4;
        a4.h(this);
        qjeVar.k(a4);
        if (qjeVar.i() != null) {
            qer a5 = qjeVar.i().a.a();
            this.s = a5;
            a5.h(this);
            qjeVar.k(this.s);
        }
        if (qjeVar.j() != null) {
            this.t = new qeu(this, qjeVar, qjeVar.j());
        }
    }

    private final int h() {
        float f = this.m.c;
        float f2 = this.r;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.n.c * f2);
        int round3 = Math.round(this.k.c * this.r);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private final int[] i(int[] iArr) {
        qfj qfjVar = this.p;
        if (qfjVar != null) {
            Integer[] numArr = (Integer[]) qfjVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        qeu qeuVar;
        qeu qeuVar2;
        qeu qeuVar3;
        qeu qeuVar4;
        qeu qeuVar5;
        if (obj == qdg.d) {
            this.l.d = qlzVar;
            return;
        }
        if (obj == qdg.K) {
            qer qerVar = this.o;
            if (qerVar != null) {
                this.d.m(qerVar);
            }
            if (qlzVar == null) {
                this.o = null;
                return;
            }
            qfj qfjVar = new qfj(qlzVar);
            this.o = qfjVar;
            qfjVar.h(this);
            this.d.k(this.o);
            return;
        }
        if (obj == qdg.L) {
            qfj qfjVar2 = this.p;
            if (qfjVar2 != null) {
                this.d.m(qfjVar2);
            }
            if (qlzVar == null) {
                this.p = null;
                return;
            }
            this.e.g();
            this.f.g();
            qfj qfjVar3 = new qfj(qlzVar);
            this.p = qfjVar3;
            qfjVar3.h(this);
            this.d.k(this.p);
            return;
        }
        if (obj == qdg.j) {
            qer qerVar2 = this.s;
            if (qerVar2 != null) {
                qerVar2.d = qlzVar;
                return;
            }
            qfj qfjVar4 = new qfj(qlzVar);
            this.s = qfjVar4;
            qfjVar4.h(this);
            this.d.k(this.s);
            return;
        }
        if (obj == qdg.e && (qeuVar5 = this.t) != null) {
            qeuVar5.b(qlzVar);
            return;
        }
        if (obj == qdg.G && (qeuVar4 = this.t) != null) {
            qeuVar4.f(qlzVar);
            return;
        }
        if (obj == qdg.H && (qeuVar3 = this.t) != null) {
            qeuVar3.c(qlzVar);
            return;
        }
        if (obj == qdg.I && (qeuVar2 = this.t) != null) {
            qeuVar2.e(qlzVar);
        } else {
            if (obj != qdg.J || (qeuVar = this.t) == null) {
                return;
            }
            qeuVar.g(qlzVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011f  */
    @Override // defpackage.qdw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdz.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.g.reset();
        for (int i = 0; i < this.j.size(); i++) {
            this.g.addPath(((qee) this.j.get(i)).i(), matrix);
        }
        this.g.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.qem
    public final void d() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.qhr
    public final void e(qhq qhqVar, int i, List list, qhq qhqVar2) {
        qlr.d(qhqVar, i, list, qhqVar2, this);
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            qdu qduVar = (qdu) list2.get(i);
            if (qduVar instanceof qee) {
                this.j.add((qee) qduVar);
            }
        }
    }

    @Override // defpackage.qdu
    public final String g() {
        return this.b;
    }
}
