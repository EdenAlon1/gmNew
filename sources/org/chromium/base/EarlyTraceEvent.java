package org.chromium.base;

import defpackage.fidx;
import defpackage.fiem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EarlyTraceEvent {
    static volatile int a;
    static final Object b = new Object();
    static final List c = new ArrayList();
    static final List d = new ArrayList();

    public static boolean getBackgroundStartupTracingFlag() {
        return false;
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        fiem b2 = fiem.b();
        try {
            fidx.a.edit().putBoolean("bg_startup_tracing", z).apply();
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void a() {
    }
}
