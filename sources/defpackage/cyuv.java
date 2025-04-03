package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyuv {
    public static final void a(final dlsr dlsrVar, final ffix ffixVar, final ffji ffjiVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1692023372);
        if (i3 == 0) {
            i2 = (true != b.D(dlsrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjiVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else if (dlsrVar.b != null) {
            int i4 = huo.a;
            hun hunVar = hum.k;
            hvi a = jfw.a(hvi.e, "MiniCdpActionItem");
            ipn a2 = dyo.a(dxu.c, hunVar, b, 48);
            int a3 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, a);
            int i5 = ist.a;
            ffix ffixVar2 = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar2);
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
            hvi k = ebs.k(hxo.a(hvi.e, eqm.b(24.0f)), 24.0f);
            b.v(-342526523);
            boolean z = (i2 & 112) == 32;
            boolean z2 = (i2 & 14) == 4;
            boolean z3 = (i2 & 896) == 256;
            Object R = hfmVar.R();
            if ((z3 | z2 | z) || R == hfc.a) {
                R = new ffix() { // from class: cyus
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffix.this.invoke();
                        dlsr dlsrVar2 = dlsrVar;
                        dlsrVar2.k.invoke();
                        ffjiVar.invoke(dlsrVar2.a);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hvi d = dfb.d(k, false, null, (ffix) R, 7);
            dmzz dmzzVar = dlsrVar.b;
            dmzzVar.getClass();
            dwho.a(dnaa.a(dmzzVar, b), dlsrVar.a, d, gft.a(b).s, b, 0, 0);
            b.n();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cyut
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlsr dlsrVar2 = dlsr.this;
                    ffix ffixVar3 = ffixVar;
                    int i6 = i;
                    cyuv.a(dlsrVar2, ffixVar3, ffjiVar, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final cyup cyupVar, final ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2050461664);
        if (i3 == 0) {
            i2 = (true != b.D(cyupVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            if (cyupVar == null) {
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: cyuq
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int i4 = i;
                            cyuv.b(null, ffix.this, (hfd) obj, hip.a(i4 | 1));
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            dwfo.a(hxo.a(eba.j(hvi.e, 0.0f, 10.0f, 0.0f, 0.0f, 13), eqm.b(24.0f)), null, dwfk.b(gft.a(b).D, 0L, b, 14), null, null, hpx.d(-41523182, new cyuu(cyupVar, ffixVar), b), b, 196608, 26);
            b = b;
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: cyur
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cyup cyupVar2 = cyup.this;
                    int i4 = i;
                    cyuv.b(cyupVar2, ffixVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
