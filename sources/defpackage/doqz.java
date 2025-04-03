package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doqz extends ffhv implements ffjm {
    final /* synthetic */ doqp a;
    final /* synthetic */ ffix b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doqz(doqp doqpVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = doqpVar;
        this.b = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doqz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b.invoke();
        this.b.invoke();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new doqz(this.a, this.b, ffguVar);
    }
}
