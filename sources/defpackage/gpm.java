package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpm extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ boolean b;
    final /* synthetic */ gpk c;
    final /* synthetic */ idh d;
    final /* synthetic */ int e;
    final /* synthetic */ dwn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpm(hvi hviVar, boolean z, gpk gpkVar, dwn dwnVar, idh idhVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = z;
        this.c = gpkVar;
        this.f = dwnVar;
        this.d = idhVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gpn.b(this.a, this.b, this.c, this.f, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
