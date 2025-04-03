package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efjt extends SQLiteException {
    public efjt(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
