package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umq extends ffhv implements ffjm {
    final /* synthetic */ umw a;
    final /* synthetic */ dbyf b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umq(ffgu ffguVar, umw umwVar, dbyf dbyfVar) {
        super(2, ffguVar);
        this.a = umwVar;
        this.b = dbyfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((umq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.c;
        ffhe ffheVar = ffhe.a;
        return ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new ums(null, this.a, this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        umq umqVar = new umq(ffguVar, this.a, this.b);
        umqVar.c = obj;
        return umqVar;
    }
}
