package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkr extends ffkk implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ hvi b;
    final /* synthetic */ idh c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ int g;
    final /* synthetic */ fjh h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkr(ffix ffixVar, hvi hviVar, idh idhVar, long j, long j2, fjh fjhVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = ffixVar;
        this.b = hviVar;
        this.c = idhVar;
        this.d = j;
        this.e = j2;
        this.h = fjhVar;
        this.f = ffjmVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fks.b(this.a, this.b, this.c, this.d, this.e, this.h, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
