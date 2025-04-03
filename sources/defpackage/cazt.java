package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cazt extends cazs {
    public cazt(Uri uri, int i, int i2) {
        super(null, uri, null, i, i2, -1, -1, false);
    }

    @Override // defpackage.cbce
    public final cbbn d(Context context, int i) {
        cbbh cbcdVar = c() ? new cbcd(context, this) : new cbch(context, this);
        cbcdVar.f = i;
        return cbcdVar;
    }
}
