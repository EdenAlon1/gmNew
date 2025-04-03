package defpackage;

import android.database.Cursor;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axys implements ffji {
    public static final axys a = new axys();

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.getClass();
        long j = cursor.getLong(0);
        Instant ofEpochMilli = Instant.ofEpochMilli(cursor.getLong(1));
        ofEpochMilli.getClass();
        return new axvr(j, ofEpochMilli);
    }
}
