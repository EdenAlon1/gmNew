package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enb {
    public static final dtt a(eot eotVar, eog eogVar, cyj cyjVar, cxt cxtVar, hfd hfdVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            eogVar = new eoh();
        }
        if ((i2 & 4) != 0) {
            cyjVar = cxd.a(hfdVar);
        }
        boolean z = true;
        if ((i2 & 8) != 0) {
            iam iamVar = ddh.a;
            cxtVar = cxu.b(0.0f, 400.0f, Float.valueOf(1.0f), 1);
        }
        Object obj = (jzn) hfdVar.e(jdr.e);
        kah kahVar = (kah) hfdVar.e(jdr.j);
        boolean D = ((((i & 14) ^ 6) > 4 && hfdVar.D(eotVar)) || (i & 6) == 4) | hfdVar.D(cyjVar) | hfdVar.D(cxtVar);
        if ((((i & 112) ^ 48) <= 32 || !hfdVar.D(eogVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean D2 = D | z | hfdVar.D(obj) | hfdVar.D(kahVar);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (D2 || R == hfc.a) {
            dvq dvqVar = new dvq(new dvi(eotVar, new ena(eotVar, kahVar), eogVar), cyjVar, cxtVar);
            hfmVar.ad(dvqVar);
            R = dvqVar;
        }
        return (dtt) R;
    }

    public static final ijf b(eot eotVar, dqs dqsVar, hfd hfdVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !hfdVar.D(eotVar)) && (i & 6) != 4) {
            z = false;
        }
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (z || R == hfc.a) {
            R = new eme(eotVar, dqsVar);
            hfmVar.ad(R);
        }
        return (eme) R;
    }
}
