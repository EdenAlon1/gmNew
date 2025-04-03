package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctm extends ffkk implements ffji {
    final /* synthetic */ ffji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctm(ffji ffjiVar) {
        super(1);
        this.a = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        return new kaf((((int) (r0 & 4294967295L)) & 4294967295L) | (((Number) this.a.invoke(Integer.valueOf((int) (((kaf) obj).a >> 32)))).intValue() << 32));
    }
}
