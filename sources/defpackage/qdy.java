package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdy implements qdw, qem, qec {
    float a;
    private final Path b;
    private final Paint c;
    private final qje d;
    private final String e;
    private final boolean f;
    private final List g;
    private final qer h;
    private final qer i;
    private qer j;
    private final qdb k;
    private qer l;
    private qeu m;

    public qdy(qdb qdbVar, qje qjeVar, qiw qiwVar) {
        Path path = new Path();
        this.b = path;
        this.c = new qdq(1);
        this.g = new ArrayList();
        this.d = qjeVar;
        this.e = qiwVar.b;
        this.f = qiwVar.e;
        this.k = qdbVar;
        if (qjeVar.i() != null) {
            qer a = qjeVar.i().a.a();
            this.l = a;
            a.h(this);
            qjeVar.k(this.l);
        }
        if (qjeVar.j() != null) {
            this.m = new qeu(this, qjeVar, qjeVar.j());
        }
        if (qiwVar.c == null) {
            this.h = null;
            this.i = null;
            return;
        }
        path.setFillType(qiwVar.a);
        qer a2 = qiwVar.c.a();
        this.h = a2;
        a2.h(this);
        qjeVar.k(a2);
        qer a3 = qiwVar.d.a();
        this.i = a3;
        a3.h(this);
        qjeVar.k(a3);
    }

    @Override // defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        qeu qeuVar;
        qeu qeuVar2;
        qeu qeuVar3;
        qeu qeuVar4;
        qeu qeuVar5;
        if (obj == qdg.a) {
            this.h.d = qlzVar;
            return;
        }
        if (obj == qdg.d) {
            this.i.d = qlzVar;
            return;
        }
        if (obj == qdg.K) {
            qer qerVar = this.j;
            if (qerVar != null) {
                this.d.m(qerVar);
            }
            if (qlzVar == null) {
                this.j = null;
                return;
            }
            qfj qfjVar = new qfj(qlzVar);
            this.j = qfjVar;
            qfjVar.h(this);
            this.d.k(this.j);
            return;
        }
        if (obj == qdg.j) {
            qer qerVar2 = this.l;
            if (qerVar2 != null) {
                qerVar2.d = qlzVar;
                return;
            }
            qfj qfjVar2 = new qfj(qlzVar);
            this.l = qfjVar2;
            qfjVar2.h(this);
            this.d.k(this.l);
            return;
        }
        if (obj == qdg.e && (qeuVar5 = this.m) != null) {
            qeuVar5.b(qlzVar);
            return;
        }
        if (obj == qdg.G && (qeuVar4 = this.m) != null) {
            qeuVar4.f(qlzVar);
            return;
        }
        if (obj == qdg.H && (qeuVar3 = this.m) != null) {
            qeuVar3.c(qlzVar);
            return;
        }
        if (obj == qdg.I && (qeuVar2 = this.m) != null) {
            qeuVar2.e(qlzVar);
        } else {
            if (obj != qdg.J || (qeuVar = this.m) == null) {
                return;
            }
            qeuVar.g(qlzVar);
        }
    }

    @Override // defpackage.qdw
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        qer qerVar = this.h;
        qer qerVar2 = this.i;
        this.c.setColor((qlr.e((int) ((((i / 255.0f) * ((Integer) qerVar2.e()).intValue()) / 100.0f) * 255.0f)) << 24) | (((qes) qerVar).k() & 16777215));
        qer qerVar3 = this.j;
        if (qerVar3 != null) {
            this.c.setColorFilter((ColorFilter) qerVar3.e());
        }
        qer qerVar4 = this.l;
        if (qerVar4 != null) {
            float floatValue = ((Float) qerVar4.e()).floatValue();
            if (floatValue == 0.0f) {
                this.c.setMaskFilter(null);
            } else if (floatValue != this.a) {
                this.c.setMaskFilter(this.d.h(floatValue));
            }
            this.a = floatValue;
        }
        qeu qeuVar = this.m;
        if (qeuVar != null) {
            qeuVar.a(this.c);
        }
        this.b.reset();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            this.b.addPath(((qee) this.g.get(i2)).i(), matrix);
        }
        canvas.drawPath(this.b, this.c);
        qby.a();
    }

    @Override // defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.b.reset();
        for (int i = 0; i < this.g.size(); i++) {
            this.b.addPath(((qee) this.g.get(i)).i(), matrix);
        }
        this.b.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.qem
    public final void d() {
        this.k.invalidateSelf();
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
                this.g.add((qee) qduVar);
            }
        }
    }

    @Override // defpackage.qdu
    public final String g() {
        return this.e;
    }
}
