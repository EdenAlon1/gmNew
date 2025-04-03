package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbab extends cbbo {
    private final Uri a;
    private final cbad b;

    public cbab(cbad cbadVar, Uri uri) {
        csix.l(uri);
        this.b = cbadVar;
        this.a = uri;
    }

    @Override // defpackage.cbbo
    public final cbbn f(Context context) {
        cbad cbadVar = this.b;
        crji crjiVar = (crji) cbadVar.b.b();
        crjiVar.getClass();
        cbal cbalVar = (cbal) cbadVar.c.b();
        cbalVar.getClass();
        cbak cbakVar = (cbak) cbadVar.d.b();
        cbakVar.getClass();
        context.getClass();
        return new cbaa(cbadVar.a, crjiVar, cbalVar, cbakVar, cbadVar.e, context, this, this.a);
    }
}
