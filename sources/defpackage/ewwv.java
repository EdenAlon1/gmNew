package defpackage;

import android.content.Context;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewwv implements Closeable {
    public final Context a;
    public final ewze b;
    public ewuy c;
    public boolean d = true;

    public ewwv(Context context, ewze ewzeVar) {
        this.a = context;
        this.b = ewzeVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }
}
