package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qeg implements qem, qec, qee {
    private final String c;
    private final boolean d;
    private final qdb e;
    private final qer f;
    private final qer g;
    private final qer h;
    private boolean k;
    private final Path a = new Path();
    private final RectF b = new RectF();
    private final qdt i = new qdt();
    private qer j = null;

    public qeg(qdb qdbVar, qje qjeVar, qis qisVar) {
        this.c = qisVar.a;
        this.d = qisVar.e;
        this.e = qdbVar;
        qer a = qisVar.b.a();
        this.f = a;
        qer a2 = qisVar.c.a();
        this.g = a2;
        qer a3 = qisVar.d.a();
        this.h = a3;
        qjeVar.k(a);
        qjeVar.k(a2);
        qjeVar.k(a3);
        a.h(this);
        a2.h(this);
        a3.h(this);
    }

    @Override // defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        qer qerVar;
        if (obj == qdg.l) {
            qerVar = this.g;
        } else if (obj == qdg.n) {
            qerVar = this.f;
        } else if (obj != qdg.m) {
            return;
        } else {
            qerVar = this.h;
        }
        qerVar.d = qlzVar;
    }

    @Override // defpackage.qem
    public final void d() {
        this.k = false;
        this.e.invalidateSelf();
    }

    @Override // defpackage.qhr
    public final void e(qhq qhqVar, int i, List list, qhq qhqVar2) {
        qlr.d(qhqVar, i, list, qhqVar2, this);
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            qdu qduVar = (qdu) list.get(i);
            if (qduVar instanceof qel) {
                qel qelVar = (qel) qduVar;
                if (qelVar.e == 1) {
                    this.i.a(qelVar);
                    qelVar.a(this);
                }
            }
            if (qduVar instanceof qei) {
                this.j = ((qei) qduVar).a;
            }
        }
    }

    @Override // defpackage.qdu
    public final String g() {
        return this.c;
    }

    @Override // defpackage.qee
    public final Path i() {
        qer qerVar;
        if (this.k) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.k = true;
            return this.a;
        }
        PointF pointF = (PointF) this.g.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float k = ((qev) this.h).k();
        if (k == 0.0f && (qerVar = this.j) != null) {
            k = Math.min(((Float) qerVar.e()).floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (k > min) {
            k = min;
        }
        PointF pointF2 = (PointF) this.f.e();
        this.a.moveTo(pointF2.x + f, (pointF2.y - f2) + k);
        this.a.lineTo(pointF2.x + f, (pointF2.y + f2) - k);
        if (k > 0.0f) {
            float f3 = k + k;
            this.b.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            this.a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x - f) + k, pointF2.y + f2);
        if (k > 0.0f) {
            float f4 = k + k;
            this.b.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            this.a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.a.lineTo(pointF2.x - f, (pointF2.y - f2) + k);
        if (k > 0.0f) {
            float f5 = k + k;
            this.b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            this.a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.a.lineTo((pointF2.x + f) - k, pointF2.y - f2);
        if (k > 0.0f) {
            float f6 = k + k;
            this.b.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
            this.a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.a.close();
        this.i.b(this.a);
        this.k = true;
        return this.a;
    }
}
