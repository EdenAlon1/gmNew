package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dljn implements Closeable, dljy {
    private final dlkt a;
    private final dlfa b = new dlfa(false);

    public dljn(dlkt dlktVar) {
        this.a = dlktVar;
    }

    @Override // defpackage.dljy
    public final dlfa a() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:452:0x09f4, code lost:
    
        if (r0 == null) goto L432;
     */
    /* JADX WARN: Removed duplicated region for block: B:384:0x08e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0868 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0a2a  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0a2d A[SYNTHETIC] */
    @Override // defpackage.dljy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dljx b(defpackage.dlfy r33, java.util.List r34, java.util.List r35) {
        /*
            Method dump skipped, instructions count: 2631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dljn.b(dlfy, java.util.List, java.util.List):dljx");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
