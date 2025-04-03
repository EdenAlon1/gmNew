package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acnn extends ffhv implements ffjm {
    final /* synthetic */ acnp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acnn(acnp acnpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = acnpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acnn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        actj a = ((actk) this.a.c.b()).a();
        a.d = true;
        acua acuaVar = acua.FOREGROUND;
        esni esniVar = (esni) esnk.a.createBuilder();
        eyex eyexVar = eyex.a;
        esniVar.copyOnWrite();
        esnk esnkVar = (esnk) esniVar.instance;
        eyexVar.getClass();
        esnkVar.c = eyexVar;
        esnkVar.b = 208;
        a.d(acuaVar, (esnk) esniVar.build());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new acnn(this.a, ffguVar);
    }
}
