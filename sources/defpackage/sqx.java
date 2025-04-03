package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.backup.g1.GoogleOneRestoreService;
import com.google.android.libraries.subscriptions.restore.IG1Restore;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqx extends IG1Restore.Stub {
    final /* synthetic */ GoogleOneRestoreService a;

    public sqx(GoogleOneRestoreService googleOneRestoreService) {
        this.a = googleOneRestoreService;
    }

    @Override // com.google.android.libraries.subscriptions.restore.IG1Restore
    public final int requestRestore(Uri uri, Uri uri2, Uri uri3) {
        this.a.c.c("Bugle.Backup.G1.RestoreIntent.Counts");
        try {
            int requestRestore = this.a.b.requestRestore(uri, uri2, uri3);
            if (requestRestore != 0) {
                return requestRestore;
            }
            this.a.c.c("Bugle.Backup.G1.RestoreSuccess.Counts");
            ((coxg) this.a.d.b()).k(eqqh.GOOGLE_ONE_RESTORE);
            return 0;
        } catch (Exception e) {
            if (e instanceof SecurityException) {
                throw e;
            }
            ensk i = GoogleOneRestoreService.a.i();
            i.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/backup/g1/GoogleOneRestoreService$IG1RestoreWrapper", "requestRestore", 54, "GoogleOneRestoreService.java")).t("Error in restoring G1 backup:%s", e);
            return 1;
        }
    }
}
