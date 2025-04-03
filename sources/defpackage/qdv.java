package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdv implements qdw, qee, qem, qhr {
    public final List a;
    private final Matrix b;
    private final Path c;
    private final RectF d;
    private final String e;
    private final boolean f;
    private final qdb g;
    private List h;
    private qfi i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qdv(defpackage.qdb r8, defpackage.qje r9, defpackage.qix r10, defpackage.qci r11) {
        /*
            r7 = this;
            java.lang.String r3 = r10.a
            boolean r4 = r10.c
            java.util.List r0 = r10.b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = r1
        L11:
            int r6 = r0.size()
            if (r2 >= r6) goto L29
            java.lang.Object r6 = r0.get(r2)
            qil r6 = (defpackage.qil) r6
            qdu r6 = r6.a(r8, r11, r9)
            if (r6 == 0) goto L26
            r5.add(r6)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            java.util.List r10 = r10.b
        L2b:
            int r11 = r10.size()
            if (r1 >= r11) goto L41
            java.lang.Object r11 = r10.get(r1)
            qil r11 = (defpackage.qil) r11
            boolean r0 = r11 instanceof defpackage.qig
            if (r0 == 0) goto L3e
            qig r11 = (defpackage.qig) r11
            goto L42
        L3e:
            int r1 = r1 + 1
            goto L2b
        L41:
            r11 = 0
        L42:
            r0 = r7
            r1 = r8
            r2 = r9
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdv.<init>(qdb, qje, qix, qci):void");
    }

    @Override // defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        qfi qfiVar = this.i;
        if (qfiVar != null) {
            qfiVar.e(obj, qlzVar);
        }
    }

    @Override // defpackage.qdw
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        this.b.set(matrix);
        qfi qfiVar = this.i;
        if (qfiVar != null) {
            this.b.preConcat(qfiVar.a());
            i = (int) (((((this.i.e == null ? 100 : ((Integer) r4.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = this.a.get(size);
            if (obj instanceof qdw) {
                ((qdw) obj).b(canvas, this.b, i);
            }
        }
    }

    @Override // defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.b.set(matrix);
        qfi qfiVar = this.i;
        if (qfiVar != null) {
            this.b.preConcat(qfiVar.a());
        }
        this.d.set(0.0f, 0.0f, 0.0f, 0.0f);
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            qdu qduVar = (qdu) this.a.get(size);
            if (qduVar instanceof qdw) {
                ((qdw) qduVar).c(this.d, this.b, z);
                rectF.union(this.d);
            }
        }
    }

    @Override // defpackage.qem
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.qhr
    public final void e(qhq qhqVar, int i, List list, qhq qhqVar2) {
        if (qhqVar.e(this.e, i) || "__container".equals(this.e)) {
            if (!"__container".equals(this.e)) {
                qhqVar2 = qhqVar2.b(this.e);
                if (qhqVar.d(this.e, i)) {
                    list.add(qhqVar2.c(this));
                }
            }
            if (qhqVar.f(this.e, i)) {
                int a = i + qhqVar.a(this.e, i);
                for (int i2 = 0; i2 < this.a.size(); i2++) {
                    qdu qduVar = (qdu) this.a.get(i2);
                    if (qduVar instanceof qhr) {
                        ((qhr) qduVar).e(qhqVar, a, list, qhqVar2);
                    }
                }
            }
        }
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.a.size());
        arrayList.addAll(list);
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            qdu qduVar = (qdu) this.a.get(size);
            qduVar.f(arrayList, this.a.subList(0, size));
            arrayList.add(qduVar);
        }
    }

    @Override // defpackage.qdu
    public final String g() {
        throw null;
    }

    final Matrix h() {
        qfi qfiVar = this.i;
        if (qfiVar != null) {
            return qfiVar.a();
        }
        this.b.reset();
        return this.b;
    }

    @Override // defpackage.qee
    public final Path i() {
        this.b.reset();
        qfi qfiVar = this.i;
        if (qfiVar != null) {
            this.b.set(qfiVar.a());
        }
        this.c.reset();
        if (!this.f) {
            int size = this.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                qdu qduVar = (qdu) this.a.get(size);
                if (qduVar instanceof qee) {
                    this.c.addPath(((qee) qduVar).i(), this.b);
                }
            }
        }
        return this.c;
    }

    final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            for (int i = 0; i < this.a.size(); i++) {
                qdu qduVar = (qdu) this.a.get(i);
                if (qduVar instanceof qee) {
                    this.h.add((qee) qduVar);
                }
            }
        }
        return this.h;
    }

    public qdv(qdb qdbVar, qje qjeVar, String str, boolean z, List list, qig qigVar) {
        new qdq();
        new RectF();
        this.b = new Matrix();
        this.c = new Path();
        this.d = new RectF();
        this.e = str;
        this.g = qdbVar;
        this.f = z;
        this.a = list;
        if (qigVar != null) {
            qfi qfiVar = new qfi(qigVar);
            this.i = qfiVar;
            qfiVar.c(qjeVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            qdu qduVar = (qdu) list.get(size);
            if (qduVar instanceof qeb) {
                arrayList.add((qeb) qduVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((qeb) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }
}
