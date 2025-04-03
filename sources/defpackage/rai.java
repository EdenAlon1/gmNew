package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rai implements rao {
    private final Context a;

    public rai(Context context) {
        this.a = context;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        Uri uri = (Uri) obj;
        return new ran(new rjn(uri), new rah(this.a, uri));
    }

    @Override // defpackage.rao
    public final /* synthetic */ boolean b(Object obj) {
        return qut.a((Uri) obj);
    }
}
