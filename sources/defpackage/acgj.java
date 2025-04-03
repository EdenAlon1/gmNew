package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgj implements ljv, acgf {
    public static final cskc a = cskc.g("Bugle", "BugleSensorObserver");
    public final fazb b;
    public boolean c = false;
    private final ffbr d;
    private final errl e;
    private final ffbr f;
    private final ffbr g;
    private final Context h;

    public acgj(Context context, fazb fazbVar, ffbr ffbrVar, errl errlVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.h = context;
        this.b = fazbVar;
        this.d = ffbrVar;
        this.e = errlVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
        if (this.c) {
            acgg acggVar = (acgg) this.b.b();
            ListenableFuture listenableFuture = acggVar.j;
            if (listenableFuture != null) {
                listenableFuture.cancel(true);
            }
            acggVar.h.unregisterListener(acggVar);
            ((acgg) this.b.b()).i.remove(this);
        }
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        final cfva cfvaVar = acfp.a;
        cfvaVar.getClass();
        erqt.r(this.e.submit(new Callable() { // from class: acgh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Boolean) cfva.this.e();
            }
        }), axou.a(new acgi(this)), this.e);
    }

    @Override // defpackage.acgf
    public final void g() {
        if (((Boolean) adwg.a.e()).booleanValue()) {
            adtn adtnVar = (adtn) this.g.b();
            Context context = this.h;
            adtt adttVar = new adtt();
            adttVar.b(eoio.BUGLE_ADVANCED_FEEDBACK_SOURCE_SHAKE_GESTURE);
            adtnVar.b(context, adttVar.a());
            return;
        }
        ((altk) this.f.b()).aJ(2);
        eg egVar = (eg) ddzb.e(this.h);
        if (egVar == null) {
            acgq.a.r("No associated activity with the context, skip taking bug report");
            return;
        }
        if (egVar.isFinishing()) {
            acgq.a.r("Activity is finishing, can not show a dialog now");
            return;
        }
        fr a2 = egVar.a();
        if (a2.ai()) {
            acgq.a.r("Fragment manager has state saved, can not show a dialog now");
            return;
        }
        acgr acgrVar = new acgr();
        fbae.e(acgrVar);
        acgrVar.t(a2, "com.google.android.apps.messaging.TakeBugReportDialogFragment");
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
