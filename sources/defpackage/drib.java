package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drib implements ffjm {
    final /* synthetic */ drie a;

    public drib(drie drieVar) {
        this.a = drieVar;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [drjb, java.lang.Object] */
    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.p().isPresent();
            ?? r3 = this.a.p().get();
            drhe f = drie.f(this.a);
            f.getClass();
            r3.b(f, hfdVar);
        }
        return ffcu.a;
    }
}
