package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbw extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ fzr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbw(String str, fzr fzrVar) {
        super(2);
        this.a = str;
        this.b = fzrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            String str = this.a;
            hve hveVar = hvi.e;
            boolean D = hfdVar.D(str);
            String str2 = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new gbv(str2);
                hfdVar.y(f);
            }
            c = jjs.c(hveVar, false, (ffji) f);
            grl.b(str, c, this.b.f, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131064);
        }
        return ffcu.a;
    }
}
