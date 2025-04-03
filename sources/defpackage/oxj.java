package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oxj {
    public final int b;

    public oxj(int i) {
        this.b = i;
    }

    public static final void f(String str) {
        if (ffpc.j(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int a = ffkj.a(str.charAt(true != z ? i : length), 32);
            if (z) {
                if (a > 0) {
                    break;
                } else {
                    length--;
                }
            } else if (a > 0) {
                z = true;
            } else {
                i++;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public abstract void a(oxi oxiVar);

    public void b(oxi oxiVar, int i, int i2) {
        throw null;
    }

    public abstract void d(oxi oxiVar, int i, int i2);

    public void e() {
    }

    public void c(oxi oxiVar) {
    }
}
