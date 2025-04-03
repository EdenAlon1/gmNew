package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfw implements erqj {
    final /* synthetic */ egdt a;
    final /* synthetic */ egfx b;

    public egfw(egfx egfxVar, egdt egdtVar) {
        this.a = egdtVar;
        this.b = egfxVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ewlz ewlzVar = (ewlz) obj;
        exfw a = this.a.a();
        eggw eggwVar = new eggw();
        eggwVar.d(enkr.g(ewlzVar.b, new emwl() { // from class: egfu
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
        eggwVar.b(enkr.g(ewlzVar.c, new emwl() { // from class: egfv
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                ewja ewjaVar = (ewja) obj2;
                eggj eggjVar = new eggj();
                eggjVar.c(ewjaVar.b);
                eggjVar.b(ewjaVar.d);
                eggjVar.e(ewjaVar.c);
                eggjVar.d(ewjaVar.e);
                return eggjVar.a();
            }
        }));
        eggwVar.c(a);
        this.b.g.j(eggwVar.a());
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        egdp a = this.b.d.a(th);
        exfw c = this.a.c(th);
        eggw eggwVar = new eggw();
        int i = engw.d;
        eggwVar.d(enou.a);
        eggwVar.b(enou.a);
        eggwVar.a = emxc.j(a);
        eggwVar.c(c);
        this.b.g.j(eggwVar.a());
    }
}
