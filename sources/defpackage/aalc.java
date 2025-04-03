package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aalc extends ffhv implements ffjm {
    final /* synthetic */ aalh a;
    final /* synthetic */ apor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aalc(aalh aalhVar, apor aporVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aalhVar;
        this.b = aporVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aalc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.g.invoke(this.b);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aalc(this.a, this.b, ffguVar);
    }
}
