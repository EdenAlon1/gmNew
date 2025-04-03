package defpackage;

import java.io.Closeable;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhhe implements Closeable {
    public Reader d;

    public abstract long a();

    public abstract fhgn b();

    public abstract fhmv c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        fhhl.q(c());
    }

    public final InputStream d() {
        return c().k();
    }
}
