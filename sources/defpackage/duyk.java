package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duyk {
    public final duyp a;
    private final String b;

    public duyk(duyj duyjVar, Class cls, Executor executor) {
        Class<?> cls2 = duyjVar.getClass();
        String b = dvah.b(dvah.a(cls) + "->" + dvah.a(cls2));
        duyp duypVar = (duyp) duyp.a.get(executor);
        duypVar = duypVar == null ? new duyp(executor, false) : duypVar;
        this.b = b;
        this.a = duypVar;
    }

    final void a(Class cls, duyc duycVar, duyj duyjVar) {
        String str = this.b;
        dvag b = duyi.b(String.valueOf(str).concat(".enqueue"));
        duyp duypVar = this.a;
        try {
            synchronized (duypVar.e) {
                duycVar.a();
                duypVar.e.offerLast(new duyo(str, cls, duycVar, duyjVar));
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void b() {
        final duyp duypVar = this.a;
        duypVar.b.execute(new Runnable() { // from class: duyn
            @Override // java.lang.Runnable
            public final void run() {
                AtomicBoolean atomicBoolean;
                duyo duyoVar;
                duyp duypVar2 = duyp.this;
                AtomicBoolean atomicBoolean2 = duypVar2.d;
                if (atomicBoolean2 != null && !atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    boolean d = dunl.d(duypVar2.b);
                    ArrayList arrayList = null;
                    while (true) {
                        synchronized (duypVar2.e) {
                            duyoVar = (duyo) duypVar2.e.pollFirst();
                        }
                        if (duyoVar == null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (arrayList != null && elapsedRealtime2 > 20) {
                                ((enrr) ((enrr) duyi.a.j()).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter$NotificationQueue", "notifyPendingNotificationsOnExecutor", 877, "NotificationCenter.java")).C("Heavy notify work detected on UI thread: %s takes %sms", arrayList, elapsedRealtime2);
                            }
                            if (atomicBoolean != null) {
                                return;
                            } else {
                                return;
                            }
                        }
                        dvag b = duyi.b(String.valueOf(duyoVar.a).concat(".notifyOnExecutor"));
                        try {
                            try {
                                duyc duycVar = duyoVar.c;
                                if (duycVar == duyi.b) {
                                    duyoVar.d.b(duyoVar.b);
                                } else {
                                    duyoVar.d.c(duycVar);
                                }
                            } catch (Exception e) {
                                if (duzy.a) {
                                    throw new AssertionError("Failed to notify " + duyoVar.a, e);
                                }
                                ((enrr) ((enrr) ((enrr) duyi.a.i()).g(e)).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter$NotificationQueue", "notifyPendingNotificationsOnExecutor", 865, "NotificationCenter.java")).t("Failed to notify %s", duyoVar.a);
                            }
                            if (arrayList == null && d) {
                                arrayList = new ArrayList();
                            }
                            if (arrayList != null) {
                                arrayList.add(duyoVar.a);
                            }
                            b.close();
                        } finally {
                        }
                    }
                } finally {
                    atomicBoolean = duypVar2.d;
                    if (atomicBoolean != null) {
                        atomicBoolean.set(false);
                    }
                }
            }
        });
    }
}
