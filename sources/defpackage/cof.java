package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cof extends cou {
    private int f;

    public cof() {
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
        this.b = new Object[max];
        this.c = new float[max];
    }

    public final void a() {
        this.e = 0;
        if (this.a != cpg.a) {
            ffdo.s(r1, -9187201950435737472L, this.a.length);
            long[] jArr = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        ffdo.d(this.b, null, 0, this.d);
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        r4 = e(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (r36.f != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (((r36.a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r4 = r36.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (r4 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        r18 = 128;
        r14 = 8;
        r24 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (java.lang.Long.compare((r36.e * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        r4 = r36.a;
        r6 = r36.d;
        r7 = r36.b;
        r8 = r36.c;
        r9 = r6 + 7;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        if (r10 >= (r9 >> 3)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        r11 = r12;
        r12 = r4[r10] & (-9187201950435737472L);
        r4[r10] = (-72340172838076674L) & ((~r12) + (r12 >>> 7));
        r10 = r10 + 1;
        r12 = r11;
        r15 = r15;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        r11 = r12;
        r28 = r15;
        r9 = defpackage.ffdo.A(r4);
        r10 = r9 - 1;
        r14 = 72057594037927935L;
        r4[r10] = (r4[r10] & 72057594037927935L) | (-72057594037927936L);
        r4[r9] = r4[r11];
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0116, code lost:
    
        if (r9 == r6) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0118, code lost:
    
        r10 = r9 >> 3;
        r16 = (r9 & 7) << 3;
        r12 = (r4[r10] >> r16) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0126, code lost:
    
        if (r12 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012d, code lost:
    
        if (r12 == 254) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0130, code lost:
    
        r12 = r7[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0132, code lost:
    
        if (r12 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0134, code lost:
    
        r12 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
    
        r12 = r12 * r21;
        r12 = r12 ^ (r12 << 16);
        r13 = r12 & 127;
        r12 = r12 >>> 7;
        r17 = e(r12);
        r12 = r12 & r6;
        r31 = r11;
        r32 = r14;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0158, code lost:
    
        if ((((r17 - r12) & r6) / 8) != (((r9 - r12) & r6) / 8)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0179, code lost:
    
        r11 = r17 >> 3;
        r12 = r4[r11];
        r30 = (r17 & 7) << 3;
        r14 = r14 << r30;
        r34 = r2;
        r1 = (~(255 << r30)) & r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018f, code lost:
    
        if (((r12 >> r30) & 255) != 128) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
    
        r12 = ~(255 << r16);
        r4[r11] = r1 | r14;
        r4[r10] = (r4[r10] & r12) | (128 << r16);
        r7[r17] = r7[r9];
        r7[r9] = null;
        r8[r17] = r8[r9];
        r8[r9] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c3, code lost:
    
        r4[defpackage.ffdo.A(r4)] = (r4[r31] & r32) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r11 = r31;
        r14 = r32;
        r2 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ae, code lost:
    
        r4[r11] = r1 | r14;
        r1 = r7[r17];
        r7[r17] = r7[r9];
        r7[r9] = r1;
        r1 = r8[r17];
        r8[r17] = r8[r9];
        r8[r9] = r1;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
    
        r4[r10] = (r4[r10] & (~(255 << r16))) | (r14 << r16);
        r4[defpackage.ffdo.A(r4)] = (r4[r31] & r32) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r11 = r31;
        r14 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01db, code lost:
    
        r34 = r2;
        r31 = r11;
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0269, code lost:
    
        r4 = e(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x027a, code lost:
    
        r36.e++;
        r1 = r36.f;
        r2 = r36.a;
        r3 = r4 >> 3;
        r5 = r2[r3];
        r7 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0292, code lost:
    
        if (((r5 >> r7) & r24) != r18) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0294, code lost:
    
        r31 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0296, code lost:
    
        r36.f = r1 - r31;
        r1 = r36.d;
        r5 = (r5 & (~(r24 << r7))) | (r34 << r7);
        r2[r3] = r5;
        r2[(((r4 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r11 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e8, code lost:
    
        r34 = r2;
        r31 = 0;
        r28 = 1;
        r1 = defpackage.cpg.b(r36.d);
        r2 = r36.a;
        r3 = r36.b;
        r4 = r36.c;
        r6 = r36.d;
        g(r1);
        r1 = r36.a;
        r7 = r36.b;
        r8 = r36.c;
        r9 = r36.d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x020b, code lost:
    
        if (r10 >= r6) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x021a, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & r24) >= r18) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x021c, code lost:
    
        r11 = r3[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x021e, code lost:
    
        if (r11 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0220, code lost:
    
        r12 = r11.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0227, code lost:
    
        r12 = r12 * r21;
        r13 = e((r12 ^ (r12 << 16)) >>> 7);
        r14 = r13 >> 3;
        r15 = (r13 & 7) << 3;
        r23 = r1;
        r22 = r2;
        r1 = (r1[r14] & (~(r24 << r15))) | ((r12 & 127) << r15);
        r23[r14] = r1;
        r23[(((r13 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r13] = r11;
        r8[r13] = r4[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0262, code lost:
    
        r10 = r10 + 1;
        r2 = r22;
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0225, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025e, code lost:
    
        r23 = r1;
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e4, code lost:
    
        r24 = 255;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x026e, code lost:
    
        r34 = r2;
        r24 = 255;
        r31 = 0;
        r28 = 1;
        r18 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r37, float r38) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cof.b(java.lang.Object, float):void");
    }

    public /* synthetic */ cof(byte[] bArr) {
        g(cpg.d(6));
    }
}
