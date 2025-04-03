package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ife extends ffkk implements ffji {
    final /* synthetic */ iff a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ife(iff iffVar) {
        super(1);
        this.a = iffVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        double a = this.a.k.a(((Number) obj).doubleValue());
        iff iffVar = this.a;
        return Double.valueOf(ffmk.b(a, iffVar.e, iffVar.f));
    }
}
