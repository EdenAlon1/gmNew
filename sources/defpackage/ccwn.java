package defpackage;

import android.database.sqlite.SQLiteConstraintException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwn extends csgp {
    private final SQLiteConstraintException a;

    public ccwn(SQLiteConstraintException sQLiteConstraintException) {
        super(22, csgx.NO_RETRY, "Tried to backup a conversation but CMS already assigned its ID to a different conversation");
        this.a = sQLiteConstraintException;
    }

    public final boolean equals(Object obj) {
        ccwn ccwnVar = obj instanceof ccwn ? (ccwn) obj : null;
        if (ccwnVar == null) {
            return false;
        }
        return ffkj.e(getMessage(), ccwnVar.getMessage());
    }

    @Override // java.lang.Throwable
    public final /* synthetic */ Throwable getCause() {
        return this.a;
    }
}
