package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eitj implements Closeable {
    final /* synthetic */ eitk a;

    public eitj(eitk eitkVar) {
        this.a = eitkVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        emxf.m(this.a.a.compareAndSet(true, false), "AccountOperationContext is already in the immutable state. This may be caused by concurrent access to the object, which is forbidden.");
    }
}
