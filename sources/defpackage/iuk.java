package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iuk extends ffkk implements ffji {
    final /* synthetic */ iul a;
    final /* synthetic */ itg b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuk(iul iulVar, itg itgVar, ffji ffjiVar) {
        super(1);
        this.a = iulVar;
        this.b = itgVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        itg itgVar;
        iul iulVar = this.a;
        itg itgVar2 = this.b;
        ifr ifrVar = (ifr) obj;
        itg itgVar3 = iulVar.a;
        iulVar.a = itgVar2;
        try {
            jzn c = ifrVar.t().c();
            kah d = ifrVar.t().d();
            ibt b = ifrVar.t().b();
            long a = ifrVar.t().a();
            iga igaVar = ifrVar.t().a;
            ffji ffjiVar = this.c;
            jzn c2 = iulVar.t().c();
            kah d2 = iulVar.t().d();
            ibt b2 = iulVar.t().b();
            long a2 = iulVar.t().a();
            iga igaVar2 = iulVar.t().a;
            try {
                ifl t = iulVar.t();
                t.f(c);
                t.g(d);
                t.e(b);
                t.h(a);
                t.a = igaVar;
                b.l();
                try {
                    ffjiVar.invoke(iulVar);
                    b.j();
                    ifl t2 = iulVar.t();
                    t2.f(c2);
                    t2.g(d2);
                    t2.e(b2);
                    t2.h(a2);
                    t2.a = igaVar2;
                    this.a.a = itgVar3;
                    return ffcu.a;
                } catch (Throwable th) {
                    itgVar = itgVar3;
                    try {
                        b.j();
                        ifl t3 = iulVar.t();
                        t3.f(c2);
                        t3.g(d2);
                        t3.e(b2);
                        t3.h(a2);
                        t3.a = igaVar2;
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        this.a.a = itgVar;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                itgVar = itgVar3;
            }
        } catch (Throwable th4) {
            th = th4;
            itgVar = itgVar3;
        }
    }
}
