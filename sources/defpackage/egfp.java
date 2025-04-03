package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfp implements erqj {
    final /* synthetic */ egdt a;
    final /* synthetic */ egfr b;

    public egfp(egfr egfrVar, egdt egdtVar) {
        this.a = egdtVar;
        this.b = egfrVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eggu egguVar = new eggu();
        egguVar.c(enkr.g(((ewkl) obj).b, new emwl() { // from class: egfo
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                ewkr ewkrVar = (ewkr) obj2;
                return new eggo(ewkrVar.b, ewkrVar.c);
            }
        }));
        egguVar.b(this.a.a());
        this.b.f.j(egguVar.a());
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        egdp a = this.b.d.a(th);
        exfw c = this.a.c(th);
        eggu egguVar = new eggu();
        int i = engw.d;
        egguVar.c(enou.a);
        egguVar.a = emxc.j(a);
        egguVar.b(c);
        this.b.f.j(egguVar.a());
    }
}
