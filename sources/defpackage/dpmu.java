package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpmu {
    public static final void a(final ffix ffixVar, final hvi hviVar, final long j, final long j2, hfd hfdVar, final int i) {
        int i2;
        ffixVar.getClass();
        hfd b = hfdVar.b(-1595864315);
        if ((i & 6) == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.C(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b.C(j2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != b.A(14.0f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != b.B(1) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) != 0 && !b.G()) {
                b.s();
            }
            b.l();
            b.v(-1043607472);
            int i3 = i2 & 14;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (i3 == 4 || R == hfc.a) {
                R = new ffix() { // from class: dpmq
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return Float.valueOf(ffmk.e(((Number) ffix.this.invoke()).floatValue(), 0.0f, 1.0f));
                    }
                };
                hfmVar.ad(R);
            }
            final ffix ffixVar2 = (ffix) R;
            hfmVar.Z();
            final ifv ifvVar = new ifv(((jzn) b.e(jdr.e)).em(14.0f), 0.0f, 1, 0, 26);
            b.v(-1043601175);
            boolean D = b.D(ffixVar2);
            Object R2 = hfmVar.R();
            if (D || R2 == hfc.a) {
                R2 = new ffji() { // from class: dpmr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        jkv jkvVar = (jkv) obj;
                        jkvVar.getClass();
                        jkr.p(jkvVar, new jji(((Number) ffix.this.invoke()).floatValue(), new ffmf(0.0f, 1.0f)));
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R2);
            }
            hfmVar.Z();
            hvi k = ebs.k(jjs.c(hviVar, true, (ffji) R2), 40.0f);
            b.v(-1043597505);
            boolean D2 = ((((i2 & 896) ^ 384) > 256 && b.C(j)) || (i2 & 384) == 256) | b.D(ffixVar2) | ((((i2 & 7168) ^ 3072) > 2048 && b.C(j2)) || (i2 & 3072) == 2048) | b.F(ifvVar);
            Object R3 = hfmVar.R();
            if (D2 || R3 == hfc.a) {
                ffji ffjiVar = new ffji() { // from class: dpms
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ifr ifrVar = (ifr) obj;
                        ifrVar.getClass();
                        float floatValue = 360.0f * ((Number) ffix.this.invoke()).floatValue();
                        long b2 = ifrVar.b() >> 32;
                        ifv ifvVar2 = ifvVar;
                        float f = ifvVar2.a / 2.0f;
                        float intBitsToFloat = Float.intBitsToFloat((int) b2) - (f + f);
                        ifrVar.z(ibp.b(ffdx.g(new ibw(j), new ibw(j2)), 0L, 0L, 14), floatValue, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), ifvVar2);
                        return ffcu.a;
                    }
                };
                hfmVar.ad(ffjiVar);
                R3 = ffjiVar;
            }
            hfmVar.Z();
            deu.a(k, (ffji) R3, b, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dpmt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    hvi hviVar2 = hviVar;
                    long j3 = j;
                    dpmu.a(ffixVar3, hviVar2, j3, j2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
