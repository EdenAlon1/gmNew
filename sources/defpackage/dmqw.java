package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqw implements ffjm {
    final /* synthetic */ dmms a;
    final /* synthetic */ dmnh b;
    final /* synthetic */ dmov c;
    final /* synthetic */ hzi d;
    final /* synthetic */ boolean e;
    final /* synthetic */ dmpg f;
    final /* synthetic */ float g;
    final /* synthetic */ boolean h;
    final /* synthetic */ dmpi i;

    public dmqw(dmms dmmsVar, dmnh dmnhVar, dmov dmovVar, hzi hziVar, boolean z, dmpg dmpgVar, float f, boolean z2, dmpi dmpiVar) {
        this.a = dmmsVar;
        this.b = dmnhVar;
        this.c = dmovVar;
        this.d = hziVar;
        this.e = z;
        this.f = dmpgVar;
        this.g = f;
        this.h = z2;
        this.i = dmpiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmrb.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, hfdVar, 0);
        }
        return ffcu.a;
    }
}
