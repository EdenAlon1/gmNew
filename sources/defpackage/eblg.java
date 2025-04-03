package defpackage;

import android.graphics.Bitmap;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eblg implements erqj {
    final /* synthetic */ ebtc a;

    public eblg(ebtc ebtcVar) {
        this.a = ebtcVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.a((Bitmap) obj);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.w("AvatarRetriever", "Failed to load avatar.", th);
        this.a.a(null);
    }
}
