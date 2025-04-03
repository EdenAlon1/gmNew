package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iid extends ffkk implements ffji {
    final /* synthetic */ iif a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iid(iif iifVar) {
        super(1);
        this.a = iifVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        iif iifVar = this.a;
        ifr ifrVar = (ifr) obj;
        float f = iifVar.g;
        float f2 = iifVar.h;
        ifl t = ifrVar.t();
        long a = t.a();
        t.b().l();
        igv igvVar = iifVar.a;
        try {
            t.c.d(f, f2, 0L);
            igvVar.b(ifrVar);
            t.b().j();
            t.h(a);
            return ffcu.a;
        } catch (Throwable th) {
            t.b().j();
            t.h(a);
            throw th;
        }
    }
}
