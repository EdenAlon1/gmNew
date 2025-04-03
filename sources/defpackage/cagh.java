package defpackage;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagh {
    public final ffbr a;

    public cagh(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final void a() {
        ((dtve) this.a.b()).j().endTransaction();
    }

    public final boolean b() {
        SQLiteDatabase j = ((dtve) this.a.b()).j();
        return j != null && j.isOpen();
    }
}
