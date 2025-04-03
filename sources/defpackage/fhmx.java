package defpackage;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhmx implements Serializable, Comparable {
    public static final fhmx a = new fhmx(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public fhmx(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static final fhmx f(byte... bArr) {
        bArr.getClass();
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        copyOf.getClass();
        return new fhmx(copyOf);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        objectInputStream.getClass();
        if (readInt < 0) {
            throw new IllegalArgumentException(a.h(readInt, "byteCount < 0: "));
        }
        byte[] bArr = new byte[readInt];
        int i = 0;
        while (i < readInt) {
            int read = objectInputStream.read(bArr, i, readInt - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
        fhmx fhmxVar = new fhmx(bArr);
        Field declaredField = fhmx.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, fhmxVar.b);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int b() {
        return this.b.length;
    }

    public final String c() {
        int length;
        int i;
        byte[] bArr = fhml.a;
        byte[] bArr2 = this.b;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArr2.length;
            i = length - (length % 3);
            if (i2 >= i) {
                break;
            }
            int i4 = i3 + 3;
            byte b = bArr2[i2];
            int i5 = i2 + 2;
            byte b2 = bArr2[i2 + 1];
            i2 += 3;
            byte b3 = bArr2[i5];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int i6 = length - i;
        if (i6 == 1) {
            byte b4 = bArr2[i2];
            bArr3[i3] = bArr[(b4 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (i6 == 2) {
            int i7 = i2 + 1;
            byte b5 = bArr2[i2];
            byte b6 = bArr2[i7];
            bArr3[i3] = bArr[(b5 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i3 + 3] = 61;
        }
        return fhny.a(bArr3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fhmx fhmxVar = (fhmx) obj;
        fhmxVar.getClass();
        int b = b();
        int b2 = fhmxVar.b();
        int min = Math.min(b, b2);
        for (int i = 0; i < min; i++) {
            int a2 = a(i) & 255;
            int a3 = fhmxVar.a(i) & 255;
            if (a2 != a3) {
                return a2 >= a3 ? 1 : -1;
            }
        }
        if (b == b2) {
            return 0;
        }
        return b >= b2 ? 1 : -1;
    }

    public String d() {
        byte[] bArr = this.b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            cArr[i] = fhoa.a[(b >> 4) & 15];
            cArr[i + 1] = fhoa.a[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public final String e() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String a2 = fhny.a(j());
        this.d = a2;
        return a2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fhmx) {
            fhmx fhmxVar = (fhmx) obj;
            int b = fhmxVar.b();
            byte[] bArr = this.b;
            int length = bArr.length;
            return b == length && fhmxVar.h(0, bArr, 0, length);
        }
        return false;
    }

    public fhmx g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, length);
                copyOf.getClass();
                copyOf[i] = (byte) (b + 32);
                while (i2 < copyOf.length) {
                    int i3 = i2 + 1;
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                    i2 = i3;
                }
                return new fhmx(copyOf);
            }
            i = i2;
        }
    }

    public boolean h(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.b;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && fhmm.c(bArr2, i, bArr, i2, i3);
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.b);
        this.c = hashCode;
        return hashCode;
    }

    public final boolean i(fhmx fhmxVar) {
        fhmxVar.getClass();
        return l(fhmxVar, fhmxVar.b());
    }

    public byte[] j() {
        return this.b;
    }

    public byte[] k() {
        byte[] bArr = this.b;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        copyOf.getClass();
        return copyOf;
    }

    public boolean l(fhmx fhmxVar, int i) {
        return fhmxVar.h(0, this.b, 0, i);
    }

    public void m(fhmt fhmtVar, int i) {
        char[] cArr = fhoa.a;
        fhmtVar.M(this.b, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d1, code lost:
    
        if (r3 < 65536) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00ba, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00d4, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d7, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x009b, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0119, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x011f, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x010e, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x012d, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0131, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0135, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00e2, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0139, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0085, code lost:
    
        if (r9 < 65536) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0087, code lost:
    
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x008a, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0074, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008d, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0062, code lost:
    
        if (r5 != 64) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c4, code lost:
    
        if (r5 != 64) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhmx.toString():java.lang.String");
    }
}
