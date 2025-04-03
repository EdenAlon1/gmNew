package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flj extends ffkk implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ebe c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flj(ffix ffixVar, hvi hviVar, ebe ebeVar, ffjn ffjnVar, int i) {
        super(2);
        this.a = ffixVar;
        this.b = hviVar;
        this.c = ebeVar;
        this.d = ffjnVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        flk.c(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
