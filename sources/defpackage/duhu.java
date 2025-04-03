package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duhu implements erqj {
    final /* synthetic */ quc a;
    final /* synthetic */ duhv b;

    public duhu(duhv duhvVar, quc qucVar) {
        this.a = qucVar;
        this.b = duhvVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        rab rabVar = (rab) obj;
        if (this.b.f) {
            return;
        }
        duhv duhvVar = this.b;
        qzz c = duhvVar.h.c(duhvVar.d, duhvVar.a, duhvVar.b, true, rabVar);
        ran a = duhvVar.h.c.a(c, duhvVar.a, duhvVar.b, duhvVar.c);
        if (a != null) {
            duhvVar.g = a.c;
            a.c.g(duhvVar.e, duhvVar);
            if (duhvVar.f) {
                duhvVar.d();
                return;
            }
            return;
        }
        duhvVar.f(new RuntimeException(String.valueOf(duhvVar.h.c) + " returned null LoadData for " + c.b()));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (this.b.f) {
            return;
        }
        qtt qttVar = duhy.a;
        this.a.f(new RuntimeException(th));
    }
}
