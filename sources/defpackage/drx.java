package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class drx extends ffhv implements ffjm {
    final /* synthetic */ long a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drx(long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drx) c((dsl) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((dsl) this.b).b(this.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drx drxVar = new drx(this.a, ffguVar);
        drxVar.b = obj;
        return drxVar;
    }
}
