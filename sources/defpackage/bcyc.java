package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcyc {
    public final Context a;
    private final crji b;
    private final ffbr c;

    public bcyc(Context context, crji crjiVar, ffbr ffbrVar) {
        this.a = context;
        this.b = crjiVar;
        this.c = ffbrVar;
    }

    public final Uri a(cbaj cbajVar) {
        csix.l(cbajVar);
        String a = crjd.a(this.a);
        Uri uri = cbajVar.c;
        if (a.equals(uri.getAuthority())) {
            return uri;
        }
        return this.b.f(uri, cbajVar.d, ((aolr) this.c.b()).f(), null);
    }
}
