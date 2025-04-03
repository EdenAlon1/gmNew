package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smd {
    public static final void a(final doui douiVar, final ffxx ffxxVar, final ffxx ffxxVar2, doue doueVar, hfd hfdVar, final int i) {
        int i2;
        doui douiVar2;
        doui b;
        final doue doueVar2;
        hfd b2 = hfdVar.b(381078703);
        if ((i & 6) == 0) {
            i2 = (true != b2.D(douiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b2.F(ffxxVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b2.F(ffxxVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != b2.F(doueVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && b2.I()) {
            b2.s();
            doueVar2 = doueVar;
        } else {
            int i3 = i2 >> 6;
            b2.t();
            if ((i & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            b2.v(83450706);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (R == hfc.a) {
                R = new smc(null);
                hfmVar.ad(R);
            }
            hfmVar.Z();
            hkx a = hkk.a(false, (ffjm) R, b2);
            if (douiVar instanceof doug) {
                b2.v(83454907);
                b = doug.a((doug) douiVar, ((Boolean) a.a()).booleanValue(), ((Number) hkt.b(ffxxVar2, Float.valueOf(0.0f), null, b2, 2).a()).floatValue());
                hfmVar.Z();
            } else if (douiVar instanceof douf) {
                b2.v(-1707697033);
                douf doufVar = (douf) douiVar;
                b = douf.b(doufVar, ((Boolean) hkt.b(ffxxVar, Boolean.valueOf(doufVar.b), null, b2, 2).a()).booleanValue());
                hfmVar.Z();
            } else {
                b2.v(83464072);
                hfmVar.Z();
                douiVar2 = douiVar;
                doud.b(douiVar2, doueVar, null, null, b2, i3 & 112, 12);
                doueVar2 = doueVar;
            }
            douiVar2 = b;
            doud.b(douiVar2, doueVar, null, null, b2, i3 & 112, 12);
            doueVar2 = doueVar;
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new ffjm() { // from class: smb
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    doui douiVar3 = doui.this;
                    ffxx ffxxVar3 = ffxxVar;
                    ffxx ffxxVar4 = ffxxVar2;
                    smd.a(douiVar3, ffxxVar3, ffxxVar4, doueVar2, (hfd) obj, hip.a(i | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
