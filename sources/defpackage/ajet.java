package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajet implements ffjm {
    final /* synthetic */ ffbr a;
    final /* synthetic */ ajev b;

    public ajet(ffbr ffbrVar, ajev ajevVar) {
        this.a = ffbrVar;
        this.b = ajevVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ffbr ffbrVar = this.a;
            hik hikVar = dnae.a;
            Object b = ffbrVar.b();
            b.getClass();
            hfz.a(hikVar.c(b), hpx.d(-208271599, new ajes(this.b), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
