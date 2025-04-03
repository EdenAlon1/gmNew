package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsu extends ffkk implements ffjm {
    final /* synthetic */ ftb a;
    final /* synthetic */ hvi b;
    final /* synthetic */ grs c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsu(ftb ftbVar, hvi hviVar, grs grsVar, boolean z, int i) {
        super(2);
        this.a = ftbVar;
        this.b = hviVar;
        this.c = grsVar;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        guj.x(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
