package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface fhnt extends Closeable, Flushable {
    fhnx a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void id(fhmt fhmtVar, long j);
}
