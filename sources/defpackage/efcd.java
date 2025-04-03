package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcd {
    public static final File a(Uri uri, efbt efbtVar) {
        char c;
        String scheme = uri.getScheme();
        int hashCode = scheme.hashCode();
        if (hashCode != -861391249) {
            if (hashCode == 3143036 && scheme.equals("file")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (scheme.equals("android")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            return efbtVar.a(uri);
        }
        if (c == 1) {
            return efcc.a(uri);
        }
        throw new efcv("Couldn't convert URI to path: ".concat(String.valueOf(String.valueOf(uri))));
    }
}
