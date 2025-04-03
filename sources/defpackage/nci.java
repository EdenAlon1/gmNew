package defpackage;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nci {
    private final nch a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    public nci(nch nchVar) {
        this.a = nchVar;
    }

    public final nco a(Object... objArr) {
        Constructor a;
        synchronized (this.b) {
            if (!this.b.get()) {
                try {
                    a = this.a.a();
                } catch (ClassNotFoundException unused) {
                    this.b.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (nco) a.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
