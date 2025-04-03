package defpackage;

import android.content.Context;
import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbhs {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper");
    public static final fgjb b = new fgjf();
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final Context f;
    public final ffsk g;
    public final ffbr h;
    public final atjw i;
    public final bbhg j;
    public final atjx k;
    private final bbhv l;

    public bbhs(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Context context, ffsk ffskVar, ffbr ffbrVar4, bbhv bbhvVar, atjw atjwVar, bbhg bbhgVar, atjx atjxVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        context.getClass();
        ffskVar.getClass();
        ffbrVar4.getClass();
        bbhgVar.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = context;
        this.g = ffskVar;
        this.h = ffbrVar4;
        this.l = bbhvVar;
        this.i = atjwVar;
        this.j = bbhgVar;
        this.k = atjxVar;
    }

    public static final void c(final bbin bbinVar, final bbim bbimVar, final boolean z, final String str) {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleBackup");
        ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "writeSingleBackupTable", 214, "DatabaseBackerUpper.kt")).t("[%s]: Writing Backup", str);
        long c = bbhj.c("DatabaseBackerUpper::writeSingleBackupTable", new ffix() { // from class: bbhl
            @Override // defpackage.ffix
            public final Object invoke() {
                enru enruVar2 = bbhs.a;
                try {
                    bbin.this.b(bbimVar);
                } catch (Exception e) {
                    if (!z) {
                        throw e;
                    }
                    String str2 = str;
                    ensk j = bbhs.a.j();
                    j.Y(ente.a, "BugleBackup");
                    ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "writeSingleBackupTable$lambda$9", 223, "DatabaseBackerUpper.kt")).t("[%s]: Failed to write to Backup, continuing.", str2);
                }
                return ffcu.a;
            }
        });
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleBackup");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "writeSingleBackupTable", 229, "DatabaseBackerUpper.kt")).C("[%s]: Backup time: [%s]ms", str, ffpw.g(c));
    }

    public final File a(UUID uuid) {
        Context context = this.f;
        atjw atjwVar = this.i;
        File dir = context.getDir("backup", 0);
        if (atjwVar.a() && uuid != null) {
            File file = new File(new File(dir, uuid.toString()), "backup_db");
            if (file.exists()) {
                return file;
            }
        }
        File file2 = new File(dir, "backup_db");
        if (file2.exists()) {
            return file2;
        }
        ensk j = a.j();
        j.Y(ente.a, "BugleBackup");
        ((enrr) j.h("com/google/android/apps/messaging/shared/datamodel/backup/DatabaseBackerUpper", "getBackupDatabaseFile", 131, "DatabaseBackerUpper.kt")).q("Backup database file not found");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.bbim r9, java.util.UUID r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.bbhp
            if (r0 == 0) goto L13
            r0 = r11
            bbhp r0 = (defpackage.bbhp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bbhp r0 = new bbhp
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 3
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.UUID r10 = r0.e
            bbhs r9 = r0.d
            defpackage.ffci.b(r11)     // Catch: java.lang.Exception -> L2d
            goto L5e
        L2d:
            r11 = move-exception
            goto L85
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            defpackage.ffci.b(r11)
            bbhv r11 = r8.l
            bbib r2 = new bbib
            bbic r11 = r11.a
            r2.<init>(r11, r10, r5)
            ffsk r11 = r11.b
            defpackage.axol.k(r11, r5, r2, r4)
            bbhj r11 = defpackage.bbhj.a     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = "DatabaseBackerUpper#backup"
            bbhq r6 = new bbhq     // Catch: java.lang.Exception -> L82
            r6.<init>(r8, r9, r10, r5)     // Catch: java.lang.Exception -> L82
            r0.d = r8     // Catch: java.lang.Exception -> L82
            r0.e = r10     // Catch: java.lang.Exception -> L82
            r0.c = r3     // Catch: java.lang.Exception -> L82
            java.lang.Object r11 = r11.b(r2, r6, r0)     // Catch: java.lang.Exception -> L82
            if (r11 == r1) goto L81
            r9 = r8
        L5e:
            ffqi r11 = (defpackage.ffqi) r11     // Catch: java.lang.Exception -> L2d
            bbhv r0 = r9.l     // Catch: java.lang.Exception -> L2d
            long r1 = r11.b     // Catch: java.lang.Exception -> L2d
            long r6 = defpackage.ffpw.h(r1)     // Catch: java.lang.Exception -> L2d
            int r1 = defpackage.ffpw.d(r1)     // Catch: java.lang.Exception -> L2d
            long r1 = (long) r1     // Catch: java.lang.Exception -> L2d
            j$.time.Duration r1 = j$.time.Duration.ofSeconds(r6, r1)     // Catch: java.lang.Exception -> L2d
            r1.getClass()     // Catch: java.lang.Exception -> L2d
            ffsk r2 = r0.b     // Catch: java.lang.Exception -> L2d
            bbhu r6 = new bbhu     // Catch: java.lang.Exception -> L2d
            r6.<init>(r0, r10, r1, r5)     // Catch: java.lang.Exception -> L2d
            defpackage.axol.k(r2, r5, r6, r4)     // Catch: java.lang.Exception -> L2d
            java.lang.Object r9 = r11.a     // Catch: java.lang.Exception -> L2d
            return r9
        L81:
            return r1
        L82:
            r9 = move-exception
            r11 = r9
            r9 = r8
        L85:
            bbhv r9 = r9.l
            boolean r0 = r11 instanceof java.lang.IllegalStateException
            if (r3 == r0) goto L8d
            r0 = 2
            goto L8e
        L8d:
            r0 = r4
        L8e:
            bbic r9 = r9.a
            bbia r1 = new bbia
            r1.<init>(r9, r0, r10, r5)
            ffsk r9 = r9.b
            defpackage.axol.k(r9, r5, r1, r4)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbhs.b(bbim, java.util.UUID, ffgu):java.lang.Object");
    }
}
