package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epz extends ffkk implements ffix {
    final /* synthetic */ ffji a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epz(ffji ffjiVar, boolean z) {
        super(0);
        this.a = ffjiVar;
        this.b = z;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.invoke(Boolean.valueOf(!this.b));
        return ffcu.a;
    }
}
