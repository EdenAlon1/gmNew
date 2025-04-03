package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class adly implements ejlr<eisx, Void> {
    final /* synthetic */ adme a;

    public adly(adme admeVar) {
        this.a = admeVar;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.function.Function] */
    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        eisx eisxVar = (eisx) obj;
        adni a = ((adls) ekhs.a(this.a.b)).a();
        eisx eisxVar2 = this.a.q;
        eisxVar2.getClass();
        if (eisxVar.equals(eisxVar2)) {
            adme.a.p("No account picked from ESI");
            if (a.b().isPresent()) {
                a.b().get().apply(eisxVar);
            }
        } else if (a.c().isPresent()) {
            csjb c = adme.a.c();
            c.y("AccountId", eisxVar.a());
            c.I("An Account is picked from ESI");
            c.r();
            a.c().get().apply(eisxVar);
        }
        this.a.i.c(eisxVar);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        this.a.i.a();
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
