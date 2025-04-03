package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdx implements qee, qem, qec {
    private final String b;
    private final qdb c;
    private final qer d;
    private final qer e;
    private final qik f;
    private boolean h;
    private final Path a = new Path();
    private final qdt g = new qdt();

    public qdx(qdb qdbVar, qje qjeVar, qik qikVar) {
        this.b = qikVar.a;
        this.c = qdbVar;
        qer a = qikVar.c.a();
        this.d = a;
        qer a2 = qikVar.b.a();
        this.e = a2;
        this.f = qikVar;
        qjeVar.k(a);
        qjeVar.k(a2);
        a.h(this);
        a2.h(this);
    }

    @Override // defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        qer qerVar;
        if (obj == qdg.k) {
            qerVar = this.d;
        } else if (obj != qdg.n) {
            return;
        } else {
            qerVar = this.e;
        }
        qerVar.d = qlzVar;
    }

    @Override // defpackage.qem
    public final void d() {
        this.h = false;
        this.c.invalidateSelf();
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
                    this.g.a(qelVar);
                    qelVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.qdu
    public final String g() {
        return this.b;
    }

    @Override // defpackage.qee
    public final Path i() {
        if (this.h) {
            return this.a;
        }
        this.a.reset();
        if (this.f.e) {
            this.h = true;
            return this.a;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        this.a.reset();
        float f3 = f2 * 0.55228f;
        float f4 = -f;
        float f5 = -f3;
        float f6 = f3 + 0.0f;
        float f7 = 0.55228f * f;
        float f8 = -f7;
        float f9 = f7 + 0.0f;
        float f10 = -f2;
        if (this.f.d) {
            this.a.moveTo(0.0f, f10);
            this.a.cubicTo(f8, f10, f4, f5, f4, 0.0f);
            this.a.cubicTo(f4, f6, f8, f2, 0.0f, f2);
            this.a.cubicTo(f9, f2, f, f6, f, 0.0f);
            this.a.cubicTo(f, f5, f9, f10, 0.0f, f10);
        } else {
            this.a.moveTo(0.0f, f10);
            this.a.cubicTo(f9, f10, f, f5, f, 0.0f);
            this.a.cubicTo(f, f6, f9, f2, 0.0f, f2);
            this.a.cubicTo(f8, f2, f4, f6, f4, 0.0f);
            this.a.cubicTo(f4, f5, f8, f10, 0.0f, f10);
        }
        PointF pointF2 = (PointF) this.e.e();
        this.a.offset(pointF2.x, pointF2.y);
        this.a.close();
        this.g.b(this.a);
        this.h = true;
        return this.a;
    }
}
