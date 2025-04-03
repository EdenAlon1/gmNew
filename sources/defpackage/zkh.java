package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkh {
    public static final void a(final hvi hviVar, final zkk zkkVar, final hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(950396217);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(zkkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.D(hziVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            dopp.a(zkf.a, null, null, null, null, null, null, null, null, false, null, null, hpx.d(740258611, new zkg(zkkVar, hviVar, hziVar), b), hfdVar2, 805306368, 384, 3582);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zkd
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hvi hviVar2 = hvi.this;
                    zkk zkkVar2 = zkkVar;
                    int i4 = i;
                    zkh.a(hviVar2, zkkVar2, hziVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final zkk zkkVar, hvi hviVar, hzi hziVar, hfd hfdVar, final int i) {
        int i2;
        final hvi hviVar2;
        final hzi hziVar2;
        hfd b = hfdVar.b(745607218);
        if ((i & 6) == 0) {
            i2 = (true != b.D(zkkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i3 & 147) == 146 && b.I()) {
            b.s();
            hviVar2 = hviVar;
            hziVar2 = hziVar;
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                hviVar2 = hvi.e;
                hziVar2 = hzi.a;
            } else {
                b.s();
                hviVar2 = hviVar;
                hziVar2 = hziVar;
            }
            b.l();
            hik hikVar = dook.a;
            dooi dooiVar = (dooi) b.e(dook.a);
            b.v(-575944014);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffix() { // from class: zkb
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return false;
                    }
                };
                hfmVar.ad(R);
            }
            ffix ffixVar = (ffix) R;
            hfmVar.Z();
            boolean z = dooiVar.a;
            ffix ffixVar2 = dooiVar.b;
            ffix ffixVar3 = dooiVar.c;
            ffix ffixVar4 = dooiVar.d;
            ffix ffixVar5 = dooiVar.e;
            ffix ffixVar6 = dooiVar.f;
            ffix ffixVar7 = dooiVar.g;
            ffix ffixVar8 = dooiVar.h;
            ffix ffixVar9 = dooiVar.j;
            ffix ffixVar10 = dooiVar.k;
            ffix ffixVar11 = dooiVar.l;
            ffix ffixVar12 = dooiVar.m;
            ffix ffixVar13 = dooiVar.n;
            ffix ffixVar14 = dooiVar.o;
            ffix ffixVar15 = dooiVar.p;
            ffix ffixVar16 = dooiVar.q;
            ffix ffixVar17 = dooiVar.r;
            ffix ffixVar18 = dooiVar.s;
            ffix ffixVar19 = dooiVar.t;
            ffix ffixVar20 = dooiVar.u;
            ffix ffixVar21 = dooiVar.v;
            ffixVar.getClass();
            hfz.a(hikVar.c(new dooi(ffixVar2, ffixVar3, ffixVar4, ffixVar5, ffixVar6, ffixVar7, ffixVar8, ffixVar, ffixVar9, ffixVar10, ffixVar11, ffixVar12, ffixVar13, ffixVar14, ffixVar15, ffixVar16, ffixVar17, ffixVar18, ffixVar19, ffixVar20, ffixVar21)), hpx.d(1094501618, new zke(zkkVar, hviVar2, hziVar2), b), b, 56);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zkc
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zkk zkkVar2 = zkk.this;
                    hvi hviVar3 = hviVar2;
                    int i4 = i;
                    zkh.b(zkkVar2, hviVar3, hziVar2, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
