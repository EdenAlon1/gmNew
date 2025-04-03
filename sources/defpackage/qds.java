package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qds implements qem, qec, qdw {
    protected final qje a;
    final Paint b;
    float c;
    private final qdb h;
    private final float[] j;
    private final qer k;
    private final qer l;
    private final List m;
    private final qer n;
    private qer o;
    private qer p;
    private qeu q;
    private final PathMeasure d = new PathMeasure();
    private final Path e = new Path();
    private final Path f = new Path();
    private final RectF g = new RectF();
    private final List i = new ArrayList();

    public qds(qdb qdbVar, qje qjeVar, Paint.Cap cap, Paint.Join join, float f, qhy qhyVar, qhw qhwVar, List list, qhw qhwVar2) {
        qdq qdqVar = new qdq(1);
        this.b = qdqVar;
        this.c = 0.0f;
        this.h = qdbVar;
        this.a = qjeVar;
        qdqVar.setStyle(Paint.Style.STROKE);
        qdqVar.setStrokeCap(cap);
        qdqVar.setStrokeJoin(join);
        qdqVar.setStrokeMiter(f);
        this.l = qhyVar.a();
        this.k = qhwVar.a();
        if (qhwVar2 == null) {
            this.n = null;
        } else {
            this.n = qhwVar2.a();
        }
        this.m = new ArrayList(list.size());
        this.j = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.m.add(((qhw) list.get(i)).a());
        }
        qjeVar.k(this.l);
        qjeVar.k(this.k);
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            qjeVar.k((qer) this.m.get(i2));
        }
        qer qerVar = this.n;
        if (qerVar != null) {
            qjeVar.k(qerVar);
        }
        this.l.h(this);
        this.k.h(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((qer) this.m.get(i3)).h(this);
        }
        qer qerVar2 = this.n;
        if (qerVar2 != null) {
            qerVar2.h(this);
        }
        if (qjeVar.i() != null) {
            qer a = qjeVar.i().a.a();
            this.p = a;
            a.h(this);
            qjeVar.k(this.p);
        }
        if (qjeVar.j() != null) {
            this.q = new qeu(this, qjeVar, qjeVar.j());
        }
    }

    @Override // defpackage.qhr
    public void a(Object obj, qlz qlzVar) {
        qeu qeuVar;
        qeu qeuVar2;
        qeu qeuVar3;
        qeu qeuVar4;
        qeu qeuVar5;
        if (obj == qdg.d) {
            this.l.d = qlzVar;
            return;
        }
        if (obj == qdg.s) {
            this.k.d = qlzVar;
            return;
        }
        if (obj == qdg.K) {
            qer qerVar = this.o;
            if (qerVar != null) {
                this.a.m(qerVar);
            }
            if (qlzVar == null) {
                this.o = null;
                return;
            }
            qfj qfjVar = new qfj(qlzVar);
            this.o = qfjVar;
            qfjVar.h(this);
            this.a.k(this.o);
            return;
        }
        if (obj == qdg.j) {
            qer qerVar2 = this.p;
            if (qerVar2 != null) {
                qerVar2.d = qlzVar;
                return;
            }
            qfj qfjVar2 = new qfj(qlzVar);
            this.p = qfjVar2;
            qfjVar2.h(this);
            this.a.k(this.p);
            return;
        }
        if (obj == qdg.e && (qeuVar5 = this.q) != null) {
            qeuVar5.b(qlzVar);
            return;
        }
        if (obj == qdg.G && (qeuVar4 = this.q) != null) {
            qeuVar4.f(qlzVar);
            return;
        }
        if (obj == qdg.H && (qeuVar3 = this.q) != null) {
            qeuVar3.c(qlzVar);
            return;
        }
        if (obj == qdg.I && (qeuVar2 = this.q) != null) {
            qeuVar2.e(qlzVar);
        } else {
            if (obj != qdg.J || (qeuVar = this.q) == null) {
                return;
            }
            qeuVar.g(qlzVar);
        }
    }

    @Override // defpackage.qdw
    public void b(Canvas canvas, Matrix matrix, int i) {
        float[] fArr = (float[]) qlw.a.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            qby.a();
            return;
        }
        qex qexVar = (qex) this.l;
        this.b.setAlpha(qlr.e((int) ((((i / 255.0f) * qexVar.k(qexVar.d(), qexVar.b())) / 100.0f) * 255.0f)));
        this.b.setStrokeWidth(((qev) this.k).k() * qlw.c(matrix));
        if (this.b.getStrokeWidth() <= 0.0f) {
            qby.a();
            return;
        }
        if (this.m.isEmpty()) {
            qby.a();
        } else {
            float c = qlw.c(matrix);
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                this.j[i2] = ((Float) ((qer) this.m.get(i2)).e()).floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr2 = this.j;
                    if (fArr2[i2] < 1.0f) {
                        fArr2[i2] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.j;
                    if (fArr3[i2] < 0.1f) {
                        fArr3[i2] = 0.1f;
                    }
                }
                float[] fArr4 = this.j;
                fArr4[i2] = fArr4[i2] * c;
            }
            qer qerVar = this.n;
            this.b.setPathEffect(new DashPathEffect(this.j, qerVar == null ? 0.0f : ((Float) qerVar.e()).floatValue() * c));
            qby.a();
        }
        qer qerVar2 = this.o;
        if (qerVar2 != null) {
            this.b.setColorFilter((ColorFilter) qerVar2.e());
        }
        qer qerVar3 = this.p;
        if (qerVar3 != null) {
            float floatValue = ((Float) qerVar3.e()).floatValue();
            if (floatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (floatValue != this.c) {
                this.b.setMaskFilter(this.a.h(floatValue));
            }
            this.c = floatValue;
        }
        qeu qeuVar = this.q;
        if (qeuVar != null) {
            qeuVar.a(this.b);
        }
        int i3 = 0;
        while (i3 < this.i.size()) {
            qdr qdrVar = (qdr) this.i.get(i3);
            if (qdrVar.b != null) {
                this.e.reset();
                int size = qdrVar.a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        this.e.addPath(((qee) qdrVar.a.get(size)).i(), matrix);
                    }
                }
                float floatValue2 = ((Float) qdrVar.b.b.e()).floatValue() / 100.0f;
                float floatValue3 = ((Float) qdrVar.b.c.e()).floatValue() / 100.0f;
                float floatValue4 = ((Float) qdrVar.b.d.e()).floatValue() / 360.0f;
                if (floatValue2 >= 0.01f || floatValue3 <= 0.99f) {
                    this.d.setPath(this.e, z);
                    float length = this.d.getLength();
                    while (this.d.nextContour()) {
                        length += this.d.getLength();
                    }
                    float f = floatValue4 * length;
                    float f2 = (floatValue2 * length) + f;
                    float min = Math.min((floatValue3 * length) + f, (f2 + length) - 1.0f);
                    int size2 = qdrVar.a.size() - 1;
                    float f3 = 0.0f;
                    while (size2 >= 0) {
                        this.f.set(((qee) qdrVar.a.get(size2)).i());
                        this.f.transform(matrix);
                        this.d.setPath(this.f, z);
                        float length2 = this.d.getLength();
                        float f4 = f3 + length2;
                        if (min > length) {
                            float f5 = min - length;
                            if (f5 < f4 && f3 < f5) {
                                qlw.e(this.f, f2 > length ? (f2 - length) / length2 : 0.0f, Math.min(f5 / length2, 1.0f), 0.0f);
                                canvas.drawPath(this.f, this.b);
                                size2--;
                                f3 = f4;
                                z = false;
                            }
                        }
                        if (f4 >= f2 && f3 <= min) {
                            if (f4 > min || f2 >= f3) {
                                qlw.e(this.f, f2 < f3 ? 0.0f : (f2 - f3) / length2, min > f4 ? 1.0f : (min - f3) / length2, 0.0f);
                                canvas.drawPath(this.f, this.b);
                            } else {
                                canvas.drawPath(this.f, this.b);
                            }
                        }
                        size2--;
                        f3 = f4;
                        z = false;
                    }
                    qby.a();
                } else {
                    canvas.drawPath(this.e, this.b);
                    qby.a();
                }
            } else {
                this.e.reset();
                int size3 = qdrVar.a.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    } else {
                        this.e.addPath(((qee) qdrVar.a.get(size3)).i(), matrix);
                    }
                }
                qby.a();
                canvas.drawPath(this.e, this.b);
                qby.a();
            }
            i3++;
            z = false;
        }
        qby.a();
    }

    @Override // defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.e.reset();
        for (int i = 0; i < this.i.size(); i++) {
            qdr qdrVar = (qdr) this.i.get(i);
            for (int i2 = 0; i2 < qdrVar.a.size(); i2++) {
                this.e.addPath(((qee) qdrVar.a.get(i2)).i(), matrix);
            }
        }
        this.e.computeBounds(this.g, false);
        qer qerVar = this.k;
        RectF rectF2 = this.g;
        float k = ((qev) qerVar).k() / 2.0f;
        rectF2.set(rectF2.left - k, this.g.top - k, this.g.right + k, this.g.bottom + k);
        rectF.set(this.g);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        qby.a();
    }

    @Override // defpackage.qem
    public final void d() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.qhr
    public final void e(qhq qhqVar, int i, List list, qhq qhqVar2) {
        qlr.d(qhqVar, i, list, qhqVar2, this);
    }

    @Override // defpackage.qdu
    public final void f(List list, List list2) {
        qdr qdrVar = null;
        qel qelVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            qdu qduVar = (qdu) list.get(size);
            if (qduVar instanceof qel) {
                qel qelVar2 = (qel) qduVar;
                if (qelVar2.e == 2) {
                    qelVar = qelVar2;
                }
            }
        }
        if (qelVar != null) {
            qelVar.a(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            qdu qduVar2 = (qdu) list2.get(size2);
            if (qduVar2 instanceof qel) {
                qel qelVar3 = (qel) qduVar2;
                if (qelVar3.e == 2) {
                    if (qdrVar != null) {
                        this.i.add(qdrVar);
                    }
                    qdr qdrVar2 = new qdr(qelVar3);
                    qelVar3.a(this);
                    qdrVar = qdrVar2;
                }
            }
            if (qduVar2 instanceof qee) {
                if (qdrVar == null) {
                    qdrVar = new qdr(qelVar);
                }
                qdrVar.a.add((qee) qduVar2);
            }
        }
        if (qdrVar != null) {
            this.i.add(qdrVar);
        }
    }
}
