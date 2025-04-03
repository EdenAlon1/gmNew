package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class neb implements nco {
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = lvf.ae("#!AMR\n");
    private static final byte[] d = lvf.ae("#!AMR-WB\n");
    private final byte[] e;
    private final ndu f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private ncr n;
    private ndu o;
    private ndu p;
    private ndn q;
    private long r;
    private boolean s;

    public neb(byte[] bArr) {
        this.e = new byte[1];
        this.k = -1;
        nck nckVar = new nck();
        this.f = nckVar;
        this.p = nckVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036 A[Catch: EOFException -> 0x0073, TryCatch #0 {EOFException -> 0x0073, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x0036, B:24:0x003f, B:30:0x003b, B:40:0x0059, B:41:0x0066, B:42:0x0067, B:43:0x0072), top: B:12:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b A[Catch: EOFException -> 0x0073, TryCatch #0 {EOFException -> 0x0073, blocks: (B:13:0x0007, B:15:0x0018, B:23:0x0036, B:24:0x003f, B:30:0x003b, B:40:0x0059, B:41:0x0066, B:42:0x0067, B:43:0x0072), top: B:12:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int h(defpackage.ncp r10) {
        /*
            r9 = this;
            int r0 = r9.j
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != 0) goto L74
            r10.k()     // Catch: java.io.EOFException -> L73
            byte[] r0 = r9.e     // Catch: java.io.EOFException -> L73
            r10.i(r0, r1, r3)     // Catch: java.io.EOFException -> L73
            byte[] r0 = r9.e     // Catch: java.io.EOFException -> L73
            r0 = r0[r1]     // Catch: java.io.EOFException -> L73
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L67
            int r0 = r0 >> 3
            boolean r4 = r9.g     // Catch: java.io.EOFException -> L73
            r0 = r0 & 15
            if (r4 == 0) goto L29
            r6 = 10
            if (r0 < r6) goto L34
            r6 = 13
            if (r0 <= r6) goto L29
            goto L34
        L29:
            if (r4 != 0) goto L52
            r6 = 12
            if (r0 < r6) goto L34
            r6 = 14
            if (r0 > r6) goto L34
            goto L52
        L34:
            if (r4 == 0) goto L3b
            int[] r4 = defpackage.neb.b     // Catch: java.io.EOFException -> L73
            r0 = r4[r0]     // Catch: java.io.EOFException -> L73
            goto L3f
        L3b:
            int[] r4 = defpackage.neb.a     // Catch: java.io.EOFException -> L73
            r0 = r4[r0]     // Catch: java.io.EOFException -> L73
        L3f:
            r9.i = r0     // Catch: java.io.EOFException -> L73
            r9.j = r0
            int r4 = r9.k
            if (r4 != r2) goto L4a
            r9.k = r0
            r4 = r0
        L4a:
            if (r4 != r0) goto L74
            int r4 = r9.l
            int r4 = r4 + r3
            r9.l = r4
            goto L74
        L52:
            java.lang.String r10 = "WB"
            java.lang.String r1 = "NB"
            if (r3 == r4) goto L59
            r10 = r1
        L59:
            java.lang.String r1 = "Illegal AMR "
            java.lang.String r4 = " frame type "
            java.lang.String r10 = defpackage.a.z(r0, r10, r1, r4)     // Catch: java.io.EOFException -> L73
            lrg r0 = new lrg     // Catch: java.io.EOFException -> L73
            r0.<init>(r10, r5, r3, r3)     // Catch: java.io.EOFException -> L73
            throw r0     // Catch: java.io.EOFException -> L73
        L67:
            java.lang.String r10 = "Invalid padding bits for frame header "
            java.lang.String r10 = defpackage.a.h(r0, r10)     // Catch: java.io.EOFException -> L73
            lrg r0 = new lrg     // Catch: java.io.EOFException -> L73
            r0.<init>(r10, r5, r3, r3)     // Catch: java.io.EOFException -> L73
            throw r0     // Catch: java.io.EOFException -> L73
        L73:
            return r2
        L74:
            ndu r4 = r9.p
            int r10 = r4.e(r10, r0, r3)
            if (r10 != r2) goto L7d
            return r2
        L7d:
            int r0 = r9.j
            int r0 = r0 - r10
            r9.j = r0
            if (r0 <= 0) goto L85
            return r1
        L85:
            ndu r2 = r9.p
            long r3 = r9.h
            int r6 = r9.i
            r7 = 0
            r8 = 0
            r5 = 1
            r2.o(r3, r5, r6, r7, r8)
            long r2 = r9.h
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.h = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.neb.h(ncp):int");
    }

    private static boolean i(ncp ncpVar, byte[] bArr) {
        ncpVar.k();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ncpVar.i(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean j(ncp ncpVar) {
        byte[] bArr = c;
        if (i(ncpVar, bArr)) {
            this.g = false;
            ncpVar.l(bArr.length);
            return true;
        }
        byte[] bArr2 = d;
        if (!i(ncpVar, bArr2)) {
            return false;
        }
        this.g = true;
        ncpVar.l(bArr2.length);
        return true;
    }

    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        lti.g(this.o);
        int i = lvf.a;
        if (((nce) ncpVar).b == 0 && !j(ncpVar)) {
            throw new lrg("Could not find AMR header.", null, true, 1);
        }
        if (!this.s) {
            this.s = true;
            boolean z = this.g;
            String str = true != z ? "audio/amr" : "audio/amr-wb";
            String str2 = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i2 = true != z ? 8000 : 16000;
            int i3 = z ? b[8] : a[7];
            ndu nduVar = this.o;
            lqb lqbVar = new lqb();
            lqbVar.a(str);
            lqbVar.c(str2);
            lqbVar.n = i3;
            lqbVar.C = 1;
            lqbVar.D = i2;
            nduVar.i(new lqc(lqbVar));
        }
        int h = h(ncpVar);
        if (this.q == null) {
            ndm ndmVar = new ndm(-9223372036854775807L);
            this.q = ndmVar;
            this.n.w(ndmVar);
        }
        return h == -1 ? -1 : 0;
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.n = ncrVar;
        ndu p = ncrVar.p(0, 1);
        this.o = p;
        this.p = p;
        ncrVar.r();
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        this.h = 0L;
        this.i = 0;
        this.j = 0;
        this.r = j2;
        this.m = 0L;
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        return j(ncpVar);
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    public neb() {
        this(null);
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
