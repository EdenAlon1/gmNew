package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qeh implements qdw, qee, qeb, qem, qec {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final qdb c;
    private final qje d;
    private final String e;
    private final boolean f;
    private final qer g;
    private final qer h;
    private final qfi i;
    private qdv j;

    public qeh(qdb qdbVar, qje qjeVar, qit qitVar) {
        this.c = qdbVar;
        this.d = qjeVar;
        this.e = qitVar.a;
        this.f = qitVar.e;
        qer a = qitVar.b.a();
        this.g = a;
        qjeVar.k(a);
        a.h(this);
        qer a2 = qitVar.c.a();
        this.h = a2;
        qjeVar.k(a2);
        a2.h(this);
        qfi qfiVar = new qfi(qitVar.d);
        this.i = qfiVar;
        qfiVar.c(qjeVar);
        qfiVar.d(this);
    }

    @Override // defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        qer qerVar;
        if (this.i.e(obj, qlzVar)) {
            return;
        }
        if (obj == qdg.u) {
            qerVar = this.g;
        } else if (obj != qdg.v) {
            return;
        } else {
            qerVar = this.h;
        }
        qerVar.d = qlzVar;
    }

    @Override // defpackage.qdw
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        float floatValue3 = ((Float) this.i.h.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.i.i.e()).floatValue() / 100.0f;
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            this.a.set(matrix);
            float f = i2;
            this.a.preConcat(this.i.b(f + floatValue2));
            PointF pointF = qlr.a;
            this.j.b(canvas, this.a, (int) (i * (((f / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
        }
    }

    @Override // defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.qem
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.qhr
    public final void e(qhq qhqVar, int i, List list, qhq qhqVar2) {
        qlr.d(qhqVar, i, list, qhqVar2, this);
        for (int i2 = 0; i2 < this.j.a.size(); i2++) {
            qdu qduVar = (qdu) this.j.a.get(i2);
            if (qduVar instanceof qec) {
                qlr.d(qhqVar, i, list, qhqVar2, (qec) qduVar);
            }
        }
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.qdu
    public final String g() {
        return this.e;
    }

    @Override // defpackage.qeb
    public final void h(ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((qdu) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new qdv(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.qee
    public final Path i() {
        Path i = this.j.i();
        this.b.reset();
        float floatValue = ((Float) this.g.e()).floatValue();
        float floatValue2 = ((Float) this.h.e()).floatValue();
        int i2 = (int) floatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return this.b;
            }
            this.a.set(this.i.b(i2 + floatValue2));
            this.b.addPath(i, this.a);
        }
    }
}
