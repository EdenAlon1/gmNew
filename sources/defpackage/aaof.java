package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaof {
    public static final hik a = new hky(new ffix() { // from class: aaoc
        @Override // defpackage.ffix
        public final Object invoke() {
            hik hikVar = aaof.a;
            throw new IllegalStateException("VideoBubbleLoader must be provided");
        }
    });

    public static final void a(final aapj aapjVar, final eqd eqdVar, final Object obj, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(335509953);
        if (i3 == 0) {
            i2 = (true != b.D(aapjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(eqdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(obj) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            b.v(-1230739913);
            int i4 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i4 == 4 || R == hfc.a) {
                R = new aaod(aapjVar, null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hgs.g(aapjVar, (ffjm) R, b);
            int ordinal = aapjVar.e.ordinal();
            if (ordinal == 0) {
                b.v(501885016);
                hfmVar.Z();
                hio L = b.L();
                if (L != null) {
                    L.d = new ffjm() { // from class: aaoa
                        @Override // defpackage.ffjm
                        public final Object a(Object obj2, Object obj3) {
                            ((Integer) obj3).intValue();
                            aapj aapjVar2 = aapj.this;
                            int i5 = i;
                            eqd eqdVar2 = eqdVar;
                            int a2 = hip.a(i5 | 1);
                            aaof.a(aapjVar2, eqdVar2, obj, (hfd) obj2, a2);
                            return ffcu.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                b.v(-1230731357);
                String str = aapjVar.f;
                String str2 = aapjVar.g;
                String str3 = aapjVar.j;
                dlwg dlwgVar = new dlwg(str, str2, str3 == null ? "" : str3, 4);
                boolean z = aapjVar.k;
                dnmm dnmmVar = aapjVar.i;
                dlza.a(new dlzf(dlwgVar, new dlze(dnmmVar.a, dnmmVar.c), str3, z, (ffix) null, 48), null, eqdVar, b, (i2 << 3) & 896, 2);
                hfmVar.Z();
            } else {
                b.v(502757325);
                dnum.b(aapjVar.d, null, hpx.d(-282188261, new aaoe(aapjVar, eqdVar, obj), b), b, 384);
                hfmVar.Z();
            }
        }
        hio L2 = b.L();
        if (L2 != null) {
            L2.d = new ffjm() { // from class: aaob
                @Override // defpackage.ffjm
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    aapj aapjVar2 = aapj.this;
                    int i5 = i;
                    eqd eqdVar2 = eqdVar;
                    int a2 = hip.a(i5 | 1);
                    aaof.a(aapjVar2, eqdVar2, obj, (hfd) obj2, a2);
                    return ffcu.a;
                }
            };
        }
    }
}
