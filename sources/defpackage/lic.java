package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lic {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public lic(int i, int i2, long j, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public static lic d(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new lic(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(lig.m);
        return new lic(1, bytes.length, bytes);
    }

    public static lic e(String str) {
        byte[] bytes = (str + (char) 0).getBytes(lig.m);
        return new lic(2, bytes.length, bytes);
    }

    public static lic f(long j, ByteOrder byteOrder) {
        return g(new long[]{j}, byteOrder);
    }

    public static lic g(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[lig.j[4] * jArr.length]);
        wrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = jArr.length;
            if (i >= length) {
                return new lic(4, length, wrap.array());
            }
            wrap.putInt((int) jArr[i]);
            i++;
        }
    }

    public static lic h(lie lieVar, ByteOrder byteOrder) {
        return i(new lie[]{lieVar}, byteOrder);
    }

    public static lic i(lie[] lieVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[lig.j[5] * lieVarArr.length]);
        wrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = lieVarArr.length;
            if (i >= length) {
                return new lic(5, length, wrap.array());
            }
            lie lieVar = lieVarArr[i];
            wrap.putInt((int) lieVar.a);
            wrap.putInt((int) lieVar.b);
            i++;
        }
    }

    public static lic j(int i, ByteOrder byteOrder) {
        return k(new int[]{i}, byteOrder);
    }

    public static lic k(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[lig.j[3] * iArr.length]);
        wrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return new lic(3, length, wrap.array());
            }
            wrap.putShort((short) iArr[i]);
            i++;
        }
    }

    public final double a(ByteOrder byteOrder) {
        Object l = l(byteOrder);
        if (l == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (l instanceof String) {
            return Double.parseDouble((String) l);
        }
        if (l instanceof long[]) {
            if (((long[]) l).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (l instanceof int[]) {
            if (((int[]) l).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (l instanceof double[]) {
            double[] dArr = (double[]) l;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(l instanceof lie[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        lie[] lieVarArr = (lie[]) l;
        if (lieVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        lie lieVar = lieVarArr[0];
        return lieVar.a / lieVar.b;
    }

    public final int b(ByteOrder byteOrder) {
        Object l = l(byteOrder);
        if (l == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (l instanceof String) {
            return Integer.parseInt((String) l);
        }
        if (l instanceof long[]) {
            long[] jArr = (long[]) l;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(l instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) l;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final int c() {
        return lig.j[this.a] * this.b;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0195: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:406), block:B:178:0x0195 */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object l(java.nio.ByteOrder r11) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lic.l(java.nio.ByteOrder):java.lang.Object");
    }

    public final String m(ByteOrder byteOrder) {
        Object l = l(byteOrder);
        if (l == null) {
            return null;
        }
        if (l instanceof String) {
            return (String) l;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (l instanceof long[]) {
            long[] jArr = (long[]) l;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    break;
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (l instanceof int[]) {
            int[] iArr = (int[]) l;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    break;
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (l instanceof double[]) {
            double[] dArr = (double[]) l;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    break;
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else {
            if (!(l instanceof lie[])) {
                return null;
            }
            lie[] lieVarArr = (lie[]) l;
            while (true) {
                int length4 = lieVarArr.length;
                if (i >= length4) {
                    break;
                }
                sb.append(lieVarArr[i].a);
                sb.append('/');
                sb.append(lieVarArr[i].b);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return "(" + lig.i[this.a] + ", data length:" + this.d.length + ")";
    }

    public lic(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }
}
