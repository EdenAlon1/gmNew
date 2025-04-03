package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbbt implements dazo {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/debug/cloudstore/analysisui/RpcPlaygroundPage");
    public final dbcd b;
    private final String c = "RPC playground";

    public dbbt(dbcd dbcdVar) {
        this.b = dbcdVar;
    }

    public static final String c(hho hhoVar) {
        return (String) hhoVar.a();
    }

    @Override // defpackage.dazo
    public final String a() {
        return this.c;
    }

    @Override // defpackage.dazo
    public final void b(hfd hfdVar) {
        hvi d;
        hfdVar.v(-1436333741);
        hfdVar.v(-1580138475);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            hic hicVar = new hic("", hla.a);
            hfdVar.y(hicVar);
            f = hicVar;
        }
        hho hhoVar = (hho) f;
        hfdVar.o();
        d = ebs.d(eba.j(hvi.e, 0.0f, 10.0f, 0.0f, 0.0f, 13), 1.0f);
        int i = huo.a;
        ipn a2 = dyo.a(dxu.c, hum.k, hfdVar, 48);
        int a3 = hey.a(hfdVar);
        hgb c = hfdVar.c();
        hvi b = huz.b(hfdVar, d);
        int i2 = ist.a;
        ffix ffixVar = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a2, iss.e);
        hlc.b(hfdVar, c, iss.d);
        ffjm ffjmVar = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
            Integer valueOf = Integer.valueOf(a3);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar);
        }
        hlc.b(hfdVar, b, iss.c);
        d(hhoVar, hfdVar, 0);
        fjp.a(null, 0L, 0.0f, hfdVar, 0, 15);
        e((String) hhoVar.a(), hfdVar, 0);
        hfdVar.n();
        hfdVar.o();
    }

    public final void d(final hho hhoVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        long f;
        long f2;
        long f3;
        long f4;
        long f5;
        long f6;
        long f7;
        long f8;
        long f9;
        long f10;
        long f11;
        long f12;
        long f13;
        long f14;
        long f15;
        hhoVar.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(1912339816);
        if (i3 == 0) {
            i2 = i | (true != b.D(hhoVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(this) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = hgs.a(ffhe.a, b);
                hfmVar.ad(R);
            }
            final ffsk ffskVar = (ffsk) R;
            int i4 = huo.a;
            hun hunVar = hum.k;
            c = dix.c(hvi.e, dix.a(0, b, 0, 1), false & ((r6 & 8) == 0), (r6 & 2) != 0, true);
            ipn a2 = dyo.a(dxu.c, hunVar, b, 48);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, c);
            int i5 = ist.a;
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
            b.v(1100835237);
            boolean F = b.F(ffskVar);
            boolean z = (i2 & 14) == 4;
            boolean F2 = F | z | b.F(this);
            Object R2 = hfmVar.R();
            if (F2 || R2 == hfc.a) {
                R2 = new ffix() { // from class: dbbk
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        axol.k(ffsk.this, null, new dbbp(hhoVar, this, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            boolean z2 = z;
            dwfj.a((ffix) R2, jfw.a(hvi.e, "exportUserDataReferenceButton"), false, null, null, null, null, null, dbak.a, b, 805306416, 508);
            hvi g = ebs.g(hvi.e, 80.0f);
            ipn a4 = ebm.a(dxu.a, hum.m, b, 0);
            int a5 = hey.a(b);
            hqb ai2 = hfmVar.ai();
            hvi b3 = huz.b(b, g);
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
            hlc.b(b, b3, iss.c);
            b.v(-1642761420);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                hic hicVar = new hic("testCorrelationId", hla.a);
                hfmVar.ad(hicVar);
                R3 = hicVar;
            }
            final hho hhoVar2 = (hho) R3;
            hfmVar.Z();
            String c2 = c(hhoVar2);
            hvi a6 = jfw.a(ebs.d(hvi.e, 0.5f), "correlationIdTextField");
            f = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), 0.3f, ibw.f(fla.a(b).l()));
            f2 = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), ((Number) b.e(fiz.a)).floatValue(), ibw.f(((ibw) b.e(fjb.a)).i));
            f3 = iby.f(ibw.d(f2), ibw.c(f2), ibw.b(f2), fix.a(b), ibw.f(f2));
            long h = fla.a(b).h();
            long b4 = fla.a(b).b();
            f4 = iby.f(ibw.d(r10), ibw.c(r10), ibw.b(r10), fix.b(b), ibw.f(fla.a(b).h()));
            f5 = iby.f(ibw.d(r10), ibw.c(r10), ibw.b(r10), 0.42f, ibw.f(fla.a(b).g()));
            f6 = iby.f(ibw.d(f5), ibw.c(f5), ibw.b(f5), fix.a(b), ibw.f(f5));
            long b5 = fla.a(b).b();
            f7 = iby.f(ibw.d(r12), ibw.c(r12), ibw.b(r12), 0.54f, ibw.f(fla.a(b).g()));
            f8 = iby.f(ibw.d(f7), ibw.c(f7), ibw.b(f7), fix.a(b), ibw.f(f7));
            f9 = iby.f(ibw.d(r7), ibw.c(r7), ibw.b(r7), 0.54f, ibw.f(fla.a(b).g()));
            f10 = iby.f(ibw.d(f9), ibw.c(f9), ibw.b(f9), fix.a(b), ibw.f(f9));
            long b6 = fla.a(b).b();
            f11 = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), fix.b(b), ibw.f(fla.a(b).h()));
            f12 = iby.f(ibw.d(r8), ibw.c(r8), ibw.b(r8), fix.c(b), ibw.f(fla.a(b).g()));
            f13 = iby.f(ibw.d(f12), ibw.c(f12), ibw.b(f12), fix.a(b), ibw.f(f12));
            long b7 = fla.a(b).b();
            f14 = iby.f(ibw.d(r5), ibw.c(r5), ibw.b(r5), fix.c(b), ibw.f(fla.a(b).g()));
            f15 = iby.f(ibw.d(f14), ibw.c(f14), ibw.b(f14), fix.a(b), ibw.f(f14));
            fjj fjjVar = new fjj(f2, f3, h, b4, f4, f5, b5, f6, f7, f8, f7, f9, f10, b6, f, f11, f12, f13, b7, f14, f15);
            b.v(-1642757350);
            Object R4 = hfmVar.R();
            if (R4 == hfc.a) {
                R4 = new ffji() { // from class: dbbl
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        hho.this.b(str);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R4);
            }
            hfmVar.Z();
            fpn.d(c2, (ffji) R4, a6, false, null, dbak.b, null, null, null, 0, 0, null, fjjVar, b, 1573296, 0);
            b = b;
            b.v(-1642745414);
            boolean F3 = b.F(ffskVar) | z2 | b.F(this);
            Object R5 = hfmVar.R();
            if (F3 || R5 == hfc.a) {
                R5 = new ffix() { // from class: dbbm
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        axol.k(ffsk.this, null, new dbbq(hhoVar, this, hhoVar2, null), 3);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R5);
            }
            hfmVar.Z();
            dwfj.a((ffix) R5, jfw.a(hvi.e, "getConversationByCorrelationIdButton"), false, null, null, null, null, null, dbak.c, b, 805306416, 508);
            b.n();
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbbn
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbbt dbbtVar = dbbt.this;
                    int i6 = i;
                    dbbtVar.d(hhoVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public final void e(final String str, hfd hfdVar, final int i) {
        int i2;
        hfd hfdVar2;
        str.getClass();
        int i3 = i & 6;
        hfd b = hfdVar.b(131156580);
        if (i3 == 0) {
            i2 = (true != b.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            hfdVar2 = b;
        } else {
            hfdVar2 = b;
            fnd.a(eba.f(hvi.e, 20.0f, 10.0f, 20.0f, 10.0f), null, dbak.d, null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, hpx.d(1703650082, new dbbs(str), b), hfdVar2, 384, 12582912, 131066);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dbbo
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dbbt dbbtVar = dbbt.this;
                    int i4 = i;
                    dbbtVar.e(str, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
