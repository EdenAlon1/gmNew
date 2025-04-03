package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gea extends ffkk implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ hvi b;
    final /* synthetic */ boolean c;
    final /* synthetic */ idh d;
    final /* synthetic */ gdx e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gea(ffix ffixVar, hvi hviVar, boolean z, idh idhVar, gdx gdxVar, ffjm ffjmVar, int i, int i2) {
        super(2);
        this.a = ffixVar;
        this.b = hviVar;
        this.c = z;
        this.d = idhVar;
        this.e = gdxVar;
        this.f = ffjmVar;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gem.a(this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1), this.h);
        return ffcu.a;
    }
}
