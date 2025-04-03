package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czoh {
    public static final Uri a(Uri uri) {
        if (uri.isHierarchical()) {
            return uri;
        }
        String uri2 = uri.toString();
        uri2.getClass();
        Uri parse = Uri.parse(ffpc.r(uri2));
        parse.getClass();
        return parse;
    }
}
