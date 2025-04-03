package defpackage;

import android.database.Cursor;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eirk {
    public static final String[] a = {BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE};

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (RuntimeException unused) {
            }
        }
    }
}
