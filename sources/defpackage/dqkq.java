package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqkq {
    public static final Integer a(Cursor cursor, String str) {
        Integer valueOf = Integer.valueOf(cursor.getColumnIndex(str));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return Integer.valueOf(cursor.getInt(valueOf.intValue()));
        }
        return null;
    }

    public static final Long b(Cursor cursor, String str) {
        Integer valueOf = Integer.valueOf(cursor.getColumnIndex(str));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return Long.valueOf(cursor.getLong(valueOf.intValue()));
        }
        return null;
    }

    public static final String c(Cursor cursor, String str) {
        Integer valueOf = Integer.valueOf(cursor.getColumnIndex(str));
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return cursor.getString(valueOf.intValue());
        }
        return null;
    }
}
