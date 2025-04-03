package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctk extends ffkk implements ffji {
    final /* synthetic */ ffji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctk(ffji ffjiVar) {
        super(1);
        this.a = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((kaf) obj).a >> 32;
        return new kaf((((Number) this.a.invoke(Integer.valueOf((int) (r0 & 4294967295L)))).intValue() & 4294967295L) | (((int) j) << 32));
    }
}
