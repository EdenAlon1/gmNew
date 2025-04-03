package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axyq implements ffjm {
    public static final axyq a = new axyq();

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Cursor cursor = (Cursor) obj2;
        return Integer.valueOf(cursor != null ? cursor.getCount() : 0);
    }
}
