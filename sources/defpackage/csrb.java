package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class csrb implements Closeable {
    public abstract csqz a();

    public abstract csqz b();

    public abstract void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eoel eoelVar = new eoel();
        eoelVar.a(b());
        eoelVar.a(a());
        eoelVar.close();
    }

    public abstract void d();
}
