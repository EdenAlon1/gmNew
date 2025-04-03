package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olz {
    public static final ofy a;
    private static final ofw b;

    static {
        ofw ofwVar = new ofw(false);
        b = ofwVar;
        a = new ofy(ofv.a, ofwVar, ofwVar);
    }

    public static final olu a(ffxx ffxxVar, ffhd ffhdVar, hfd hfdVar, int i) {
        hfdVar.w(388053246);
        if (i != 0) {
            ffhdVar = ffhe.a;
        }
        hfdVar.w(-1919372411);
        boolean D = hfdVar.D(ffxxVar);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (D || R == hfc.a) {
            R = new olu(ffxxVar);
            hfmVar.ad(R);
        }
        olu oluVar = (olu) R;
        hfmVar.Z();
        hfdVar.w(-1919369752);
        boolean F = hfdVar.F(ffhdVar) | hfdVar.F(oluVar);
        Object R2 = hfmVar.R();
        if (F || R2 == hfc.a) {
            R2 = new olw(ffhdVar, oluVar, null);
            hfmVar.ad(R2);
        }
        hfmVar.Z();
        hgs.g(oluVar, (ffjm) R2, hfdVar);
        hfdVar.w(-1919362042);
        boolean F2 = hfdVar.F(ffhdVar) | hfdVar.F(oluVar);
        Object R3 = hfmVar.R();
        if (F2 || R3 == hfc.a) {
            R3 = new oly(ffhdVar, oluVar, null);
            hfmVar.ad(R3);
        }
        hfmVar.Z();
        hgs.g(oluVar, (ffjm) R3, hfdVar);
        hfmVar.Z();
        return oluVar;
    }
}
