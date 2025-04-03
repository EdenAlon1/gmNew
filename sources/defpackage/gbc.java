package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbc extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ float e = 120.0f;
    final /* synthetic */ ffjm f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbc(hvi hviVar, ffjm ffjmVar, long j, long j2, float f, ffjm ffjmVar2, int i) {
        super(2);
        this.a = hviVar;
        this.b = ffjmVar;
        this.c = j;
        this.d = j2;
        this.f = ffjmVar2;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.g | 1);
        ffjm ffjmVar = this.f;
        gcy.c(this.a, this.b, this.c, this.d, 120.0f, ffjmVar, (hfd) obj, a);
        return ffcu.a;
    }
}
