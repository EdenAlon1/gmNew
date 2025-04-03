package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgrd {
    public static final boolean a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2) {
            return false;
        }
        return ffkj.e(pathSegments.get(pathSegments.size() - 2), "cms_attachments");
    }
}
