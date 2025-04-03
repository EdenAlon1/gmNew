package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwv extends csgp {
    private final SQLiteException a;

    public ccwv(String str, String str2, SQLiteException sQLiteException) {
        super(14, csgx.NO_RETRY, a.m(str2, str, "Could not set the CMS Id for ", " row "));
        this.a = sQLiteException;
    }

    public final boolean equals(Object obj) {
        ccwv ccwvVar = obj instanceof ccwv ? (ccwv) obj : null;
        if (ccwvVar == null) {
            return false;
        }
        return ffkj.e(getMessage(), ccwvVar.getMessage());
    }

    @Override // java.lang.Throwable
    public final /* synthetic */ Throwable getCause() {
        return this.a;
    }
}
