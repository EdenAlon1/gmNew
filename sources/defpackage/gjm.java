package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjm extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ gqr c;
    final /* synthetic */ idh d;
    final /* synthetic */ dwn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjm(boolean z, boolean z2, dwn dwnVar, gqr gqrVar, idh idhVar) {
        super(2);
        this.a = z;
        this.b = z2;
        this.e = dwnVar;
        this.c = gqrVar;
        this.d = idhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gjg.a.c(this.a, this.b, this.e, null, this.c, this.d, 0.0f, 0.0f, hfdVar, 100663296);
        }
        return ffcu.a;
    }
}
