package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egvu implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ hho b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffji d;
    final /* synthetic */ Context e;
    final /* synthetic */ ada f;
    final /* synthetic */ Uri g;
    final /* synthetic */ ada h;
    final /* synthetic */ ada i;
    final /* synthetic */ boolean j;
    final /* synthetic */ ffji k;
    final /* synthetic */ egse l;

    public egvu(ffix ffixVar, hho hhoVar, boolean z, ffji ffjiVar, egse egseVar, Context context, ada adaVar, Uri uri, ada adaVar2, ada adaVar3, boolean z2, ffji ffjiVar2) {
        this.a = ffixVar;
        this.b = hhoVar;
        this.c = z;
        this.d = ffjiVar;
        this.l = egseVar;
        this.e = context;
        this.f = adaVar;
        this.g = uri;
        this.h = adaVar2;
        this.i = adaVar3;
        this.j = z2;
        this.k = ffjiVar2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((egtj) obj).getClass();
        gmk f = gim.f(true, hfdVar, 6, 2);
        long j = gft.a(hfdVar).F;
        long j2 = gft.a(hfdVar).q;
        hve hveVar = hvi.e;
        hfdVar.v(1257048657);
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new ffji() { // from class: egvd
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    jkv jkvVar = (jkv) obj4;
                    jkvVar.getClass();
                    jkr.u(jkvVar, "photoEditBottomSheet");
                    return ffcu.a;
                }
            };
            hfdVar.y(f2);
        }
        hfdVar.o();
        c = jjs.c(hveVar, false, (ffji) f2);
        dwhz.a(this.a, c, f, 0.0f, false, null, j, j2, 0.0f, 0L, null, null, null, hpx.d(720305858, new egvt(this.b, this.c, this.d, this.l, this.e, this.f, this.g, this.h, this.i, this.j, this.k), hfdVar), hfdVar, 0, 3072, 7992);
        return ffcu.a;
    }
}
