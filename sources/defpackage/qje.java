package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qje implements qdw, qem, qhr {
    final Matrix a;
    final qdb b;
    final qji c;
    public qev d;
    public qje e;
    public qje f;
    final qfi g;
    float h;
    BlurMaskFilter i;
    private final Path j = new Path();
    private final Matrix k = new Matrix();
    private final Matrix l = new Matrix();
    private final Paint m = new qdq(1);
    private final Paint n = new qdq(PorterDuff.Mode.DST_IN, null);
    private final Paint o = new qdq(PorterDuff.Mode.DST_OUT, null);
    private final Paint p;
    private final Paint q;
    private final RectF r;
    private final RectF s;
    private final RectF t;
    private final RectF u;
    private final RectF v;
    private qez w;
    private List x;
    private final List y;
    private boolean z;

    public qje(qdb qdbVar, qji qjiVar) {
        qdq qdqVar = new qdq(1);
        this.p = qdqVar;
        this.q = new qdq(PorterDuff.Mode.CLEAR);
        this.r = new RectF();
        this.s = new RectF();
        this.t = new RectF();
        this.u = new RectF();
        this.v = new RectF();
        this.a = new Matrix();
        this.y = new ArrayList();
        this.z = true;
        this.h = 0.0f;
        this.b = qdbVar;
        this.c = qjiVar;
        String str = qjiVar.c;
        if (qjiVar.x == 3) {
            qdqVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            qdqVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        qfi qfiVar = new qfi(qjiVar.h);
        this.g = qfiVar;
        qfiVar.d(this);
        List list = qjiVar.g;
        if (list != null && !list.isEmpty()) {
            qez qezVar = new qez(qjiVar.g);
            this.w = qezVar;
            Iterator it = qezVar.a.iterator();
            while (it.hasNext()) {
                ((qer) it.next()).h(this);
            }
            for (qer qerVar : this.w.b) {
                k(qerVar);
                qerVar.h(this);
            }
        }
        if (this.c.s.isEmpty()) {
            p(true);
            return;
        }
        qev qevVar = new qev(this.c.s);
        this.d = qevVar;
        qevVar.b = true;
        qevVar.h(new qem() { // from class: qjd
            @Override // defpackage.qem
            public final void d() {
                qje qjeVar = qje.this;
                qjeVar.p(qjeVar.d.k() == 1.0f);
            }
        });
        p(((Float) this.d.e()).floatValue() == 1.0f);
        k(this.d);
    }

    private final void s() {
        if (this.x != null) {
            return;
        }
        if (this.f == null) {
            this.x = Collections.EMPTY_LIST;
            return;
        }
        this.x = new ArrayList();
        for (qje qjeVar = this.f; qjeVar != null; qjeVar = qjeVar.f) {
            this.x.add(qjeVar);
        }
    }

    private final void t(Canvas canvas) {
        canvas.drawRect(this.r.left - 1.0f, this.r.top - 1.0f, this.r.right + 1.0f, this.r.bottom + 1.0f, this.q);
        qby.a();
    }

    private final void u() {
        this.b.invalidateSelf();
    }

    private final void v() {
        qdm qdmVar = this.b.a.a;
        String str = this.c.c;
    }

    @Override // defpackage.qhr
    public void a(Object obj, qlz qlzVar) {
        this.g.e(obj, qlzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0131  */
    @Override // defpackage.qdw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qje.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // defpackage.qdw
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.r.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.a.set(matrix);
        if (z) {
            List list = this.x;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        this.a.preConcat(((qje) this.x.get(size)).g.a());
                    }
                }
            } else {
                qje qjeVar = this.f;
                if (qjeVar != null) {
                    this.a.preConcat(qjeVar.g.a());
                }
            }
        }
        this.a.preConcat(this.g.a());
    }

    @Override // defpackage.qem
    public final void d() {
        u();
    }

    @Override // defpackage.qhr
    public final void e(qhq qhqVar, int i, List list, qhq qhqVar2) {
        qje qjeVar = this.e;
        if (qjeVar != null) {
            qhq b = qhqVar2.b(qjeVar.g());
            if (qhqVar.d(this.e.g(), i)) {
                list.add(b.c(this.e));
            }
            if (qhqVar.f(g(), i)) {
                this.e.n(qhqVar, qhqVar.a(this.e.g(), i) + i, list, b);
            }
        }
        if (qhqVar.e(g(), i)) {
            if (!"__container".equals(g())) {
                qhqVar2 = qhqVar2.b(g());
                if (qhqVar.d(g(), i)) {
                    list.add(qhqVar2.c(this));
                }
            }
            if (qhqVar.f(g(), i)) {
                n(qhqVar, i + qhqVar.a(g(), i), list, qhqVar2);
            }
        }
    }

    @Override // defpackage.qdu
    public final String g() {
        return this.c.c;
    }

    public final BlurMaskFilter h(float f) {
        if (this.h == f) {
            return this.i;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.i = blurMaskFilter;
        this.h = f;
        return blurMaskFilter;
    }

    public qij i() {
        return this.c.u;
    }

    public qkd j() {
        return this.c.v;
    }

    public final void k(qer qerVar) {
        if (qerVar == null) {
            return;
        }
        this.y.add(qerVar);
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i);

    public final void m(qer qerVar) {
        this.y.remove(qerVar);
    }

    public void o(float f) {
        qfi qfiVar = this.g;
        qer qerVar = qfiVar.e;
        if (qerVar != null) {
            qerVar.j(f);
        }
        qer qerVar2 = qfiVar.h;
        if (qerVar2 != null) {
            qerVar2.j(f);
        }
        qer qerVar3 = qfiVar.i;
        if (qerVar3 != null) {
            qerVar3.j(f);
        }
        qer qerVar4 = qfiVar.a;
        if (qerVar4 != null) {
            qerVar4.j(f);
        }
        qer qerVar5 = qfiVar.b;
        if (qerVar5 != null) {
            qerVar5.j(f);
        }
        qer qerVar6 = qfiVar.c;
        if (qerVar6 != null) {
            qerVar6.j(f);
        }
        qer qerVar7 = qfiVar.d;
        if (qerVar7 != null) {
            qerVar7.j(f);
        }
        qev qevVar = qfiVar.f;
        if (qevVar != null) {
            qevVar.j(f);
        }
        qev qevVar2 = qfiVar.g;
        if (qevVar2 != null) {
            qevVar2.j(f);
        }
        if (this.w != null) {
            for (int i = 0; i < this.w.a.size(); i++) {
                ((qer) this.w.a.get(i)).j(f);
            }
        }
        qev qevVar3 = this.d;
        if (qevVar3 != null) {
            qevVar3.j(f);
        }
        qje qjeVar = this.e;
        if (qjeVar != null) {
            qjeVar.o(f);
        }
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            ((qer) this.y.get(i2)).j(f);
        }
    }

    public final void p(boolean z) {
        if (z != this.z) {
            this.z = z;
            u();
        }
    }

    final boolean q() {
        qez qezVar = this.w;
        return (qezVar == null || qezVar.a.isEmpty()) ? false : true;
    }

    final boolean r() {
        return this.e != null;
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
    }

    public void n(qhq qhqVar, int i, List list, qhq qhqVar2) {
    }
}
