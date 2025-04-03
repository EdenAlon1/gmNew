package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpf {
    public static final void a(gpi gpiVar, ffjn ffjnVar, hvi hviVar, boolean z, boolean z2, boolean z3, ffjn ffjnVar2, hfd hfdVar, int i) {
        int i2;
        hvi hviVar2;
        hvi a;
        boolean z4;
        int i3 = i & 6;
        hfd b = hfdVar.b(-402577235);
        if (i3 == 0) {
            i2 = (true != b.D(gpiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffjnVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != b.E(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != b.E(z2) ? 8192 : 16384;
        }
        int i5 = i4 | 196608;
        if ((1572864 & i) == 0) {
            i5 |= true != b.F(ffjnVar2) ? 524288 : 1048576;
        }
        if ((599187 & i5) == 599186 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            z4 = z3;
        } else {
            hviVar2 = hvi.e;
            boolean z5 = b.e(jdr.j) == kah.b;
            a = dpj.a(hviVar2, r14.d, dqs.b, gpiVar.a() == gpj.c, null, r14.o(), new gym(gpiVar.b, null), false, 32);
            int i6 = huo.a;
            ipn a2 = dyc.a(hum.a, true);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i7 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a2, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar);
            }
            hlc.b(b, b2, iss.c);
            hvi b3 = dyi.a.b(hvi.e);
            int i8 = (i5 << 6) & 7168;
            ipn a4 = ebm.a(dxu.a, hum.m, b, 0);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b4 = huz.b(b, b3);
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
            } else {
                b.z();
            }
            hlc.b(b, a4, iss.e);
            hlc.b(b, ai2, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a5))) {
                Integer valueOf2 = Integer.valueOf(a5);
                hfmVar.ad(valueOf2);
                b.h(valueOf2, ffjmVar2);
            }
            hlc.b(b, b4, iss.c);
            ffjnVar.a(ebr.a, b, Integer.valueOf(((i8 >> 6) & 112) | 6));
            b.n();
            gzl gzlVar = gpiVar.b;
            boolean z6 = (i5 & 7168) == 2048;
            hve hveVar = hvi.e;
            dqs dqsVar = dqs.b;
            boolean E = b.E(z5) | z6;
            boolean z7 = (57344 & i5) == 16384;
            int i9 = i5;
            boolean z8 = (i5 & 14) == 4;
            Object R = hfmVar.R();
            if ((z8 | E | z7) || R == hfc.a) {
                R = new gpd(gpiVar, z, z5, z2);
                hfmVar.ad(R);
            }
            hvi a6 = gyu.a(hveVar, gzlVar, dqsVar, (ffjm) R);
            int i10 = (i9 >> 9) & 7168;
            ipn a7 = ebm.a(dxu.a, hum.m, b, 0);
            int a8 = hey.a(b);
            hqb ai3 = hfmVar.ai();
            hvi b5 = huz.b(b, a6);
            ffix ffixVar3 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar3);
            } else {
                b.z();
            }
            hlc.b(b, a7, iss.e);
            hlc.b(b, ai3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a8))) {
                Integer valueOf3 = Integer.valueOf(a8);
                hfmVar.ad(valueOf3);
                b.h(valueOf3, ffjmVar3);
            }
            hlc.b(b, b5, iss.c);
            ffjnVar2.a(ebr.a, b, Integer.valueOf(((i10 >> 6) & 112) | 6));
            b.n();
            b.n();
            z4 = true;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new gpe(gpiVar, ffjnVar, hviVar2, z, z2, z4, ffjnVar2, i);
        }
    }
}
