package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fob extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ idh b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ float e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fob(hvi hviVar, idh idhVar, long j, long j2, float f, ffjm ffjmVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = idhVar;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = ffjmVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        foh.c(this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
