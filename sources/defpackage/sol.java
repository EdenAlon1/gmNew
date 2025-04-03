package defpackage;

import com.google.android.apps.messaging.backup.BugleBackupAgent;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sol implements ctwa {
    final /* synthetic */ Charset a;
    final /* synthetic */ enhd b;
    final /* synthetic */ BugleBackupAgent c;

    public sol(BugleBackupAgent bugleBackupAgent, Charset charset, enhd enhdVar) {
        this.a = charset;
        this.b = enhdVar;
        this.c = bugleBackupAgent;
    }

    @Override // defpackage.ctwa
    public final boolean a(int i) {
        String w = this.c.c.h(i).w();
        if (w == null) {
            ensk j = BugleBackupAgent.a.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/backup/BugleBackupAgent$1", "callForSubscription", 755, "BugleBackupAgent.java")).r("SIM ICCID for active subscription ID %d is null. Skipping.", i);
            return true;
        }
        int i2 = eodh.a;
        String eodbVar = eodf.a.c(w, this.a).toString();
        ensk e = BugleBackupAgent.a.e();
        e.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/backup/BugleBackupAgent$1", "callForSubscription", 765, "BugleBackupAgent.java")).J("SIM ICCID for active subscription ID %d is \"%s\" (SHA-256: %s).", Integer.valueOf(i), w, cskt.b(eodbVar));
        this.b.k(this.c.j.a(i).a(), "bugleuniqsub_".concat(eodbVar));
        return true;
    }
}
