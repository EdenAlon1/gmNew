package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfv extends ffhv implements ffji {
    final /* synthetic */ qfw a;
    final /* synthetic */ qci b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfv(qfw qfwVar, qci qciVar, float f, boolean z, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = qfwVar;
        this.b = qciVar;
        this.c = f;
        this.d = z;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.l(this.b);
        this.a.o(this.c);
        this.a.m(1);
        this.a.n(false);
        if (this.d) {
            this.a.u(Long.MIN_VALUE);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new qfv(this.a, this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
