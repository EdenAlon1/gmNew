package defpackage;

import android.content.ContentUris;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class dedu {
    public static Uri a(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return null;
        }
        return ContentUris.withAppendedId(uri2, ContentUris.parseId(uri));
    }
}
