package com.google.android.apps.messaging.rcsmigration;

import android.content.Intent;
import android.os.IBinder;
import defpackage.ajnr;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RcsMigrationService extends ajnr {
    private static final enru c = enru.c("com/google/android/apps/messaging/rcsmigration/RcsMigrationService");
    public ffbr a;
    public ffbr b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        IBinder iBinder;
        ekzm b = ((elbx) this.b.b()).b("RcsMigrationService::onBind");
        try {
            int intExtra = intent.getIntExtra("expected_version", -1);
            if (intExtra == 1) {
                ensk h = c.h();
                h.Y(ente.a, "BugleDataModel");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/rcsmigration/RcsMigrationService", "runOnBind", 41, "RcsMigrationService.java")).q("RcsMigrationService: Returning RCS state provider.");
                iBinder = (IBinder) this.a.b();
            } else {
                ensk j = c.j();
                j.Y(ente.a, "BugleDataModel");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/rcsmigration/RcsMigrationService", "runOnBind", 44, "RcsMigrationService.java")).u("RcsMigrationService: Version not supported returning null. Current Version:%d Expected Version:%d", 1, intExtra);
                iBinder = null;
            }
            b.close();
            return iBinder;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
