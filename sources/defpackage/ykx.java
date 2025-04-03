package defpackage;

import android.net.Uri;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykx {
    public static final Object a(yla ylaVar, Uri uri, ffgu ffguVar) {
        if (!csup.b(uri)) {
            return uri;
        }
        if (csup.b(uri)) {
            return ffra.a(ekxi.a(ylaVar.b), new ykz(null, uri, ylaVar), ffguVar);
        }
        Objects.toString(uri);
        throw new IllegalArgumentException(String.valueOf(uri).concat(" is not a remote uri."));
    }
}
