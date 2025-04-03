package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fze extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fze(String str, String str2) {
        super(2);
        this.a = str;
        this.b = str2;
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
            boolean D = hfdVar.D(str) | hfdVar.D(this.b);
            String str2 = this.a;
            String str3 = this.b;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new fzd(str2, str3);
                hfdVar.y(f);
            }
            c = jjs.c(hveVar, false, (ffji) f);
            grl.b(str, c, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131068);
        }
        return ffcu.a;
    }
}
