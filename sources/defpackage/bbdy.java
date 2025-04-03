package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbdy extends bbdc {
    private static final cskc n = cskc.g("BugleDataModel", "BackgroundResponseRunnable");
    private final Bundle o;

    public bbdy(bbcj bbcjVar, Action action, Bundle bundle, bbdd bbddVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        super(bbcjVar, action, "Bugle.DataModel.ActionBreakdown.ResponseExecution.Latency", 2785L, bbddVar, errlVar, ffbrVar, ffbrVar2, ffbrVar3);
        this.o = bundle;
    }

    @Override // defpackage.bbdc
    public final void b() {
        final Action action;
        final Bundle bundle;
        ekzz f;
        try {
            action = this.f;
            bundle = this.o;
            f = eleg.f("BackgroundResponseRunnable#processBackgroundWorkResponse");
        } catch (Throwable th) {
            th = th;
            try {
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                if (((areh) this.k.b()).a()) {
                    th = this.f.u(th);
                }
                if (((Boolean) b.e()).booleanValue()) {
                    n.o(String.valueOf(this.f) + ".processBackgroundWorkResponse threw", th);
                    axnw.d(th);
                } else {
                    csix.p(String.valueOf(this.f) + ".processBackgroundWorkResponse threw " + th.toString(), th);
                }
            } finally {
                this.c.e(this.f, this.d);
            }
        }
        try {
            bbcd.e(action, 6, 7);
            ekzz a = action.a();
            try {
                Object obj = elfo.g(new Callable() { // from class: bbbu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Action.this.fU(bundle);
                    }
                }, erpp.a).get();
                a.close();
                bbcd.c(action, 7, obj, true);
                f.close();
            } finally {
            }
        } finally {
        }
    }
}
