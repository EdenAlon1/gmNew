package com.google.android.apps.messaging.shared.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.app.UncaughtExceptionReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.arbi;
import defpackage.arbm;
import defpackage.cfyt;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.emwl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.fbad;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UncaughtExceptionReceiver extends arbi {
    public static final enru c = enru.c("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver");
    public cfyt d;
    public elbx e;

    @Override // defpackage.arbi, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final Throwable th;
        String str;
        final BroadcastReceiver.PendingResult goAsync;
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((arbm) fbad.a(context)).hA(this);
                    this.a = true;
                }
            }
        }
        ekzm b = this.e.b("UncaughtExceptionReceiver Receive broadcast");
        String str2 = null;
        try {
            try {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        th = new NullPointerException("UncaughtExceptionReceiver: Can't process uncaught exception: extras are missing");
                    } else {
                        Object obj = extras.get("throwable");
                        if (obj == null) {
                            th = new NullPointerException("UncaughtExceptionReceiver: Can't process uncaught exception: throwable is missing");
                        } else {
                            String name = obj.getClass().getName();
                            try {
                                str2 = obj.toString();
                                Throwable th2 = (Throwable) obj;
                                ensk h = c.h();
                                h.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) ((enrr) h).g(th2)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "getThrowable", 'S', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: reporting uncaught exception");
                                th = th2;
                            } catch (ClassCastException e) {
                                th = e;
                                str = str2;
                                str2 = name;
                                ensk j = c.j();
                                j.Y(ente.a, "Bugle");
                                ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "getThrowable", 87, "UncaughtExceptionReceiver.java")).D("UncaughtExceptionReceiver: Can't report uncaught exception: %s \"%s\" is not a Throwable. Reporting deserialization exception instead.", str2, str);
                                goAsync = goAsync();
                                this.d.b(th).f(RuntimeException.class, new eroh() { // from class: arbj
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        Throwable th3 = th;
                                        RuntimeException runtimeException = (RuntimeException) obj2;
                                        if (th3 instanceof CancellationException) {
                                            return elfo.d(th3);
                                        }
                                        UncaughtExceptionReceiver uncaughtExceptionReceiver = UncaughtExceptionReceiver.this;
                                        ensk j2 = UncaughtExceptionReceiver.c.j();
                                        j2.Y(ente.a, "Bugle");
                                        ((enrr) ((enrr) ((enrr) j2).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 115, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Exception while processing %s in uncaught exception handler. Processing that instead.", th3);
                                        return uncaughtExceptionReceiver.d.b(runtimeException);
                                    }
                                }, erpp.a).e(RuntimeException.class, new emwl() { // from class: arbk
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        Throwable th3 = th;
                                        RuntimeException runtimeException = (RuntimeException) obj2;
                                        if (th3 instanceof CancellationException) {
                                            return null;
                                        }
                                        ensk j2 = UncaughtExceptionReceiver.c.j();
                                        j2.Y(ente.a, "Bugle");
                                        ((enrr) ((enrr) ((enrr) j2).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 128, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Second Exception while processing %s in uncaught exception handler. Giving up.", th3);
                                        return null;
                                    }
                                }, erpp.a).b(new Runnable() { // from class: arbl
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ensk g = UncaughtExceptionReceiver.c.g();
                                        g.Y(ente.a, "Bugle");
                                        ((enrr) ((enrr) ((enrr) g).g(th)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 137, "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: Finishing UncaughtExceptionReceiver for");
                                        goAsync.finish();
                                    }
                                }, erpp.a);
                                b.close();
                            }
                        }
                    }
                } finally {
                }
            } catch (ClassCastException e2) {
                th = e2;
                str = str2;
            }
        } catch (RuntimeException e3) {
            ensk j2 = c.j();
            j2.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j2).g(e3)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "getThrowable", ']', "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: Can't report uncaught exception: Exception thrown during deserialization. Reporting deserialization exception instead.");
            th = e3;
        }
        goAsync = goAsync();
        try {
            this.d.b(th).f(RuntimeException.class, new eroh() { // from class: arbj
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    Throwable th3 = th;
                    RuntimeException runtimeException = (RuntimeException) obj2;
                    if (th3 instanceof CancellationException) {
                        return elfo.d(th3);
                    }
                    UncaughtExceptionReceiver uncaughtExceptionReceiver = UncaughtExceptionReceiver.this;
                    ensk j22 = UncaughtExceptionReceiver.c.j();
                    j22.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j22).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 115, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Exception while processing %s in uncaught exception handler. Processing that instead.", th3);
                    return uncaughtExceptionReceiver.d.b(runtimeException);
                }
            }, erpp.a).e(RuntimeException.class, new emwl() { // from class: arbk
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    Throwable th3 = th;
                    RuntimeException runtimeException = (RuntimeException) obj2;
                    if (th3 instanceof CancellationException) {
                        return null;
                    }
                    ensk j22 = UncaughtExceptionReceiver.c.j();
                    j22.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j22).g(runtimeException)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 128, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Second Exception while processing %s in uncaught exception handler. Giving up.", th3);
                    return null;
                }
            }, erpp.a).b(new Runnable() { // from class: arbl
                @Override // java.lang.Runnable
                public final void run() {
                    ensk g = UncaughtExceptionReceiver.c.g();
                    g.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) g).g(th)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 137, "UncaughtExceptionReceiver.java")).q("UncaughtExceptionReceiver: Finishing UncaughtExceptionReceiver for");
                    goAsync.finish();
                }
            }, erpp.a);
        } catch (RuntimeException e4) {
            ensk i = c.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(e4)).h("com/google/android/apps/messaging/shared/app/UncaughtExceptionReceiver", "passExceptionToSilentFeedbackManager", 143, "UncaughtExceptionReceiver.java")).t("UncaughtExceptionReceiver: Exception scheduling uncaught exception processing work for %s", th);
            goAsync.finish();
        }
        b.close();
    }
}
