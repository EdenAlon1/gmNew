package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hsg extends ffkk implements ffji {
    final /* synthetic */ ffji a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsg(ffji ffjiVar, ffji ffjiVar2) {
        super(1);
        this.a = ffjiVar;
        this.b = ffjiVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.invoke(obj);
        this.b.invoke(obj);
        return ffcu.a;
    }
}
