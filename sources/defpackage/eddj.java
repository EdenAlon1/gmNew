package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eddj implements eddp {
    private final eddq a;
    private final Map b = new ConcurrentHashMap();

    public eddj(eddq eddqVar) {
        this.a = eddqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[Catch: IllegalStateException -> 0x0088, IllegalArgumentException | IllegalStateException -> 0x008a, all -> 0x0099, TRY_ENTER, TryCatch #4 {, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x0011, B:13:0x0026, B:14:0x0044, B:15:0x0048, B:17:0x004e, B:19:0x005a, B:29:0x0041, B:39:0x0080, B:40:0x0087, B:41:0x0084, B:46:0x008b, B:47:0x0096), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084 A[Catch: IllegalStateException -> 0x0088, IllegalArgumentException | IllegalStateException -> 0x008a, all -> 0x0099, TryCatch #4 {, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x0011, B:13:0x0026, B:14:0x0044, B:15:0x0048, B:17:0x004e, B:19:0x005a, B:29:0x0041, B:39:0x0080, B:40:0x0087, B:41:0x0084, B:46:0x008b, B:47:0x0096), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void b(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Map r0 = r7.b     // Catch: java.lang.Throwable -> L99
            boolean r0 = r0.containsKey(r8)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L97
            java.lang.Class<eddh> r0 = defpackage.eddh.class
            java.io.InputStream r0 = r0.getResourceAsStream(r8)     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
            if (r0 != 0) goto L24
            java.util.logging.Logger r1 = defpackage.eddh.a     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
            java.lang.String r3 = "File %s not found"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
            r5 = 0
            r4[r5] = r8     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
            r1.log(r2, r3)     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
        L24:
            if (r0 != 0) goto L29
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
            goto L44
        L29:
            r1 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            edcy r1 = new edcy     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            r1.<init>()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            r1.readExternal(r2)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            java.util.List r3 = r1.a     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            if (r3 != 0) goto L61
            java.util.List r0 = r1.a     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            defpackage.eddi.a(r2)     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
        L44:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L99
        L48:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L99
            edcx r1 = (defpackage.edcx) r1     // Catch: java.lang.Throwable -> L99
            eddq r2 = r7.a     // Catch: java.lang.Throwable -> L99
            r2.a(r1)     // Catch: java.lang.Throwable -> L99
            goto L48
        L5a:
            java.util.Map r0 = r7.b     // Catch: java.lang.Throwable -> L99
            r0.put(r8, r8)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r7)
            return
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            java.lang.String r3 = "Empty metadata"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
            throw r1     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6e
        L69:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L7e
        L6e:
            r1 = move-exception
            goto L76
        L70:
            r2 = move-exception
            goto L7e
        L72:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L76:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.String r4 = "Unable to parse metadata file"
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L69
        L7e:
            if (r1 == 0) goto L84
            defpackage.eddi.a(r1)     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
            goto L87
        L84:
            defpackage.eddi.a(r0)     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
        L87:
            throw r2     // Catch: java.lang.IllegalStateException -> L88 java.lang.IllegalArgumentException -> L8a java.lang.Throwable -> L99
        L88:
            r0 = move-exception
            goto L8b
        L8a:
            r0 = move-exception
        L8b:
            java.lang.String r1 = "Failed to read file "
            java.lang.String r8 = r1.concat(r8)     // Catch: java.lang.Throwable -> L99
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L99
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> L99
            throw r1     // Catch: java.lang.Throwable -> L99
        L97:
            monitor-exit(r7)
            return
        L99:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L99
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eddj.b(java.lang.String):void");
    }

    @Override // defpackage.eddp
    public final eddq a(String str) {
        if (!this.b.containsKey(str)) {
            b(str);
        }
        return this.a;
    }
}
