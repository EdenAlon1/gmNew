package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcb extends ffkk implements ffji {
    final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcb(int i) {
        super(1);
        this.a = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).intValue();
        return Integer.valueOf(this.a);
    }
}
