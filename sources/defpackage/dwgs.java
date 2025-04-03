package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgs {
    public static final ebe a = eba.h(24.0f, 16.0f, 12.0f, 0.0f, 8);
    public static final ebe b = eba.h(24.0f, 0.0f, 12.0f, 12.0f, 2);

    public static final void a(final gcz gczVar, hvi hviVar, gae gaeVar, fzr fzrVar, ffjm ffjmVar, ffjm ffjmVar2, boolean z, hfd hfdVar, final int i) {
        int i2;
        hvi hviVar2;
        fzr a2;
        ffjm d;
        boolean z2;
        gae gaeVar2;
        ffjm d2;
        final boolean z3;
        final ffjm ffjmVar3;
        final ffjm ffjmVar4;
        final fzr fzrVar2;
        final gae gaeVar3;
        final hvi hviVar3;
        gczVar.getClass();
        hfd b2 = hfdVar.b(-151238119);
        if ((i & 6) == 0) {
            i2 = (true != b2.D(gczVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        int i4 = 1794048 | i3;
        if ((599187 & i4) == 599186 && b2.I()) {
            b2.s();
            hviVar3 = hviVar;
            gaeVar3 = gaeVar;
            fzrVar2 = fzrVar;
            ffjmVar4 = ffjmVar;
            ffjmVar3 = ffjmVar2;
            z3 = z;
        } else {
            b2.t();
            if ((i & 1) == 0 || b2.G()) {
                hviVar2 = hvi.e;
                b2.v(1857053622);
                hfm hfmVar = (hfm) b2;
                Object R = hfmVar.R();
                if (R == hfc.a) {
                    fzw fzwVar = fzw.a;
                    R = new gae();
                    hfmVar.ad(R);
                }
                gae gaeVar4 = (gae) R;
                hfmVar.Z();
                a2 = dwgm.a(b2);
                d = hpx.d(-1574577523, new dwgq(gczVar, a2), b2);
                z2 = true;
                gaeVar2 = gaeVar4;
                d2 = hpx.d(2056112311, new dwgr(gczVar, gaeVar4, a2), b2);
            } else {
                b2.s();
                hviVar2 = hviVar;
                gaeVar2 = gaeVar;
                a2 = fzrVar;
                d = ffjmVar;
                d2 = ffjmVar2;
                z2 = z;
            }
            b2.l();
            int i5 = 4186238 & i4;
            hvi hviVar4 = hviVar2;
            fzr fzrVar3 = a2;
            ffjm ffjmVar5 = d;
            boolean z4 = z2;
            gcy.i(gczVar, hviVar4, gaeVar2, fzrVar3, ffjmVar5, d2, z4, false, b2, i5);
            z3 = z4;
            ffjmVar3 = d2;
            ffjmVar4 = ffjmVar5;
            fzrVar2 = fzrVar3;
            gaeVar3 = gaeVar2;
            hviVar3 = hviVar4;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: dwgp
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    hfd hfdVar2 = (hfd) obj;
                    ((Integer) obj2).intValue();
                    gcz gczVar2 = gcz.this;
                    hvi hviVar5 = hviVar3;
                    gae gaeVar5 = gaeVar3;
                    fzr fzrVar4 = fzrVar2;
                    ffjm ffjmVar6 = ffjmVar4;
                    int i6 = i;
                    dwgs.a(gczVar2, hviVar5, gaeVar5, fzrVar4, ffjmVar6, ffjmVar3, z3, hfdVar2, hip.a(i6 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
