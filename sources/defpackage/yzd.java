package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzd extends ffhv implements ffjm {
    final /* synthetic */ yzm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzd(yzm yzmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = yzmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yzd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        avjf avjfVar = (avjf) this.a.i.b();
        eqex eqexVar = (eqex) eqey.a.createBuilder();
        eqexVar.copyOnWrite();
        eqey eqeyVar = (eqey) eqexVar.instance;
        eqeyVar.c = 3;
        eqeyVar.b |= 1;
        avjfVar.i((eqey) eqexVar.build());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yzd(this.a, ffguVar);
    }
}
