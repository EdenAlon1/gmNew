package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gms extends ffkk implements ffjm {
    final /* synthetic */ gmv a;
    final /* synthetic */ hvi b;
    final /* synthetic */ gmm c;
    final /* synthetic */ boolean d;
    final /* synthetic */ long e;
    final /* synthetic */ int f;
    final /* synthetic */ dwn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gms(gmv gmvVar, dwn dwnVar, hvi hviVar, gmm gmmVar, boolean z, long j, int i) {
        super(2);
        this.a = gmvVar;
        this.g = dwnVar;
        this.b = hviVar;
        this.c = gmmVar;
        this.d = z;
        this.e = j;
        this.f = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.d(this.g, this.b, this.c, this.d, this.e, (hfd) obj, hip.a(this.f | 1));
        return ffcu.a;
    }
}
