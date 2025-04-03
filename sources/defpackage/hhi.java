package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhi extends ffkk implements ffji {
    final /* synthetic */ ffji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhi(ffji ffjiVar) {
        super(1);
        this.a = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return this.a.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
    }
}
