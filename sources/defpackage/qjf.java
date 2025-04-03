package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjf extends qje {
    public boolean j;
    private qer k;
    private final List l;
    private final RectF m;
    private final RectF n;

    public qjf(qdb qdbVar, qji qjiVar, List list, qci qciVar) {
        super(qdbVar, qjiVar);
        qje qjeVar;
        qje qjfVar;
        String str;
        this.l = new ArrayList();
        this.m = new RectF();
        this.n = new RectF();
        new Paint();
        this.j = true;
        qhw qhwVar = qjiVar.r;
        if (qhwVar != null) {
            qer a = qhwVar.a();
            this.k = a;
            k(a);
            this.k.h(this);
        } else {
            this.k = null;
        }
        cno cnoVar = new cno(qciVar.h.size());
        int size = list.size() - 1;
        qje qjeVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < cnoVar.b(); i++) {
                    qje qjeVar3 = (qje) cnoVar.d(cnoVar.c(i));
                    if (qjeVar3 != null && (qjeVar = (qje) cnoVar.d(qjeVar3.c.e)) != null) {
                        qjeVar3.f = qjeVar;
                    }
                }
                return;
            }
            qji qjiVar2 = (qji) list.get(size);
            int i2 = qjiVar2.w;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                qjfVar = new qjf(qdbVar, qjiVar2, (List) qciVar.b.get(qjiVar2.f), qciVar);
            } else if (i3 == 1) {
                qjfVar = new qjl(qdbVar, qjiVar2);
            } else if (i3 == 2) {
                qjfVar = new qjg(qdbVar, qjiVar2);
            } else if (i3 == 3) {
                qjfVar = new qjj(qdbVar, qjiVar2);
            } else if (i3 == 4) {
                qjfVar = new qjk(qdbVar, qjiVar2, this, qciVar);
            } else if (i3 != 5) {
                switch (i2) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                qlp.a("Unknown layer type ".concat(str));
                qjfVar = null;
            } else {
                qjfVar = new qjp(qdbVar, qjiVar2);
            }
            if (qjfVar != null) {
                cnoVar.h(qjfVar.c.d, qjfVar);
                if (qjeVar2 != null) {
                    qjeVar2.e = qjfVar;
                    qjeVar2 = null;
                } else {
                    this.l.add(0, qjfVar);
                    int i4 = qjiVar2.x;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 1 || i5 == 2) {
                        qjeVar2 = qjfVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.qje, defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        super.a(obj, qlzVar);
        if (obj == qdg.E) {
            if (qlzVar == null) {
                qer qerVar = this.k;
                if (qerVar != null) {
                    qerVar.d = null;
                    return;
                }
                return;
            }
            qfj qfjVar = new qfj(qlzVar);
            this.k = qfjVar;
            qfjVar.h(this);
            k(this.k);
        }
    }

    @Override // defpackage.qje, defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            this.m.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((qje) this.l.get(size)).c(this.m, this.a, true);
            rectF.union(this.m);
        }
    }

    @Override // defpackage.qje
    public final void l(Canvas canvas, Matrix matrix, int i) {
        qji qjiVar = this.c;
        this.n.set(0.0f, 0.0f, qjiVar.n, qjiVar.o);
        matrix.mapRect(this.n);
        canvas.save();
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                qby.a();
                return;
            } else if ((!this.j && "__container".equals(this.c.c)) || this.n.isEmpty() || canvas.clipRect(this.n)) {
                ((qje) this.l.get(size)).b(canvas, matrix, i);
            }
        }
    }

    @Override // defpackage.qje
    public final void n(qhq qhqVar, int i, List list, qhq qhqVar2) {
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            ((qje) this.l.get(i2)).e(qhqVar, i, list, qhqVar2);
        }
    }

    @Override // defpackage.qje
    public final void o(float f) {
        super.o(f);
        if (this.k != null) {
            f = ((((Float) this.k.e()).floatValue() * this.c.b.l) - this.c.b.j) / (this.b.a.b() + 0.01f);
        }
        if (this.k == null) {
            qji qjiVar = this.c;
            f -= qjiVar.m / qjiVar.b.b();
        }
        qji qjiVar2 = this.c;
        if (qjiVar2.l != 0.0f && !"__container".equals(qjiVar2.c)) {
            f /= this.c.l;
        }
        int size = this.l.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((qje) this.l.get(size)).o(f);
            }
        }
    }
}
