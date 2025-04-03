package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axmu extends axnb {
    public bbfr a;
    public elbx b;
    public baky c;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.b.b("CloudSyncInternalReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.CloudSync.Latency";
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        boolean z;
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -883916357) {
                if (hashCode == -525415832 && action.equals("com.google.android.apps.messaging.cloudsync.internal.action.SEND_MESSAGE_RESULT")) {
                    z = false;
                }
                z = -1;
            } else {
                if (action.equals("com.google.android.apps.messaging.cloudsync.internal.action.ACTION_ATTACHMENTS_DOWNLOADED")) {
                    z = true;
                }
                z = -1;
            }
            if (!z) {
                this.a.a(bdhb.b(intent.getStringExtra("com.google.android.apps.messaging.cloudsync.internal.extra.REQUEST_ID")), intent.getStringExtra("com.google.android.apps.messaging.cloudsync.extra.ID"), intent.getIntExtra("com.google.android.apps.messaging.cloudsync.internal.extra.SUB_ID", -1), getResultCode()).r(this);
                return;
            }
            if (!z) {
                return;
            }
            baky bakyVar = this.c;
            int i = getResultCode() != -1 ? 2 : 0;
            String stringExtra = intent.getStringExtra("com.google.android.apps.messaging.cloudsync.extra.ID");
            String[] stringArrayExtra = intent.getStringArrayExtra("com.google.android.apps.messaging.cloudsync.extra.ATTACHMENTS_TYPES");
            String[] stringArrayExtra2 = intent.getStringArrayExtra("com.google.android.apps.messaging.cloudsync.extra.ATTACHMENTS_VALUES");
            Bundle extras = intent.getExtras();
            stringArrayExtra.getClass();
            stringArrayExtra2.getClass();
            extras.getClass();
            new ProcessDownloadedMmsAction(bakyVar.c, bakyVar.b, i, stringExtra, stringArrayExtra, stringArrayExtra2, extras).A();
        }
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 18;
    }
}
