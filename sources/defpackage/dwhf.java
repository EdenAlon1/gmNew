package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwhf implements ffjm {
    final /* synthetic */ fhz a;
    final /* synthetic */ ffjm b;

    public dwhf(fhz fhzVar, ffjm ffjmVar) {
        this.a = fhzVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfz.b(new hil[]{fsc.a.c(dwhs.a), fib.a.c(this.a), fyc.b.c(false)}, this.b, hfdVar, 8);
        }
        return ffcu.a;
    }
}
