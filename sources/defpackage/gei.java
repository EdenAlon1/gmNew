package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gei extends ffkk implements ffjm {
    final /* synthetic */ ffix a;
    final /* synthetic */ hvi b;
    final /* synthetic */ boolean c;
    final /* synthetic */ idh d;
    final /* synthetic */ gdx e;
    final /* synthetic */ der f;
    final /* synthetic */ ffjm g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gei(ffix ffixVar, hvi hviVar, boolean z, idh idhVar, gdx gdxVar, der derVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = ffixVar;
        this.b = hviVar;
        this.c = z;
        this.d = idhVar;
        this.e = gdxVar;
        this.f = derVar;
        this.g = ffjmVar;
        this.h = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gem.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hfd) obj, hip.a(this.h | 1));
        return ffcu.a;
    }
}
