package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class exau implements Closeable {
    public abstract ParcelFileDescriptor a();

    public abstract ParcelFileDescriptor b();

    public abstract ParcelFileDescriptor c();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eoel eoelVar = new eoel();
        try {
            enqv it = e().iterator();
            while (it.hasNext()) {
                eoelVar.a((exat) it.next());
            }
            eoelVar.a(a());
            eoelVar.a(d());
            eoelVar.a(b());
            eoelVar.a(c());
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

    public abstract engw e();
}
