package defpackage;

import android.database.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class bbhq extends ffhv implements ffji {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ bbhs f;
    final /* synthetic */ bbim g;
    final /* synthetic */ UUID h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbhq(bbhs bbhsVar, bbim bbimVar, UUID uuid, ffgu ffguVar) {
        super(1, ffguVar);
        this.f = bbhsVar;
        this.g = bbimVar;
        this.h = uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        fgjb fgjbVar;
        Object obj5;
        File file;
        ffhh ffhhVar = ffhh.a;
        if (this.e != 0) {
            obj4 = this.d;
            obj3 = this.c;
            obj2 = this.b;
            Object obj6 = this.a;
            ffci.b(obj);
            fgjbVar = obj6;
        } else {
            ffci.b(obj);
            fgjb fgjbVar2 = this.f.k.a() ? this.f.j.a : bbhs.b;
            obj2 = this.f;
            obj3 = this.g;
            UUID uuid = this.h;
            this.a = fgjbVar2;
            this.b = obj2;
            this.c = obj3;
            this.d = uuid;
            this.e = 1;
            if (fgjbVar2.a(null, this) == ffhhVar) {
                return ffhhVar;
            }
            obj4 = uuid;
            fgjbVar = fgjbVar2;
        }
        try {
            enru enruVar = bbhs.a;
            ((bbii) ((bbhs) obj2).h.b()).a().j().disableWriteAheadLogging();
            ensk h = bbhs.a.h();
            h.Y(ente.a, "BugleBackup");
            ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "clearBackupDatabase", 153, "DatabaseBackerUpper.kt")).q("Clearing Backup Database");
            dtve e = dtub.e(((dtqy) bbik.a()).b);
            try {
                e.y("PRAGMA FOREIGN_KEYS = 0");
                Object b = ((bbhs) obj2).d.b();
                b.getClass();
                Iterator it = ((Iterable) b).iterator();
                while (it.hasNext()) {
                    ((bbiq) it.next()).a.a();
                }
                Object b2 = ((bbhs) obj2).c.b();
                b2.getClass();
                Iterator it2 = ((Iterable) b2).iterator();
                while (it2.hasNext()) {
                    ((bbiq) it2.next()).a.a();
                }
                e.y("PRAGMA FOREIGN_KEYS = 1");
                Cursor g = ((bbii) ((bbhs) obj2).h.b()).b().g("pragma wal_checkpoint(TRUNCATE)", null);
                try {
                    g.moveToFirst();
                    ensk e2 = bbii.a.e();
                    e2.Y(ente.a, "BugleBackup");
                    obj5 = obj2;
                    ((enrr) e2.h("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher", "walCheckpointBugleDb", 109, "BackupDatabaseAttacher.kt")).G("Checkpoint BugleDb complete: checkpointed = [%s], pages written = [%s]", g.getLong(0) == 0, g.getLong(2));
                    ffig.a(g, null);
                } finally {
                }
                try {
                    final bbhs bbhsVar = (bbhs) obj5;
                    final bbim bbimVar = (bbim) obj3;
                    ((dtuu) ((bbhs) obj5).e.b()).d("buildBackupDatabase-bugle", new Runnable() { // from class: bbhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            final bbhs bbhsVar2 = bbhs.this;
                            bbii bbiiVar = (bbii) bbhsVar2.h.b();
                            bbiiVar.d(bbiiVar.a(), bbiiVar.b(), "bugleDb");
                            ensk h2 = bbhs.a.h();
                            h2.Y(ente.a, "BugleBackup");
                            ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyDataFromBugleDb", 177, "DatabaseBackerUpper.kt")).q("Writing Core Backup Tables");
                            final bbim bbimVar2 = bbimVar;
                            long c = bbhj.c("DatabaseBackerUpper::copyDataFromBugleDb#coreBackup", new ffix() { // from class: bbhn
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    for (bbiq bbiqVar : (List) bbhs.this.c.b()) {
                                        bbim bbimVar3 = bbimVar2;
                                        bbhs.c(bbiqVar.a, bbimVar3, false, bbiqVar.b);
                                    }
                                    return ffcu.a;
                                }
                            });
                            ensk h3 = bbhs.a.h();
                            h3.Y(ente.a, "BugleBackup");
                            ((enrr) h3.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyDataFromBugleDb", 188, "DatabaseBackerUpper.kt")).s("Total Core Backup time: [%s]ms", ffpw.g(c));
                            ensk h4 = bbhs.a.h();
                            h4.Y(ente.a, "BugleBackup");
                            ((enrr) h4.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyDataFromBugleDb", 192, "DatabaseBackerUpper.kt")).q("Writing Feature Backup Tables");
                            long c2 = bbhj.c("DatabaseBackerUpper::copyDataFromBugleDb#featueBackup", new ffix() { // from class: bbho
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    for (bbiq bbiqVar : (List) bbhs.this.d.b()) {
                                        bbim bbimVar3 = bbimVar2;
                                        bbhs.c(bbiqVar.a, bbimVar3, true, bbiqVar.b);
                                    }
                                    return ffcu.a;
                                }
                            });
                            ensk h5 = bbhs.a.h();
                            h5.Y(ente.a, "BugleBackup");
                            ((enrr) h5.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyDataFromBugleDb", 205, "DatabaseBackerUpper.kt")).s("Total Feature Backup time: [%s]ms", ffpw.g(c2));
                        }
                    });
                    ((bbii) ((bbhs) obj5).h.b()).f();
                    ensk h2 = bbhs.a.h();
                    h2.Y(ente.a, "BugleBackup");
                    ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "prepareBackupDbForStorage", 166, "DatabaseBackerUpper.kt")).q("Preparing BackupDb for storage");
                    final bbhs bbhsVar2 = (bbhs) obj5;
                    long c = bbhj.c("DatabaseBackerUpper::prepareBackupDbForStorage", new ffix() { // from class: bbhk
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ((bbii) bbhs.this.h.b()).a().y("VACUUM");
                            return ffcu.a;
                        }
                    });
                    ensk h3 = bbhs.a.h();
                    h3.Y(ente.a, "BugleBackup");
                    ((enrr) h3.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "prepareBackupDbForStorage", 171, "DatabaseBackerUpper.kt")).s("Prepare BackupDb time: [%s]ms", ffpw.g(c));
                    File dir = ((bbhs) obj5).f.getDir("backup", 0);
                    File c2 = ((bbii) ((bbhs) obj5).h.b()).c();
                    if (((bbhs) obj5).i.a()) {
                        File file2 = new File(dir, ((UUID) obj4).toString());
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        file = new File(file2, "backup_db");
                    } else {
                        file = new File(dir, "backup_db");
                    }
                    file.delete();
                    file.createNewFile();
                    ensk h4 = bbhs.a.h();
                    h4.Y(ente.a, "BugleBackup");
                    ((enrr) h4.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "copyBackupDatabase", 257, "DatabaseBackerUpper.kt")).t("Making a copy of backupDb at ", file.getPath());
                    FileInputStream fileInputStream = new FileInputStream(c2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            eoej.a(fileInputStream, fileOutputStream);
                            ffig.a(fileOutputStream, null);
                            ffig.a(fileInputStream, null);
                            fgjbVar.b(null);
                            return file;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    ((bbii) ((bbhs) obj5).h.b()).f();
                    throw th;
                }
            } catch (Throwable th2) {
                e.y("PRAGMA FOREIGN_KEYS = 1");
                throw th2;
            }
        } catch (Throwable th3) {
            fgjbVar.b(null);
            throw th3;
        }
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bbhq(this.f, this.g, this.h, (ffgu) obj).b(ffcu.a);
    }
}
