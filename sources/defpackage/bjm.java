package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjm {
    private static volatile ScheduledExecutorService a;

    private bjm() {
    }

    public static ScheduledExecutorService a() {
        if (a == null) {
            synchronized (bjm.class) {
                if (a == null) {
                    a = new bjh(new Handler(Looper.getMainLooper()));
                }
            }
        }
        return a;
    }
}
