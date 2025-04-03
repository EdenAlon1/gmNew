package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpee implements erqj {
    final /* synthetic */ String a;

    public cpee(String str) {
        this.a = str;
    }

    @Override // defpackage.erqj
    public final void b(Object obj) {
        csjb a = cpef.a.a();
        a.I("Finished executing background startup task:");
        a.I(this.a);
        a.r();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        csjb b = cpef.a.b();
        b.I("Failed executing background startup task:");
        b.I(this.a);
        b.s(th);
    }
}
