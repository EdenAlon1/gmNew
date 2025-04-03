package defpackage;

import androidx.compose.material3.ThumbElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpn {
    public static final daa a = new daa((byte[]) null);

    public static final void a(boolean z, ffji ffjiVar, hvi hviVar, gpk gpkVar, dwn dwnVar, hfd hfdVar, int i) {
        boolean z2;
        int i2;
        dwn dwnVar2;
        dwn dwnVar3;
        hvi hviVar2;
        hfd b = hfdVar.b(1580463220);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (true != b.E(z2) ? 2 : 4) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hviVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.F(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.E(true) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(gpkVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(dwnVar) ? 524288 : 1048576;
        }
        int i3 = i2;
        if ((599187 & i3) == 599186 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            if (dwnVar == null) {
                b.v(-1480205692);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    R = new dwn();
                    hfmVar.ad(R);
                }
                dwnVar2 = (dwn) R;
                hfmVar.Z();
            } else {
                b.v(783534771);
                ((hfm) b).Z();
                dwnVar2 = dwnVar;
            }
            if (ffjiVar != null) {
                dwnVar3 = dwnVar2;
                hviVar2 = epy.a(gex.a(hvi.e), z2, dwnVar3, null, true, new jjj(2), ffjiVar);
            } else {
                dwnVar3 = dwnVar2;
                hviVar2 = hvi.e;
            }
            int i4 = huo.a;
            int i5 = i3 << 3;
            int i6 = i3 >> 6;
            b(ebs.i(ebs.z(hviVar2, hum.e, 2), 52.0f, 32.0f), z, gpkVar, dwnVar3, glx.c(5, b), b, (i6 & 7168) | (i5 & 112) | (i6 & 896) | (i5 & 57344));
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gpl(z, ffjiVar, hviVar, gpkVar, dwnVar, i);
        }
    }

    public static final void b(hvi hviVar, boolean z, gpk gpkVar, dwn dwnVar, idh idhVar, hfd hfdVar, int i) {
        int i2;
        long j;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4 = z;
        hfd b = hfdVar.b(-1594099146);
        if ((i & 6) == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z4) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(true) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.D(gpkVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.D(dwnVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != b.D(idhVar) ? 524288 : 1048576;
        }
        if ((i2 & 599187) == 599186 && b.I()) {
            b.s();
        } else {
            if (z4) {
                j = gpkVar.b;
                z2 = true;
            } else {
                j = gpkVar.e;
                z2 = false;
            }
            long j3 = z2 ? gpkVar.a : gpkVar.d;
            idh c = glx.c(5, b);
            if (z2) {
                j2 = gpkVar.c;
                z3 = true;
            } else {
                j2 = gpkVar.f;
                z3 = false;
            }
            hvi a2 = dee.a(dek.c(hviVar, 2.0f, j2, c), j, c);
            int i3 = huo.a;
            ipn a3 = dyc.a(hum.a, false);
            int a4 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a2);
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a3, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a4))) {
                Integer valueOf = Integer.valueOf(a4);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            hvi a5 = dee.a(dhc.a(dyi.a.a(hvi.e, hum.d).a(new ThumbElement(dwnVar, z2, gjb.a(2, b))), dwnVar, gkw.a(false, 20.0f, 0L, 4)), j3, idhVar);
            ipn a6 = dyc.a(hum.e, false);
            int a7 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, a5);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a6, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a7))) {
                Integer valueOf2 = Integer.valueOf(a7);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b3, iss.c);
            b.v(1708002413);
            hfmVar.Z();
            b.n();
            b.n();
            z4 = z3;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gpm(hviVar, z4, gpkVar, dwnVar, idhVar, i);
        }
    }
}
