package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import defpackage.fieb;
import defpackage.fiec;
import defpackage.fied;
import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JavaHandlerThread {
    public final HandlerThread a;
    public Throwable b;

    public JavaHandlerThread(String str, int i) {
        this.a = new HandlerThread(str, i);
    }

    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    private final Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }

    private final boolean isAlive() {
        return this.a.isAlive();
    }

    private final void joinThread() {
        boolean z = false;
        while (!z) {
            try {
                this.a.join();
                z = true;
            } catch (InterruptedException unused) {
            }
        }
    }

    private final void listenForUncaughtExceptionsForTesting() {
        this.a.setUncaughtExceptionHandler(new fied(this));
    }

    private final void quitThreadSafely(long j) {
        new Handler(this.a.getLooper()).post(new fiec(this, j));
        this.a.getLooper().quitSafely();
    }

    private final void startAndInitialize(long j, long j2) {
        if (this.a.getState() == Thread.State.NEW) {
            this.a.start();
        }
        new Handler(this.a.getLooper()).post(new fieb(j, j2));
    }
}
