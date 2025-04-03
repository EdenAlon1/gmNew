package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbz implements rao {
    private final Context a;

    public rbz(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        Long l;
        Uri uri = (Uri) obj;
        if (!qut.b(i, i2) || (l = (Long) qtuVar.b(rev.a)) == null || l.longValue() != -1) {
            return null;
        }
        rjn rjnVar = new rjn(uri);
        Context context = this.a;
        return new ran(rjnVar, quw.c(context, uri, new quv(context.getContentResolver())));
    }

    @Override // defpackage.rao
    public final /* synthetic */ boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return qut.a(uri) && qut.c(uri);
    }
}
