package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbk extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ int b;
    final /* synthetic */ ffji c;
    final /* synthetic */ fzr d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbk(hvi hviVar, int i, ffji ffjiVar, fzr fzrVar, int i2) {
        super(2);
        this.a = hviVar;
        this.b = i;
        this.c = ffjiVar;
        this.d = fzrVar;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gcy.d(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
