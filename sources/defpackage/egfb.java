package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egfb implements erqj {
    final /* synthetic */ egdt a;
    final /* synthetic */ egfd b;

    public egfb(egfd egfdVar, egdt egdtVar) {
        this.a = egdtVar;
        this.b = egfdVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.c.j(new eggh(engw.j(enkr.g(((ewkz) obj).b, new emwl() { // from class: egey
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                ewiu ewiuVar = (ewiu) obj2;
                return egec.a(ewiuVar.b, enkr.g(ewiuVar.c, new egez()));
            }
        })), emux.a, this.a.a()));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        egdp a = this.b.a.a(th);
        exfw c = this.a.c(th);
        int i = engw.d;
        this.b.c.j(new eggh(enou.a, emxc.j(a), c));
    }
}
