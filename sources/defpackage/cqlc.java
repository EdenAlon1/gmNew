package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqlc {
    public static final cskc a = cskc.g("Bugle", "TableBasedWipeoutDetectionHeuristicCommon");
    public final Context b;
    public final comc c;

    public cqlc(Context context, comc comcVar) {
        this.b = context;
        this.c = comcVar;
    }

    final void a(Uri uri, final cqlb cqlbVar) {
        final Uri insert = this.b.getContentResolver().insert(uri, new ContentValues());
        emyw.e(insert);
        Cursor query = this.b.getContentResolver().query(insert, new String[]{"_data"}, null, null, null, null);
        try {
            emyw.e(query);
            if (!query.moveToNext()) {
                throw new emyx(a.C(insert, "Unable to query newly created uri="));
            }
            final String string = query.getString(0);
            if (TextUtils.isEmpty(string)) {
                throw new emyx(a.C(insert, "Newly created Uri has an empty filename. uri="));
            }
            this.c.m(new emwl() { // from class: cqla
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return cqlb.this.a((eyhs) obj, insert, string);
                }
            });
            if (query != null) {
                query.close();
            }
        } catch (Throwable th) {
            if (query == null) {
                throw th;
            }
            try {
                query.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
