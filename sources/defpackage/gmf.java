package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmf extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;
    final /* synthetic */ ffix c;
    final /* synthetic */ ffji d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmf(boolean z, ffix ffixVar, ffix ffixVar2, ffji ffjiVar, boolean z2) {
        super(1);
        this.a = z;
        this.b = ffixVar;
        this.c = ffixVar2;
        this.d = ffjiVar;
        this.e = z2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffji ffjiVar = this.d;
        boolean z = this.e;
        return new gmk(this.a, this.b, this.c, (gml) obj, ffjiVar, z);
    }
}
