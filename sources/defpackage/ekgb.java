package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekgb implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ekgh a;

    public ekgb(ekgh ekghVar) {
        this.a = ekghVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        this.a.a.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        this.a.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        this.a.b.add(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        this.a.b.remove(activity);
        efbd.c();
        final ekgh ekghVar = this.a;
        if (!ekghVar.d && ekghVar.b.isEmpty() && ekghVar.a()) {
            MessageQueue myQueue = Looper.myQueue();
            final MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() { // from class: ekfy
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    final ekgh ekghVar2 = ekgh.this;
                    if (ekghVar2.d || !ekghVar2.b.isEmpty()) {
                        return false;
                    }
                    ekzz f = eleg.f("Recreating all activities");
                    try {
                        if (ekghVar2.a()) {
                            ekghVar2.d = true;
                            efbd.e(eldl.l(new Runnable() { // from class: ekfz
                                /* JADX WARN: Type inference failed for: r2v5, types: [ekap, java.lang.Object] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    for (ekbo ekboVar : ekgh.this.c.values()) {
                                        if (ekboVar.d()) {
                                            efbd.c();
                                            for (ekek ekekVar : ekboVar.b.values()) {
                                                if (ekekVar.f()) {
                                                    try {
                                                        ekcv ekcvVar = (ekcv) erqt.q(ekekVar.v.c());
                                                        ekcvVar.c();
                                                        ekeg b = ekcvVar.b();
                                                        eked.a(ekekVar.s.b().b(b.b, b.d), "Failed to commit to config");
                                                    } catch (ExecutionException e) {
                                                        throw new RuntimeException(e.getCause());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }));
                            Iterator it = ekghVar2.a.iterator();
                            while (it.hasNext()) {
                                klg.a((Activity) it.next());
                            }
                            efbd.e(new Runnable() { // from class: ekga
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ekgh.this.d = false;
                                }
                            });
                        }
                        ffig.a(f, null);
                        return false;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ffig.a(f, th);
                            throw th2;
                        }
                    }
                }
            };
            long j = eldl.a;
            final elat e = ekyf.e();
            myQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: elct
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    long j2 = eldl.a;
                    elat h = ekyf.h(ekyf.b(), elat.this);
                    try {
                        return idleHandler.queueIdle();
                    } finally {
                    }
                }
            });
        }
    }
}
