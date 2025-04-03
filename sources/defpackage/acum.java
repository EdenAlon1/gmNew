package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class acum implements Closeable {
    public abstract acus a();

    public abstract acvo b();

    public abstract acvo c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
        c().close();
        ((elfl) e().get()).cancel(false);
        Enumeration keys = f().keys();
        while (keys.hasMoreElements()) {
            Closeable closeable = (Closeable) keys.nextElement();
            if (((Boolean) f().remove(closeable)) != null) {
                closeable.close();
            }
        }
    }

    public abstract acyu d();

    public abstract emyl e();

    public abstract ConcurrentHashMap f();

    public abstract boolean g();

    public final boolean h() {
        return b().e() && c().e();
    }
}
