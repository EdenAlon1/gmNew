package defpackage;

import android.content.Context;
import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchi {
    private final ffbr a;
    private final ffbr b;

    public dchi(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    public final dchh a(Cursor cursor) {
        Context context = (Context) this.a.b();
        context.getClass();
        csuu csuuVar = (csuu) this.b.b();
        csuuVar.getClass();
        cursor.getClass();
        return new dchh(context, csuuVar, cursor);
    }
}
