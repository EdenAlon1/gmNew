package defpackage;

import android.R;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwww implements dwqq {
    final /* synthetic */ dxbq a;
    final /* synthetic */ dwqp b;
    final /* synthetic */ kml c;
    final /* synthetic */ kno d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    final /* synthetic */ dwxa g;

    public dwww(dwxa dwxaVar, dxbq dxbqVar, dwqp dwqpVar, kml kmlVar, kno knoVar, int i, String str) {
        this.a = dxbqVar;
        this.b = dwqpVar;
        this.c = kmlVar;
        this.d = knoVar;
        this.e = i;
        this.f = str;
        this.g = dwxaVar;
    }

    @Override // defpackage.dwqq
    public final void a(long j) {
        ListenableFuture d = this.g.g.d(((dxbp) this.a).a);
        final dwqp dwqpVar = this.b;
        final kml kmlVar = this.c;
        final kno knoVar = this.d;
        final int i = this.e;
        elfr.k(d, new eroh() { // from class: dwws
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                emxc emxcVar = (emxc) obj;
                if (!emxcVar.g()) {
                    return erre.a;
                }
                if (((ListenableFuture) emxcVar.c()).isDone()) {
                    return erre.a;
                }
                dwoe dwoeVar = (dwoe) dwqp.this;
                if (dwoeVar.g == 2) {
                    int i2 = i;
                    kno knoVar2 = knoVar;
                    kml kmlVar2 = kmlVar;
                    kmlVar2.A = "progress";
                    kmlVar2.r(R.drawable.stat_sys_download);
                    kmlVar2.h(dwoeVar.a);
                    kmlVar2.q(0, 0, true);
                    knoVar2.f(i2, kmlVar2.a());
                }
                return erre.a;
            }
        }, this.g.i);
    }

    @Override // defpackage.dwqq
    public final void b() {
        ListenableFuture c = this.g.g.c(((dxbp) this.a).a);
        final dwqp dwqpVar = this.b;
        final kml kmlVar = this.c;
        final String str = this.f;
        final kno knoVar = this.d;
        final int i = this.e;
        elfr.k(c, new eroh() { // from class: dwwv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (((Boolean) obj).booleanValue() && ((dwoe) dwqp.this).g == 2) {
                    int i2 = i;
                    kno knoVar2 = knoVar;
                    String str2 = str;
                    kml kmlVar2 = kmlVar;
                    kmlVar2.A = "status";
                    kmlVar2.h(str2);
                    kmlVar2.r(R.drawable.stat_sys_download);
                    kmlVar2.o(true);
                    kmlVar2.q(0, 0, false);
                    knoVar2.f(i2, kmlVar2.a());
                }
                return erre.a;
            }
        }, this.g.i);
    }

    @Override // defpackage.dwqq
    public final void c() {
        final dwqp dwqpVar = this.b;
        final kml kmlVar = this.c;
        final dxbq dxbqVar = this.a;
        elfr.i(new erog() { // from class: dwwt
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dwoe dwoeVar = (dwoe) dwqpVar;
                int i = dwoeVar.g;
                dwww dwwwVar = dwww.this;
                if (i == 2) {
                    kmlVar.b.clear();
                    new kno(dwwwVar.g.a).d(null, dwoeVar.a.hashCode());
                }
                dxbq dxbqVar2 = dxbqVar;
                dwxa dwxaVar = dwwwVar.g;
                ((dxxc) dwxaVar.j.c()).j(dwoeVar.a);
                return dwwwVar.g.g.e(((dxbp) dxbqVar2).a);
            }
        }, this.g.i);
    }
}
