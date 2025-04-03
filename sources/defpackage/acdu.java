package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdu implements ekob {
    public final Context a;
    private final akzt b;

    public acdu(Context context, akzt akztVar) {
        this.a = context;
        this.b = akztVar;
    }

    @Override // defpackage.ekob
    public final eknz b(ekoa ekoaVar) {
        Uri data = ekoaVar.a.getData();
        if (data == null) {
            return null;
        }
        if ((!"https".equals(data.getScheme()) && !"http".equals(data.getScheme())) || !"messages.google.com".equals(data.getHost()) || !"/install".equals(data.getPath())) {
            return null;
        }
        this.b.c("Bugle.Deeplink.Uace.Campaigns");
        return new acdt(this);
    }
}
