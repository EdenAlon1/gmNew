package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhmp implements fhnv {
    final /* synthetic */ fhmq a;
    final /* synthetic */ fhnv b;

    public fhmp(fhmq fhmqVar, fhnv fhnvVar) {
        this.a = fhmqVar;
        this.b = fhnvVar;
    }

    @Override // defpackage.fhnv
    public final /* synthetic */ fhnx a() {
        return this.a;
    }

    @Override // defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        fhmq fhmqVar = this.a;
        fhmqVar.e();
        try {
            long b = this.b.b(fhmtVar, j);
            if (fhmqVar.f()) {
                throw fhmqVar.d(null);
            }
            return b;
        } catch (IOException e) {
            if (fhmqVar.f()) {
                throw fhmqVar.d(e);
            }
            throw e;
        } finally {
            fhmqVar.f();
        }
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fhmq fhmqVar = this.a;
        fhmqVar.e();
        try {
            this.b.close();
            if (fhmqVar.f()) {
                throw fhmqVar.d(null);
            }
        } catch (IOException e) {
            if (!fhmqVar.f()) {
                throw e;
            }
            throw fhmqVar.d(e);
        } finally {
            fhmqVar.f();
        }
    }

    public final String toString() {
        return "AsyncTimeout.source(" + this.b + ")";
    }
}
