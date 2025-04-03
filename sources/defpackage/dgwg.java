package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgwg {
    public static final Cursor a(ContentResolver contentResolver, String str, String[] strArr, String[] strArr2) {
        return contentResolver.query(Uri.parse(str), strArr, "lookup = ?", strArr2, null);
    }
}
