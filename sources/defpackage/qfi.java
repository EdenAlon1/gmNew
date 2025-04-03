package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfi {
    public qer a;
    public qer b;
    public qer c;
    public qer d;
    public qer e;
    public qev f;
    public qev g;
    public qer h;
    public qer i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public qfi(qig qigVar) {
        qhz qhzVar = qigVar.a;
        this.a = qhzVar == null ? null : qhzVar.a();
        qih qihVar = qigVar.b;
        this.b = qihVar == null ? null : qihVar.a();
        qib qibVar = qigVar.c;
        this.c = qibVar == null ? null : qibVar.a();
        qhw qhwVar = qigVar.d;
        this.d = qhwVar == null ? null : qhwVar.a();
        qhw qhwVar2 = qigVar.f;
        qev qevVar = (qev) (qhwVar2 == null ? null : qhwVar2.a());
        this.f = qevVar;
        if (qevVar != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        qhw qhwVar3 = qigVar.g;
        this.g = (qev) (qhwVar3 == null ? null : qhwVar3.a());
        qhy qhyVar = qigVar.e;
        if (qhyVar != null) {
            this.e = qhyVar.a();
        }
        qhw qhwVar4 = qigVar.h;
        if (qhwVar4 != null) {
            this.h = qhwVar4.a();
        } else {
            this.h = null;
        }
        qhw qhwVar5 = qigVar.i;
        if (qhwVar5 != null) {
            this.i = qhwVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        PointF pointF;
        PointF pointF2;
        this.j.reset();
        qer qerVar = this.b;
        if (qerVar != null && (pointF2 = (PointF) qerVar.e()) != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            this.j.preTranslate(pointF2.x, pointF2.y);
        }
        qer qerVar2 = this.d;
        if (qerVar2 != null) {
            float floatValue = qerVar2 instanceof qfj ? ((Float) qerVar2.e()).floatValue() : ((qev) qerVar2).k();
            if (floatValue != 0.0f) {
                this.j.preRotate(floatValue);
            }
        }
        if (this.f != null) {
            float cos = this.g == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.k()) + 90.0f));
            float sin = this.g == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.k()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = cos;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.k.setValues(fArr);
            f();
            float[] fArr2 = this.n;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.l.setValues(fArr2);
            f();
            float[] fArr3 = this.n;
            fArr3[0] = cos;
            fArr3[1] = f;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.m.setValues(fArr3);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            this.j.preConcat(this.m);
        }
        qer qerVar3 = this.c;
        if (qerVar3 != null) {
            qma qmaVar = (qma) qerVar3.e();
            float f2 = qmaVar.a;
            if (f2 != 1.0f || qmaVar.b != 1.0f) {
                this.j.preScale(f2, qmaVar.b);
            }
        }
        qer qerVar4 = this.a;
        if (qerVar4 != null && (((pointF = (PointF) qerVar4.e()) != null && pointF.x != 0.0f) || pointF.y != 0.0f)) {
            this.j.preTranslate(-pointF.x, -pointF.y);
        }
        return this.j;
    }

    public final Matrix b(float f) {
        qer qerVar = this.b;
        PointF pointF = qerVar == null ? null : (PointF) qerVar.e();
        qer qerVar2 = this.c;
        qma qmaVar = qerVar2 == null ? null : (qma) qerVar2.e();
        this.j.reset();
        if (pointF != null) {
            this.j.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (qmaVar != null) {
            double d = f;
            this.j.preScale((float) Math.pow(qmaVar.a, d), (float) Math.pow(qmaVar.b, d));
        }
        qer qerVar3 = this.d;
        if (qerVar3 != null) {
            float floatValue = ((Float) qerVar3.e()).floatValue();
            qer qerVar4 = this.a;
            PointF pointF2 = qerVar4 != null ? (PointF) qerVar4.e() : null;
            this.j.preRotate(floatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.j;
    }

    public final void c(qje qjeVar) {
        qjeVar.k(this.e);
        qjeVar.k(this.h);
        qjeVar.k(this.i);
        qjeVar.k(this.a);
        qjeVar.k(this.b);
        qjeVar.k(this.c);
        qjeVar.k(this.d);
        qjeVar.k(this.f);
        qjeVar.k(this.g);
    }

    public final void d(qem qemVar) {
        qer qerVar = this.e;
        if (qerVar != null) {
            qerVar.h(qemVar);
        }
        qer qerVar2 = this.h;
        if (qerVar2 != null) {
            qerVar2.h(qemVar);
        }
        qer qerVar3 = this.i;
        if (qerVar3 != null) {
            qerVar3.h(qemVar);
        }
        qer qerVar4 = this.a;
        if (qerVar4 != null) {
            qerVar4.h(qemVar);
        }
        qer qerVar5 = this.b;
        if (qerVar5 != null) {
            qerVar5.h(qemVar);
        }
        qer qerVar6 = this.c;
        if (qerVar6 != null) {
            qerVar6.h(qemVar);
        }
        qer qerVar7 = this.d;
        if (qerVar7 != null) {
            qerVar7.h(qemVar);
        }
        qev qevVar = this.f;
        if (qevVar != null) {
            qevVar.h(qemVar);
        }
        qev qevVar2 = this.g;
        if (qevVar2 != null) {
            qevVar2.h(qemVar);
        }
    }

    public final boolean e(Object obj, qlz qlzVar) {
        if (obj == qdg.f) {
            qer qerVar = this.a;
            if (qerVar == null) {
                this.a = new qfj(qlzVar, new PointF());
                return true;
            }
            qerVar.d = qlzVar;
            return true;
        }
        if (obj == qdg.g) {
            qer qerVar2 = this.b;
            if (qerVar2 == null) {
                this.b = new qfj(qlzVar, new PointF());
                return true;
            }
            qerVar2.d = qlzVar;
            return true;
        }
        if (obj == qdg.h) {
            qer qerVar3 = this.b;
            if (qerVar3 instanceof qff) {
                qff qffVar = (qff) qerVar3;
                qlz qlzVar2 = qffVar.e;
                qffVar.e = qlzVar;
                return true;
            }
        }
        if (obj == qdg.i) {
            qer qerVar4 = this.b;
            if (qerVar4 instanceof qff) {
                qff qffVar2 = (qff) qerVar4;
                qlz qlzVar3 = qffVar2.f;
                qffVar2.f = qlzVar;
                return true;
            }
        }
        if (obj == qdg.o) {
            qer qerVar5 = this.c;
            if (qerVar5 == null) {
                this.c = new qfj(qlzVar, new qma());
                return true;
            }
            qerVar5.d = qlzVar;
            return true;
        }
        if (obj == qdg.p) {
            qer qerVar6 = this.d;
            if (qerVar6 == null) {
                this.d = new qfj(qlzVar, Float.valueOf(0.0f));
                return true;
            }
            qerVar6.d = qlzVar;
            return true;
        }
        if (obj == qdg.c) {
            qer qerVar7 = this.e;
            if (qerVar7 == null) {
                this.e = new qfj(qlzVar, 100);
                return true;
            }
            qerVar7.d = qlzVar;
            return true;
        }
        if (obj == qdg.C) {
            qer qerVar8 = this.h;
            if (qerVar8 == null) {
                this.h = new qfj(qlzVar, Float.valueOf(100.0f));
                return true;
            }
            qerVar8.d = qlzVar;
            return true;
        }
        if (obj == qdg.D) {
            qer qerVar9 = this.i;
            if (qerVar9 == null) {
                this.i = new qfj(qlzVar, Float.valueOf(100.0f));
                return true;
            }
            qerVar9.d = qlzVar;
            return true;
        }
        if (obj == qdg.q) {
            if (this.f == null) {
                this.f = new qev(Collections.singletonList(new qlx(Float.valueOf(0.0f))));
            }
            this.f.d = qlzVar;
            return true;
        }
        if (obj != qdg.r) {
            return false;
        }
        if (this.g == null) {
            this.g = new qev(Collections.singletonList(new qlx(Float.valueOf(0.0f))));
        }
        this.g.d = qlzVar;
        return true;
    }
}
