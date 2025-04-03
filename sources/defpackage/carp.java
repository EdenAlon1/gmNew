package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class carp implements Closeable {
    private final emwl a;

    public carp(emwl emwlVar) {
        this.a = emwlVar;
        emxf.m(!((Boolean) emwlVar.apply(null)).booleanValue(), "database closed before starting work");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        emxf.m(!((Boolean) this.a.apply(null)).booleanValue(), "database closed while doing work");
    }
}
