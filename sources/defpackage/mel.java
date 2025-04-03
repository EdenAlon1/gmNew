package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mel extends lrh {
    public final int c;
    public final String d;
    public final int e;
    public final lqc f;
    public final int g;
    public final mtl h;
    final boolean i;

    public mel(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    final mel a(mtl mtlVar) {
        String message = getMessage();
        int i = lvf.a;
        return new mel(message, getCause(), this.a, this.c, this.d, this.e, this.f, this.g, mtlVar, this.b, this.i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mel(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, defpackage.lqc r19, int r20, boolean r21) {
        /*
            r13 = this;
            r8 = r20
            if (r14 == 0) goto L5e
            r0 = 1
            if (r14 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r17
            r6 = r18
            goto L64
        Le:
            java.lang.String r1 = java.lang.String.valueOf(r19)
            int r2 = defpackage.lvf.a
            if (r8 == 0) goto L33
            if (r8 == r0) goto L30
            r0 = 2
            if (r8 == r0) goto L2d
            r0 = 3
            if (r8 == r0) goto L2a
            r0 = 4
            if (r8 != r0) goto L24
            java.lang.String r0 = "YES"
            goto L35
        L24:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L2a:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L35
        L2d:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L35
        L30:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L35
        L33:
            java.lang.String r0 = "NO"
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L64
        L5e:
            r5 = r17
            r6 = r18
            java.lang.String r0 = "Source error"
        L64:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L71:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r16
            r7 = r19
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mel.<init>(int, java.lang.Throwable, int, java.lang.String, int, lqc, int, boolean):void");
    }

    private mel(String str, Throwable th, int i, int i2, String str2, int i3, lqc lqcVar, int i4, mtl mtlVar, long j, boolean z) {
        super(str, th, i, j);
        boolean z2;
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        lti.a(z2);
        lti.a(th != null);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = lqcVar;
        this.g = i4;
        this.h = mtlVar;
        this.i = z;
    }
}
