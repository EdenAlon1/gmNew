package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjvc {
    public static final String a(Uri uri) {
        String queryParameter;
        return (uri == null || (queryParameter = uri.getQueryParameter("m")) == null) ? String.valueOf(uri) : queryParameter;
    }
}
