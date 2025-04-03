package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpj {
    public static final jpi a(hfd hfdVar) {
        jse jseVar = (jse) hfdVar.e(jdr.g);
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        kah kahVar = (kah) hfdVar.e(jdr.j);
        boolean D = hfdVar.D(jseVar) | hfdVar.D(jznVar) | hfdVar.D(kahVar) | hfdVar.B(8);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (D || R == hfc.a) {
            R = new jpi(jseVar, jznVar, kahVar);
            hfmVar.ad(R);
        }
        return (jpi) R;
    }
}
