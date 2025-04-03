package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crfe implements faws {
    private final faws a;
    private final csjk b;
    private final ffbr c;
    private final ffbr d;

    public crfe(csjk csjkVar, faws fawsVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = csjkVar;
        this.a = fawsVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    private final void c() {
        if (((atte) this.c.b()).a() || ((attd) this.d.b()).a()) {
            if (((csmz) this.b.a()).u()) {
                throw new cqqj("Transfer via satellite");
            }
        } else if (((csmz) this.b.a()).s()) {
            throw new cqqj("Transfer via satellite");
        }
    }

    @Override // defpackage.faws
    public final fawj a(String str, favp favpVar, fawp fawpVar) {
        c();
        return this.a.a(str, favpVar, fawpVar);
    }

    @Override // defpackage.faws
    public final fawj b(String str, favs favsVar, favp favpVar, String str2, fawp fawpVar) {
        c();
        return this.a.b(str, favsVar, favpVar, str2, fawpVar);
    }
}
