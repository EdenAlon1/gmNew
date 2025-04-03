package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgx {
    private final phv a;

    public pgx(phv phvVar) {
        this.a = phvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, phv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.pgx a(android.content.Context r10) {
        /*
            java.lang.String r0 = "EmbeddingBackend"
            r10.getClass()
            ffji r1 = defpackage.phu.a
            pir r2 = defpackage.pir.a
            if (r2 != 0) goto Lc2
            java.util.concurrent.locks.ReentrantLock r2 = defpackage.pir.b
            r2.lock()
            pir r3 = defpackage.pir.a     // Catch: java.lang.Throwable -> Lbd
            if (r3 != 0) goto Lb9
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> Lbd
            r10.getClass()     // Catch: java.lang.Throwable -> Lbd
            pgk r3 = new pgk     // Catch: java.lang.Throwable -> Lbd
            r3.<init>()     // Catch: java.lang.Throwable -> Lbd
            int r3 = r3.a     // Catch: java.lang.Throwable -> Lbd
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L9a
            r5.getClass()     // Catch: java.lang.Throwable -> L9a
            if (r3 <= 0) goto Lab
            boolean r5 = defpackage.pih.b()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto Lab
            java.lang.Class<phv> r5 = defpackage.phv.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto Lab
            boolean r6 = defpackage.pih.b()     // Catch: java.lang.Throwable -> L9a
            if (r6 == 0) goto L64
            java.lang.Class<pij> r6 = defpackage.pij.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch: java.lang.Throwable -> L9a
            if (r6 == 0) goto L5f
            pla r7 = new pla     // Catch: java.lang.Throwable -> L9a
            pgp r8 = new pgp     // Catch: java.lang.Throwable -> L9a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L9a
            androidx.window.extensions.WindowExtensions r9 = defpackage.pgq$$ExternalSyntheticApiModelOutline0.m()     // Catch: java.lang.Throwable -> L9a
            r9.getClass()     // Catch: java.lang.Throwable -> L9a
            r7.<init>(r6, r8, r9)     // Catch: java.lang.Throwable -> L9a
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r6 = r7.a()     // Catch: java.lang.Throwable -> L9a
            if (r6 != 0) goto L68
        L5f:
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r6 = defpackage.pih.a()     // Catch: java.lang.Throwable -> L9a
            goto L68
        L64:
            androidx.window.extensions.embedding.ActivityEmbeddingComponent r6 = defpackage.pih.a()     // Catch: java.lang.Throwable -> L9a
        L68:
            phm r7 = new phm     // Catch: java.lang.Throwable -> L9a
            r7.<init>()     // Catch: java.lang.Throwable -> L9a
            pij r8 = new pij     // Catch: java.lang.Throwable -> L9a
            pgp r9 = new pgp     // Catch: java.lang.Throwable -> L9a
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L9a
            r5 = 8
            if (r3 < r5) goto L7d
            piw r5 = new piw     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L9a
        L7d:
            r5 = 6
            if (r3 < r5) goto L95
            r6.getClass()     // Catch: java.lang.Throwable -> L9a
            java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock     // Catch: java.lang.Throwable -> L9a
            r3.<init>()     // Catch: java.lang.Throwable -> L9a
            android.util.ArrayMap r3 = new android.util.ArrayMap     // Catch: java.lang.Throwable -> L9a
            r3.<init>()     // Catch: java.lang.Throwable -> L9a
            pgk r3 = new pgk     // Catch: java.lang.Throwable -> L9a
            r3.<init>()     // Catch: java.lang.Throwable -> L9a
            r3.a(r5)     // Catch: java.lang.Throwable -> L9a
        L95:
            r8.<init>(r6, r7, r9)     // Catch: java.lang.Throwable -> L9a
            r4 = r8
            goto Lab
        L9a:
            r3 = move-exception
            java.lang.String r5 = "Failed to load embedding extension: "
            r3.toString()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = r5.concat(r3)     // Catch: java.lang.Throwable -> Lbd
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> Lbd
        Lab:
            if (r4 != 0) goto Lb2
            java.lang.String r3 = "No supported embedding extension found"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> Lbd
        Lb2:
            pir r0 = new pir     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r10, r4)     // Catch: java.lang.Throwable -> Lbd
            defpackage.pir.a = r0     // Catch: java.lang.Throwable -> Lbd
        Lb9:
            r2.unlock()
            goto Lc2
        Lbd:
            r10 = move-exception
            r2.unlock()
            throw r10
        Lc2:
            pir r10 = defpackage.pir.a
            r10.getClass()
            java.lang.Object r10 = r1.invoke(r10)
            pgx r0 = new pgx
            r0.<init>(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgx.a(android.content.Context):pgx");
    }

    public final boolean b(Activity activity) {
        activity.getClass();
        return this.a.a(activity);
    }
}
