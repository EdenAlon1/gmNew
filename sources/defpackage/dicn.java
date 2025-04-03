package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dicn {
    public static final dfrg a(dfre dfreVar, Uri uri, int i) {
        dfvf.a(uri, "uri must not be null");
        if (i != 0) {
            i = 1;
        }
        dfwv.b(true, "invalid filter type");
        dici diciVar = new dici(dfreVar, uri, i);
        dfreVar.b(diciVar);
        return diciVar;
    }
}
