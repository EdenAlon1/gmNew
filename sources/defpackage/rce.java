package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rce implements rao {
    private final Context a;
    private final rao b;
    private final rao c;
    private final Class d;

    public rce(Context context, rao raoVar, rao raoVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = raoVar;
        this.c = raoVar2;
        this.d = cls;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        Uri uri = (Uri) obj;
        return new ran(new rjn(uri), new rcd(this.a, this.b, this.c, uri, i, i2, qtuVar, this.d));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && qut.a((Uri) obj);
    }
}
