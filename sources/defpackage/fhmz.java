package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhmz implements fhnv {
    public final fhnv b;

    public fhmz(fhnv fhnvVar) {
        fhnvVar.getClass();
        this.b = fhnvVar;
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.b.a();
    }

    @Override // defpackage.fhnv
    public long b(fhmt fhmtVar, long j) {
        throw null;
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
