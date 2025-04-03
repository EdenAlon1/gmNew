package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmnm extends ffhv implements ffjm {
    final /* synthetic */ dmmm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmnm(dmmm dmmmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dmmmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmnm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.c.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmnm(this.a, ffguVar);
    }
}
