package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class foo extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ idh b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ float e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foo(hvi hviVar, idh idhVar, long j, long j2, float f, ffjm ffjmVar, int i, int i2) {
        super(2);
        this.a = hviVar;
        this.b = idhVar;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = ffjmVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C0001for.a(this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1), this.h);
        return ffcu.a;
    }
}
