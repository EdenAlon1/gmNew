package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fug {
    public static final inw a = new inw();
    public static final irk b = new irk();

    public static final void a(hvi hviVar, long j, long j2, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b2 = hfdVar.b(1298144073);
        if (i3 == 0) {
            i2 = (true != b2.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.C(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(null) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            b2.v(-1273598829);
            idh c = glx.c(5, b2);
            hfm hfmVar = (hfm) b2;
            hfmVar.Z();
            hvi a2 = dee.a(ebs.a(hviVar, 6.0f, 6.0f), j, c).a(hvi.e);
            int i4 = huo.a;
            ipn a3 = ebm.a(dxu.e, hum.n, b2, 54);
            int a4 = hey.a(b2);
            hqb ai = hfmVar.ai();
            hvi b3 = huz.b(b2, a2);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b2.x();
            if (hfmVar.z) {
                b2.j(ffixVar);
            } else {
                b2.z();
            }
            hlc.b(b2, a3, iss.e);
            hlc.b(b2, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b2.h(valueOf, ffjmVar);
            }
            hlc.b(b2, b3, iss.c);
            b2.v(-1326041597);
            hfmVar.Z();
            b2.n();
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fuc(hviVar, j, j2, i);
        }
    }
}
