package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgz {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor");
    public final ffbr b;
    public final ffbr c;
    private final cetc d;

    public cfgz(cetc cetcVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.d = cetcVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    final void a(elfl elflVar, cety cetyVar, cevc cevcVar) {
        this.d.c(elflVar);
        int ordinal = cevcVar.ordinal();
        if (ordinal == 0) {
            throw new IllegalStateException("Unexpected value: ".concat(String.valueOf(String.valueOf(cevcVar))));
        }
        if (ordinal == 1 || ordinal == 2) {
            try {
                this.d.a(elflVar);
                return;
            } catch (IllegalStateException unused) {
                ensk h = a.h();
                h.Y(ente.a, "BugleWorkQueue");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueWorkerExecutor", "keepAlive", 94, "WorkQueueWorkerExecutor.java")).q("unable to attach service -- probably in background already");
                if (cevcVar != cevc.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE) {
                    return;
                }
            }
        } else if (ordinal != 3) {
            return;
        }
        Notification notification = ((cetj) cetyVar).g;
        if (notification == null) {
            throw new IllegalStateException("cannot be null");
        }
        this.d.e(elflVar, notification, 13);
    }
}
