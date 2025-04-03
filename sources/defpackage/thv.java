package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class thv implements ejlr<Void, Void> {
    final /* synthetic */ thw a;

    public thv(thw thwVar) {
        this.a = thwVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        if (((dixa) this.a.C.b()).a()) {
            ((cmpz) this.a.D.b()).a(true);
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        if (((dixa) this.a.C.b()).a()) {
            ((cmpz) this.a.D.b()).a(false);
        }
        thw.a.s("Failed to start disabling multi-device", th);
        if (this.a.w.a()) {
            crze.c("Failed to start disabling multi-device", th);
        } else {
            ((cfyt) this.a.u.b()).b(th).k(axnw.b(), erpp.a);
        }
        this.a.c(true);
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
