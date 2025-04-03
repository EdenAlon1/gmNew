package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cihg implements Closeable {
    final /* synthetic */ elfl a;
    final /* synthetic */ cihh b;

    public cihg(cihh cihhVar, elfl elflVar) {
        this.a = elflVar;
        this.b = cihhVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b.b) {
            elfl elflVar = this.a;
            cihh cihhVar = this.b;
            if (elflVar == cihhVar.h) {
                cihhVar.h = null;
            }
        }
    }
}
