package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public final class oti extends oxj {
    private orp a;
    private final List c;
    private final otg d;
    private final String e;
    private final String f;

    public oti(orp orpVar, otg otgVar) {
        super(23);
        this.c = orpVar.e;
        this.a = orpVar;
        this.d = otgVar;
        this.e = "86254750241babac4b8d52996a675549";
        this.f = "1cbd3130fa23b59692c061c594c16cc0";
    }

    private final void g(oxi oxiVar) {
        oxiVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        oxiVar.g(otc.a(this.e));
    }

    @Override // defpackage.oxj
    public final void a(oxi oxiVar) {
        Cursor b = oxiVar.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (b.moveToFirst()) {
                if (b.getInt(0) == 0) {
                    z = true;
                }
            }
            ffig.a(b, null);
            this.d.b(oxiVar);
            if (!z) {
                oth a = this.d.a(oxiVar);
                if (!a.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(a.b)));
                }
            }
            g(oxiVar);
            for (osz oszVar : this.c) {
            }
        } finally {
        }
    }

    @Override // defpackage.oxj
    public final void b(oxi oxiVar, int i, int i2) {
        d(oxiVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c A[LOOP:0: B:23:0x0096->B:25:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    @Override // defpackage.oxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.oxi r5) {
        /*
            r4 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r5.b(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> Lbb
            r2 = 0
            if (r1 == 0) goto L15
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> Lbb
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = r2
        L16:
            r3 = 0
            defpackage.ffig.a(r0, r3)
            if (r1 == 0) goto L6c
            oxh r0 = new oxh
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r0 = r5.a(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L32
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L65
            goto L33
        L32:
            r1 = r3
        L33:
            defpackage.ffig.a(r0, r3)
            java.lang.String r0 = r4.e
            boolean r0 = defpackage.ffkj.e(r0, r1)
            if (r0 != 0) goto L79
            java.lang.String r0 = r4.f
            boolean r0 = defpackage.ffkj.e(r0, r1)
            if (r0 == 0) goto L47
            goto L79
        L47:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r0.<init>(r2)
            java.lang.String r2 = r4.e
            r0.append(r2)
            java.lang.String r2 = ", found: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L65:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r1 = move-exception
            defpackage.ffig.a(r0, r5)
            throw r1
        L6c:
            otg r0 = r4.d
            oth r0 = r0.a(r5)
            boolean r1 = r0.a
            if (r1 == 0) goto La9
            r4.g(r5)
        L79:
            otg r0 = r4.d
            psz r0 = (defpackage.psz) r0
            androidx.work.impl.WorkDatabase_Impl r1 = r0.a
            r1.a = r5
            java.lang.String r1 = "PRAGMA foreign_keys = ON"
            r5.g(r1)
            ouz r1 = new ouz
            r1.<init>(r5)
            androidx.work.impl.WorkDatabase_Impl r0 = r0.a
            r0.u(r1)
            java.util.List r0 = r4.c
            java.util.Iterator r0 = r0.iterator()
        L96:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()
            osz r1 = (defpackage.osz) r1
            r1.a(r5)
            goto L96
        La6:
            r4.a = r3
            return
        La9:
            java.lang.String r5 = r0.b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
        Lbb:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r1 = move-exception
            defpackage.ffig.a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oti.c(oxi):void");
    }

    @Override // defpackage.oxj
    public final void d(oxi oxiVar, int i, int i2) {
        List a;
        orp orpVar = this.a;
        if (orpVar != null && (a = ovz.a(orpVar.d, i, i2)) != null) {
            ovo.a(new ouz(oxiVar));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                ((ovj) it.next()).b(new ouz(oxiVar));
            }
            oth a2 = this.d.a(oxiVar);
            if (!a2.a) {
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(a2.b)));
            }
            g(oxiVar);
            return;
        }
        orp orpVar2 = this.a;
        if (orpVar2 == null || ovz.b(orpVar2, i, i2)) {
            throw new IllegalStateException(a.x(i2, i, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        oxiVar.g("DROP TABLE IF EXISTS `Dependency`");
        oxiVar.g("DROP TABLE IF EXISTS `WorkSpec`");
        oxiVar.g("DROP TABLE IF EXISTS `WorkTag`");
        oxiVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
        oxiVar.g("DROP TABLE IF EXISTS `WorkName`");
        oxiVar.g("DROP TABLE IF EXISTS `WorkProgress`");
        oxiVar.g("DROP TABLE IF EXISTS `Preference`");
        for (osz oszVar : this.c) {
        }
        this.d.b(oxiVar);
    }

    @Override // defpackage.oxj
    public final void e() {
    }
}
