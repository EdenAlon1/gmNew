package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhmy implements fhnt {
    public final fhnt b;

    public fhmy(fhnt fhntVar) {
        this.b = fhntVar;
    }

    @Override // defpackage.fhnt
    public final fhnx a() {
        return this.b.a();
    }

    @Override // defpackage.fhnt, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // defpackage.fhnt, java.io.Flushable
    public void flush() {
        this.b.flush();
    }

    @Override // defpackage.fhnt
    public void id(fhmt fhmtVar, long j) {
        throw null;
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.b + ")";
    }
}
