package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fce extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ffix b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fce(hvi hviVar, ffix ffixVar, boolean z, int i) {
        super(2);
        this.a = hviVar;
        this.b = ffixVar;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        fci.c(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
