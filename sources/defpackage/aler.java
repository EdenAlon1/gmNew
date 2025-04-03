package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aler implements Closeable {
    public final int a;
    public final int b;
    public final long c;
    final /* synthetic */ alex d;

    public aler(alex alexVar, int i, int i2, long j) {
        this.d = alexVar;
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final void a() {
        this.d.f(this, fagh.CANCELLED);
    }

    public final void b(fagh faghVar) {
        if (faghVar == null) {
            faghVar = fagh.UNKNOWN;
        }
        this.d.f(this, faghVar);
    }

    public final void c() {
        this.d.f(this, fagh.OK);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.f(this, fagh.OK);
    }
}
