package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ums extends ffhv implements ffjm {
    final /* synthetic */ umw a;
    final /* synthetic */ dbyf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ums(ffgu ffguVar, umw umwVar, dbyf dbyfVar) {
        super(2, ffguVar);
        this.a = umwVar;
        this.b = dbyfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ums) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        alcb alcbVar = this.a.b;
        epog a = epof.a((eppq) eppr.a.createBuilder());
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        eptqVar.getClass();
        eqni.b(epts.CONTACT, eptqVar);
        eqni.c(eptu.EXPANDED, eptqVar);
        a.e(eqni.a(eptqVar));
        eppu eppuVar = (eppu) eppw.a.createBuilder();
        eppuVar.getClass();
        eqnj.b(2, eppuVar);
        dbyf dbyfVar = this.b;
        dbyfVar.getClass();
        int size = dbyfVar.g().size();
        eppuVar.copyOnWrite();
        eppw eppwVar = (eppw) eppuVar.instance;
        eppwVar.b |= 1;
        eppwVar.c = size;
        dbyf dbyfVar2 = this.b;
        dbyfVar2.getClass();
        int size2 = dbyfVar2.b().size();
        eppuVar.copyOnWrite();
        eppw eppwVar2 = (eppw) eppuVar.instance;
        eppwVar2.b = 2 | eppwVar2.b;
        eppwVar2.d = size2;
        a.b(eqnj.a(eppuVar));
        alcbVar.g(a.a(), -1);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ums umsVar = new ums(ffguVar, this.a, this.b);
        umsVar.c = obj;
        return umsVar;
    }
}
