package org.chromium.base;

import defpackage.fiee;
import defpackage.iy$$ExternalSyntheticApiModelOutline3;
import internal.J.N;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler a;
    private final boolean b;
    private boolean c;

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.a = uncaughtExceptionHandler;
        this.b = z;
    }

    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (!this.c && !iy$$ExternalSyntheticApiModelOutline3.m437m((Object) th)) {
            this.c = true;
            N.MLlibBXh(this.b, th instanceof fiee ? th.getCause() : th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
