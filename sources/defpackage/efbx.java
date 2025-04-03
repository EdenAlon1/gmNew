package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbx {
    public static final Uri a(String str, String str2, long j) {
        Uri.Builder path = new Uri.Builder().scheme("blobstore").authority(str2).path(str);
        if (efby.c(str) && !efby.b(str)) {
            path.appendQueryParameter("expiryDateSecs", String.valueOf(j));
        }
        Uri build = path.build();
        efby.a(build);
        return build;
    }
}
