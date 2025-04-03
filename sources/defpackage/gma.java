package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gma extends ffkk implements ffix {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;
    final /* synthetic */ ffix c;
    final /* synthetic */ gml d;
    final /* synthetic */ ffji e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gma(boolean z, ffix ffixVar, ffix ffixVar2, gml gmlVar, ffji ffjiVar, boolean z2) {
        super(0);
        this.a = z;
        this.b = ffixVar;
        this.c = ffixVar2;
        this.d = gmlVar;
        this.e = ffjiVar;
        this.f = z2;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new gmk(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
