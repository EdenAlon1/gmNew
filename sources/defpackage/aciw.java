package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciw extends ffhv implements ffjm {
    final /* synthetic */ aciy a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aciw(ffgu ffguVar, aciy aciyVar) {
        super(2, ffguVar);
        this.a = aciyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((aciw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        actj a = ((actk) this.a.b.b()).a();
        a.d = true;
        acua acuaVar = acua.FOREGROUND;
        esni esniVar = (esni) esnk.a.createBuilder();
        esniVar.getClass();
        eslz eslzVar = (eslz) esmb.a.createBuilder();
        eslzVar.getClass();
        eslzVar.copyOnWrite();
        ((esmb) eslzVar.instance).d = esma.a(5);
        eyfy build = eslzVar.build();
        build.getClass();
        esniVar.copyOnWrite();
        esnk esnkVar = (esnk) esniVar.instance;
        esnkVar.c = (esmb) build;
        esnkVar.b = 212;
        eyfy build2 = esniVar.build();
        build2.getClass();
        a.d(acuaVar, (esnk) build2);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aciw aciwVar = new aciw(ffguVar, this.a);
        aciwVar.b = obj;
        return aciwVar;
    }
}
