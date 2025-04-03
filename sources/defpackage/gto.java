package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gto extends ffkk implements ffjm {
    final /* synthetic */ gqr a;
    final /* synthetic */ dwn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gto(dwn dwnVar, gqr gqrVar) {
        super(2);
        this.b = dwnVar;
        this.a = gqrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gjg.a.c(true, false, this.b, null, this.a, glx.c(11, hfdVar), 0.0f, 0.0f, hfdVar, 100663734);
        }
        return ffcu.a;
    }
}
