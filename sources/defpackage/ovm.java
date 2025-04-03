package defpackage;

import android.database.Cursor;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovm {
    public static final int a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int b(Cursor cursor, String str) {
        String str2;
        int a = a(cursor, str);
        if (a >= 0) {
            return a;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            columnNames.getClass();
            str2 = ffdo.R(columnNames, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        throw new IllegalArgumentException(a.m(str2, str, "column '", "' does not exist. Available columns: "));
    }
}
