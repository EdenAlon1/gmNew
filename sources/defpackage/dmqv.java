package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqv implements ffjm {
    final /* synthetic */ dmms a;
    final /* synthetic */ dmnh b;
    final /* synthetic */ hho c;

    public dmqv(dmms dmmsVar, dmnh dmnhVar, hho hhoVar) {
        this.a = dmmsVar;
        this.b = dmnhVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmob.d(this.a, this.b, this.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}
