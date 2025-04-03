package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejmu {
    public static final engw a(Cursor cursor, ffji ffjiVar) {
        ArrayList arrayList = new ArrayList();
        if (cursor.moveToFirst()) {
            do {
                arrayList.add(ffjiVar.invoke(new ejnp(cursor)));
            } while (cursor.moveToNext());
        }
        return engq.a(arrayList);
    }

    public static final Object b(ffhd ffhdVar, ffji ffjiVar, ffgu ffguVar) {
        return ffsl.a(new ejmt(ffhdVar, ffjiVar, null), ffguVar);
    }
}
