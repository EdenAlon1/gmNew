package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iuv extends iqk implements ivn, ivq {
    private static final ffji f = iur.a;
    private cof g;
    private cop h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final iqj l;
    public cof m;

    public iuv() {
        ffji ffjiVar = iqm.a;
        this.l = new ipb(this);
    }

    protected static final void T(iwi iwiVar) {
        isa isaVar;
        iwi iwiVar2 = iwiVar.u;
        if (!ffkj.e(iwiVar2 != null ? iwiVar2.r : null, iwiVar.r)) {
            ((ivm) iwiVar.aa()).w.e();
            return;
        }
        isb h = iwiVar.aa().h();
        if (h == null || (isaVar = ((ivm) h).w) == null) {
            return;
        }
        isaVar.e();
    }

    public abstract long I();

    public abstract ioc J();

    public abstract ipo K();

    @Override // defpackage.ivn
    public abstract iui L();

    public abstract iuv M();

    public abstract iuv N();

    public final void O(ixj ixjVar) {
        long j;
        char c;
        long j2;
        iuv N;
        iuv N2;
        ixh ixhVar;
        if (this.k || ixjVar.a.n() == null) {
            return;
        }
        cof cofVar = this.g;
        if (cofVar == null) {
            cofVar = new cof(null);
            this.g = cofVar;
        }
        cof cofVar2 = this.m;
        if (cofVar2 == null) {
            cofVar2 = new cof(null);
            this.m = cofVar2;
        }
        Object[] objArr = cofVar2.b;
        float[] fArr = cofVar2.c;
        long[] jArr = cofVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            j = 255;
            while (true) {
                long j3 = jArr[i];
                c = 7;
                j2 = -9187201950435737472L;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((j3 & 255) < 128) {
                            int i4 = (i << 3) + i3;
                            cofVar.b(objArr[i4], fArr[i4]);
                        }
                        j3 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
        }
        cofVar2.a();
        iwx iwxVar = L().l;
        if (iwxVar != null && (ixhVar = ((AndroidComposeView) iwxVar).v) != null) {
            ixhVar.d(ixjVar, f, new ius(ixjVar, this));
        }
        Object[] objArr2 = cofVar2.b;
        long[] jArr2 = cofVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                long j4 = jArr2[i5];
                if ((((~j4) << c) & j4 & j2) != j2) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j4 & j) < 128) {
                            iqt iqtVar = (iqt) objArr2[(i5 << 3) + i7];
                            if (!cofVar.d(iqtVar) && (N = N()) != null) {
                                while (true) {
                                    cof cofVar3 = N.m;
                                    if ((cofVar3 == null || !cofVar3.d(iqtVar)) && (N2 = N.N()) != null) {
                                        N = N2;
                                    }
                                }
                                cop copVar = N.h;
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length2) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        cofVar.a();
    }

    public final void P(ipo ipoVar) {
        O(new ixj(ipoVar, this));
    }

    public abstract void Q();

    @Override // defpackage.ivq
    public final void R(boolean z) {
        iuv N = N();
        iui L = N != null ? N.L() : null;
        if (ffkj.e(L, L())) {
            this.i = z;
        } else {
            if ((L == null || L.aD() != 3) && (L == null || L.aD() != 4)) {
                return;
            }
            this.i = z;
        }
    }

    public abstract boolean S();

    @Override // defpackage.jzx
    public final /* synthetic */ float ef(long j) {
        return jzw.a(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float eg(float f2) {
        return jzm.a(this, f2);
    }

    @Override // defpackage.ipr
    public final int eh(imq imqVar) {
        int s;
        if (!S() || (s = s(imqVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = imqVar instanceof irj;
        long j = this.e;
        return s + (z ? kaa.a(j) : kaa.b(j));
    }

    @Override // defpackage.ipq
    public final /* synthetic */ ipo ei(int i, int i2, Map map, ffji ffjiVar) {
        return ipp.a(this, i, i2, map, ffjiVar);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float ek(int i) {
        return jzm.b(this, i);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float el(long j) {
        return jzm.c(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float em(float f2) {
        return jzm.d(this, f2);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int en(long j) {
        return jzm.e(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int eo(float f2) {
        return jzm.f(this, f2);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long ep(long j) {
        return jzm.g(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long eq(long j) {
        return jzm.h(this, j);
    }

    @Override // defpackage.jzx
    public final /* synthetic */ long er(float f2) {
        return jzw.b(this, f2);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long es(float f2) {
        return jzm.i(this, f2);
    }

    @Override // defpackage.ipq
    public final ipo et(int i, int i2, Map map, ffji ffjiVar, ffji ffjiVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            imn.c(a.x(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new iut(i, i2, map, ffjiVar, ffjiVar2, this);
    }

    @Override // defpackage.iny
    public boolean eu() {
        return false;
    }

    public abstract int s(imq imqVar);
}
