package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gec extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ffix b;
    final /* synthetic */ boolean c;
    final /* synthetic */ idh d;
    final /* synthetic */ gdx e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gec(hvi hviVar, ffix ffixVar, boolean z, idh idhVar, gdx gdxVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = ffixVar;
        this.c = z;
        this.d = idhVar;
        this.e = gdxVar;
        this.f = ffjmVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gem.c(this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
