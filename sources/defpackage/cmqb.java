package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmqb {
    public final ffbr a;
    public final ffbr b;
    private final ffsk c;

    public cmqb(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.c = ffskVar;
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final void a(erbj erbjVar, String str) {
        axol.k(this.c, null, new cmqa(this, erbjVar, str, null), 3);
    }

    public final void b(String str, int i) {
        str.getClass();
        erbi erbiVar = (erbi) erbj.a.createBuilder();
        erbiVar.getClass();
        erbq erbqVar = (erbq) erbr.a.createBuilder();
        erbqVar.getClass();
        erbn erbnVar = (erbn) erbp.a.createBuilder();
        erbnVar.getClass();
        erbnVar.copyOnWrite();
        erbp erbpVar = (erbp) erbnVar.instance;
        erbpVar.c = i - 1;
        erbpVar.b |= 1;
        eyfy build = erbnVar.build();
        build.getClass();
        erbqVar.copyOnWrite();
        erbr erbrVar = (erbr) erbqVar.instance;
        erbrVar.c = (erbp) build;
        erbrVar.b = 3;
        erbk.b(erbs.a(erbqVar), erbiVar);
        a(erbk.a(erbiVar), str);
    }

    public final void c(String str, int i) {
        erbi erbiVar = (erbi) erbj.a.createBuilder();
        erbiVar.getClass();
        erbv erbvVar = (erbv) erbx.a.createBuilder();
        erbvVar.getClass();
        erbvVar.copyOnWrite();
        erbx erbxVar = (erbx) erbvVar.instance;
        erbxVar.c = i - 1;
        erbxVar.b |= 1;
        eyfy build = erbvVar.build();
        build.getClass();
        erbiVar.copyOnWrite();
        erbj erbjVar = (erbj) erbiVar.instance;
        erbjVar.c = (erbx) build;
        erbjVar.b = 3;
        a(erbk.a(erbiVar), str);
    }
}
