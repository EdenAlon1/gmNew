package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhhg extends AbstractContactsSyncServiceCallbacks {
    final /* synthetic */ dhri a;

    public dhhg(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.people.contactssync.internal.AbstractContactsSyncServiceCallbacks, com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks
    public final void onGetBackupAndSyncOptInState(Status status, BackupAndSyncOptInState backupAndSyncOptInState) {
        if (!status.d()) {
            dfup.b(status, null, this.a);
            return;
        }
        int i = backupAndSyncOptInState.c;
        int i2 = dhhl.a;
        int i3 = 1;
        if (i != 1) {
            i3 = 2;
            if (i != 2) {
                i3 = 3;
                if (i != 3) {
                    i3 = 0;
                }
            }
        }
        dfup.b(status, new DeviceContactsSyncSetting(i3), this.a);
    }
}
