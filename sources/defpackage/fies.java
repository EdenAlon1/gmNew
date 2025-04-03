package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import internal.J.N;
import java.util.ArrayList;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.TraceEvent;
import org.chromium.base.task.PostTask;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fies implements MessageQueue.IdleHandler {
    public static boolean a;
    public static fies b;
    private long c;

    public static void a() {
        PostTask.b(new Runnable() { // from class: fier
            @Override // java.lang.Runnable
            public final void run() {
                if (!N.MnfJQqTB()) {
                    if (fies.b == null || !fies.a) {
                        return;
                    }
                    Looper.myQueue().removeIdleHandler(fies.b);
                    fies.a = false;
                    return;
                }
                if (fies.b == null) {
                    fies.b = new fies();
                }
                if (fies.a) {
                    return;
                }
                Looper.myQueue().addIdleHandler(fies.b);
                fies.a = true;
            }
        });
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.c;
        if (j != 0 && elapsedRealtime - j <= 1000) {
            return true;
        }
        this.c = elapsedRealtime;
        if (!TraceEvent.a || !N.MnfJQqTB()) {
            return true;
        }
        TraceEvent.b("instantAndroidViewHierarchy", null);
        ApplicationStatus.b();
        final ArrayList arrayList = new ArrayList();
        if (arrayList.isEmpty()) {
            TraceEvent.d();
            return true;
        }
        final long hashCode = arrayList.hashCode();
        PostTask.a(0, new Runnable() { // from class: fien
            @Override // java.lang.Runnable
            public final void run() {
                N.Ml5G_GLY(hashCode, arrayList);
            }
        });
        TraceEvent.c(hashCode);
        return true;
    }
}
