package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exz extends ffkk implements ffji {
    final /* synthetic */ eyh a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exz(eyh eyhVar, ffji ffjiVar) {
        super(1);
        this.a = eyhVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.c.add(this.b);
        return new exy(this.a, this.b);
    }
}
