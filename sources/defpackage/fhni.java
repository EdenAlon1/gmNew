package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhni implements fhnt {
    private final OutputStream a;
    private final fhnx b;

    public fhni(OutputStream outputStream, fhnx fhnxVar) {
        this.a = outputStream;
        this.b = fhnxVar;
    }

    @Override // defpackage.fhnt
    public final fhnx a() {
        return this.b;
    }

    @Override // defpackage.fhnt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.fhnt, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.fhnt
    public final void id(fhmt fhmtVar, long j) {
        fhmm.b(fhmtVar.b, 0L, j);
        while (j > 0) {
            this.b.g();
            fhnq fhnqVar = fhmtVar.a;
            fhnqVar.getClass();
            int min = (int) Math.min(j, fhnqVar.c - fhnqVar.b);
            this.a.write(fhnqVar.a, fhnqVar.b, min);
            int i = fhnqVar.b + min;
            fhnqVar.b = i;
            long j2 = min;
            fhmtVar.b -= j2;
            j -= j2;
            if (i == fhnqVar.c) {
                fhmtVar.a = fhnqVar.a();
                fhnr.b(fhnqVar);
            }
        }
    }

    public final String toString() {
        return "sink(" + this.a + ")";
    }
}
