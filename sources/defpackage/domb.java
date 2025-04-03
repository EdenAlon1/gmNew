package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class domb extends ffhv implements ffjm {
    final /* synthetic */ doml a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public domb(doml domlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = domlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((domb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.f.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new domb(this.a, ffguVar);
    }
}
