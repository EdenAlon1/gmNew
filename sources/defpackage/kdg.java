package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kdg extends ffkk implements ffji {
    final /* synthetic */ kes a;
    final /* synthetic */ ffix b;
    final /* synthetic */ kex c;
    final /* synthetic */ kah d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdg(kes kesVar, ffix ffixVar, kex kexVar, kah kahVar) {
        super(1);
        this.a = kesVar;
        this.b = ffixVar;
        this.c = kexVar;
        this.d = kahVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kes kesVar = this.a;
        kesVar.b.addView(kesVar, kesVar.c);
        this.a.n(this.b, this.c, this.d);
        return new kdf(this.a);
    }
}
