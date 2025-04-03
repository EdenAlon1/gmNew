package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxam {
    private final Context a;

    public dxam(Context context) {
        this.a = context;
    }

    public final String a(Uri uri) {
        return efcd.a(uri, new efbt(this.a)).getAbsolutePath();
    }
}
