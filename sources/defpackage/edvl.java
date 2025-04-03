package defpackage;

import android.content.ContentValues;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edvl {
    static ContentValues a(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key_id", str);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, str2);
        return contentValues;
    }
}
