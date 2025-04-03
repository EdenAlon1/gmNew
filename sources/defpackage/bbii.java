package defpackage;

import android.util.Pair;
import j$.time.Duration;
import j$.time.Instant;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbii {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher");
    public final ffbr b;
    public final ffbr c;
    public final cqoh d;

    public bbii(ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        cqohVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = cqohVar;
    }

    public static final void g(dtve dtveVar, dtve dtveVar2, String str) {
        String h = h(dtveVar);
        String h2 = h(dtveVar2);
        if (!i(dtveVar, str)) {
            ensk h3 = a.h();
            h3.Y(ente.a, "BugleBackup");
            ((enrr) h3.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "detachDatabase", 266, "BackupDatabaseAttacher.kt")).J("Skipping SQL execution: Database [%s](alias: [%s]) is already detached from [%s].", h2, str, h);
            return;
        }
        enru enruVar = a;
        ensk h4 = enruVar.h();
        h4.Y(ente.a, "BugleBackup");
        ((enrr) h4.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "detachDatabase", 248, "BackupDatabaseAttacher.kt")).J("Attempting to detach database [%s](alias: [%s]) from [%s]", h2, str, h);
        dtveVar.y("DETACH DATABASE ".concat(str));
        ensk h5 = enruVar.h();
        h5.Y(ente.a, "BugleBackup");
        ((enrr) h5.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "detachDatabase", 257, "BackupDatabaseAttacher.kt")).J("Successfully detached database [%s](alias: [%s]) from [%s]", h2, str, h);
    }

    private static final String h(dtve dtveVar) {
        return dtveVar.j().getPath();
    }

    private static final boolean i(dtve dtveVar, String str) {
        List<Pair<String, String>> attachedDbs = dtveVar.j().getAttachedDbs();
        attachedDbs.getClass();
        if (attachedDbs.isEmpty()) {
            return false;
        }
        Iterator<T> it = attachedDbs.iterator();
        while (it.hasNext()) {
            if (ffkj.e(((Pair) it.next()).first, str)) {
                return true;
            }
        }
        return false;
    }

    public final dtve a() {
        dtve e = dtub.e(((dtqy) bbik.a()).b);
        e.getClass();
        return e;
    }

    public final dtve b() {
        dtve e = dtub.e(((dtqy) bwlk.a()).b);
        e.getClass();
        return e;
    }

    public final File c() {
        return new File(h(a()));
    }

    public final void d(final dtve dtveVar, dtve dtveVar2, final String str) {
        String h = h(dtveVar);
        final String h2 = h(dtveVar2);
        if (i(dtveVar, str)) {
            ensk h3 = a.h();
            h3.Y(ente.a, "BugleBackup");
            ((enrr) h3.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "attachDatabase", 185, "BackupDatabaseAttacher.kt")).J("Skipping SQL execution: Database [%s](alias: [%s]) is already attached to [%s]", h2, str, h);
            return;
        }
        enru enruVar = a;
        ensk h4 = enruVar.h();
        h4.Y(ente.a, "BugleBackup");
        ((enrr) h4.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "attachDatabase", 156, "BackupDatabaseAttacher.kt")).J("Attempting to attach database [%s](alias: [%s]) to [%s]", h2, str, h);
        dtui dtuiVar = new dtui("backup-database-attacher-attach-db");
        emyl emylVar = new emyl() { // from class: bbid
            @Override // defpackage.emyl
            public final Object get() {
                boolean I;
                bbii bbiiVar = bbii.this;
                ffbr ffbrVar = bbiiVar.c;
                Instant f = bbiiVar.d.f();
                Object b = ffbrVar.b();
                b.getClass();
                Instant plus = f.plus(Duration.ofSeconds(((Number) b).longValue()));
                dtve dtveVar3 = dtveVar;
                int i = 0;
                while (bbiiVar.d.f().compareTo(plus) < 0) {
                    i++;
                    try {
                        dtveVar3.j().disableWriteAheadLogging();
                        ensk h5 = bbii.a.h();
                        h5.Y(ente.a, "BugleBackup");
                        ((enrr) h5.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "tryRealHardToDisableWal", 220, "BackupDatabaseAttacher.kt")).J("Time spent trying to disable WAL for database [%s]: [%s] attempts in [%s]ms", ((dtqy) dtveVar3.l()).b, Integer.valueOf(i), Long.valueOf(Duration.between(f, bbiiVar.d.f()).toMillis()));
                        String str2 = str;
                        dtveVar3.y("ATTACH DATABASE \"" + h2 + "\" AS " + str2);
                        return ffcu.a;
                    } catch (IllegalStateException e) {
                        String message = e.getMessage();
                        message.getClass();
                        I = ffpc.I(message, "Write Ahead Logging", false);
                        if (!I) {
                            throw e;
                        }
                    }
                }
                throw new TimeoutException("Failed to disable WAL mode within the timeout");
            }
        };
        dtvc c = dtvd.c();
        c.b(true);
        dtveVar.s(dtuiVar, emylVar, c.a());
        ensk h5 = enruVar.h();
        h5.Y(ente.a, "BugleBackup");
        ((enrr) h5.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "attachDatabase", 176, "BackupDatabaseAttacher.kt")).J("Successfully attached database [%s](alias: [%s]) to [%s]", h2, str, h);
    }

    public final void e() {
        g(b(), a(), "backupDb");
    }

    public final void f() {
        g(a(), b(), "bugleDb");
    }
}
