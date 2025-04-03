package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enoz extends enhk {
    public static final enhk a = new enoz(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    final transient Object[] c;
    public final transient int d;
    private final transient Object e;

    private enoz(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.c = objArr;
        this.d = i;
    }

    public static enoz a(int i, Object[] objArr) {
        return w(i, objArr, null);
    }

    static enoz w(int i, Object[] objArr, enhd enhdVar) {
        if (i == 0) {
            return (enoz) a;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            Object obj2 = objArr[1];
            obj2.getClass();
            endr.a(obj, obj2);
            return new enoz(null, objArr, 1);
        }
        emxf.x(i, objArr.length >> 1);
        Object z = z(objArr, i, enip.d(i), 0);
        if (z instanceof Object[]) {
            Object[] objArr2 = (Object[]) z;
            enhc enhcVar = (enhc) objArr2[2];
            if (enhdVar == null) {
                throw enhcVar.a();
            }
            enhdVar.c = enhcVar;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue + intValue);
            z = obj3;
            i = intValue;
        }
        return new enoz(z, objArr, i);
    }

    static Object x(Object[] objArr, int i, int i2, int i3) {
        Object z = z(objArr, i, i2, i3);
        if (z instanceof Object[]) {
            throw ((enhc) ((Object[]) z)[2]).a();
        }
        return z;
    }

    static Object y(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            obj3.getClass();
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            obj4.getClass();
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int a2 = engc.a(obj2.hashCode());
            while (true) {
                int i3 = a2 & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                a2 = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int a3 = engc.a(obj2.hashCode());
            while (true) {
                int i5 = a3 & length2;
                char c = (char) sArr[i5];
                if (c == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[c])) {
                    return objArr[c ^ 1];
                }
                a3 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int a4 = engc.a(obj2.hashCode());
            while (true) {
                int i6 = a4 & length3;
                int i7 = iArr[i6];
                if (i7 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                a4 = i6 + 1;
            }
        }
    }

    private static Object z(Object[] objArr, int i, int i2, int i3) {
        int i4;
        enhc enhcVar = null;
        int i5 = 1;
        if (i == 1) {
            Object obj = objArr[i3];
            obj.getClass();
            Object obj2 = objArr[i3 ^ 1];
            obj2.getClass();
            endr.a(obj, obj2);
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 + i8 + i3;
                int i10 = i7 + i7 + i3;
                Object obj3 = objArr[i9];
                obj3.getClass();
                Object obj4 = objArr[i9 ^ 1];
                obj4.getClass();
                endr.a(obj3, obj4);
                int a2 = engc.a(obj3.hashCode());
                while (true) {
                    int i11 = a2 & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj3;
                            objArr[i10 ^ 1] = obj4;
                        }
                        i7++;
                    } else {
                        if (obj3.equals(objArr[i12])) {
                            int i13 = i12 ^ 1;
                            Object obj5 = objArr[i13];
                            obj5.getClass();
                            enhc enhcVar2 = new enhc(obj3, obj4, obj5);
                            objArr[i13] = obj4;
                            enhcVar = enhcVar2;
                            break;
                        }
                        a2 = i11 + 1;
                    }
                }
            }
            return i7 == i ? bArr : new Object[]{bArr, Integer.valueOf(i7), enhcVar};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = i15 + i15 + i3;
                int i17 = i14 + i14 + i3;
                Object obj6 = objArr[i16];
                obj6.getClass();
                Object obj7 = objArr[i16 ^ 1];
                obj7.getClass();
                endr.a(obj6, obj7);
                int a3 = engc.a(obj6.hashCode());
                while (true) {
                    int i18 = a3 & i6;
                    char c = (char) sArr[i18];
                    if (c == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj6;
                            objArr[i17 ^ 1] = obj7;
                        }
                        i14++;
                    } else {
                        if (obj6.equals(objArr[c])) {
                            int i19 = c ^ 1;
                            Object obj8 = objArr[i19];
                            obj8.getClass();
                            enhc enhcVar3 = new enhc(obj6, obj7, obj8);
                            objArr[i19] = obj7;
                            enhcVar = enhcVar3;
                            break;
                        }
                        a3 = i18 + 1;
                    }
                }
            }
            return i14 == i ? sArr : new Object[]{sArr, Integer.valueOf(i14), enhcVar};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = i20 + i20 + i3;
            int i23 = i21 + i21 + i3;
            Object obj9 = objArr[i22];
            obj9.getClass();
            Object obj10 = objArr[i22 ^ i5];
            obj10.getClass();
            endr.a(obj9, obj10);
            int a4 = engc.a(obj9.hashCode());
            while (true) {
                int i24 = a4 & i6;
                int i25 = iArr[i24];
                if (i25 == -1) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj9;
                        objArr[i23 ^ 1] = obj10;
                    }
                    i21++;
                    i4 = i5;
                } else {
                    i4 = i5;
                    if (obj9.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj11 = objArr[i26];
                        obj11.getClass();
                        enhc enhcVar4 = new enhc(obj9, obj10, obj11);
                        objArr[i26] = obj10;
                        enhcVar = enhcVar4;
                        break;
                    }
                    a4 = i24 + 1;
                    i5 = i4;
                }
            }
            i20++;
            i5 = i4;
        }
        int i27 = i5;
        if (i21 == i) {
            return iArr;
        }
        Integer valueOf = Integer.valueOf(i21);
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i27] = valueOf;
        objArr2[2] = enhcVar;
        return objArr2;
    }

    @Override // defpackage.enhk
    public final engi e() {
        return new enoy(this.c, 1, this.d);
    }

    @Override // defpackage.enhk, java.util.Map
    public final Object get(Object obj) {
        Object y = y(this.e, this.c, this.d, 0, obj);
        if (y == null) {
            return null;
        }
        return y;
    }

    @Override // defpackage.enhk
    public final enip hE() {
        return new enow(this, this.c, 0, this.d);
    }

    @Override // defpackage.enhk
    public final enip hF() {
        return new enox(this, new enoy(this.c, 0, this.d));
    }

    @Override // defpackage.enhk
    public final boolean hH() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.d;
    }

    @Override // defpackage.enhk
    public Object writeReplace() {
        return super.writeReplace();
    }
}
