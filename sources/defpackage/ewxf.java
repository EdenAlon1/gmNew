package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ewxf implements Closeable {
    public abstract ParcelFileDescriptor a();

    public abstract ParcelFileDescriptor b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eoel eoelVar = new eoel();
        try {
            eoelVar.a(b());
            eoelVar.a(a());
            eoelVar.close();
        } catch (Throwable th) {
            try {
                eoelVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
