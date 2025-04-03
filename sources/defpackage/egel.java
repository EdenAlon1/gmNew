package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egel implements erqj {
    final /* synthetic */ egdt a;
    final /* synthetic */ egem b;

    public egel(egem egemVar, egdt egdtVar) {
        this.a = egdtVar;
        this.b = egemVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ewjr ewjrVar = (ewjr) obj;
        synchronized (this) {
            this.b.d.addAll(enkr.g(ewjrVar.c, new emwl() { // from class: egek
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
            this.b.e.add(this.a.b(ewjrVar.c.size()));
            egem egemVar = this.b;
            egemVar.c.j(new eggl(engw.n(egemVar.d), emux.a, engw.n(this.b.e)));
            egem egemVar2 = this.b;
            egemVar2.g = (ewjrVar.b & 4) != 0;
            egemVar2.l = false;
            this.b.f = false;
        }
        this.b.d();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        synchronized (this) {
            egdp a = this.b.a.a(th);
            exfw c = this.a.c(th);
            this.b.e.add(c);
            egdg egdgVar = this.b.b;
            exfr exfrVar = (exfr) exfs.a.createBuilder();
            exfu exfuVar = c.f;
            if (exfuVar == null) {
                exfuVar = exfu.a;
            }
            exfrVar.copyOnWrite();
            exfs exfsVar = (exfs) exfrVar.instance;
            exfuVar.getClass();
            exfsVar.c = exfuVar;
            exfsVar.b |= 2;
            egdgVar.b((exfs) exfrVar.build());
            egem egemVar = this.b;
            egemVar.c.j(new eggl(engw.n(egemVar.d), emxc.j(a), engw.n(this.b.e)));
            this.b.l = false;
            this.b.f = true;
        }
    }
}
