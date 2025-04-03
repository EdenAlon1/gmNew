package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fzu extends ffkk implements ffjm {
    final /* synthetic */ fzw a;
    final /* synthetic */ int b;
    final /* synthetic */ hvi c;
    final /* synthetic */ long d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzu(fzw fzwVar, int i, hvi hviVar, long j, int i2) {
        super(2);
        this.a = fzwVar;
        this.b = i;
        this.c = hviVar;
        this.d = j;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.b(this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
