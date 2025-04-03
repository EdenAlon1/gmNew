package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbdz extends bbdc {
    private static final cskc n = cskc.g("BugleDataModel", "BackgroundWorkerRunnable");

    public bbdz(bbcj bbcjVar, Action action, bbdd bbddVar, errl errlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        super(bbcjVar, action, "Bugle.DataModel.ActionBreakdown.BackgroundExecution.Latency", 30174L, bbddVar, errlVar, ffbrVar, ffbrVar2, ffbrVar3);
    }

    @Override // defpackage.bbdc
    public final void b() {
        ArrayList arrayList;
        csjb a = n.a();
        a.I("running BackgroundWork ");
        a.v(this.f.getClass().getSimpleName());
        a.r();
        ekzz f = eleg.f("BackgroundWorkerRunnable#runImpl");
        try {
            bbcd.e(this.f, 4, 5);
            try {
                try {
                    ekzz a2 = this.f.a();
                    try {
                        Bundle bundle = (Bundle) this.f.fS().get();
                        a2.close();
                        bbcd.e(this.f, 5, 6);
                        this.c.f(new bbdy(this.d, this.f, bundle, this.c, this.i, this.j, this.k, this.l), "Bugle.DataModel.ActionBreakdown.ResponseQueue.Latency");
                        this.c.d("ACTION_RESPONSE_QUEUED_", this.f);
                    } finally {
                    }
                } catch (ExecutionException e) {
                    if (e.getCause() instanceof RuntimeException) {
                        throw ((RuntimeException) e.getCause());
                    }
                    if (!(e.getCause() instanceof Exception)) {
                        throw e;
                    }
                    throw ((Exception) e.getCause());
                }
            } catch (Exception e2) {
                Exception exc = e2;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                if (!((Boolean) b.e()).booleanValue()) {
                    csix.p(String.format("Aborting due to unexpected error (%s) in background worker", exc.getClass().getSimpleName()), exc);
                    n.o("Error in background worker.", exc);
                    bbcd.e(this.f, 5, 6);
                    this.c.f(new bbdx(this.d, this.f, exc, this.c, this.i, this.j, this.k, this.l), "Bugle.DataModel.ActionBreakdown.FailureQueue.Latency");
                    this.c.d("ACTION_ERROR_QUEUED_", this.f);
                } else if (((arei) this.j.b()).a() && (exc instanceof CancellationException)) {
                    n.s("future failed due to CancellationException", exc);
                } else {
                    if (((areh) this.k.b()).a() && (arrayList = this.f.x) != null) {
                        exc = Action.o(arrayList, exc);
                    }
                    n.o("Fatal Error in action", exc);
                    axnw.d(exc);
                }
            }
            f.close();
        } finally {
        }
    }
}
