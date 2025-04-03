package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gam extends ffkk implements ffji {
    final /* synthetic */ gcz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gam(gcz gczVar) {
        super(1);
        this.a = gczVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.b(((Number) obj).longValue());
        return ffcu.a;
    }
}
