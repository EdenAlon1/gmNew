package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qll extends qlk {
    private static final fhmx f;
    private static final fhmx g;
    private static final fhmx h;
    private static final fhmx i;
    private static final fhmx j;
    private final fhmv k;
    private final fhmt l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    static {
        fhmx fhmxVar = fhmx.a;
        f = fhmw.b("'\\");
        g = fhmw.b("\"\\");
        h = fhmw.b("{}[]:, \n\t\r\f/\\;#=");
        i = fhmw.b("\n\r");
        j = fhmw.b("*/");
    }

    public qll(fhmv fhmvVar) {
        this.k = fhmvVar;
        this.l = ((fhnp) fhmvVar).b;
        l(6);
    }

    private final void A() {
        long j2 = this.k.j(h);
        fhmt fhmtVar = this.l;
        if (j2 == -1) {
            j2 = fhmtVar.b;
        }
        fhmtVar.C(j2);
    }

    private final boolean B(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        x();
        return false;
    }

    private final char r() {
        int i2;
        if (!this.k.E(1L)) {
            throw d("Unterminated escape sequence");
        }
        byte d = this.l.d();
        if (d == 10 || d == 34 || d == 39 || d == 47 || d == 92) {
            return (char) d;
        }
        if (d == 98) {
            return '\b';
        }
        if (d == 102) {
            return '\f';
        }
        if (d == 110) {
            return '\n';
        }
        if (d == 114) {
            return '\r';
        }
        if (d == 116) {
            return '\t';
        }
        if (d != 117) {
            throw d("Invalid escape sequence: \\" + ((char) d));
        }
        if (!this.k.E(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(e()));
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte c2 = this.l.c(i3);
            char c3 = (char) (c << 4);
            if (c2 >= 48 && c2 <= 57) {
                i2 = c2 - 48;
            } else if (c2 >= 97 && c2 <= 102) {
                i2 = c2 - 87;
            } else {
                if (c2 < 65 || c2 > 70) {
                    throw d("\\u".concat(this.l.n(4L)));
                }
                i2 = c2 - 55;
            }
            c = (char) (c3 + i2);
        }
        this.l.C(4L);
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d9, code lost:
    
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01da, code lost:
    
        r22.n = r5;
        r22.l.C(r1);
        r22.m = 16;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01cd, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e8, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e9, code lost:
    
        if (r2 == 2) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ec, code lost:
    
        if (r2 == 4) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ee, code lost:
    
        if (r2 != 7) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f0, code lost:
    
        r22.o = r4;
        r3 = 17;
        r22.m = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01bb, code lost:
    
        if (B(r10) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01bf, code lost:
    
        if (r2 != 2) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c1, code lost:
    
        if (r9 == 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c7, code lost:
    
        if (r5 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c9, code lost:
    
        if (r7 == 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cb, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d0, code lost:
    
        if (r5 != r16) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d2, code lost:
    
        if (r3 != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d4, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d5, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d6, code lost:
    
        if (r3 == 0) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int s() {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qll.s():int");
    }

    private final int t(String str, qli qliVar) {
        int length = qliVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(qliVar.a[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x004b, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x004d, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ac, code lost:
    
        r1 = r28.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b0, code lost:
    
        if (r4 == r19) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b2, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b6, code lost:
    
        if (r2 == 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b8, code lost:
    
        r4 = r4 + defpackage.qll.j.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01c3, code lost:
    
        r1.C(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:
    
        if (r2 == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01cf, code lost:
    
        throw d("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c1, code lost:
    
        r4 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b4, code lost:
    
        r2 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ac A[EDGE_INSN: B:57:0x01ac->B:42:0x01ac BREAK  A[LOOP:2: B:27:0x0076->B:39:0x01d0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int u(boolean r29) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qll.u(boolean):int");
    }

    private final String v(fhmx fhmxVar) {
        StringBuilder sb = null;
        while (true) {
            long j2 = this.k.j(fhmxVar);
            if (j2 == -1) {
                throw d("Unterminated string");
            }
            if (this.l.c(j2) != 92) {
                if (sb == null) {
                    String n = this.l.n(j2);
                    this.l.d();
                    return n;
                }
                sb.append(this.l.n(j2));
                this.l.d();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.l.n(j2));
            this.l.d();
            sb.append(r());
        }
    }

    private final String w() {
        long j2 = this.k.j(h);
        return j2 != -1 ? this.l.n(j2) : this.l.m();
    }

    private final void x() {
        throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void y(fhmx fhmxVar) {
        while (true) {
            long j2 = this.k.j(fhmxVar);
            if (j2 == -1) {
                throw d("Unterminated string");
            }
            long j3 = 1 + j2;
            if (this.l.c(j2) != 92) {
                this.l.C(j3);
                return;
            } else {
                this.l.C(j3);
                r();
            }
        }
    }

    private final void z() {
        long j2 = this.k.j(i);
        fhmt fhmtVar = this.l;
        fhmtVar.C(j2 != -1 ? j2 + 1 : fhmtVar.b);
    }

    @Override // defpackage.qlk
    public final double a() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 17) {
            this.p = this.l.n(this.o);
        } else if (i2 == 9) {
            this.p = v(g);
        } else if (i2 == 8) {
            this.p = v(f);
        } else if (i2 == 10) {
            this.p = w();
        } else if (i2 != 11) {
            throw new qlg(qli.b(this, "Expected a double but was "));
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new qlh("JSON forbids NaN and infinities: " + parseDouble + " at path " + e());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new qlg("Expected a double but was " + this.p + " at path " + e());
        }
    }

    @Override // defpackage.qlk
    public final int b() {
        String v;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.m = 0;
                int[] iArr = this.e;
                int i4 = this.b - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            throw new qlg("Expected an int but was " + j2 + " at path " + e());
        }
        if (i2 == 17) {
            this.p = this.l.n(this.o);
        } else {
            if (i2 == 9) {
                v = v(g);
            } else if (i2 == 8) {
                v = v(f);
            } else if (i2 != 11) {
                throw new qlg(qli.b(this, "Expected an int but was "));
            }
            this.p = v;
            try {
                int parseInt = Integer.parseInt(v);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            int i6 = (int) parseDouble;
            if (i6 == parseDouble) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new qlg("Expected an int but was " + this.p + " at path " + e());
        } catch (NumberFormatException unused2) {
            throw new qlg("Expected an int but was " + this.p + " at path " + e());
        }
    }

    @Override // defpackage.qlk
    public final int c(qli qliVar) {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 < 12 || i2 > 15) {
            return -1;
        }
        if (i2 == 15) {
            return t(this.p, qliVar);
        }
        int g2 = this.k.g(qliVar.b);
        if (g2 != -1) {
            this.m = 0;
            this.d[this.b - 1] = qliVar.a[g2];
            return g2;
        }
        String str = this.d[this.b - 1];
        String f2 = f();
        int t = t(f2, qliVar);
        if (t != -1) {
            return t;
        }
        this.m = 15;
        this.p = f2;
        this.d[this.b - 1] = str;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.A();
        this.k.close();
    }

    @Override // defpackage.qlk
    public final String f() {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            str = w();
        } else if (i2 == 13) {
            str = v(g);
        } else if (i2 == 12) {
            str = v(f);
        } else {
            if (i2 != 15) {
                throw new qlg(qli.b(this, "Expected a name but was "));
            }
            str = this.p;
        }
        this.m = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    @Override // defpackage.qlk
    public final String g() {
        String n;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 10) {
            n = w();
        } else if (i2 == 9) {
            n = v(g);
        } else if (i2 == 8) {
            n = v(f);
        } else if (i2 == 11) {
            n = this.p;
            this.p = null;
        } else if (i2 == 16) {
            n = Long.toString(this.n);
        } else {
            if (i2 != 17) {
                throw new qlg(qli.b(this, "Expected a string but was "));
            }
            n = this.l.n(this.o);
        }
        this.m = 0;
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        return n;
    }

    @Override // defpackage.qlk
    public final void h() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 != 3) {
            throw new qlg(qli.b(this, "Expected BEGIN_ARRAY but was "));
        }
        l(1);
        this.e[this.b - 1] = 0;
        this.m = 0;
    }

    @Override // defpackage.qlk
    public final void i() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 != 1) {
            throw new qlg(qli.b(this, "Expected BEGIN_OBJECT but was "));
        }
        l(3);
        this.m = 0;
    }

    @Override // defpackage.qlk
    public final void j() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 != 4) {
            throw new qlg(qli.b(this, "Expected END_ARRAY but was "));
        }
        int i3 = this.b;
        this.b = i3 - 1;
        int[] iArr = this.e;
        int i4 = i3 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.m = 0;
    }

    @Override // defpackage.qlk
    public final void k() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 != 2) {
            throw new qlg(qli.b(this, "Expected END_OBJECT but was "));
        }
        int i3 = this.b;
        int i4 = i3 - 1;
        this.b = i4;
        this.d[i4] = null;
        int[] iArr = this.e;
        int i5 = i3 - 2;
        iArr[i5] = iArr[i5] + 1;
        this.m = 0;
    }

    @Override // defpackage.qlk
    public final void m() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            A();
        } else if (i2 == 13) {
            y(g);
        } else if (i2 == 12) {
            y(f);
        } else if (i2 != 15) {
            throw new qlg(qli.b(this, "Expected a name but was "));
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.qlk
    public final void n() {
        int i2 = 0;
        do {
            int i3 = this.m;
            if (i3 == 0) {
                i3 = s();
            }
            if (i3 == 3) {
                l(1);
            } else if (i3 == 1) {
                l(3);
            } else {
                if (i3 == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new qlg(qli.b(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (i3 == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new qlg(qli.b(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (i3 == 14 || i3 == 10) {
                    A();
                } else if (i3 == 9 || i3 == 13) {
                    y(g);
                } else if (i3 == 8 || i3 == 12) {
                    y(f);
                } else if (i3 == 17) {
                    this.l.C(this.o);
                } else if (i3 == 18) {
                    throw new qlg(qli.b(this, "Expected a value but was "));
                }
                this.m = 0;
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i4 = this.b - 1;
        iArr[i4] = iArr[i4] + 1;
        this.d[i4] = "null";
    }

    @Override // defpackage.qlk
    public final boolean o() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // defpackage.qlk
    public final boolean p() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        }
        if (i2 != 6) {
            throw new qlg(qli.b(this, "Expected a boolean but was "));
        }
        this.m = 0;
        int[] iArr2 = this.e;
        int i4 = this.b - 1;
        iArr2[i4] = iArr2[i4] + 1;
        return false;
    }

    @Override // defpackage.qlk
    public final int q() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        switch (i2) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.k.toString() + ")";
    }
}
