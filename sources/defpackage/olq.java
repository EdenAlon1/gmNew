package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olq extends ffkk implements ffji {
    final /* synthetic */ ffji a;
    final /* synthetic */ olu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olq(ffji ffjiVar, olu oluVar) {
        super(1);
        this.a = ffjiVar;
        this.b = oluVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        Object g = this.b.g(intValue);
        return g == null ? new omb(intValue) : this.a.invoke(g);
    }
}
