package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpl extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffji b;
    final /* synthetic */ hvi c;
    final /* synthetic */ gpk d;
    final /* synthetic */ int e;
    final /* synthetic */ dwn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpl(boolean z, ffji ffjiVar, hvi hviVar, gpk gpkVar, dwn dwnVar, int i) {
        super(2);
        this.a = z;
        this.b = ffjiVar;
        this.c = hviVar;
        this.d = gpkVar;
        this.f = dwnVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gpn.a(this.a, this.b, this.c, this.d, this.f, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
