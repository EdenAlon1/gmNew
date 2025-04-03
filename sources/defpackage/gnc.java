package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnc extends ffhv implements ffjn {
    final /* synthetic */ gnn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnc(gnn gnnVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.a = gnnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        return new gnc(this.a, (ffgu) obj3).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.invoke();
        return ffcu.a;
    }
}
