package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeup implements erqj {
    final /* synthetic */ eeuq a;

    public eeup(eeuq eeuqVar) {
        this.a = eeuqVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.d("MetadataFetcher", "load() succeeded with cache key ".concat(String.valueOf(this.a.e)));
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        eeuq eeuqVar = this.a;
        if (th instanceof CancellationException) {
            Log.d("MetadataFetcher", "load() cancelled for cache key ".concat(String.valueOf(eeuqVar.e)));
        } else {
            Log.w("MetadataFetcher", "load() failed for cache key ".concat(String.valueOf(eeuqVar.e)), th);
        }
        synchronized (eeuqVar.b) {
            eeuqVar.g = null;
        }
    }
}
