package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oya {
    public static final oxv a(oxx oxxVar, SQLiteDatabase sQLiteDatabase) {
        oxxVar.getClass();
        oxv oxvVar = oxxVar.a;
        if (oxvVar != null && ffkj.e(oxvVar.d, sQLiteDatabase)) {
            return oxvVar;
        }
        oxv oxvVar2 = new oxv(sQLiteDatabase);
        oxxVar.a = oxvVar2;
        return oxvVar2;
    }
}
