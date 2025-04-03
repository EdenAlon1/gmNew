package org.chromium.base.task;

import android.os.Looper;
import defpackage.fiey;
import defpackage.fiez;
import defpackage.fifc;
import defpackage.fifd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.base.ThreadUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class PostTask {
    public static volatile Executor d;
    private static volatile boolean e;
    public static final Object a = new Object();
    public static List b = new ArrayList();
    public static fiey c = new fiey();
    private static final fiez[] f = new fiez[9];

    static {
        for (int i = 0; i <= 5; i++) {
            f[i] = new fifc(i);
        }
        for (int i2 = 6; i2 <= 8; i2++) {
            f[i2] = new fifd(i2);
        }
    }

    public static void a(int i, Runnable runnable) {
        f[i].a(runnable);
    }

    public static void b(Runnable runnable) {
        if (ThreadUtils.a().getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            a(7, runnable);
        }
    }

    private static void onNativeSchedulerReady() {
        List list;
        if (e) {
            return;
        }
        e = true;
        synchronized (a) {
            list = b;
            b = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((fifc) it.next()).b();
        }
    }
}
