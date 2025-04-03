package defpackage;

import android.net.Uri;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cixt {
    public static cixt d(String str, Uri uri) {
        return new citf(str, uri, Optional.empty());
    }

    public static cixt e(String str, Uri uri, Uri uri2) {
        return new citf(str, uri, Optional.ofNullable(uri2));
    }

    public abstract Uri a();

    public abstract Optional b();

    public abstract String c();
}
