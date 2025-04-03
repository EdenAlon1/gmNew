package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.android.vcard.VCardBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qjp extends qje {
    private qer A;
    private qer B;
    private qer C;
    private qer D;
    private final StringBuilder j;
    private final RectF k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Map o;
    private final cno p;
    private final List q;
    private final qfh r;
    private final qdb s;
    private final qci t;
    private qer u;
    private qer v;
    private qer w;
    private qer x;
    private qer y;
    private qer z;

    public qjp(qdb qdbVar, qji qjiVar) {
        super(qdbVar, qjiVar);
        qhw qhwVar;
        qhw qhwVar2;
        qhv qhvVar;
        qhv qhvVar2;
        this.j = new StringBuilder(2);
        this.k = new RectF();
        this.l = new Matrix();
        this.m = new qjm();
        this.n = new qjn();
        this.o = new HashMap();
        this.p = new cno();
        this.q = new ArrayList();
        this.s = qdbVar;
        this.t = qjiVar.b;
        qfh a = qjiVar.p.a();
        this.r = a;
        a.h(this);
        k(a);
        qif qifVar = qjiVar.q;
        if (qifVar != null && (qhvVar2 = qifVar.a) != null) {
            qer a2 = qhvVar2.a();
            this.u = a2;
            a2.h(this);
            k(this.u);
        }
        if (qifVar != null && (qhvVar = qifVar.b) != null) {
            qer a3 = qhvVar.a();
            this.w = a3;
            a3.h(this);
            k(this.w);
        }
        if (qifVar != null && (qhwVar2 = qifVar.c) != null) {
            qer a4 = qhwVar2.a();
            this.y = a4;
            a4.h(this);
            k(this.y);
        }
        if (qifVar == null || (qhwVar = qifVar.d) == null) {
            return;
        }
        qer a5 = qhwVar.a();
        this.A = a5;
        a5.h(this);
        k(this.A);
    }

    private final qjo s(int i) {
        for (int size = this.q.size(); size < i; size++) {
            this.q.add(new qjo());
        }
        return (qjo) this.q.get(i - 1);
    }

    private final List t(String str, float f, qho qhoVar, float f2, float f3, boolean z) {
        float f4;
        float measureText;
        int i = 0;
        float f5 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        float f6 = 0.0f;
        int i4 = 0;
        float f7 = 0.0f;
        while (i < str.length()) {
            int i5 = i + 1;
            char charAt = str.charAt(i);
            if (z) {
                f4 = 0.0f;
                qhp qhpVar = (qhp) cpp.a(this.t.f, qhp.a(charAt, qhoVar.a, qhoVar.c));
                if (qhpVar != null) {
                    measureText = ((float) qhpVar.b) * f2 * qlw.a();
                } else {
                    i = i5;
                }
            } else {
                f4 = 0.0f;
                measureText = this.m.measureText(str.substring(i, i5));
            }
            float f8 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f7 = f8;
            } else {
                if (z2) {
                    f6 = f8;
                    i4 = i;
                } else {
                    f6 += f8;
                }
                z2 = false;
            }
            f5 += f8;
            if (f > f4 && f5 >= f && charAt != ' ') {
                i2++;
                qjo s = s(i2);
                if (i4 == i3) {
                    s.a(str.substring(i3, i).trim(), (f5 - f8) - ((r10.length() - r8.length()) * f7));
                    f5 = f8;
                    f6 = f5;
                    i3 = i;
                    i4 = i3;
                } else {
                    s.a(str.substring(i3, i4 - 1).trim(), ((f5 - f6) - ((r3.length() - r5.length()) * f7)) - f7);
                    f5 = f6;
                    i3 = i4;
                }
            }
            i = i5;
        }
        if (f5 > 0.0f) {
            i2++;
            s(i2).a(str.substring(i3), f5);
        }
        return this.q.subList(0, i2);
    }

    private static final void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static final void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static final List w(String str) {
        return Arrays.asList(str.replaceAll(VCardBuilder.VCARD_END_OF_LINE, "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private static final void x(Canvas canvas, qhn qhnVar, int i, float f) {
        PointF pointF = qhnVar.k;
        PointF pointF2 = qhnVar.l;
        float a = qlw.a();
        float f2 = pointF == null ? 0.0f : (qhnVar.e * a) + pointF.y;
        float f3 = i * qhnVar.e * a;
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = qhnVar.m;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        float f6 = f3 + f2;
        if (i3 == 0) {
            canvas.translate(f4, f6);
        } else if (i3 == 1) {
            canvas.translate((f4 + f5) - f, f6);
        } else {
            if (i3 != 2) {
                return;
            }
            canvas.translate((f4 + (f5 / 2.0f)) - (f / 2.0f), f6);
        }
    }

    @Override // defpackage.qje, defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        super.a(obj, qlzVar);
        if (obj == qdg.a) {
            qer qerVar = this.v;
            if (qerVar != null) {
                m(qerVar);
            }
            if (qlzVar == null) {
                this.v = null;
                return;
            }
            qfj qfjVar = new qfj(qlzVar);
            this.v = qfjVar;
            qfjVar.h(this);
            k(this.v);
            return;
        }
        if (obj == qdg.b) {
            qer qerVar2 = this.x;
            if (qerVar2 != null) {
                m(qerVar2);
            }
            if (qlzVar == null) {
                this.x = null;
                return;
            }
            qfj qfjVar2 = new qfj(qlzVar);
            this.x = qfjVar2;
            qfjVar2.h(this);
            k(this.x);
            return;
        }
        if (obj == qdg.s) {
            qer qerVar3 = this.z;
            if (qerVar3 != null) {
                m(qerVar3);
            }
            if (qlzVar == null) {
                this.z = null;
                return;
            }
            qfj qfjVar3 = new qfj(qlzVar);
            this.z = qfjVar3;
            qfjVar3.h(this);
            k(this.z);
            return;
        }
        if (obj == qdg.t) {
            qer qerVar4 = this.B;
            if (qerVar4 != null) {
                m(qerVar4);
            }
            if (qlzVar == null) {
                this.B = null;
                return;
            }
            qfj qfjVar4 = new qfj(qlzVar);
            this.B = qfjVar4;
            qfjVar4.h(this);
            k(this.B);
            return;
        }
        if (obj == qdg.F) {
            qer qerVar5 = this.C;
            if (qerVar5 != null) {
                m(qerVar5);
            }
            if (qlzVar == null) {
                this.C = null;
                return;
            }
            qfj qfjVar5 = new qfj(qlzVar);
            this.C = qfjVar5;
            qfjVar5.h(this);
            k(this.C);
            return;
        }
        if (obj != qdg.M) {
            if (obj == qdg.O) {
                this.r.d = new qfg(new qly(), qlzVar, new qhn());
                return;
            }
            return;
        }
        qer qerVar6 = this.D;
        if (qerVar6 != null) {
            m(qerVar6);
        }
        if (qlzVar == null) {
            this.D = null;
            return;
        }
        qfj qfjVar6 = new qfj(qlzVar);
        this.D = qfjVar6;
        qfjVar6.h(this);
        k(this.D);
    }

    @Override // defpackage.qje, defpackage.qdw
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.t.i.width(), this.t.i.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0361  */
    @Override // defpackage.qje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(android.graphics.Canvas r24, android.graphics.Matrix r25, int r26) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjp.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
