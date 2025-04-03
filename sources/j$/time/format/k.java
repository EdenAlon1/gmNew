package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalField;

/* loaded from: classes9.dex */
class k implements InterfaceC0036f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final TemporalField a;
    final int b;
    final int c;
    private final E d;
    final int e;

    k(TemporalField temporalField, int i, int i2, E e) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = e;
        this.e = 0;
    }

    long b(y yVar, long j) {
        return j;
    }

    boolean c(w wVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == E.NOT_NEGATIVE;
        }
        return true;
    }

    int d(w wVar, long j, int i, int i2) {
        return wVar.o(this.a, j, i, i2);
    }

    k e() {
        if (this.e == -1) {
            return this;
        }
        return new k(this.a, this.b, this.c, this.d, -1);
    }

    k f(int i) {
        int i2 = this.e + i;
        return new k(this.a, this.b, this.c, this.d, i2);
    }

    @Override // j$.time.format.InterfaceC0036f
    public boolean o(y yVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long e = yVar.e(temporalField);
        if (e == null) {
            return false;
        }
        long b = b(yVar, e.longValue());
        DecimalStyle b2 = yVar.b();
        String l = b == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(b));
        int length = l.length();
        int i = this.c;
        if (length > i) {
            throw new DateTimeException("Field " + String.valueOf(temporalField) + " cannot be printed as the value " + b + " exceeds the maximum print width of " + i);
        }
        String a = b2.a(l);
        int i2 = this.b;
        E e2 = this.d;
        if (b >= 0) {
            int i3 = AbstractC0033c.a[e2.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && b >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC0033c.a[e2.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append(b2.d());
            } else if (i4 == 4) {
                throw new DateTimeException("Field " + String.valueOf(temporalField) + " cannot be printed as the value " + b + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - a.length(); i5++) {
            sb.append(b2.e());
        }
        sb.append(a);
        return true;
    }

    public String toString() {
        TemporalField temporalField = this.a;
        E e = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && e == E.NORMAL) {
            return "Value(" + String.valueOf(temporalField) + ")";
        }
        if (i2 == i && e == E.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(temporalField) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(temporalField) + "," + i2 + "," + i + "," + String.valueOf(e) + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
    
        r5 = r13;
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0116, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0121, code lost:
    
        if (r1 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0123, code lost:
    
        if (r2 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
    
        if (r2.equals(java.math.BigInteger.ZERO) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0131, code lost:
    
        if (r26.l() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0136, code lost:
    
        return ~(r4 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0137, code lost:
    
        r2 = r2.negate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0164, code lost:
    
        if (r2 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016c, code lost:
    
        if (r2.bitLength() <= 63) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        r2 = r2.divide(java.math.BigInteger.TEN);
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0180, code lost:
    
        return d(r26, r2.longValue(), r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0188, code lost:
    
        return d(r26, r6, r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013e, code lost:
    
        if (r6 != r21) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0144, code lost:
    
        if (r26.l() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
    
        return ~(r4 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014a, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014e, code lost:
    
        if (r8 != j$.time.format.E.EXCEEDS_PAD) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0154, code lost:
    
        if (r26.l() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0156, code lost:
    
        r1 = r5 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0158, code lost:
    
        if (r3 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x015a, code lost:
    
        if (r1 > r9) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015f, code lost:
    
        return ~(r4 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0160, code lost:
    
        if (r1 <= r9) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0163, code lost:
    
        return ~r4;
     */
    @Override // j$.time.format.InterfaceC0036f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int u(j$.time.format.w r26, java.lang.CharSequence r27, int r28) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.k.u(j$.time.format.w, java.lang.CharSequence, int):int");
    }

    protected k(TemporalField temporalField, int i, int i2, E e, int i3) {
        this.a = temporalField;
        this.b = i;
        this.c = i2;
        this.d = e;
        this.e = i3;
    }
}
