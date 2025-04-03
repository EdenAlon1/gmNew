package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class exat implements Closeable {
    public abstract ParcelFileDescriptor a();

    public abstract ParcelFileDescriptor b();

    public abstract ParcelFileDescriptor c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eoel eoelVar = new eoel();
        try {
            eoelVar.a(c());
            eoelVar.a(a());
            eoelVar.a(b());
            eoelVar.a(d());
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

    public abstract ParcelFileDescriptor d();

    public abstract String e();
}
