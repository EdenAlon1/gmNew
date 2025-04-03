package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjh extends ffkk implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ gqr b;
    final /* synthetic */ idh c;
    final /* synthetic */ dwn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjh(boolean z, dwn dwnVar, gqr gqrVar, idh idhVar) {
        super(2);
        this.a = z;
        this.d = dwnVar;
        this.b = gqrVar;
        this.c = idhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gjg.a.c(this.a, false, this.d, null, this.b, this.c, 0.0f, 0.0f, hfdVar, 100663296);
        }
        return ffcu.a;
    }
}
