package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnvb {
    public static final void a(final dnve dnveVar, final ffix ffixVar, final boolean z, hfd hfdVar, final int i) {
        int i2;
        int em;
        int i3 = i & 6;
        hfd b = hfdVar.b(-2074270111);
        if (i3 == 0) {
            i2 = (true != b.D(dnveVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(ffixVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            float f = true != z ? 1.0f : 0.0f;
            cyq cyqVar = dooy.c(b).d;
            b.v(-586745717);
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 112) == 32;
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if ((z3 | z2) || R == hfc.a) {
                R = new ffji() { // from class: dnuy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((Float) obj).floatValue();
                        if (z) {
                            ffixVar.invoke();
                        }
                        return ffcu.a;
                    }
                };
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hkx c = cxo.c(f, cyqVar, (ffji) R, b, 3072, 4);
            b.v(-586741967);
            int em2 = dnveVar.a.h.a ? 0 : (int) ((jzn) b.e(jdr.e)).em(12.0f);
            hfmVar.Z();
            ffix ffixVar2 = dnveVar.c;
            dnvd dnvdVar = dnveVar.b;
            b.v(-596332139);
            float em3 = ((jzn) b.e(jdr.e)).em(70.0f);
            int i4 = dnvdVar.a;
            if (i4 >= em3) {
                b.v(-800370465);
                em = i4 + ((int) ((jzn) b.e(jdr.e)).em(-90.0f));
                hfmVar.Z();
            } else {
                b.v(-800237909);
                em = (int) ((jzn) b.e(jdr.e)).em(-65.0f);
                hfmVar.Z();
            }
            int i5 = dnvdVar.c;
            hfmVar.Z();
            kdy.b(new dnvc(i5, em, dnveVar.b.b, em2), ffixVar2, null, hpx.d(-917812865, new dnva(c, dnveVar), b), b, 3072, 4);
            b = b;
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dnuz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnve dnveVar2 = dnve.this;
                    ffix ffixVar3 = ffixVar;
                    int i6 = i;
                    dnvb.a(dnveVar2, ffixVar3, z, (hfd) obj, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
