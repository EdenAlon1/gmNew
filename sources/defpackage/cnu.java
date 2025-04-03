package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnu extends cmu {
    private int f;

    public cnu() {
        this(null);
    }

    private final int e(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void f() {
        this.f = cpg.a(this.d) - this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, cpg.c(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = cpg.a;
        } else {
            jArr = new long[(max + 15) >> 3];
            ffdo.s(jArr, -9187201950435737472L, jArr.length);
        }
        this.a = jArr;
        long[] jArr2 = this.a;
        int i2 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr2[i2] = (jArr2[i2] & (~j)) | j;
        f();
        this.b = new int[max];
        this.c = new int[max];
    }

    public final void c() {
        this.e = 0;
        if (this.a != cpg.a) {
            ffdo.s(r0, -9187201950435737472L, this.a.length);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        r5 = e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r37.f != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        if (((r37.a[r5 >> 3] >> ((r5 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        r5 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r5 <= 8) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (java.lang.Long.compare((r37.e * 32) ^ Long.MIN_VALUE, (r5 * 25) ^ Long.MIN_VALUE) > 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        r5 = r37.a;
        r6 = r37.d;
        r7 = r37.b;
        r8 = r37.c;
        r14 = r6 + 7;
        r26 = 255;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        if (r9 >= (r14 >> 3)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        r10 = r5[r9] & (-9187201950435737472L);
        r5[r9] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r9 = r9 + 1;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        r28 = r12;
        r9 = defpackage.ffdo.A(r5);
        r10 = r9 - 1;
        r13 = 72057594037927935L;
        r5[r10] = (r5[r10] & 72057594037927935L) | (-72057594037927936L);
        r5[r9] = r5[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
    
        if (r9 == r6) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0105, code lost:
    
        r10 = r9 >> 3;
        r16 = (r9 & 7) << 3;
        r11 = (r5[r10] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0113, code lost:
    
        if (r11 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011a, code lost:
    
        if (r11 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011d, code lost:
    
        r11 = r7[r9] * r28;
        r11 = r11 ^ (r11 << 16);
        r12 = r11 & 127;
        r11 = r11 >>> 7;
        r17 = e(r11);
        r11 = r11 & r6;
        r31 = r13;
        r33 = r2;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013d, code lost:
    
        if ((((r17 - r11) & r6) / 8) != (((r9 - r11) & r6) / 8)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013f, code lost:
    
        r5[r10] = (r1 << r16) | ((~(255 << r16)) & r5[r10]);
        r5[defpackage.ffdo.A(r5)] = (r5[0] & r31) | Long.MIN_VALUE;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0158, code lost:
    
        r13 = r31;
        r2 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015f, code lost:
    
        r3 = r17 >> 3;
        r11 = r5[r3];
        r13 = (r17 & 7) << 3;
        r1 = r1 << r13;
        r1 = (~(255 << r13)) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0173, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0175, code lost:
    
        r11 = ~(255 << r16);
        r5[r3] = r1 | r1;
        r5[r10] = (r5[r10] & r11) | (128 << r16);
        r7[r17] = r7[r9];
        r7[r9] = 0;
        r8[r17] = r8[r9];
        r8[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a7, code lost:
    
        r5[defpackage.ffdo.A(r5)] = (r5[0] & r31) | Long.MIN_VALUE;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0191, code lost:
    
        r5[r3] = r1 | r1;
        r1 = r7[r17];
        r7[r17] = r7[r9];
        r7[r9] = r1;
        r1 = r8[r17];
        r8[r17] = r8[r9];
        r8[r9] = r1;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0115, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b5, code lost:
    
        r33 = r2;
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0237, code lost:
    
        r5 = e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0244, code lost:
    
        r37.e++;
        r1 = r37.f;
        r2 = r37.a;
        r3 = r5 >> 3;
        r6 = r2[r3];
        r4 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025b, code lost:
    
        if (((r6 >> r4) & r26) != r18) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x025e, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0260, code lost:
    
        r37.f = r1 - r15;
        r1 = r37.d;
        r6 = (r6 & (~(r26 << r4))) | (r33 << r4);
        r2[r3] = r6;
        r2[(((r5 - 7) & r1) + (r1 & 7)) >> 3] = r6;
        r11 = ~r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01be, code lost:
    
        r33 = r2;
        r26 = 255;
        r1 = defpackage.cpg.b(r37.d);
        r2 = r37.a;
        r3 = r37.b;
        r5 = r37.c;
        r6 = r37.d;
        g(r1);
        r1 = r37.a;
        r7 = r37.b;
        r8 = r37.c;
        r9 = r37.d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e1, code lost:
    
        if (r10 >= r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f0, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r18) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f2, code lost:
    
        r11 = r3[r10];
        r12 = r11 * r12;
        r13 = e((r12 ^ (r12 << 16)) >>> 7);
        r14 = r13 >> 3;
        r16 = (r13 & 7) << 3;
        r20 = r1;
        r17 = r2;
        r1 = (r1[r14] & (~(255 << r16))) | ((r12 & 127) << r16);
        r20[r14] = r1;
        r20[(((r13 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r13] = r11;
        r8[r13] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0230, code lost:
    
        r10 = r10 + 1;
        r2 = r17;
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022c, code lost:
    
        r20 = r1;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01bc, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x023c, code lost:
    
        r33 = r2;
        r26 = 255;
        r18 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnu.d(int, int):void");
    }

    public /* synthetic */ cnu(byte[] bArr) {
        g(cpg.d(6));
    }
}
