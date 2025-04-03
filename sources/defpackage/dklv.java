package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dklv extends dkhi {
    public dklv(dkgm dkgmVar, ffbr ffbrVar, String str, dkur dkurVar) {
        super(dkgmVar.a, ffbrVar, str, "presence", dkgmVar.d, dkgmVar.e, dkurVar);
        this.g = "";
        this.e = b(ffbrVar);
        this.e.x = true;
    }

    @Override // defpackage.dkhi
    public final void h(eenk eenkVar) {
        try {
            j(eenkVar);
            String s = s(eenkVar);
            String h = eenkVar.h();
            if (h == null) {
                t(null, new byte[0]);
            } else {
                t(h, eenkVar.a.k);
            }
            e(s);
        } catch (Exception e) {
            dkty.i(e, "Error while processing notify: %s", e.getMessage());
        }
    }

    @Override // defpackage.dkhi
    public final void k(eenk eenkVar) {
        super.k(eenkVar);
    }
}
