package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaga extends ffhv implements ffjm {
    final /* synthetic */ aagl a;
    final /* synthetic */ aafr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaga(aagl aaglVar, aafr aafrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aaglVar;
        this.b = aafrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaga) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.d.invoke(this.b.a.b());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaga(this.a, this.b, ffguVar);
    }
}
