package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czj extends ffkk implements ffji {
    final /* synthetic */ czg a;
    final /* synthetic */ cza b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czj(czg czgVar, cza czaVar) {
        super(1);
        this.a = czgVar;
        this.b = czaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        czg czgVar = this.a;
        czgVar.a.n(this.b);
        czgVar.b(true);
        return new czi(this.a, this.b);
    }
}
