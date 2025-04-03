package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmrm implements ffjm {
    final /* synthetic */ dmms a;

    public dmrm(dmms dmmsVar) {
        this.a = dmmsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmms dmmsVar = this.a;
            hvi k = ebs.k(hvi.e, dmkx.a(hfdVar));
            dmof dmofVar = dmmsVar.d;
            dmob.c(dmofVar, true, dmofVar.g.b, k, hfdVar, 48, 0);
        }
        return ffcu.a;
    }
}
