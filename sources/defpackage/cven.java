package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cven implements ffji {
    public static final cven a = new cven();

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = ((ejnp) obj).a;
        return new cvem(ejnp.b(cursor, ejnp.a(cursor, "number")), cursor.getLong(ejnp.a(cursor, "date")));
    }
}
