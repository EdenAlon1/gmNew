package defpackage;

import android.os.PowerManager;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.ActionExecutorImpl;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bbdb implements Runnable {
    final /* synthetic */ bbdc a;

    public bbdb(bbdc bbdcVar) {
        this.a = bbdcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        csix.h();
        final bbdc bbdcVar = this.a;
        akzw akzwVar = bbdcVar.m;
        if (akzwVar != null) {
            akzwVar.c();
        } else {
            csix.c("ActionRunnable should have been queued before execution");
        }
        elfl g = ((areg) bbdcVar.l.b()).a() ? elfo.g(new Callable() { // from class: bbda
            @Override // java.util.concurrent.Callable
            public final Object call() {
                bbdc bbdcVar2 = bbdc.this;
                try {
                    PowerManager powerManager = (PowerManager) ((ActionExecutorImpl) bbdcVar2.c).c.getSystemService("power");
                    if (powerManager == null) {
                        return null;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, bbdcVar2.f.getClass().getName());
                    newWakeLock.acquire(TimeUnit.SECONDS.toMillis(3L));
                    return newWakeLock;
                } catch (RuntimeException e) {
                    ensk j = bbdc.a.j();
                    j.Y(ente.a, "BugleDataModel");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/action/execution/ActionRunnable", "acquireWakeLock", 157, "ActionRunnable.java")).t("failed to grab wakelock for %s", bbdcVar2.f);
                    return null;
                }
            }
        }, bbdcVar.i) : elfo.e(null);
        bbdd bbddVar = bbdcVar.c;
        Action action = bbdcVar.f;
        String str = bbdcVar.e;
        long j = bbdcVar.g;
        akzw a = ((ActionExecutorImpl) bbddVar).d.a(str, action.w, action.s);
        a.d(j);
        try {
            bbdcVar.b();
        } finally {
            a.c();
            bbdcVar.a(g);
        }
    }
}
