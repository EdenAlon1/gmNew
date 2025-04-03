package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cigq implements cifg {
    private static final entd b = entd.c("BugleGDitto");
    public final ffbr a;
    private final ffsk c;
    private final ffsk d;
    private final ffbr e;

    public cigq(ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar2.getClass();
        this.c = ffskVar;
        this.d = ffskVar2;
        this.e = ffbrVar;
        this.a = ffbrVar2;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return cife.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        elfl c;
        elfl c2;
        elfl c3;
        esdr esdrVar = (esdr) eyhsVar;
        esdrVar.getClass();
        if (!((cgcu) this.e.b()).a()) {
            ensz enszVar = (ensz) b.j();
            enszVar.Y(csux.O, "UnpairGaiaPairingDelegate");
            enszVar.q("Gaia Pairing is disabled. Skipping handleRequestInternal in delegate.");
            c3 = axol.c(this.c, ffhe.a, ffsm.a, new cign(null));
            return c3;
        }
        if (esdrVar.b.equals(((cibs) ciffVar).c.b)) {
            c = axol.c(this.d, ffhe.a, ffsm.a, new cigp(this, ciffVar, null));
            return c;
        }
        ensz enszVar2 = (ensz) b.h();
        enszVar2.Y(csux.O, "UnpairGaiaPairingDelegate");
        enszVar2.q("Pairing attempt id doesn't match desktopId. Won't unpair.");
        c2 = axol.c(this.c, ffhe.a, ffsm.a, new cigo(null));
        return c2;
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        if (((cgcu) this.e.b()).a()) {
            esdr esdrVar = (esdr) eyfy.parseFrom(esdr.a, eyeeVar, eyfc.a());
            esdrVar.getClass();
            return esdrVar;
        }
        ensz enszVar = (ensz) b.j();
        enszVar.Y(csux.O, "UnpairGaiaPairingDelegate");
        enszVar.q("Gaia Pairing is disabled. Skipping parseRequest in delegate.");
        esdq esdqVar = (esdq) esdr.a.createBuilder();
        esdqVar.getClass();
        eyfy build = esdqVar.build();
        build.getClass();
        return (esdr) build;
    }
}
