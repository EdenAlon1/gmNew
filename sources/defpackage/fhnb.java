package defpackage;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnb implements fhnv {
    private byte a;
    private final fhnp b;
    private final Inflater c;
    private final fhnc d;
    private final CRC32 e;

    public fhnb(fhnv fhnvVar) {
        fhnvVar.getClass();
        fhnp fhnpVar = new fhnp(fhnvVar);
        this.b = fhnpVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new fhnc(fhnpVar, inflater);
        this.e = new CRC32();
    }

    private final void c(fhmt fhmtVar, long j, long j2) {
        fhnq fhnqVar = fhmtVar.a;
        fhnqVar.getClass();
        while (true) {
            long j3 = fhnqVar.c - fhnqVar.b;
            if (j < j3) {
                break;
            }
            fhnqVar = fhnqVar.f;
            fhnqVar.getClass();
            j -= j3;
        }
        while (j2 > 0) {
            int i = (int) (fhnqVar.b + j);
            int min = (int) Math.min(fhnqVar.c - i, j2);
            this.e.update(fhnqVar.a, i, min);
            fhnqVar = fhnqVar.f;
            fhnqVar.getClass();
            j2 -= min;
            j = 0;
        }
    }

    private static final void d(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + ffpc.S(fhmm.a(i2), 8) + " != expected 0x" + ffpc.S(fhmm.a(i), 8));
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
    
        if (r1 == 2) goto L47;
     */
    @Override // defpackage.fhnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.fhmt r17, long r18) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhnb.b(fhmt, long):long");
    }

    @Override // defpackage.fhnv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
