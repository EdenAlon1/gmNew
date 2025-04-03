package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doaf implements ffjn {
    final /* synthetic */ ibw a;
    final /* synthetic */ ibw b;
    final /* synthetic */ boolean c;

    public doaf(ibw ibwVar, ibw ibwVar2, boolean z) {
        this.a = ibwVar;
        this.b = ibwVar2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [doae] */
    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        doaa doaaVar;
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hviVar.getClass();
        hfdVar.v(195237699);
        hfdVar.v(795333492);
        ibw ibwVar = this.a;
        long f = ibwVar == null ? iby.f(ibw.d(r0), ibw.c(r0), ibw.b(r0), 0.3f, ibw.f(gft.a(hfdVar).p)) : ibwVar.i;
        hfdVar.o();
        ibw ibwVar2 = this.b;
        hfdVar.v(795336897);
        long j = ibwVar2 == null ? gft.a(hfdVar).v : ibwVar2.i;
        hfdVar.o();
        if (this.c) {
            hfdVar.v(795340358);
            ?? c = doaq.c(f, hfdVar);
            hfdVar.o();
            doaaVar = c;
        } else {
            hfdVar.v(795341315);
            hfdVar.v(33864667);
            ffbz ffbzVar = doad.a;
            cyz cyzVar = (cyz) doad.a.a();
            cyzVar.getClass();
            doaa doaaVar2 = new doaa(f, cyzVar);
            hfdVar.o();
            hfdVar.o();
            doaaVar = doaaVar2;
        }
        hvi g = huz.g(hviVar, new doan(doag.a, doah.a, doaaVar, j, idb.a));
        hfdVar.o();
        return g;
    }
}
