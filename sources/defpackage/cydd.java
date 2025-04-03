package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydd implements cxyl {
    public static final cskc a = cskc.g("Bugle", "DelayBanner");
    public final cxyg b;
    private final Context c;
    private final cyai d;
    private final ejwl e;
    private final cydk f;

    public cydd(Context context, cyai cyaiVar, ejwl ejwlVar, cydk cydkVar, cxyg cxygVar) {
        this.c = context;
        this.d = cyaiVar;
        this.e = ejwlVar;
        this.f = cydkVar;
        this.b = cxygVar;
    }

    @Override // defpackage.cxyl
    public final cxyh d() {
        return new cxxy("DelayBanner", true);
    }

    @Override // defpackage.cxyl
    public final cxyq e() {
        return this.d.a(this.c);
    }

    @Override // defpackage.cxyl
    public final void l() {
        final cydk cydkVar = this.f;
        this.e.b(new ejuy(cydkVar.a, new eros() { // from class: cydi
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(elfl.g(cydk.this.b.schedule(new Callable() { // from class: cydj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return false;
                    }
                }, ((Integer) cydm.a.e()).intValue(), TimeUnit.MILLISECONDS)));
            }
        }, "DELAY_BANNER_STATE_KEY"), new ejwd<Boolean>() { // from class: cydd.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                cydd.a.r("Error getting delay banner");
                cydd cyddVar = cydd.this;
                cyddVar.b.a(cyddVar, false);
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                cydd cyddVar = cydd.this;
                cyddVar.b.a(cyddVar, false);
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        });
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.cxyl
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.cxyl
    public final void k() {
    }
}
