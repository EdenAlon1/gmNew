package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dytj extends SQLiteException {
    public dytj(Throwable th) {
        super("Error when executing transaction!!", th);
    }
}
