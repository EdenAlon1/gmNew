package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjd extends ffkk implements ffjm {
    final /* synthetic */ gjg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ hvi d;
    final /* synthetic */ gqr e;
    final /* synthetic */ idh f;
    final /* synthetic */ float g;
    final /* synthetic */ float h;
    final /* synthetic */ int i;
    final /* synthetic */ dwn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjd(gjg gjgVar, boolean z, boolean z2, dwn dwnVar, hvi hviVar, gqr gqrVar, idh idhVar, float f, float f2, int i) {
        super(2);
        this.a = gjgVar;
        this.b = z;
        this.c = z2;
        this.j = dwnVar;
        this.d = hviVar;
        this.e = gqrVar;
        this.f = idhVar;
        this.g = f;
        this.h = f2;
        this.i = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.c(this.b, this.c, this.j, this.d, this.e, this.f, this.g, this.h, (hfd) obj, hip.a(this.i | 1));
        return ffcu.a;
    }
}
