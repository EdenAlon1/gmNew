package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cskw {
    public static final enrw a(final Uri uri) {
        uri.getClass();
        return new enrw() { // from class: cskv
            @Override // defpackage.enrw
            public final Object a() {
                return cskw.d(uri);
            }
        };
    }

    public static final enrw b(final CharSequence charSequence) {
        charSequence.getClass();
        return new enrw() { // from class: csku
            @Override // defpackage.enrw
            public final Object a() {
                return cskw.c(charSequence);
            }
        };
    }

    public static final CharSequence c(CharSequence charSequence) {
        charSequence.getClass();
        String e = cskt.e(charSequence);
        e.getClass();
        return e;
    }

    public static final String d(Uri uri) {
        uri.getClass();
        if (csup.b(uri)) {
            return cskt.d(uri);
        }
        String uri2 = uri.toString();
        uri2.getClass();
        return uri2;
    }
}
