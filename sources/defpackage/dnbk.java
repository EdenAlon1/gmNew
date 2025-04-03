package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbk {
    public static final void a(final dbe dbeVar, final hvi hviVar, final cyq cyqVar, ffji ffjiVar, final ffjn ffjnVar, hfd hfdVar, final int i) {
        ffjn ffjnVar2;
        final ffji ffjiVar2;
        final dbe dbeVar2 = dbeVar;
        int i2 = i & 6;
        hfd b = hfdVar.b(1912596737);
        int i3 = i2 == 0 ? (true != b.D(dbeVar2) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != b.F(cyqVar) ? 128 : 256;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            ffjnVar2 = ffjnVar;
            i4 |= true != b.F(ffjnVar2) ? 8192 : 16384;
        } else {
            ffjnVar2 = ffjnVar;
        }
        if ((i4 & 9363) == 9362 && b.I()) {
            b.s();
            ffjiVar2 = ffjiVar;
        } else {
            b.v(-459772095);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new ffji() { // from class: dnbd
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return obj;
                    }
                };
                hfmVar.ad(R);
            }
            ffji ffjiVar3 = (ffji) R;
            hfmVar.Z();
            b.v(-459769285);
            Object R2 = hfmVar.R();
            Object obj = R2;
            if (R2 == hfc.a) {
                hss hssVar = new hss();
                hssVar.add(dbeVar2.e());
                hfmVar.ad(hssVar);
                obj = hssVar;
            }
            hss hssVar2 = (hss) obj;
            hfmVar.Z();
            b.v(-459766600);
            Object R3 = hfmVar.R();
            if (R3 == hfc.a) {
                long[] jArr = cpg.a;
                R3 = new cop((byte[]) null);
                hfmVar.ad(R3);
            }
            cop copVar = (cop) R3;
            hfmVar.Z();
            b.v(-459764268);
            if (ffkj.e(dbeVar2.e(), dbeVar2.f()) && (hssVar2.a() != 1 || !ffkj.e(hssVar2.get(0), dbeVar2.f()))) {
                b.v(-459755344);
                int i5 = i4 & 14;
                Object R4 = hfmVar.R();
                if (i5 == 4 || R4 == hfc.a) {
                    R4 = new ffji() { // from class: dnbe
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(!ffkj.e(obj2, dbe.this.f()));
                        }
                    };
                    hfmVar.ad(R4);
                }
                hfmVar.Z();
                ffdx.v(hssVar2, (ffji) R4);
                copVar.d();
            }
            hfmVar.Z();
            b.v(-459752786);
            if (!copVar.g(dbeVar2.f())) {
                htg htgVar = new htg(hssVar2, 0);
                int i6 = 0;
                while (true) {
                    if (!htgVar.hasNext()) {
                        i6 = -1;
                        break;
                    } else if (ffkj.e(ffjiVar3.invoke(htgVar.next()), ffjiVar3.invoke(dbeVar2.f()))) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 == -1) {
                    hssVar2.add(dbeVar2.f());
                } else {
                    hssVar2.set(i6, dbeVar2.f());
                }
                copVar.d();
                int a = hssVar2.a();
                int i7 = 0;
                while (i7 < a) {
                    Object obj2 = hssVar2.get(i7);
                    copVar.e(obj2, hpx.d(1605336364, new dnbj(dbeVar2, cyqVar, i7, obj2, ffjnVar2), b));
                    i7++;
                    dbeVar2 = dbeVar;
                    ffjnVar2 = ffjnVar;
                }
            }
            hfmVar.Z();
            int i8 = huo.a;
            ipn a2 = dyc.a(hum.a, false);
            int a3 = hey.a(b);
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i9 = ist.a;
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
            b.v(-370911942);
            int a4 = hssVar2.a();
            for (int i10 = 0; i10 < a4; i10++) {
                Object obj3 = hssVar2.get(i10);
                b.u(-296332823, ffjiVar3.invoke(obj3));
                ffjm ffjmVar2 = (ffjm) copVar.f(obj3);
                if (ffjmVar2 != null) {
                    ffjmVar2.a(b, 0);
                }
                hfmVar.Z();
            }
            hfmVar.Z();
            b.n();
            ffjiVar2 = ffjiVar3;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnbf
                @Override // defpackage.ffjm
                public final Object a(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    dbe dbeVar3 = dbe.this;
                    hvi hviVar2 = hviVar;
                    cyq cyqVar2 = cyqVar;
                    ffji ffjiVar4 = ffjiVar2;
                    dnbk.a(dbeVar3, hviVar2, cyqVar2, ffjiVar4, ffjnVar, (hfd) obj4, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }

    public static final void b(final Object obj, hvi hviVar, cyq cyqVar, ffjn ffjnVar, hfd hfdVar, final int i) {
        int i2;
        final cyq cyqVar2;
        final ffjn ffjnVar2;
        final hvi hviVar2;
        ffjnVar.getClass();
        hfd b = hfdVar.b(-2005669070);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? b.D(obj) : b.F(obj)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != b.F(cyqVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != b.D("ImageBubbleCrossFade") ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != b.F(ffjnVar) ? 8192 : 16384;
        }
        if ((i3 & 9363) == 9362 && b.I()) {
            b.s();
            ffjnVar2 = ffjnVar;
            cyqVar2 = cyqVar;
            hviVar2 = hviVar;
        } else {
            hve hveVar = hvi.e;
            a(dbs.d(obj, "ImageBubbleCrossFade", b, ((i3 >> 6) & 112) | (i3 & 14), 0), hveVar, cyqVar, null, ffjnVar, b, i3 & 58352);
            cyqVar2 = cyqVar;
            ffjnVar2 = ffjnVar;
            hviVar2 = hveVar;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnbc
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    Object obj4 = obj;
                    hvi hviVar3 = hviVar2;
                    cyq cyqVar3 = cyqVar2;
                    dnbk.b(obj4, hviVar3, cyqVar3, ffjnVar2, (hfd) obj2, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
