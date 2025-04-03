package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctnv extends ffhv implements ffji {
    final /* synthetic */ ctof a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctnv(ctof ctofVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = ctofVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((emmt) this.a.d.b()).e();
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ctnv(this.a, (ffgu) obj).b(ffcu.a);
    }
}
