package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxn extends ffhv implements ffjm {
    final /* synthetic */ ffkx a;
    final /* synthetic */ ffix b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmxn(ffkx ffkxVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ffkxVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmxn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.a) {
            this.b.invoke();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmxn(this.a, this.b, ffguVar);
    }
}
