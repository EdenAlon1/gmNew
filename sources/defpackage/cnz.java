package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnz extends cnf {
    private int f;

    public cnz() {
        this((byte[]) null);
    }

    private final int d(int i) {
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

    private final void e() {
        this.f = cpg.a(this.d) - this.e;
    }

    private final void f(int i) {
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
        e();
        this.b = new long[max];
        this.c = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        r1 = d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r38.f != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
    
        if (((r38.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        r1 = r38.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009b, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b5, code lost:
    
        if (java.lang.Long.compare((r38.e * 32) ^ Long.MIN_VALUE, (r1 * 25) ^ Long.MIN_VALUE) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        r1 = r38.a;
        r2 = r38.d;
        r4 = r38.b;
        r5 = r38.c;
        r13 = r2 + 7;
        r28 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
    
        if (r8 >= (r13 >> 3)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ca, code lost:
    
        r9 = r1[r8] & (-9187201950435737472L);
        r1[r8] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        r30 = r11;
        r8 = defpackage.ffdo.A(r1);
        r9 = r8 - 1;
        r12 = 72057594037927935L;
        r1[r9] = (r1[r9] & 72057594037927935L) | (-72057594037927936L);
        r1[r8] = r1[r30];
        r8 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        if (r8 == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
    
        r9 = r8 >> 3;
        r15 = (r8 & 7) << 3;
        r10 = (r1[r9] >> r15) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010e, code lost:
    
        if (r10 != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
    
        if (r10 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        r10 = defpackage.cny.a(r4[r8]) * r20;
        r10 = r10 ^ (r10 << 16);
        r11 = r10 & 127;
        r10 = r10 >>> 7;
        r16 = d(r10);
        r10 = r10 & r2;
        r32 = r12;
        r13 = r14;
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013d, code lost:
    
        if ((((r16 - r10) & r2) / 8) != (((r8 - r10) & r2) / 8)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015d, code lost:
    
        r10 = r16 >> 3;
        r11 = r1[r10];
        r34 = (r16 & 7) << 3;
        r14 = r14 << r34;
        r13 = (~(255 << r34)) & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0175, code lost:
    
        if (((r11 >> r34) & 255) != 128) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0177, code lost:
    
        r11 = ~(255 << r15);
        r1[r10] = r13 | r14;
        r1[r9] = (r11 & r1[r9]) | (128 << r15);
        r4[r16] = r4[r8];
        r4[r8] = 0;
        r5[r16] = r5[r8];
        r5[r8] = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a9, code lost:
    
        r1[defpackage.ffdo.A(r1)] = (r1[r30] & r32) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r12 = r32;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0193, code lost:
    
        r1[r10] = r13 | r14;
        r9 = r4[r16];
        r4[r16] = r4[r8];
        r4[r8] = r9;
        r9 = r5[r16];
        r5[r16] = r5[r8];
        r5[r8] = r9;
        r8 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x013f, code lost:
    
        r1[r9] = (r1[r9] & (~(255 << r15))) | (r14 << r15);
        r1[defpackage.ffdo.A(r1)] = (r1[r30] & r32) | Long.MIN_VALUE;
        r8 = r8 + 1;
        r14 = r13;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01bd, code lost:
    
        r35 = r14;
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0247, code lost:
    
        r1 = d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0256, code lost:
    
        r38.e++;
        r2 = r38.f;
        r3 = r38.a;
        r4 = r1 >> 3;
        r8 = r3[r4];
        r5 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x026e, code lost:
    
        if (((r8 >> r5) & r28) != r21) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0270, code lost:
    
        r30 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0272, code lost:
    
        r38.f = r2 - r30;
        r2 = r38.d;
        r5 = (r6 << r5) | (r8 & (~(r28 << r5)));
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r10 = ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c6, code lost:
    
        r28 = 255;
        r30 = 0;
        r35 = 1;
        r1 = defpackage.cpg.b(r38.d);
        r2 = r38.a;
        r4 = r38.b;
        r5 = r38.c;
        r8 = r38.d;
        f(r1);
        r1 = r38.a;
        r9 = r38.b;
        r10 = r38.c;
        r11 = r38.d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e9, code lost:
    
        if (r12 >= r8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f8, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= r21) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01fa, code lost:
    
        r13 = r4[r12];
        r15 = defpackage.cny.a(r13) * r20;
        r16 = r1;
        r1 = d((r15 ^ (r15 << 16)) >>> 7);
        r18 = r1 >> 3;
        r19 = (r1 & 7) << 3;
        r25 = r2;
        r1 = (r16[r18] & (~(255 << r19))) | ((r15 & 127) << r19);
        r16[r18] = r1;
        r16[(((r1 - 7) & r11) + (r11 & 7)) >> 3] = r1;
        r9[r1] = r13;
        r10[r1] = r5[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0240, code lost:
    
        r12 = r12 + 1;
        r1 = r16;
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023c, code lost:
    
        r16 = r1;
        r25 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c4, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x024c, code lost:
    
        r28 = 255;
        r30 = 0;
        r35 = 1;
        r21 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r39, int r41) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnz.c(long, int):void");
    }

    public cnz(int i) {
        f(cpg.d(i));
    }

    public /* synthetic */ cnz(byte[] bArr) {
        this(6);
    }
}
