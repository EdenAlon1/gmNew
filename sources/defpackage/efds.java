package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efds implements Closeable {
    public final /* synthetic */ Uri a;
    final /* synthetic */ Pair b;

    public efds(Uri uri, Pair pair) {
        this.a = uri;
        this.b = pair;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((Closeable) this.b.second).close();
    }
}
