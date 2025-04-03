package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qef implements qee, qem, qec {
    private final String b;
    private final qdb c;
    private final boolean d;
    private final boolean e;
    private final qer f;
    private final qer g;
    private final qer h;
    private final qer i;
    private final qer j;
    private final qer k;
    private final qer l;
    private boolean n;
    private final int o;
    private final Path a = new Path();
    private final qdt m = new qdt();

    public qef(qdb qdbVar, qje qjeVar, qir qirVar) {
        this.c = qdbVar;
        this.b = qirVar.a;
        int i = qirVar.k;
        this.o = i;
        this.d = qirVar.i;
        this.e = qirVar.j;
        qer a = qirVar.b.a();
        this.f = a;
        qer a2 = qirVar.c.a();
        this.g = a2;
        qer a3 = qirVar.d.a();
        this.h = a3;
        qer a4 = qirVar.f.a();
        this.j = a4;
        qer a5 = qirVar.h.a();
        this.l = a5;
        if (i == 1) {
            this.i = qirVar.e.a();
            this.k = qirVar.g.a();
        } else {
            this.i = null;
            this.k = null;
        }
        qjeVar.k(a);
        qjeVar.k(a2);
        qjeVar.k(a3);
        qjeVar.k(a4);
        qjeVar.k(a5);
        if (i == 1) {
            qjeVar.k(this.i);
            qjeVar.k(this.k);
        }
        a.h(this);
        a2.h(this);
        a3.h(this);
        a4.h(this);
        a5.h(this);
        if (i == 1) {
            this.i.h(this);
            this.k.h(this);
        }
    }

    @Override // defpackage.qhr
    public final void a(Object obj, qlz qlzVar) {
        qer qerVar;
        qer qerVar2;
        qer qerVar3;
        if (obj == qdg.w) {
            qerVar = this.f;
        } else if (obj == qdg.x) {
            qerVar = this.h;
        } else if (obj == qdg.n) {
            qerVar = this.g;
        } else {
            if (obj == qdg.y && (qerVar3 = this.i) != null) {
                qerVar3.d = qlzVar;
                return;
            }
            if (obj == qdg.z) {
                qerVar = this.j;
            } else if (obj == qdg.A && (qerVar2 = this.k) != null) {
                qerVar2.d = qlzVar;
                return;
            } else if (obj != qdg.B) {
                return;
            } else {
                qerVar = this.l;
            }
        }
        qerVar.d = qlzVar;
    }

    @Override // defpackage.qem
    public final void d() {
        this.n = false;
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
                    this.m.a(qelVar);
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
        float f;
        int i;
        float f2;
        float f3;
        float sin;
        double d;
        float f4;
        float f5;
        int i2;
        float f6;
        double d2;
        float f7;
        double d3;
        float f8;
        float f9;
        int i3;
        double d4;
        if (this.n) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.n = true;
            return this.a;
        }
        int i4 = this.o;
        if (i4 == 0) {
            throw null;
        }
        if (i4 != 1) {
            int floor = (int) Math.floor(((Float) this.f.e()).floatValue());
            double floatValue = ((Float) this.h.e()).floatValue();
            qer qerVar = this.l;
            double radians = Math.toRadians(floatValue - 90.0d);
            float floatValue2 = ((Float) qerVar.e()).floatValue() / 100.0f;
            float floatValue3 = ((Float) this.j.e()).floatValue();
            double d5 = floatValue3;
            float cos = (float) (d5 * Math.cos(radians));
            float sin2 = (float) (d5 * Math.sin(radians));
            this.a.moveTo(cos, sin2);
            double d6 = floor;
            double d7 = (float) (6.283185307179586d / d6);
            double d8 = radians + d7;
            double ceil = Math.ceil(d6);
            int i5 = 0;
            while (i5 < ceil) {
                double d9 = d8;
                float cos2 = (float) (Math.cos(d8) * d5);
                float sin3 = (float) (d5 * Math.sin(d8));
                if (floatValue2 != 0.0f) {
                    d4 = ceil;
                    float f10 = sin2;
                    double atan2 = (float) (Math.atan2(sin2, cos) - 1.5707963267948966d);
                    i3 = i5;
                    double atan22 = (float) (Math.atan2(sin3, cos2) - 1.5707963267948966d);
                    float f11 = floatValue3 * floatValue2 * 0.25f;
                    this.a.cubicTo(cos - (((float) Math.cos(atan2)) * f11), f10 - (f11 * ((float) Math.sin(atan2))), cos2 + (((float) Math.cos(atan22)) * f11), sin3 + (f11 * ((float) Math.sin(atan22))), cos2, sin3);
                    cos = cos2;
                    sin2 = sin3;
                } else {
                    i3 = i5;
                    sin2 = sin3;
                    d4 = ceil;
                    cos = cos2;
                    this.a.lineTo(cos, sin2);
                }
                d8 = d9 + d7;
                i5 = i3 + 1;
                ceil = d4;
            }
            PointF pointF = (PointF) this.g.e();
            this.a.offset(pointF.x, pointF.y);
            this.a.close();
        } else {
            double d10 = -1.5707963267948966d;
            float floatValue4 = ((Float) this.f.e()).floatValue();
            double floatValue5 = ((Float) this.h.e()).floatValue();
            double d11 = floatValue4;
            boolean z = this.e;
            float f12 = (float) (6.283185307179586d / d11);
            double radians2 = Math.toRadians(floatValue5 - 90.0d);
            if (z) {
                f12 = -f12;
            }
            float f13 = floatValue4 - ((int) floatValue4);
            int i6 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
            float f14 = f12 / 2.0f;
            if (i6 != 0) {
                radians2 += (1.0f - f13) * f14;
            }
            float floatValue6 = ((Float) this.j.e()).floatValue();
            float floatValue7 = ((Float) this.i.e()).floatValue();
            qer qerVar2 = this.k;
            float floatValue8 = qerVar2 != null ? ((Float) qerVar2.e()).floatValue() / 100.0f : 0.0f;
            float floatValue9 = ((Float) this.l.e()).floatValue() / 100.0f;
            if (i6 != 0) {
                float f15 = f12 * f13;
                f3 = 2.0f;
                f5 = floatValue7 + ((floatValue6 - floatValue7) * f13);
                f = f13;
                i = i6;
                double d12 = f5;
                double cos3 = d12 * Math.cos(radians2);
                f2 = f12;
                double sin4 = d12 * Math.sin(radians2);
                f4 = (float) cos3;
                sin = (float) sin4;
                this.a.moveTo(f4, sin);
                d = radians2 + (f15 / 2.0f);
            } else {
                f = f13;
                i = i6;
                f2 = f12;
                double d13 = radians2;
                f3 = 2.0f;
                double d14 = floatValue6;
                float cos4 = (float) (Math.cos(d13) * d14);
                sin = (float) (d14 * Math.sin(d13));
                this.a.moveTo(cos4, sin);
                d = d13 + f14;
                f4 = cos4;
                f5 = 0.0f;
            }
            double ceil2 = Math.ceil(d11);
            double d15 = ceil2 + ceil2;
            double d16 = d;
            int i7 = 0;
            boolean z2 = false;
            while (true) {
                double d17 = i7;
                if (d17 >= d15) {
                    break;
                }
                double d18 = d10;
                float f16 = true != z2 ? floatValue7 : floatValue6;
                if (f5 == 0.0f || d17 != d15 - 2.0d) {
                    i2 = i7;
                    f6 = f14;
                } else {
                    i2 = i7;
                    f6 = (f2 * f) / f3;
                }
                if (f5 == 0.0f || d17 != d15 - 1.0d) {
                    d2 = d17;
                    f7 = f16;
                } else {
                    d2 = d17;
                    f7 = f5;
                }
                double d19 = f7;
                double cos5 = d19 * Math.cos(d16);
                float f17 = f5;
                float f18 = f14;
                double sin5 = d19 * Math.sin(d16);
                float f19 = (float) cos5;
                float f20 = (float) sin5;
                if (floatValue8 == 0.0f && floatValue9 == 0.0f) {
                    this.a.lineTo(f19, f20);
                    f9 = f19;
                    f8 = f20;
                    d3 = d15;
                } else {
                    d3 = d15;
                    double atan23 = (float) (Math.atan2(sin, f4) + d18);
                    float cos6 = (float) Math.cos(atan23);
                    float sin6 = (float) Math.sin(atan23);
                    float f21 = f4;
                    float f22 = sin;
                    f8 = f20;
                    double atan24 = (float) (Math.atan2(f20, f19) + d18);
                    float cos7 = (float) Math.cos(atan24);
                    float sin7 = (float) Math.sin(atan24);
                    float f23 = true != z2 ? floatValue9 : floatValue8;
                    float f24 = true != z2 ? floatValue8 : floatValue9;
                    float f25 = (true != z2 ? floatValue6 : floatValue7) * f23 * 0.47829f;
                    float f26 = cos6 * f25;
                    float f27 = f25 * sin6;
                    float f28 = f16 * f24 * 0.47829f;
                    float f29 = cos7 * f28;
                    float f30 = f28 * sin7;
                    if (i != 0) {
                        if (i2 == 0) {
                            f26 *= f;
                            f27 *= f;
                        } else if (d2 == d3 - 1.0d) {
                            f29 *= f;
                            f30 *= f;
                        }
                    }
                    f9 = f19;
                    this.a.cubicTo(f21 - f26, f22 - f27, f19 + f29, f8 + f30, f9, f8);
                }
                d16 += f6;
                z2 = !z2;
                i7 = i2 + 1;
                f14 = f18;
                d10 = d18;
                d15 = d3;
                f5 = f17;
                f4 = f9;
                sin = f8;
            }
            PointF pointF2 = (PointF) this.g.e();
            this.a.offset(pointF2.x, pointF2.y);
            this.a.close();
        }
        this.a.close();
        this.m.b(this.a);
        this.n = true;
        return this.a;
    }
}
