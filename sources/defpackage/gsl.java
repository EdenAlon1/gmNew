package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsl extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ftb b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsl(hvi hviVar, ftb ftbVar, int i, boolean z, int i2) {
        super(2);
        this.a = hviVar;
        this.b = ftbVar;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hvi hviVar = this.a;
        ftb ftbVar = this.b;
        int i = this.c;
        guj.k(hviVar, ftbVar, i, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
