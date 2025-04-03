package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egfc implements erqj {
    final /* synthetic */ egdt a;
    final /* synthetic */ egfd b;

    public egfc(egfd egfdVar, egdt egdtVar) {
        this.a = egdtVar;
        this.b = egfdVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ewjz ewjzVar = (ewjz) obj;
        exfw a = this.a.a();
        eggm eggmVar = new eggm();
        eggmVar.d(enkr.g(ewjzVar.b, new emwl() { // from class: egfa
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                ewkp ewkpVar = (ewkp) obj2;
                eggf eggfVar = new eggf();
                eggfVar.d(ewkpVar.b);
                eggfVar.b(ewkpVar.c);
                eggfVar.e(ewkpVar.d);
                eggfVar.c(ewkpVar.e);
                return eggfVar.a();
            }
        }));
        eggmVar.b(enkr.g(ewjzVar.c, new egez()));
        eggmVar.c(a);
        this.b.b.j(eggmVar.a());
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        egdp a = this.b.a.a(th);
        exfw c = this.a.c(th);
        eggm eggmVar = new eggm();
        int i = engw.d;
        eggmVar.d(enou.a);
        eggmVar.b(enou.a);
        eggmVar.a = emxc.j(a);
        eggmVar.c(c);
        this.b.b.j(eggmVar.a());
    }
}
