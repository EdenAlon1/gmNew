package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjcq extends fhhe {
    IOException a;
    private final fhhe b;
    private final fhmv c;

    public fjcq(fhhe fhheVar) {
        this.b = fhheVar;
        this.c = new fhnp(new fjcp(this, fhheVar.c()));
    }

    @Override // defpackage.fhhe
    public final long a() {
        return this.b.a();
    }

    @Override // defpackage.fhhe
    public final fhgn b() {
        return this.b.b();
    }

    @Override // defpackage.fhhe
    public final fhmv c() {
        return this.c;
    }

    @Override // defpackage.fhhe, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
