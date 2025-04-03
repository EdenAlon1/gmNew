package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ifd extends ffkk implements ffji {
    final /* synthetic */ iff a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifd(iff iffVar) {
        super(1);
        this.a = iffVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        double doubleValue = ((Number) obj).doubleValue();
        return Double.valueOf(this.a.n.a(ffmk.b(doubleValue, r8.e, r8.f)));
    }
}
