package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwal implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public cwal(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi d;
        hvi c;
        String str;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            hfdVar.v(-1891629051);
            boolean D = hfdVar.D(this.a);
            final String str2 = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffji() { // from class: cwak
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        jkv jkvVar = (jkv) obj3;
                        jkvVar.getClass();
                        jkr.k(jkvVar, str2);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            c = jjs.c(d, false, (ffji) f);
            if (this.b.length() == 0) {
                str = "";
            } else {
                str = this.b.length() + "/100";
            }
            dwjt.b(str, c, 0L, 0L, null, null, 0L, new jyj(6), 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 130556);
        }
        return ffcu.a;
    }
}
