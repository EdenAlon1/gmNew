package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnk extends ffkk implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ kgc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnk(hho hhoVar, kgc kgcVar) {
        super(2);
        this.a = hhoVar;
        this.b = kgcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.b(ffcu.a);
            this.b.c();
            kgc kgcVar = this.b;
            hfdVar.v(-560636975);
            kgb b = kgcVar.b();
            kfr a = b.a();
            kfr b2 = b.b();
            hve hveVar = hvi.e;
            hfdVar.v(1921581065);
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = wne.a;
                hfdVar.y(f);
            }
            hfdVar.o();
            doay.a(kgc.d(hveVar, a, (ffji) f), hfdVar, 0, 0);
            igq a2 = jie.a(R.drawable.creative_compose_illustration, hfdVar, 0);
            hvi k = ebs.k(hvi.e, 72.0f);
            hfdVar.v(1921591184);
            boolean D = hfdVar.D(a);
            Object f2 = hfdVar.f();
            if (D || f2 == hfc.a) {
                f2 = new wnf(a);
                hfdVar.y(f2);
            }
            hfdVar.o();
            dgx.a(a2, null, kgc.d(k, b2, (ffji) f2), null, null, 0.0f, null, hfdVar, 48, 120);
            hfdVar.o();
            hfdVar.v(-2087871650);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
