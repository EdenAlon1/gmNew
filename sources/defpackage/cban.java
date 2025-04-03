package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cban extends cbce {
    final crji a;

    public cban(crji crjiVar, Uri uri, int i, int i2, boolean z) {
        this(crjiVar, uri, i, i2, z, 0);
    }

    @Override // defpackage.cbce, defpackage.cbbi, defpackage.cbbo
    public final cbbn f(Context context) {
        Uri uri = this.k;
        return "s".equals(uri == null ? null : crjm.s(uri)) ? new cbao(context, this.a, this) : (uri == null || !(csuu.w(uri) || crjm.x(context, uri))) ? new cbbz(context, this) : new cbam(context, this.a, this);
    }

    public cban(crji crjiVar, Uri uri, int i, int i2, boolean z, int i3) {
        super(uri, i, i2, true, z, i3);
        this.a = crjiVar;
    }
}
