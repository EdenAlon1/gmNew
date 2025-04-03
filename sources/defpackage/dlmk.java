package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmk extends dllp {
    public dlmk() {
        super(dexf.EXEC_SQL_FIX, 10L);
    }

    private static void c(SQLiteDatabase sQLiteDatabase, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                sQLiteDatabase.execSQL(str);
            } catch (SQLiteException e) {
                Log.e("EXEC_SQL_FIX", "Unable to execute query ".concat(String.valueOf(str)));
                throw e;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // defpackage.dllp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dllv a(defpackage.dllv r7, defpackage.emxc r8) {
        /*
            r6 = this;
            boolean r0 = r8.g()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r8.c()
            deyi r0 = (defpackage.deyi) r0
            int r0 = r0.b
            r1 = 2
            if (r0 != r1) goto La4
            android.content.Context r0 = r7.b
            java.lang.Object r8 = r8.c()
            deyi r8 = (defpackage.deyi) r8
            int r2 = r8.b
            if (r2 != r1) goto L22
            java.lang.Object r8 = r8.c
            dexq r8 = (defpackage.dexq) r8
            goto L24
        L22:
            dexq r8 = defpackage.dexq.a
        L24:
            boolean r2 = r8.f
            if (r2 == 0) goto L2c
            android.content.Context r0 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m(r0)
        L2c:
            java.lang.String r2 = r8.c
            java.io.File r2 = r0.getDatabasePath(r2)
            boolean r3 = r2.exists()
            if (r3 != 0) goto L39
            goto L97
        L39:
            java.lang.String r2 = r2.getPath()
            r3 = 0
            r4 = 0
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r3, r4)
            int r3 = r2.getVersion()     // Catch: java.lang.Throwable -> L98
            int r5 = r8.d     // Catch: java.lang.Throwable -> L98
            if (r5 != 0) goto L4c
            goto L4f
        L4c:
            if (r5 == r3) goto L4f
            goto L92
        L4f:
            int r3 = r8.b     // Catch: java.lang.Throwable -> L98
            r5 = 1
            if (r3 == 0) goto L5d
            if (r3 == r5) goto L5b
            if (r3 == r1) goto L59
            goto L5e
        L59:
            r4 = 4
            goto L5e
        L5b:
            r4 = 3
            goto L5e
        L5d:
            r4 = r1
        L5e:
            if (r4 != 0) goto L61
            r4 = r5
        L61:
            int r4 = r4 + (-2)
            if (r4 == r5) goto L75
            if (r4 != r1) goto L6d
            java.lang.String r8 = r8.c     // Catch: java.lang.Throwable -> L98
            r0.deleteDatabase(r8)     // Catch: java.lang.Throwable -> L98
            goto L92
        L6d:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = "This command type is not supported"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L98
            throw r7     // Catch: java.lang.Throwable -> L98
        L75:
            boolean r0 = r8.g     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L8d
            eygr r8 = r8.e     // Catch: java.lang.Throwable -> L98
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L98
            c(r2, r8)     // Catch: java.lang.Throwable -> L88
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L88
            r2.endTransaction()     // Catch: java.lang.Throwable -> L98
            goto L92
        L88:
            r7 = move-exception
            r2.endTransaction()     // Catch: java.lang.Throwable -> L98
            throw r7     // Catch: java.lang.Throwable -> L98
        L8d:
            eygr r8 = r8.e     // Catch: java.lang.Throwable -> L98
            c(r2, r8)     // Catch: java.lang.Throwable -> L98
        L92:
            if (r2 == 0) goto L97
            r2.close()
        L97:
            return r7
        L98:
            r7 = move-exception
            if (r2 == 0) goto La3
            r2.close()     // Catch: java.lang.Throwable -> L9f
            goto La3
        L9f:
            r8 = move-exception
            r7.addSuppressed(r8)
        La3:
            throw r7
        La4:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlmk.a(dllv, emxc):dllv");
    }

    @Override // defpackage.dllp
    public final String b() {
        return "EXEC_SQL_FIX";
    }
}
