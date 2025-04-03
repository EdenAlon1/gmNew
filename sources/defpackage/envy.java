package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class envy extends enwf implements enwd {
    public final AtomicBoolean a = new AtomicBoolean();

    @Override // defpackage.enwf
    public final enwb a() {
        return new envw(this);
    }

    @Override // defpackage.enwd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
