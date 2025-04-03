package org.chromium.base;

import defpackage.fidt;
import defpackage.fidu;
import defpackage.fiei;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.task.PostTask;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ApplicationStatus {
    public static final Map a = DesugarCollections.synchronizedMap(new HashMap());
    public static fidu b;
    public static fiei c;

    static {
        DesugarCollections.synchronizedMap(new HashMap());
    }

    private ApplicationStatus() {
    }

    public static void a(fidu fiduVar) {
        if (c == null) {
            c = new fiei();
        }
        c.d(fiduVar);
    }

    public static void b() {
        synchronized (a) {
        }
    }

    public static int getStateForApplication() {
        synchronized (a) {
        }
        return 0;
    }

    public static boolean hasVisibleActivities() {
        getStateForApplication();
        return false;
    }

    private static void registerThreadSafeNativeApplicationStateListener() {
        PostTask.b(new fidt());
    }
}
