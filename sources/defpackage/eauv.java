package defpackage;

import android.content.BroadcastReceiver;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eauv implements eaim {
    public static final entd a = entd.c("GnpSdk");
    private final errl b;
    private final ejjz c;
    private final ejlk d;

    public eauv(errl errlVar, ejjz ejjzVar, ejlk ejlkVar) {
        this.b = errlVar;
        this.c = ejjzVar;
        this.d = ejlkVar;
    }

    @Override // defpackage.eaim
    public final void a(BroadcastReceiver.PendingResult pendingResult, boolean z, Runnable runnable, eafp eafpVar) {
        int hashCode = runnable.hashCode();
        ((ensz) ((ensz) a.h()).h("com/google/android/libraries/notifications/platform/tiktok/executor/GnpExecutorApiImpl", "executeInBroadcast", 107, "GnpExecutorApiImpl.java")).r("Submitting Broadcast execution [%d] to tiktok executor.", hashCode);
        ListenableFuture submit = this.b.submit(eldl.l(runnable));
        ejjz ejjzVar = this.c;
        ejjzVar.g(submit);
        ejjzVar.e(submit, 60L, TimeUnit.SECONDS);
        final eail eailVar = new eail(pendingResult, z, hashCode);
        if (!eafpVar.e()) {
            ejlk ejlkVar = this.d;
            Runnable runnable2 = new Runnable() { // from class: eaut
                @Override // java.lang.Runnable
                public final void run() {
                    eail.this.a();
                }
            };
            Long b = eafpVar.b();
            b.getClass();
            ejlkVar.postDelayed(runnable2, Math.max(0L, b.longValue() - (SystemClock.uptimeMillis() - eafpVar.a())));
        }
        submit.b(new eauu(eailVar, hashCode), erpp.a);
    }

    @Override // defpackage.eaim
    public final void b(Runnable runnable) {
        ListenableFuture submit = this.b.submit(eldl.l(runnable));
        this.c.f(submit);
        this.c.e(submit, 60L, TimeUnit.SECONDS);
    }
}
