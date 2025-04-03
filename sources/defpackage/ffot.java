package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffot extends ffkk implements ffji {
    final /* synthetic */ ffou a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffot(ffou ffouVar) {
        super(1);
        this.a = ffouVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return this.a.b(((Number) obj).intValue());
    }
}
