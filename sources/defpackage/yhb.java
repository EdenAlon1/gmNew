package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yhb extends ffhv implements ffjm {
    final /* synthetic */ yhr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yhb(yhr yhrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = yhrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yhb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.c();
        this.a.f.a.a(186072, null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yhb(this.a, ffguVar);
    }
}
