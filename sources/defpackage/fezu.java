package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezu implements Closeable {
    public final fhmv a;
    public final fezp b;
    private final fezs c;

    public fezu(fhmv fhmvVar) {
        this.a = fhmvVar;
        fezs fezsVar = new fezs(fhmvVar);
        this.c = fezsVar;
        this.b = new fezp(fezsVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
    
        throw new java.io.IOException(defpackage.a.h(r3, "Invalid dynamic table size update "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(int r2, short r3, byte r4, int r5) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fezu.a(int, short, byte, int):java.util.List");
    }

    public final void b() {
        this.a.f();
        this.a.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
