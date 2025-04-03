package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.net.URISyntaxException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exar {
    public static Intent a(String str) {
        if (str.isEmpty()) {
            return new Intent();
        }
        if (!str.startsWith("intent:")) {
            return new Intent().setData(Uri.parse(str));
        }
        try {
            return Intent.parseUri(str, 0);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
