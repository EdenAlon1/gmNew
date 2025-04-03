package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmc extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmc(hvi hviVar, long j, long j2, int i) {
        super(2);
        this.a = hviVar;
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fmk.e(this.a, this.b, this.c, (hfd) obj, hip.a(this.d | 1));
        return ffcu.a;
    }
}
