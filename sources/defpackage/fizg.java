package defpackage;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fizg implements Cloneable, Comparable, Serializable {
    private static final DecimalFormat a;
    public static final /* synthetic */ int j = 0;
    private static final long serialVersionUID = 2694906050116005466L;
    public fiyt f;
    protected int g;
    protected int h;
    protected long i;

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        a = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
    }

    protected fizg() {
    }

    protected static String h(byte[] bArr, boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        if (z) {
            stringBuffer.append('\"');
        }
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 32 || i >= 127) {
                stringBuffer.append('\\');
                stringBuffer.append(a.format(i));
            } else if (i == 34 || i == 92) {
                stringBuffer.append('\\');
                stringBuffer.append((char) i);
            } else {
                stringBuffer.append((char) i);
            }
        }
        if (z) {
            stringBuffer.append('\"');
        }
        return stringBuffer.toString();
    }

    protected static String i(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer("\\# ");
        stringBuffer.append(bArr.length);
        stringBuffer.append(" ");
        stringBuffer.append(fjat.a(bArr));
        return stringBuffer.toString();
    }

    public static final fizg k(fiyt fiytVar, int i, int i2, long j2, boolean z) {
        fizg fixhVar;
        if (z) {
            fjae fjaeVar = fjaf.a;
            fjaf.b(i);
            fizg fizgVar = (fizg) fjaeVar.f.get(fjae.b(i));
            fixhVar = fizgVar != null ? fizgVar.b() : new fjak();
        } else {
            fixhVar = new fixh();
        }
        fixhVar.f = fiytVar;
        fixhVar.g = i;
        fixhVar.h = i2;
        fixhVar.i = j2;
        return fixhVar;
    }

    public static fizg l(fiyt fiytVar, int i, int i2) {
        return m(fiytVar, i, i2, 0L);
    }

    public static fizg m(fiyt fiytVar, int i, int i2, long j2) {
        if (!fiytVar.j()) {
            throw new fizh(fiytVar);
        }
        fjaf.b(i);
        fiwx.b(i2);
        fjaa.a(j2);
        return k(fiytVar, i, i2, j2, false);
    }

    static void p(fiyt fiytVar) {
        if (!fiytVar.j()) {
            throw new fizh(fiytVar);
        }
    }

    public abstract String a();

    public abstract fizg b();

    public abstract void c(fixb fixbVar);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int length;
        fizg fizgVar = (fizg) obj;
        int i = 0;
        if (this == fizgVar) {
            return 0;
        }
        int compareTo = this.f.compareTo(fizgVar.f);
        if (compareTo != 0) {
            return compareTo;
        }
        int i2 = this.h - fizgVar.h;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.g - fizgVar.g;
        if (i3 != 0) {
            return i3;
        }
        byte[] o = o();
        byte[] o2 = fizgVar.o();
        while (true) {
            length = o.length;
            if (i >= length || i >= o2.length) {
                break;
            }
            int i4 = (o[i] & 255) - (o2[i] & 255);
            if (i4 != 0) {
                return i4;
            }
            i++;
        }
        return length - o2.length;
    }

    public abstract void d(fixd fixdVar, fiwv fiwvVar, boolean z);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fizg)) {
            return false;
        }
        fizg fizgVar = (fizg) obj;
        if (this.g == fizgVar.g && this.h == fizgVar.h && this.f.equals(fizgVar.f)) {
            return Arrays.equals(o(), fizgVar.o());
        }
        return false;
    }

    public final int g() {
        int i = this.g;
        return i == 46 ? ((fizc) this).a : i;
    }

    public final int hashCode() {
        fixd fixdVar = new fixd();
        this.f.i(fixdVar);
        fixdVar.d(this.g);
        fixdVar.d(this.h);
        fixdVar.f(0L);
        int i = fixdVar.a;
        fixdVar.d(0);
        d(fixdVar, null, true);
        fixdVar.e((fixdVar.a - i) - 2, i);
        int i2 = 0;
        for (byte b : fixdVar.h()) {
            i2 += (i2 << 3) + (b & 255);
        }
        return i2;
    }

    public fiyt ie() {
        return null;
    }

    final fizg j() {
        try {
            return (fizg) clone();
        } catch (CloneNotSupportedException unused) {
            throw new IllegalStateException();
        }
    }

    final void n(fixd fixdVar, int i, fiwv fiwvVar) {
        this.f.g(fixdVar, fiwvVar);
        fixdVar.d(this.g);
        fixdVar.d(this.h);
        if (i == 0) {
            return;
        }
        fixdVar.f(this.i);
        int i2 = fixdVar.a;
        fixdVar.d(0);
        d(fixdVar, fiwvVar, false);
        fixdVar.e((fixdVar.a - i2) - 2, i2);
    }

    public final byte[] o() {
        fixd fixdVar = new fixd();
        d(fixdVar, null, true);
        return fixdVar.h();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f);
        if (stringBuffer.length() < 8) {
            stringBuffer.append("\t");
        }
        if (stringBuffer.length() < 16) {
            stringBuffer.append("\t");
        }
        stringBuffer.append("\t");
        if (fiyy.a("BINDTTL")) {
            long j2 = this.i;
            fjaa.a(j2);
            StringBuffer stringBuffer2 = new StringBuffer();
            long j3 = j2 % 60;
            long j4 = j2 / 60;
            long j5 = j4 / 60;
            long j6 = j5 / 24;
            long j7 = j6 / 7;
            if (j7 > 0) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append(j7);
                stringBuffer3.append("W");
                stringBuffer2.append(stringBuffer3.toString());
            }
            long j8 = j6 % 7;
            if (j8 > 0) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(j8);
                stringBuffer4.append("D");
                stringBuffer2.append(stringBuffer4.toString());
            }
            long j9 = j5 % 24;
            if (j9 > 0) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append(j9);
                stringBuffer5.append("H");
                stringBuffer2.append(stringBuffer5.toString());
            }
            long j10 = j4 % 60;
            if (j10 > 0) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append(j10);
                stringBuffer6.append("M");
                stringBuffer2.append(stringBuffer6.toString());
            }
            if (j3 > 0 || (j7 == 0 && j8 == 0 && j9 == 0 && j10 == 0)) {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append(j3);
                stringBuffer7.append("S");
                stringBuffer2.append(stringBuffer7.toString());
            }
            stringBuffer.append(stringBuffer2.toString());
        } else {
            stringBuffer.append(this.i);
        }
        stringBuffer.append("\t");
        if (this.h != 1 || !fiyy.a("noPrintIN")) {
            stringBuffer.append(fiwx.a(this.h));
            stringBuffer.append("\t");
        }
        stringBuffer.append(fjaf.a(this.g));
        String a2 = a();
        if (!a2.equals("")) {
            stringBuffer.append("\t");
            stringBuffer.append(a2);
        }
        return stringBuffer.toString();
    }

    public fizg(fiyt fiytVar, int i) {
        if (!fiytVar.j()) {
            throw new fizh(fiytVar);
        }
        fjaf.b(6);
        fiwx.b(i);
        fjaa.a(0L);
        this.f = fiytVar;
        this.g = 6;
        this.h = i;
        this.i = 0L;
    }
}
