package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jtq extends ffkk implements ffji {
    final /* synthetic */ jtr a;
    final /* synthetic */ jtp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtq(jtr jtrVar, jtp jtpVar) {
        super(1);
        this.a = jtrVar;
        this.b = jtpVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jtu jtuVar = (jtu) obj;
        jtr jtrVar = this.a;
        synchronized (jtrVar.a) {
            boolean b = jtuVar.b();
            jtp jtpVar = this.b;
            if (b) {
                jtrVar.b.d(jtpVar, jtuVar);
            } else {
                jtrVar.b.e(jtpVar);
            }
        }
        return ffcu.a;
    }
}
