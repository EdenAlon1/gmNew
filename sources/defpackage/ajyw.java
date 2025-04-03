package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajyw {
    public static final enru a = enru.c("com/google/android/apps/messaging/restore/analytics/BasicRestoreWorkflowStepsEventLoggers");
    public final ffbr b;
    private final cqoh c;
    private final ffsk d;

    public ajyw(ffbr ffbrVar, cqoh cqohVar, ffsk ffskVar) {
        ffbrVar.getClass();
        cqohVar.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = cqohVar;
        this.d = ffskVar;
    }

    public static /* synthetic */ void b(ajyw ajywVar, eqza eqzaVar, UUID uuid, int i, int i2, int i3, akdb akdbVar, Duration duration, int i4) {
        akdb akdbVar2 = (i4 & 32) != 0 ? akdb.UNDEFINED : akdbVar;
        int i5 = i4 & 8;
        int i6 = i4 & 4;
        int i7 = (i4 & 16) != 0 ? 0 : i3;
        ajywVar.a(eqzaVar, uuid, i6 != 0 ? 0 : i, i5 != 0 ? 0 : i2, i7, akdbVar2, duration, null);
    }

    public static /* synthetic */ void c(ajyw ajywVar, eqza eqzaVar, UUID uuid, Duration duration, eqyv eqyvVar, int i) {
        akdb akdbVar = (i & 64) != 0 ? akdb.UNDEFINED : null;
        eqyv eqyvVar2 = (i & 128) != 0 ? null : eqyvVar;
        eqzaVar.getClass();
        uuid.getClass();
        duration.getClass();
        akdbVar.getClass();
        Duration minus = Duration.ofMillis(ajywVar.c.a()).minus(duration);
        minus.getClass();
        ajywVar.a(eqzaVar, uuid, 0, 0, 0, akdbVar, minus, eqyvVar2);
    }

    public static /* synthetic */ Duration d(ajyw ajywVar, eqza eqzaVar, UUID uuid, Integer num, boolean z, int i) {
        eqza eqzaVar2;
        ajza ajzaVar;
        akdb akdbVar = (i & 4) != 0 ? akdb.UNDEFINED : null;
        Integer num2 = (i & 8) != 0 ? null : num;
        boolean z2 = (!((i & 16) == 0)) | z;
        eqzaVar.getClass();
        uuid.getClass();
        akdbVar.getClass();
        try {
            ajzaVar = (ajza) ajywVar.b.b();
            eqzaVar2 = eqzaVar;
        } catch (Exception e) {
            e = e;
            eqzaVar2 = eqzaVar;
        }
        try {
            axol.k(ajzaVar.b, null, new ajyz(ajzaVar, z2, eqzaVar2, uuid, akdbVar, num2, null), 3);
        } catch (Exception e2) {
            e = e2;
            ensk j = a.j();
            j.Y(ente.a, "BugleBackup");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/restore/analytics/BasicRestoreWorkflowStepsEventLoggers", "logStartEvent", 39, "BasicRestoreWorkflowStepsEventLoggers.kt")).t("Failed to log start event for: %s", eqzaVar2);
            Duration ofMillis = Duration.ofMillis(ajywVar.c.a());
            ofMillis.getClass();
            return ofMillis;
        }
        Duration ofMillis2 = Duration.ofMillis(ajywVar.c.a());
        ofMillis2.getClass();
        return ofMillis2;
    }

    public static /* synthetic */ void e(ajyw ajywVar, eqza eqzaVar, int i, UUID uuid, eqys eqysVar, int i2) {
        akdb akdbVar = (i2 & 8) != 0 ? akdb.UNDEFINED : null;
        UUID uuid2 = (i2 & 4) != 0 ? null : uuid;
        eqys eqysVar2 = (i2 & 16) != 0 ? null : eqysVar;
        eqzaVar.getClass();
        akdbVar.getClass();
        axol.k(ajywVar.d, null, new ajyv(ajywVar, eqzaVar, uuid2, i, akdbVar, eqysVar2, null), 3);
    }

    public final void a(eqza eqzaVar, UUID uuid, int i, int i2, int i3, akdb akdbVar, Duration duration, eqyv eqyvVar) {
        eqzaVar.getClass();
        uuid.getClass();
        akdbVar.getClass();
        axol.k(this.d, null, new ajyu(this, eqzaVar, uuid, duration, i, i2, i3, akdbVar, eqyvVar, null), 3);
    }
}
