package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cql extends ffkk implements ffjm {
    final /* synthetic */ dbe a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ffji c;
    final /* synthetic */ huo d;
    final /* synthetic */ ffji e;
    final /* synthetic */ ffjo f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cql(dbe dbeVar, hvi hviVar, ffji ffjiVar, huo huoVar, ffji ffjiVar2, ffjo ffjoVar, int i) {
        super(2);
        this.a = dbeVar;
        this.b = hviVar;
        this.c = ffjiVar;
        this.d = huoVar;
        this.e = ffjiVar2;
        this.f = ffjoVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        cqn.b(this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
