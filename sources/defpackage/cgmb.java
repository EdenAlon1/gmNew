package defpackage;

import j$.util.Optional;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgmb implements Closeable {
    private static final cskc a = cskc.g("BugleMDD", "MddFileProvider");
    private final Optional b;
    private final Optional c;

    public cgmb(efds efdsVar) {
        this.b = Optional.of(efdsVar);
        this.c = Optional.empty();
    }

    public final String a() {
        return this.b.isPresent() ? ((efds) this.b.get()).a.toString() : "file:".concat((String) this.c.get());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b.isEmpty()) {
            return;
        }
        try {
            ((efds) this.b.get()).close();
        } catch (IOException e) {
            csjb b = a.b();
            b.I("Couldn't close the CloseableUri");
            b.A("Uri", ((efds) this.b.get()).toString());
            b.s(e);
        }
    }

    public cgmb(String str) {
        this.c = Optional.of(str);
        this.b = Optional.empty();
    }
}
