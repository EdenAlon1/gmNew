package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ify extends ffkk implements ffji {
    final /* synthetic */ iga a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ify(iga igaVar) {
        super(1);
        this.a = igaVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        iga igaVar = this.a;
        ifr ifrVar = (ifr) obj;
        icv icvVar = igaVar.e;
        if (igaVar.g && igaVar.p && icvVar != null) {
            ifl t = ifrVar.t();
            long a = t.a();
            t.b().l();
            try {
                t.c.g(icvVar);
                igaVar.f(ifrVar);
            } finally {
                t.b().j();
                t.h(a);
            }
        } else {
            igaVar.f(ifrVar);
        }
        return ffcu.a;
    }
}
