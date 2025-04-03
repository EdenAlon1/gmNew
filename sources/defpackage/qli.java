package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qli {
    final String[] a;
    final fhnh b;

    private qli(String[] strArr, fhnh fhnhVar) {
        this.a = strArr;
        this.b = fhnhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:13:0x003a, B:14:0x003d, B:16:0x0042, B:27:0x0047, B:29:0x004a, B:32:0x0059), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qli a(java.lang.String... r12) {
        /*
            int r0 = r12.length     // Catch: java.io.IOException -> L6b
            fhmx[] r0 = new defpackage.fhmx[r0]     // Catch: java.io.IOException -> L6b
            fhmt r1 = new fhmt     // Catch: java.io.IOException -> L6b
            r1.<init>()     // Catch: java.io.IOException -> L6b
            r2 = 0
            r3 = r2
        La:
            int r4 = r12.length     // Catch: java.io.IOException -> L6b
            if (r3 >= r4) goto L59
            r4 = r12[r3]     // Catch: java.io.IOException -> L6b
            java.lang.String[] r5 = defpackage.qlk.a     // Catch: java.io.IOException -> L6b
            r6 = 34
            r1.O(r6)     // Catch: java.io.IOException -> L6b
            int r7 = r4.length()     // Catch: java.io.IOException -> L6b
            r8 = r2
            r9 = r8
        L1c:
            if (r8 >= r7) goto L45
            char r10 = r4.charAt(r8)     // Catch: java.io.IOException -> L6b
            r11 = 128(0x80, float:1.794E-43)
            if (r10 >= r11) goto L2b
            r10 = r5[r10]     // Catch: java.io.IOException -> L6b
            if (r10 == 0) goto L42
            goto L38
        L2b:
            r11 = 8232(0x2028, float:1.1535E-41)
            if (r10 != r11) goto L32
            java.lang.String r10 = "\\u2028"
            goto L38
        L32:
            r11 = 8233(0x2029, float:1.1537E-41)
            if (r10 != r11) goto L42
            java.lang.String r10 = "\\u2029"
        L38:
            if (r9 >= r8) goto L3d
            r1.T(r4, r9, r8)     // Catch: java.io.IOException -> L6b
        L3d:
            r1.aa(r10)     // Catch: java.io.IOException -> L6b
            int r9 = r8 + 1
        L42:
            int r8 = r8 + 1
            goto L1c
        L45:
            if (r9 >= r7) goto L4a
            r1.T(r4, r9, r7)     // Catch: java.io.IOException -> L6b
        L4a:
            r1.O(r6)     // Catch: java.io.IOException -> L6b
            r1.d()     // Catch: java.io.IOException -> L6b
            fhmx r4 = r1.t()     // Catch: java.io.IOException -> L6b
            r0[r3] = r4     // Catch: java.io.IOException -> L6b
            int r3 = r3 + 1
            goto La
        L59:
            qli r1 = new qli     // Catch: java.io.IOException -> L6b
            java.lang.Object r12 = r12.clone()     // Catch: java.io.IOException -> L6b
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch: java.io.IOException -> L6b
            fhng r2 = defpackage.fhnh.a     // Catch: java.io.IOException -> L6b
            fhnh r0 = r2.a(r0)     // Catch: java.io.IOException -> L6b
            r1.<init>(r12, r0)     // Catch: java.io.IOException -> L6b
            return r1
        L6b:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qli.a(java.lang.String[]):qli");
    }

    static /* synthetic */ String b(qll qllVar, String str) {
        return str + qlj.a(qllVar.q()) + " at path " + qllVar.e();
    }
}
