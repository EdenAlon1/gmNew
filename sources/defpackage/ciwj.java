package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciwj {
    public final citp a;
    private final ciuo b;

    public ciwj(ciuo ciuoVar, citp citpVar) {
        this.b = ciuoVar;
        this.a = citpVar;
    }

    public static cfkl a(cixf cixfVar) {
        cetp cetpVar = new cetp();
        cetpVar.a = cixfVar.name();
        return cetpVar.a();
    }

    public final void b(cixf cixfVar, String str) {
        civs civsVar = (civs) civt.a.createBuilder();
        civsVar.copyOnWrite();
        civt civtVar = (civt) civsVar.instance;
        civtVar.c = cixfVar.j;
        civtVar.b |= 1;
        civsVar.copyOnWrite();
        civt civtVar2 = (civt) civsVar.instance;
        civtVar2.b |= 2;
        civtVar2.d = str;
        this.a.a((civt) civsVar.build(), a(cixfVar));
    }

    public final void c(civa civaVar, Object obj, boolean z) {
        ciwk ciwkVar = (ciwk) civaVar.c().a(obj).toBuilder();
        cixf d = civaVar.d();
        ciwkVar.copyOnWrite();
        ciwl ciwlVar = (ciwl) ciwkVar.instance;
        ciwlVar.e = d.j;
        ciwlVar.b |= 1;
        ciwkVar.copyOnWrite();
        ciwl ciwlVar2 = (ciwl) ciwkVar.instance;
        ciwlVar2.b |= 2;
        ciwlVar2.f = z;
        ((cevh) this.b.a.b()).g(ceyr.h("create_notification", (ciwl) ciwkVar.build(), a(civaVar.d())));
    }
}
