package defpackage;

import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwwq implements erqj {
    final /* synthetic */ dwqq a;

    public dwwq(dwqq dwqqVar) {
        this.a = dwqqVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        dwns dwnsVar = (dwns) obj;
        try {
            this.a.c();
        } catch (Exception e) {
            dxth.q(e, "%s: Listener onComplete failed for group %s", "MobileDataDownload", dwnsVar.c);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        final dwww dwwwVar = (dwww) this.a;
        final dxbq dxbqVar = dwwwVar.a;
        final int i = dwwwVar.e;
        final kno knoVar = dwwwVar.d;
        final kml kmlVar = dwwwVar.c;
        final dwqp dwqpVar = dwwwVar.b;
        elfr.i(new erog() { // from class: dwwu
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dwoe dwoeVar = (dwoe) dwqpVar;
                int i2 = dwoeVar.g;
                dwww dwwwVar2 = dwww.this;
                if (i2 == 2) {
                    int i3 = i;
                    kno knoVar2 = knoVar;
                    kml kmlVar2 = kmlVar;
                    kmlVar2.b.clear();
                    kmlVar2.A = "status";
                    kmlVar2.h(dwwwVar2.g.a.getResources().getString(R.string.mdd_notification_download_failed));
                    kmlVar2.o(false);
                    kmlVar2.r(android.R.drawable.stat_sys_warning);
                    kmlVar2.q(0, 0, false);
                    knoVar2.f(i3, kmlVar2.a());
                }
                dxbq dxbqVar2 = dxbqVar;
                dwxa dwxaVar = dwwwVar2.g;
                ((dxxc) dwxaVar.j.c()).j(dwoeVar.a);
                return dwwwVar2.g.g.e(((dxbp) dxbqVar2).a);
            }
        }, dwwwVar.g.i);
    }
}
