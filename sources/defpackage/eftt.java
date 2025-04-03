package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eftt implements efts {
    public final efua a;

    public eftt(final efua efuaVar) {
        this.a = efuaVar;
        if (efuaVar.e) {
            return;
        }
        final ListenableFuture submit = efuaVar.c.submit(new Callable() { // from class: eftw
            /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r10 = this;
                    efua r0 = defpackage.efua.this
                    r1 = 0
                    android.content.Context r0 = r0.b     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
                    android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
                    r2 = 2132017211(0x7f14003b, float:1.9672694E38)
                    java.io.InputStream r2 = r0.openRawResource(r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
                    ezpc r0 = defpackage.ezpc.a     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L24
                    eyhz r0 = r0.getParserForType()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L24
                    java.lang.Object r0 = r0.g(r2)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L24
                    ezpc r0 = (defpackage.ezpc) r0     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L24
                    defpackage.eoek.a(r2)
                    goto L45
                L20:
                    r0 = move-exception
                    r1 = r2
                    goto Lbc
                L24:
                    r0 = move-exception
                    r9 = r2
                    goto L2c
                L27:
                    r0 = move-exception
                    goto Lbc
                L2a:
                    r0 = move-exception
                    r9 = r1
                L2c:
                    r8 = r0
                    enru r0 = defpackage.efua.a     // Catch: java.lang.Throwable -> Lba
                    ensk r2 = r0.i()     // Catch: java.lang.Throwable -> Lba
                    java.lang.String r4 = "com/google/android/libraries/toolkit/monogram/impl/MonogramData"
                    java.lang.String r5 = "createPrefixToMonogramMap"
                    java.lang.String r7 = "MonogramData.java"
                    java.lang.String r3 = "Error reading config, using defaults."
                    r6 = 98
                    defpackage.a.p(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lba
                    ezpc r0 = defpackage.ezpc.a     // Catch: java.lang.Throwable -> Lba
                    defpackage.eoek.a(r9)
                L45:
                    eyhm r0 = r0.b
                    java.util.Map r0 = j$.util.DesugarCollections.unmodifiableMap(r0)
                    eftz r2 = new eftz
                    int r3 = r0.size()
                    r2.<init>(r3)
                    java.util.Set r0 = r0.entrySet()
                    java.util.Iterator r0 = r0.iterator()
                L5c:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto Lb9
                    java.lang.Object r3 = r0.next()
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    java.lang.Object r4 = r3.getKey()
                    java.lang.String r4 = (java.lang.String) r4
                    java.lang.Object r5 = r3.getValue()
                    java.lang.String r5 = (java.lang.String) r5
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L7c
                    r3 = r4
                    goto L82
                L7c:
                    java.lang.Object r3 = r3.getValue()
                    java.lang.String r3 = (java.lang.String) r3
                L82:
                    char[] r4 = r4.toCharArray()
                    int r5 = r4.length
                    r6 = 0
                    r7 = r1
                L89:
                    if (r6 >= r5) goto Lb6
                    char r8 = r4[r6]
                    if (r7 != 0) goto L91
                    r7 = r2
                    goto L9e
                L91:
                    eftz r9 = r7.a
                    if (r9 != 0) goto L9c
                    eftz r9 = new eftz
                    r9.<init>()
                    r7.a = r9
                L9c:
                    eftz r7 = r7.a
                L9e:
                    java.lang.Character r8 = java.lang.Character.valueOf(r8)
                    java.lang.Object r9 = r7.get(r8)
                    efty r9 = (defpackage.efty) r9
                    if (r9 != 0) goto Lb2
                    efty r9 = new efty
                    r9.<init>()
                    r7.put(r8, r9)
                Lb2:
                    r7 = r9
                    int r6 = r6 + 1
                    goto L89
                Lb6:
                    r7.b = r3
                    goto L5c
                Lb9:
                    return r2
                Lba:
                    r0 = move-exception
                    r1 = r9
                Lbc:
                    defpackage.eoek.a(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eftw.call():java.lang.Object");
            }
        });
        submit.b(new Runnable() { // from class: eftx
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    efua.this.d.set((eftz) erqt.q(submit));
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        }, erpp.a);
        efuaVar.e = true;
    }
}
