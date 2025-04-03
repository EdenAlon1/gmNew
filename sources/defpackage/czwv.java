package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czwv implements ffjm {
    final /* synthetic */ czxn a;
    final /* synthetic */ hho b;
    final /* synthetic */ hho c;

    public czwv(czxn czxnVar, hho hhoVar, hho hhoVar2) {
        this.a = czxnVar;
        this.b = hhoVar;
        this.c = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            czxm.c(this.a, (ffix) this.b.a(), (ffix) this.c.a(), null, 0.0f, hfdVar, 0);
        }
        return ffcu.a;
    }
}
