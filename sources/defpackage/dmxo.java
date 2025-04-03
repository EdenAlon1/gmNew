package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxo extends ffhv implements ffjm {
    final /* synthetic */ dmxv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmxo(dmxv dmxvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dmxvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmxo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmxo(this.a, ffguVar);
    }
}
