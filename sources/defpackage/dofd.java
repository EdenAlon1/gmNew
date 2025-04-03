package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dofd implements ffjn {
    final /* synthetic */ idh a;

    public dofd(idh idhVar) {
        this.a = idhVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long f;
        hvi a;
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hviVar.getClass();
        hfdVar.v(1114672428);
        boolean a2 = dfq.a(hfdVar);
        idh idhVar = this.a;
        if (a2) {
            long j = ibw.a;
            a = hyc.a(hviVar, 5.0f, idhVar, j, j, 4);
        } else {
            f = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.4f, ibw.f(gft.a(hfdVar).a));
            a = hyc.a(hviVar, 7.0f, idhVar, 0L, f, 12);
        }
        hfdVar.o();
        return a;
    }
}
