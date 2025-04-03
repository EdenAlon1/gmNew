package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gak extends ffkk implements ffjm {
    final /* synthetic */ gcz a;
    final /* synthetic */ fzr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gak(gcz gczVar, fzr fzrVar) {
        super(2);
        this.a = gczVar;
        this.b = fzrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi c = eba.c(hvi.e, gcy.a);
            gcz gczVar = this.a;
            int c2 = gczVar.c();
            boolean D = hfdVar.D(gczVar);
            gcz gczVar2 = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gaj(gczVar2);
                hfdVar.y(f);
            }
            gcy.d(c, c2, (ffji) f, this.b, hfdVar, 6);
        }
        return ffcu.a;
    }
}
