package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hey {
    public static final int a(hfd hfdVar) {
        return hfdVar.a();
    }

    public static final hfr b(hfd hfdVar) {
        hfm hfmVar = (hfm) hfdVar;
        hfmVar.ac(206, hfp.e);
        if (hfmVar.z) {
            hjv.Y(hfmVar.u);
        }
        Object Q = hfmVar.Q();
        hfe hfeVar = Q instanceof hfe ? (hfe) Q : null;
        if (hfeVar == null) {
            hfeVar = new hfe(new hff(hfmVar, hfmVar.A, hfmVar.h, hfmVar.q));
            hfmVar.ag(hfeVar);
        }
        hfeVar.a.b.b(hfmVar.ai());
        hfmVar.Z();
        return hfeVar.a;
    }

    public static final hio c(hfd hfdVar) {
        hio O = ((hfm) hfdVar).O();
        if (O == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        O.n();
        return O;
    }
}
