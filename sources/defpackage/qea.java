package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qea extends qds {
    private final String d;
    private final boolean e;
    private final cno f;
    private final cno g;
    private final RectF h;
    private final int i;
    private final qer j;
    private final qer k;
    private final qer l;
    private qfj m;
    private final int n;

    public qea(qdb qdbVar, qje qjeVar, qio qioVar) {
        super(qdbVar, qjeVar, qiz.a(qioVar.l), qja.a(qioVar.m), qioVar.g, qioVar.c, qioVar.f, qioVar.h, qioVar.i);
        this.f = new cno();
        this.g = new cno();
        this.h = new RectF();
        this.d = qioVar.a;
        this.n = qioVar.k;
        this.e = qioVar.j;
        this.i = (int) (qdbVar.a.a() / 32.0f);
        qer a = qioVar.b.a();
        this.j = a;
        a.h(this);
        qjeVar.k(a);
        qer a2 = qioVar.d.a();
        this.k = a2;
        a2.h(this);
        qjeVar.k(a2);
        qer a3 = qioVar.e.a();
        this.l = a3;
        a3.h(this);
        qjeVar.k(a3);
    }

    private final int h() {
        float f = this.k.c;
        float f2 = this.i;
        int round = Math.round(f * f2);
        int round2 = Math.round(this.l.c * f2);
        int round3 = Math.round(this.j.c * this.i);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private final int[] i(int[] iArr) {
        qfj qfjVar = this.m;
        if (qfjVar != null) {
            Integer[] numArr = (Integer[]) qfjVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length == length2) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.qds, defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        super.a(obj, qlzVar);
        if (obj == qdg.L) {
            qfj qfjVar = this.m;
            if (qfjVar != null) {
                this.a.m(qfjVar);
            }
            if (qlzVar == null) {
                this.m = null;
                return;
            }
            qfj qfjVar2 = new qfj(qlzVar);
            this.m = qfjVar2;
            qfjVar2.h(this);
            this.a.k(this.m);
        }
    }

    @Override // defpackage.qds, defpackage.qdw
    public final void b(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        Shader radialGradient;
        if (this.e) {
            return;
        }
        c(this.h, matrix, false);
        if (this.n == 1) {
            long h = h();
            shader = (LinearGradient) this.f.d(h);
            if (shader == null) {
                PointF pointF = (PointF) this.k.e();
                PointF pointF2 = (PointF) this.l.e();
                qim qimVar = (qim) this.j.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i(qimVar.b), qimVar.a, Shader.TileMode.CLAMP);
                this.f.h(h, radialGradient);
                shader = radialGradient;
            }
            shader.setLocalMatrix(matrix);
            this.b.setShader(shader);
            super.b(canvas, matrix, i);
        }
        long h2 = h();
        shader = (RadialGradient) this.g.d(h2);
        if (shader == null) {
            PointF pointF3 = (PointF) this.k.e();
            PointF pointF4 = (PointF) this.l.e();
            qim qimVar2 = (qim) this.j.e();
            int[] i2 = i(qimVar2.b);
            float[] fArr = qimVar2.a;
            radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r9, pointF4.y - r10), i2, fArr, Shader.TileMode.CLAMP);
            this.g.h(h2, radialGradient);
            shader = radialGradient;
        }
        shader.setLocalMatrix(matrix);
        this.b.setShader(shader);
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.qdu
    public final String g() {
        return this.d;
    }
}
