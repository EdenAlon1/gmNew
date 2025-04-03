package com.google.android.apps.messaging.backup.g1;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.libraries.subscriptions.restore.IG1Restore;
import defpackage.akzt;
import defpackage.enru;
import defpackage.ffbr;
import defpackage.sqx;
import defpackage.sqy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GoogleOneRestoreService extends sqy {
    public static final enru a = enru.c("com/google/android/apps/messaging/backup/g1/GoogleOneRestoreService");
    public IG1Restore.Stub b;
    public akzt c;
    public ffbr d;
    private final IG1Restore.Stub e = new sqx(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null || !"com.android.Bugle.intent.action.RESTORE_ACTION".equals(intent.getAction())) {
            return null;
        }
        return this.e;
    }
}
