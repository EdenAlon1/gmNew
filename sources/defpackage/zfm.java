package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfm {
    public static final void a(final dspd dspdVar, final hvi hviVar, final zfj zfjVar, hfd hfdVar, final int i) {
        int i2;
        hvi c;
        long f;
        long f2;
        hfd b = hfdVar.b(-251047232);
        if ((i & 6) == 0) {
            i2 = (true != b.F(dspdVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(zfjVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            zjv zjvVar = (zjv) hkt.b(zfjVar.b, null, null, b, 2).a();
            boolean z = zjvVar != null && zjvVar.c;
            c = ebs.c(hviVar, 1.0f);
            b.v(332598637);
            hkx c2 = cxo.c(true != z ? 0.0f : 1.0f, null, null, b, 0, 30);
            long j = dooy.a(b).k;
            f = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), 0.7f, ibw.f(j));
            f2 = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), 0.9f, ibw.f(j));
            hvi b2 = dee.b(c, ibp.d(ffdx.g(new ibw(ibw.g), new ibw(f), new ibw(f2)), 0.0f, 0.0f, 14), null, ((Number) c2.a()).floatValue(), 2);
            ((hfm) b).Z();
            dym.a(b2, null, hpx.d(-1890035798, new zfl(z, dspdVar, zjvVar), b), b, 3072, 6);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: zfk
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dspd dspdVar2 = dspd.this;
                    hvi hviVar2 = hviVar;
                    int i3 = i;
                    zfm.a(dspdVar2, hviVar2, zfjVar, (hfd) obj, hip.a(i3 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
