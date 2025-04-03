package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msd implements muf {
    public nco a;
    public ncp b;
    private final nct c;

    public msd(nct nctVar) {
        this.c = nctVar;
    }

    @Override // defpackage.muf
    public final long a() {
        ncp ncpVar = this.b;
        if (ncpVar != null) {
            return ((nce) ncpVar).b;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        if (r1.b != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006f, code lost:
    
        if (r1.b != r11) goto L38;
     */
    @Override // defpackage.muf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.lpp r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, defpackage.ncr r15) {
        /*
            r7 = this;
            nce r1 = new nce
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.b = r1
            nco r8 = r7.a
            if (r8 == 0) goto Lf
            return
        Lf:
            nct r8 = r7.c
            nco[] r8 = r8.a(r9, r10)
            int r9 = r8.length
            engr r10 = defpackage.engw.d(r9)
            r11 = 0
            r12 = 1
            if (r9 != r12) goto L24
            r8 = r8[r11]
            r7.a = r8
            goto L82
        L24:
            r13 = r11
        L25:
            if (r13 >= r9) goto L7e
            r14 = r8[r13]
            boolean r0 = r14.f(r1)     // Catch: java.lang.Throwable -> L53 java.io.EOFException -> L67
            if (r0 == 0) goto L41
            r7.a = r14     // Catch: java.lang.Throwable -> L53 java.io.EOFException -> L67
            if (r14 != 0) goto L39
            long r13 = r1.b
            int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r9 != 0) goto L3a
        L39:
            r11 = r12
        L3a:
            defpackage.lti.c(r11)
            r1.k()
            goto L7e
        L41:
            java.util.List r14 = r14.x()     // Catch: java.lang.Throwable -> L53 java.io.EOFException -> L67
            r10.j(r14)     // Catch: java.lang.Throwable -> L53 java.io.EOFException -> L67
            nco r14 = r7.a
            if (r14 != 0) goto L74
            long r5 = r1.b
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto L72
            goto L74
        L53:
            r0 = move-exception
            r8 = r0
            nco r9 = r7.a
            if (r9 != 0) goto L5f
            long r9 = r1.b
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L60
        L5f:
            r11 = r12
        L60:
            defpackage.lti.c(r11)
            r1.k()
            throw r8
        L67:
            nco r14 = r7.a
            if (r14 != 0) goto L74
            long r5 = r1.b
            int r14 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r14 != 0) goto L72
            goto L74
        L72:
            r14 = r11
            goto L75
        L74:
            r14 = r12
        L75:
            defpackage.lti.c(r14)
            r1.k()
            int r13 = r13 + 1
            goto L25
        L7e:
            nco r9 = r7.a
            if (r9 == 0) goto L88
        L82:
            nco r8 = r7.a
            r8.c(r15)
            return
        L88:
            mvp r9 = new mvp
            emww r11 = new emww
            java.lang.String r12 = ", "
            r11.<init>(r12)
            engw r8 = defpackage.engw.p(r8)
            msc r12 = new msc
            r12.<init>()
            java.util.List r8 = defpackage.enkr.g(r8, r12)
            java.lang.String r8 = r11.b(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            engw r10 = r10.g()
            r9.<init>(r8, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msd.b(lpp, android.net.Uri, java.util.Map, long, long, ncr):void");
    }
}
