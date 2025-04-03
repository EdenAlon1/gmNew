package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiuv extends firk {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final fiut i;

    private fiuv(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, fiut fiutVar) {
        super(str);
        this.e = jArr;
        this.f = iArr;
        this.g = iArr2;
        this.h = strArr;
        this.i = fiutVar;
    }

    static fiuv n(DataInput dataInput, String str) {
        int readUnsignedByte;
        int readUnsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        int[] iArr = new int[readInt];
        int[] iArr2 = new int[readInt];
        String[] strArr2 = new String[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = fiux.a(dataInput);
            iArr[i2] = (int) fiux.a(dataInput);
            iArr2[i2] = (int) fiux.a(dataInput);
            if (readUnsignedShort < 256) {
                try {
                    readUnsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            } else {
                readUnsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i2] = strArr[readUnsignedByte];
        }
        return new fiuv(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new fiut(str, (int) fiux.a(dataInput), fiuw.c(dataInput), fiuw.c(dataInput)) : null);
    }

    @Override // defpackage.firk
    public final int a(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f[binarySearch];
        }
        int i = ~binarySearch;
        if (i >= jArr.length) {
            fiut fiutVar = this.i;
            return fiutVar == null ? this.f[i - 1] : fiutVar.a(j);
        }
        if (i > 0) {
            return this.f[i - 1];
        }
        return 0;
    }

    @Override // defpackage.firk
    public final int c(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.g[binarySearch];
        }
        int i = ~binarySearch;
        if (i >= jArr.length) {
            fiut fiutVar = this.i;
            return fiutVar == null ? this.g[i - 1] : fiutVar.e;
        }
        if (i > 0) {
            return this.g[i - 1];
        }
        return 0;
    }

    @Override // defpackage.firk
    public final long e(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        int i = binarySearch >= 0 ? binarySearch + 1 : ~binarySearch;
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        fiut fiutVar = this.i;
        if (fiutVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return fiutVar.e(j);
    }

    @Override // defpackage.firk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fiuv) {
            fiuv fiuvVar = (fiuv) obj;
            if (this.c.equals(fiuvVar.c) && Arrays.equals(this.e, fiuvVar.e) && Arrays.equals(this.h, fiuvVar.h) && Arrays.equals(this.f, fiuvVar.f) && Arrays.equals(this.g, fiuvVar.g)) {
                fiut fiutVar = this.i;
                fiut fiutVar2 = fiuvVar.i;
                if (fiutVar != null ? fiutVar.equals(fiutVar2) : fiutVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.firk
    public final long f(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            if (j > Long.MIN_VALUE) {
                return j - 1;
            }
            return Long.MIN_VALUE;
        }
        int i = ~binarySearch;
        if (i >= jArr.length) {
            fiut fiutVar = this.i;
            if (fiutVar != null) {
                long f = fiutVar.f(j);
                if (f < j) {
                    return f;
                }
            }
            long j2 = jArr[i - 1];
            if (j2 > Long.MIN_VALUE) {
                return j2 - 1;
            }
        } else if (i > 0) {
            long j3 = jArr[i - 1];
            if (j3 > Long.MIN_VALUE) {
                return j3 - 1;
            }
        }
        return j;
    }

    @Override // defpackage.firk
    public final String g(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.h[binarySearch];
        }
        int i = ~binarySearch;
        if (i < jArr.length) {
            return i > 0 ? this.h[i - 1] : "UTC";
        }
        fiut fiutVar = this.i;
        return fiutVar == null ? this.h[i - 1] : fiutVar.g(j);
    }

    @Override // defpackage.firk
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.firk
    public final boolean k() {
        return false;
    }
}
