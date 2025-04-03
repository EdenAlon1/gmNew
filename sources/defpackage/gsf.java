package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsf extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ftb b;
    final /* synthetic */ grs c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsf(hvi hviVar, ftb ftbVar, grs grsVar, boolean z, int i) {
        super(2);
        this.a = hviVar;
        this.b = ftbVar;
        this.c = grsVar;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        guj.j(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
