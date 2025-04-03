package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkm extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffix b;
    final /* synthetic */ hvi c;
    final /* synthetic */ idh d;
    final /* synthetic */ long e;
    final /* synthetic */ long f;
    final /* synthetic */ int g;
    final /* synthetic */ fjh h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkm(ffjm ffjmVar, ffix ffixVar, hvi hviVar, idh idhVar, long j, long j2, fjh fjhVar, int i) {
        super(2);
        this.a = ffjmVar;
        this.b = ffixVar;
        this.c = hviVar;
        this.d = idhVar;
        this.e = j;
        this.f = j2;
        this.h = fjhVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fks.a(this.a, this.b, this.c, this.d, this.e, this.f, this.h, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
