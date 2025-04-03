package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ifq {
    public static long a(ifr ifrVar) {
        return ias.b(((ifm) ifrVar).b.a());
    }

    public static long b(ifr ifrVar) {
        return ((ifm) ifrVar).b.a();
    }

    public static long c(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ void d(ifr ifrVar, long j, float f, float f2, long j2, long j3, ifs ifsVar, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        ifrVar.A(j, f, f2, j4, (i & 32) != 0 ? c(ifrVar.b(), j4) : j3, ifsVar);
    }

    public static /* synthetic */ void e(ifr ifrVar, long j, float f, long j2, ifs ifsVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            f = iar.b(ifrVar.b()) / 2.0f;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            j2 = ifrVar.a();
        }
        ifrVar.w(j, f2, j2, (i2 & 8) != 0 ? 1.0f : 0.0f, (i2 & 16) != 0 ? ifu.a : ifsVar, (i2 & 64) != 0 ? 3 : i);
    }

    public static /* synthetic */ void g(ifr ifrVar, ibq ibqVar, long j, long j2, float f, float f2, int i) {
        float f3 = (i & 64) != 0 ? 1.0f : f2;
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        ifrVar.E(ibqVar, j, j2, f, f3);
    }

    public static /* synthetic */ void h(ifr ifrVar, icv icvVar, long j, ifs ifsVar, int i) {
        if ((i & 8) != 0) {
            ifsVar = ifu.a;
        }
        ifrVar.G(icvVar, j, (i & 4) != 0 ? 1.0f : 0.0f, ifsVar);
    }

    public static /* synthetic */ void i(ifr ifrVar, ibq ibqVar, long j, long j2, float f, ifs ifsVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        ifrVar.y(ibqVar, j3, (i2 & 4) != 0 ? c(ifrVar.b(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? ifu.a : ifsVar, (i2 & 64) != 0 ? 3 : i);
    }

    public static /* synthetic */ void j(ifr ifrVar, ibq ibqVar, long j, long j2, long j3, ifs ifsVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = c(ifrVar.b(), j);
        }
        if ((i & 8) != 0) {
            j3 = 0;
        }
        float f = (i & 16) != 0 ? 1.0f : 0.0f;
        if ((i & 32) != 0) {
            ifsVar = ifu.a;
        }
        ifrVar.H(ibqVar, j, j2, j3, f, ifsVar);
    }

    public static /* synthetic */ void k(ifr ifrVar, long j, long j2, long j3, long j4, ifs ifsVar, float f, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = c(ifrVar.b(), j2);
        }
        if ((i & 8) != 0) {
            j4 = 0;
        }
        if ((i & 16) != 0) {
            ifsVar = ifu.a;
        }
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        ifrVar.I(j, j2, j3, j4, ifsVar, f);
    }

    public static /* synthetic */ void l(ifr ifrVar, ich ichVar, long j, long j2, float f, ibx ibxVar, int i, int i2) {
        long b = (i2 & 4) != 0 ? (ichVar.b() & 4294967295L) | (ichVar.c() << 32) : j;
        ifrVar.C(ichVar, b, (i2 & 16) != 0 ? b : j2, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? ifu.a : null, (i2 & 128) != 0 ? null : ibxVar, (i2 & 256) != 0 ? 3 : 0, (((i2 & 512) == 0 ? 1 : 0) ^ 1) | i);
    }

    public static /* synthetic */ void m(ifr ifrVar, long j, long j2, long j3, float f, int i, int i2) {
        float f2;
        ifr ifrVar2;
        long j4;
        long j5;
        long j6;
        int i3 = (i2 & 256) != 0 ? 3 : i;
        float f3 = (i2 & 64) != 0 ? 1.0f : 0.0f;
        if ((i2 & 8) != 0) {
            f2 = 0.0f;
            j4 = j;
            j5 = j2;
            j6 = j3;
            ifrVar2 = ifrVar;
        } else {
            f2 = f;
            ifrVar2 = ifrVar;
            j4 = j;
            j5 = j2;
            j6 = j3;
        }
        ifrVar2.F(j4, j5, j6, f2, f3, i3);
    }

    public static /* synthetic */ void n(ifr ifrVar, icv icvVar, ibq ibqVar, float f, ifs ifsVar, int i) {
        if ((i & 8) != 0) {
            ifsVar = ifu.a;
        }
        ifs ifsVar2 = ifsVar;
        int i2 = (i & 32) != 0 ? 3 : 0;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        ifrVar.x(icvVar, ibqVar, f, ifsVar2, i2);
    }
}
