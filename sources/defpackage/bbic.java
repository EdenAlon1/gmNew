package defpackage;

import androidx.car.app.model.Alert;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbic {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/backup/analytics/BackupEventLogger");
    public final ffsk b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public bbic(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.b = ffskVar;
        this.e = ffbrVar3;
    }

    public static final int b(int i, Duration duration) {
        if (duration.toMillis() == 0) {
            return 0;
        }
        double millis = (i / duration.toMillis()) * 1000.0d;
        return millis < eobe.a ? Alert.DURATION_SHOW_INDEFINITELY : (int) millis;
    }

    public final void a(eolu eoluVar, boolean z) {
        akxn a2 = ((akyb) ((z || !((aucj) this.e.b()).a()) ? this.c : this.d).b()).a();
        a2.d(epyw.BACKUP_WORKFLOW_EVENT);
        a2.j(eoluVar, alal.LOG_SPEC_BACKUP_WORKFLOW_EVENTS);
    }
}
