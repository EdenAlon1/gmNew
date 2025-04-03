package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoy {
    public static final eob a = new eob(ffel.a, 0, 0, 0, dqs.b, 0, 0, 0, dvy.a, new eou(), ffsl.b(ffhe.a));
    public static final eov b = new eov();

    public static final long a(eob eobVar, int i) {
        int i2 = eobVar.c + eobVar.b;
        long a2 = eobVar.a();
        long j = eobVar.d;
        long j2 = eobVar.c;
        int b2 = (int) (eobVar.e == dqs.b ? eobVar.b() >> 32 : eobVar.b() & 4294967295L);
        return ffmk.j(((((i * i2) + a2) + j) - j2) - (b2 - ffmk.i(eobVar.n.a(b2, eobVar.b, eobVar.a(), eobVar.d, i - 1, i), 0, b2)), 0L);
    }

    public static final eot b(int i, ffix ffixVar, hfd hfdVar, int i2) {
        if (1 == (i2 & 1)) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        hrh hrhVar = emi.a;
        boolean B = hfdVar.B(i) | hfdVar.A(0.0f) | hfdVar.D(ffixVar);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (B || R == hfc.a) {
            R = new eox(i, ffixVar);
            hfmVar.ad(R);
        }
        emi emiVar = (emi) hqr.c(objArr, hrhVar, (ffix) R, hfdVar, 0, 4);
        emiVar.b.b(ffixVar);
        return emiVar;
    }
}
