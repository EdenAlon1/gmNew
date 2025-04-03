package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cttt extends ffhv implements ffjm {
    final /* synthetic */ cttu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cttt(cttu cttuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cttuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cttt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cfup cfupVar = cttv.a;
        Object e = cttv.a.e();
        e.getClass();
        this.a.a.m(((Number) e).longValue());
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cttt(this.a, ffguVar);
    }
}
