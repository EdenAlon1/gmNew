package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dbtm implements ejlr<Void, Void> {
    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        csjb c = dbtn.a.c();
        c.I("Successfully switched Gaia pairing");
        c.r();
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        dbtn.a.s("Failed to switch Gaia pairing", th);
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
