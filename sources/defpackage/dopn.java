package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dopn extends ffhv implements ffjm {
    final /* synthetic */ ffji a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dopn(ffji ffjiVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ffjiVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dopn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        hik hikVar = dopp.a;
        this.a.invoke(Boolean.valueOf(!ffkj.e(this.b, new dopd())));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dopn(this.a, this.b, ffguVar);
    }
}
