package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qff extends qer {
    protected qlz e;
    protected qlz f;
    private final PointF g;
    private final PointF h;
    private final qer i;
    private final qer j;

    public qff(qer qerVar, qer qerVar2) {
        super(Collections.EMPTY_LIST);
        this.g = new PointF();
        this.h = new PointF();
        this.i = qerVar;
        this.j = qerVar2;
        j(this.c);
    }

    @Override // defpackage.qer
    public final /* bridge */ /* synthetic */ Object e() {
        return k(0.0f);
    }

    @Override // defpackage.qer
    public final /* bridge */ /* synthetic */ Object f(qlx qlxVar, float f) {
        return k(f);
    }

    @Override // defpackage.qer
    public final void j(float f) {
        this.i.j(f);
        this.j.j(f);
        this.g.set(((Float) this.i.e()).floatValue(), ((Float) this.j.e()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((qem) this.a.get(i)).d();
        }
    }

    final PointF k(float f) {
        float f2;
        Float f3;
        qlx d;
        qlx d2;
        Float f4 = null;
        if (this.e == null || (d2 = this.i.d()) == null) {
            f2 = f;
            f3 = null;
        } else {
            float b = this.i.b();
            Float f5 = d2.h;
            f2 = f;
            f3 = (Float) this.e.b(d2.g, f5 == null ? d2.g : f5.floatValue(), (Float) d2.b, (Float) d2.c, f, f, b);
        }
        if (this.f != null && (d = this.j.d()) != null) {
            float b2 = this.j.b();
            Float f6 = d.h;
            f4 = (Float) this.f.b(d.g, f6 == null ? d.g : f6.floatValue(), (Float) d.b, (Float) d.c, f2, f2, b2);
        }
        if (f3 == null) {
            this.h.set(this.g.x, 0.0f);
        } else {
            this.h.set(f3.floatValue(), 0.0f);
        }
        if (f4 == null) {
            PointF pointF = this.h;
            pointF.set(pointF.x, this.g.y);
        } else {
            PointF pointF2 = this.h;
            pointF2.set(pointF2.x, f4.floatValue());
        }
        return this.h;
    }
}
