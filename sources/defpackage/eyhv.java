package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyhv<T> implements eyik<T> {
    public static final int[] a = new int[0];
    public static final Unsafe b = eyjj.j();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final eyhs g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final eyjc m;
    private final eyfd n;

    public eyhv(int[] iArr, Object[] objArr, int i, int i2, eyhs eyhsVar, int[] iArr2, int i3, int i4, eyjc eyjcVar, eyfd eyfdVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = eyhsVar instanceof eyfy;
        boolean z = false;
        if (eyfdVar != null && (eyhsVar instanceof eyft)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = eyjcVar;
        this.n = eyfdVar;
        this.g = eyhsVar;
    }

    private final Object A(Object obj, int i, Object obj2, eyjc eyjcVar, Object obj3) {
        eygg y;
        int p = p(i);
        Object h = eyjj.h(obj, w(v(i)));
        if (h == null || (y = y(i)) == null) {
            return obj2;
        }
        eyhk a2 = eyhn.a(B(i));
        Iterator it = ((eyhm) h).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!y.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = eyjcVar.a(obj3);
                }
                int a3 = eyhl.a(a2, entry.getKey(), entry.getValue());
                eyee eyeeVar = eyee.b;
                byte[] bArr = new byte[a3];
                eyer ab = eyer.ab(bArr);
                try {
                    eyhl.b(ab, a2, entry.getKey(), entry.getValue());
                    eyjcVar.f(obj2, p, eyea.a(ab, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private final Object B(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object C(Object obj, int i) {
        eyik z = z(i);
        long w = w(v(i));
        if (!O(obj, i)) {
            return z.e();
        }
        Object object = b.getObject(obj, w);
        if (R(object)) {
            return object;
        }
        Object e = z.e();
        if (object != null) {
            z.h(e, object);
        }
        return e;
    }

    private final Object D(Object obj, int i, int i2) {
        eyik z = z(i2);
        if (!S(obj, i, i2)) {
            return z.e();
        }
        Object object = b.getObject(obj, w(v(i2)));
        if (R(object)) {
            return object;
        }
        Object e = z.e();
        if (object != null) {
            z.h(e, object);
        }
        return e;
    }

    private static void E(Object obj) {
        if (!R(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void F(Object obj, Object obj2, int i) {
        if (O(obj2, i)) {
            long w = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, w);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            eyik z = z(i);
            if (!O(obj, i)) {
                if (R(object)) {
                    Object e = z.e();
                    z.h(e, object);
                    unsafe.putObject(obj, w, e);
                } else {
                    unsafe.putObject(obj, w, object);
                }
                I(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, w);
            if (!R(object2)) {
                Object e2 = z.e();
                z.h(e2, object2);
                unsafe.putObject(obj, w, e2);
                object2 = e2;
            }
            z.h(object2, object);
        }
    }

    private final void G(Object obj, Object obj2, int i) {
        int p = p(i);
        if (S(obj2, p, i)) {
            long w = w(v(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, w);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + p(i) + " is present but null: " + obj2.toString());
            }
            eyik z = z(i);
            if (!S(obj, p, i)) {
                if (R(object)) {
                    Object e = z.e();
                    z.h(e, object);
                    unsafe.putObject(obj, w, e);
                } else {
                    unsafe.putObject(obj, w, object);
                }
                J(obj, p, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, w);
            if (!R(object2)) {
                Object e2 = z.e();
                z.h(e2, object2);
                unsafe.putObject(obj, w, e2);
                object2 = e2;
            }
            z.h(object2, object);
        }
    }

    private final void H(Object obj, int i, eyie eyieVar) {
        if (N(i)) {
            eyjj.u(obj, w(i), eyieVar.v());
        } else if (this.i) {
            eyjj.u(obj, w(i), eyieVar.u());
        } else {
            eyjj.u(obj, w(i), eyieVar.o());
        }
    }

    private final void I(Object obj, int i) {
        int s = s(i);
        long j = 1048575 & s;
        if (j == 1048575) {
            return;
        }
        eyjj.s(obj, j, (1 << (s >>> 20)) | eyjj.d(obj, j));
    }

    private final void J(Object obj, int i, int i2) {
        eyjj.s(obj, s(i2) & 1048575, i);
    }

    private final void K(Object obj, int i, Object obj2) {
        b.putObject(obj, w(v(i)), obj2);
        I(obj, i);
    }

    private final void L(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, w(v(i2)), obj2);
        J(obj, i, i2);
    }

    private final boolean M(Object obj, Object obj2, int i) {
        return O(obj, i) == O(obj2, i);
    }

    private static boolean N(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean O(Object obj, int i) {
        int s = s(i);
        long j = 1048575 & s;
        if (j != 1048575) {
            return (eyjj.d(obj, j) & (1 << (s >>> 20))) != 0;
        }
        int v = v(i);
        long w = w(v);
        switch (u(v)) {
            case 0:
                return Double.doubleToRawLongBits(eyjj.b(obj, w)) != 0;
            case 1:
                return Float.floatToRawIntBits(eyjj.c(obj, w)) != 0;
            case 2:
                return eyjj.f(obj, w) != 0;
            case 3:
                return eyjj.f(obj, w) != 0;
            case 4:
                return eyjj.d(obj, w) != 0;
            case 5:
                return eyjj.f(obj, w) != 0;
            case 6:
                return eyjj.d(obj, w) != 0;
            case 7:
                return eyjj.w(obj, w);
            case 8:
                Object h = eyjj.h(obj, w);
                if (h instanceof String) {
                    return !((String) h).isEmpty();
                }
                if (h instanceof eyee) {
                    return !eyee.b.equals(h);
                }
                throw new IllegalArgumentException();
            case 9:
                return eyjj.h(obj, w) != null;
            case 10:
                return !eyee.b.equals(eyjj.h(obj, w));
            case 11:
                return eyjj.d(obj, w) != 0;
            case 12:
                return eyjj.d(obj, w) != 0;
            case 13:
                return eyjj.d(obj, w) != 0;
            case 14:
                return eyjj.f(obj, w) != 0;
            case 15:
                return eyjj.d(obj, w) != 0;
            case 16:
                return eyjj.f(obj, w) != 0;
            case 17:
                return eyjj.h(obj, w) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean P(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? O(obj, i) : (i3 & i4) != 0;
    }

    private static boolean Q(Object obj, int i, eyik eyikVar) {
        return eyikVar.l(eyjj.h(obj, w(i)));
    }

    private static boolean R(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof eyfy) {
            return ((eyfy) obj).isMutable();
        }
        return true;
    }

    private final boolean S(Object obj, int i, int i2) {
        return eyjj.d(obj, (long) (s(i2) & 1048575)) == i;
    }

    private static boolean T(Object obj, long j) {
        return ((Boolean) eyjj.h(obj, j)).booleanValue();
    }

    private static final int U(byte[] bArr, int i, int i2, eyjr eyjrVar, Class cls, eydr eydrVar) {
        eyjr eyjrVar2 = eyjr.DOUBLE;
        switch (eyjrVar) {
            case DOUBLE:
                int i3 = i + 8;
                eydrVar.c = Double.valueOf(eyds.a(bArr, i));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                eydrVar.c = Float.valueOf(eyds.b(bArr, i));
                return i4;
            case INT64:
            case UINT64:
                int w = eyds.w(bArr, i, eydrVar);
                eydrVar.c = Long.valueOf(eydrVar.b);
                return w;
            case INT32:
            case UINT32:
            case ENUM:
                int t = eyds.t(bArr, i, eydrVar);
                eydrVar.c = Integer.valueOf(eydrVar.a);
                return t;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                eydrVar.c = Long.valueOf(eyds.A(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                eydrVar.c = Integer.valueOf(eyds.d(bArr, i));
                return i6;
            case BOOL:
                int w2 = eyds.w(bArr, i, eydrVar);
                eydrVar.c = Boolean.valueOf(eydrVar.b != 0);
                return w2;
            case STRING:
                return eyds.r(bArr, i, eydrVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return eyds.f(eyib.a.a(cls), bArr, i, i2, eydrVar);
            case BYTES:
                return eyds.c(bArr, i, eydrVar);
            case SINT32:
                int t2 = eyds.t(bArr, i, eydrVar);
                eydrVar.c = Integer.valueOf(eyel.H(eydrVar.a));
                return t2;
            case SINT64:
                int w3 = eyds.w(bArr, i, eydrVar);
                eydrVar.c = Long.valueOf(eyel.J(eydrVar.b));
                return w3;
        }
    }

    private static final void V(int i, Object obj, eyes eyesVar) {
        if (obj instanceof String) {
            eyesVar.q(i, (String) obj);
        } else {
            eyesVar.b(i, (eyee) obj);
        }
    }

    static eyjd d(Object obj) {
        eyfy eyfyVar = (eyfy) obj;
        eyjd eyjdVar = eyfyVar.unknownFields;
        if (eyjdVar != eyjd.a) {
            return eyjdVar;
        }
        eyjd eyjdVar2 = new eyjd();
        eyfyVar.unknownFields = eyjdVar2;
        return eyjdVar2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static double n(Object obj, long j) {
        return ((Double) eyjj.h(obj, j)).doubleValue();
    }

    private static float o(Object obj, long j) {
        return ((Float) eyjj.h(obj, j)).floatValue();
    }

    private final int p(int i) {
        return this.c[i];
    }

    private static int q(Object obj, long j) {
        return ((Integer) eyjj.h(obj, j)).intValue();
    }

    private final int r(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return t(i, 0);
    }

    private final int s(int i) {
        return this.c[i + 2];
    }

    private final int t(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int p = p(i4);
            if (i == p) {
                return i4;
            }
            if (i < p) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int u(int i) {
        return (i >>> 20) & PrivateKeyType.INVALID;
    }

    private final int v(int i) {
        return this.c[i + 1];
    }

    private static long w(int i) {
        return i & 1048575;
    }

    private static long x(Object obj, long j) {
        return ((Long) eyjj.h(obj, j)).longValue();
    }

    private final eygg y(int i) {
        int i2 = i / 3;
        return (eygg) this.d[i2 + i2 + 1];
    }

    private final eyik z(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        eyik eyikVar = (eyik) objArr[i3];
        if (eyikVar != null) {
            return eyikVar;
        }
        eyik a2 = eyib.a.a((Class) objArr[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    @Override // defpackage.eyik
    public final int a(Object obj) {
        int i;
        int ao;
        int ar;
        int H;
        int e;
        int size;
        int size2;
        int j;
        int U;
        int U2;
        int U3;
        int i2;
        int U4;
        int W;
        int i3;
        int i4;
        eyhv<T> eyhvVar = this;
        Object obj2 = obj;
        Unsafe unsafe = b;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < eyhvVar.c.length; i8 += 3) {
            int v = eyhvVar.v(i8);
            int u = u(v);
            int p = eyhvVar.p(i8);
            int i9 = eyhvVar.c[i8 + 2];
            int i10 = i9 & 1048575;
            if (u <= 17) {
                if (i10 != i5) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(obj2, i10);
                    i5 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long w = w(v);
            if (u >= eyfk.DOUBLE_LIST_PACKED.Z) {
                int i11 = eyfk.SINT64_LIST_PACKED.Z;
            }
            switch (u) {
                case 0:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        ao = eyer.ao(p);
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        ar = eyer.ar(p);
                        i7 += ar;
                    }
                    eyhvVar = this;
                    obj2 = obj;
                    break;
                case 2:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        H = eyer.H(p, unsafe.getLong(obj2, w));
                        i7 += H;
                    }
                    eyhvVar = this;
                    break;
                case 3:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        H = eyer.X(p, unsafe.getLong(obj2, w));
                        i7 += H;
                    }
                    eyhvVar = this;
                    break;
                case 4:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        H = eyer.F(p, unsafe.getInt(obj2, w));
                        i7 += H;
                    }
                    eyhvVar = this;
                    break;
                case 5:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        ar = eyer.aq(p);
                        i7 += ar;
                    }
                    eyhvVar = this;
                    obj2 = obj;
                    break;
                case 6:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        ar = eyer.ap(p);
                        i7 += ar;
                    }
                    eyhvVar = this;
                    obj2 = obj;
                    break;
                case 7:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        ar = eyer.an(p);
                        i7 += ar;
                    }
                    eyhvVar = this;
                    obj2 = obj;
                    break;
                case 8:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        Object object = unsafe.getObject(obj2, w);
                        H = object instanceof eyee ? eyer.B(p, (eyee) object) : eyer.S(p, (String) object);
                        i7 += H;
                    }
                    eyhvVar = this;
                    break;
                case 9:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        ao = eyil.f(p, unsafe.getObject(obj2, w), eyhvVar.z(i8));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        H = eyer.B(p, (eyee) unsafe.getObject(obj2, w));
                        i7 += H;
                    }
                    eyhvVar = this;
                    break;
                case 11:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        H = eyer.V(p, unsafe.getInt(obj2, w));
                        i7 += H;
                    }
                    eyhvVar = this;
                    break;
                case 12:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        H = eyer.D(p, unsafe.getInt(obj2, w));
                        i7 += H;
                    }
                    eyhvVar = this;
                    break;
                case 13:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        ar = eyer.as(p);
                        i7 += ar;
                    }
                    eyhvVar = this;
                    obj2 = obj;
                    break;
                case 14:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        ar = eyer.at(p);
                        i7 += ar;
                    }
                    eyhvVar = this;
                    obj2 = obj;
                    break;
                case 15:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        H = eyer.O(p, unsafe.getInt(obj2, w));
                        i7 += H;
                    }
                    eyhvVar = this;
                    break;
                case 16:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        H = eyer.Q(p, unsafe.getLong(obj2, w));
                        i7 += H;
                    }
                    eyhvVar = this;
                    break;
                case 17:
                    if (eyhvVar.P(obj2, i8, i5, i6, i)) {
                        ao = eyer.E(p, (eyhs) unsafe.getObject(obj2, w), eyhvVar.z(i8));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    ao = eyil.q(p, (List) unsafe.getObject(obj2, w));
                    i7 += ao;
                    break;
                case 19:
                    ao = eyil.p(p, (List) unsafe.getObject(obj2, w));
                    i7 += ao;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar = eyil.a;
                    if (list.size() != 0) {
                        e = eyil.e(list);
                        size = list.size() * eyer.U(p);
                        i2 = e + size;
                        i7 += i2;
                        break;
                    }
                    i2 = 0;
                    i7 += i2;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar2 = eyil.a;
                    size2 = list2.size();
                    if (size2 != 0) {
                        j = eyil.j(list2);
                        U = eyer.U(p);
                        ao = j + (size2 * U);
                        i7 += ao;
                        break;
                    }
                    ao = 0;
                    i7 += ao;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar3 = eyil.a;
                    size2 = list3.size();
                    if (size2 != 0) {
                        j = eyil.d(list3);
                        U = eyer.U(p);
                        ao = j + (size2 * U);
                        i7 += ao;
                        break;
                    }
                    ao = 0;
                    i7 += ao;
                case 23:
                    ao = eyil.q(p, (List) unsafe.getObject(obj2, w));
                    i7 += ao;
                    break;
                case 24:
                    ao = eyil.p(p, (List) unsafe.getObject(obj2, w));
                    i7 += ao;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar4 = eyil.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        ao = size3 * eyer.an(p);
                        i7 += ao;
                        break;
                    }
                    ao = 0;
                    i7 += ao;
                case 26:
                    List list5 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar5 = eyil.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        U2 = 0;
                    } else {
                        U2 = eyer.U(p) * size4;
                        if (list5 instanceof eyhb) {
                            eyhb eyhbVar = (eyhb) list5;
                            for (int i12 = 0; i12 < size4; i12++) {
                                Object c = eyhbVar.c();
                                U2 += c instanceof eyee ? eyer.C((eyee) c) : eyer.T((String) c);
                            }
                        } else {
                            for (int i13 = 0; i13 < size4; i13++) {
                                Object obj3 = list5.get(i13);
                                U2 += obj3 instanceof eyee ? eyer.C((eyee) obj3) : eyer.T((String) obj3);
                            }
                        }
                    }
                    i7 += U2;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj2, w);
                    eyik z = eyhvVar.z(i8);
                    eyjc eyjcVar6 = eyil.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        U3 = 0;
                    } else {
                        U3 = eyer.U(p) * size5;
                        for (int i14 = 0; i14 < size5; i14++) {
                            Object obj4 = list6.get(i14);
                            U3 += obj4 instanceof eyha ? eyer.J((eyha) obj4) : eyer.M((eyhs) obj4, z);
                        }
                    }
                    i7 += U3;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar7 = eyil.a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        i2 = size6 * eyer.U(p);
                        for (int i15 = 0; i15 < list7.size(); i15++) {
                            i2 += eyer.C((eyee) list7.get(i15));
                        }
                        i7 += i2;
                        break;
                    }
                    i2 = 0;
                    i7 += i2;
                case 29:
                    List list8 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar8 = eyil.a;
                    size2 = list8.size();
                    if (size2 != 0) {
                        j = eyil.i(list8);
                        U = eyer.U(p);
                        ao = j + (size2 * U);
                        i7 += ao;
                        break;
                    }
                    ao = 0;
                    i7 += ao;
                case 30:
                    List list9 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar9 = eyil.a;
                    size2 = list9.size();
                    if (size2 != 0) {
                        j = eyil.a(list9);
                        U = eyer.U(p);
                        ao = j + (size2 * U);
                        i7 += ao;
                        break;
                    }
                    ao = 0;
                    i7 += ao;
                case 31:
                    ao = eyil.p(p, (List) unsafe.getObject(obj2, w));
                    i7 += ao;
                    break;
                case 32:
                    ao = eyil.q(p, (List) unsafe.getObject(obj2, w));
                    i7 += ao;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar10 = eyil.a;
                    size2 = list10.size();
                    if (size2 != 0) {
                        j = eyil.g(list10);
                        U = eyer.U(p);
                        ao = j + (size2 * U);
                        i7 += ao;
                        break;
                    }
                    ao = 0;
                    i7 += ao;
                case 34:
                    List list11 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar11 = eyil.a;
                    size2 = list11.size();
                    if (size2 != 0) {
                        j = eyil.h(list11);
                        U = eyer.U(p);
                        ao = j + (size2 * U);
                        i7 += ao;
                        break;
                    }
                    ao = 0;
                    i7 += ao;
                case 35:
                    size = eyil.c((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    size = eyil.b((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size = eyil.e((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size = eyil.j((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    size = eyil.d((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    size = eyil.c((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    size = eyil.b((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list12 = (List) unsafe.getObject(obj2, w);
                    eyjc eyjcVar12 = eyil.a;
                    size = list12.size();
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size = eyil.i((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size = eyil.a((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    size = eyil.b((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    size = eyil.c((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size = eyil.g((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size = eyil.h((List) unsafe.getObject(obj2, w));
                    if (size > 0) {
                        U4 = eyer.U(p);
                        W = eyer.W(size);
                        e = U4 + W;
                        i2 = e + size;
                        i7 += i2;
                        break;
                    } else {
                        break;
                    }
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    List list13 = (List) unsafe.getObject(obj2, w);
                    eyik z2 = eyhvVar.z(i8);
                    eyjc eyjcVar13 = eyil.a;
                    int size7 = list13.size();
                    if (size7 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i16 = 0; i16 < size7; i16++) {
                            i3 += eyer.E(p, (eyhs) list13.get(i16), z2);
                        }
                    }
                    i7 += i3;
                    break;
                case 50:
                    eyhm eyhmVar = (eyhm) unsafe.getObject(obj2, w);
                    eyhl eyhlVar = (eyhl) eyhvVar.B(i8);
                    if (eyhmVar.isEmpty()) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (Map.Entry entry : eyhmVar.entrySet()) {
                            i4 += eyer.U(p) + eyer.K(eyhl.a(eyhlVar.a, entry.getKey(), entry.getValue()));
                        }
                    }
                    i7 += i4;
                    break;
                case 51:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.ao(p);
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.ar(p);
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.H(p, x(obj2, w));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.X(p, x(obj2, w));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.F(p, q(obj2, w));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.aq(p);
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.ap(p);
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.an(p);
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (eyhvVar.S(obj2, p, i8)) {
                        Object object2 = unsafe.getObject(obj2, w);
                        ao = object2 instanceof eyee ? eyer.B(p, (eyee) object2) : eyer.S(p, (String) object2);
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyil.f(p, unsafe.getObject(obj2, w), eyhvVar.z(i8));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.B(p, (eyee) unsafe.getObject(obj2, w));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.V(p, q(obj2, w));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.D(p, q(obj2, w));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.as(p);
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.at(p);
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.O(p, q(obj2, w));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.Q(p, x(obj2, w));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (eyhvVar.S(obj2, p, i8)) {
                        ao = eyer.E(p, (eyhs) unsafe.getObject(obj2, w), eyhvVar.z(i8));
                        i7 += ao;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int a2 = i7 + eyje.k(obj2).a();
        if (!eyhvVar.h) {
            return a2;
        }
        eyfj a3 = eyhvVar.n.a(obj2);
        int i17 = a3.b.b;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            eyin eyinVar = (eyin) a3.b.d(i19);
            i18 += eyfj.k((eyfv) eyinVar.a, eyinVar.b);
        }
        for (Map.Entry entry2 : a3.b.a()) {
            i18 += eyfj.k((eyfv) entry2.getKey(), entry2.getValue());
        }
        return a2 + i18;
    }

    @Override // defpackage.eyik
    public final int b(Object obj) {
        int i;
        int b2;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int v = v(i4);
            int p = p(i4);
            long w = w(v);
            int i5 = 37;
            switch (u(v)) {
                case 0:
                    i = i3 * 53;
                    b2 = eygs.b(Double.doubleToLongBits(eyjj.b(obj, w)));
                    i3 = i + b2;
                    break;
                case 1:
                    i = i3 * 53;
                    b2 = Float.floatToIntBits(eyjj.c(obj, w));
                    i3 = i + b2;
                    break;
                case 2:
                    i = i3 * 53;
                    b2 = eygs.b(eyjj.f(obj, w));
                    i3 = i + b2;
                    break;
                case 3:
                    i = i3 * 53;
                    b2 = eygs.b(eyjj.f(obj, w));
                    i3 = i + b2;
                    break;
                case 4:
                    i = i3 * 53;
                    b2 = eyjj.d(obj, w);
                    i3 = i + b2;
                    break;
                case 5:
                    i = i3 * 53;
                    b2 = eygs.b(eyjj.f(obj, w));
                    i3 = i + b2;
                    break;
                case 6:
                    i = i3 * 53;
                    b2 = eyjj.d(obj, w);
                    i3 = i + b2;
                    break;
                case 7:
                    i = i3 * 53;
                    b2 = eygs.a(eyjj.w(obj, w));
                    i3 = i + b2;
                    break;
                case 8:
                    i = i3 * 53;
                    b2 = ((String) eyjj.h(obj, w)).hashCode();
                    i3 = i + b2;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object h = eyjj.h(obj, w);
                    if (h != null) {
                        i5 = h.hashCode();
                    }
                    i3 = i2 + i5;
                    break;
                case 10:
                    i = i3 * 53;
                    b2 = eyjj.h(obj, w).hashCode();
                    i3 = i + b2;
                    break;
                case 11:
                    i = i3 * 53;
                    b2 = eyjj.d(obj, w);
                    i3 = i + b2;
                    break;
                case 12:
                    i = i3 * 53;
                    b2 = eyjj.d(obj, w);
                    i3 = i + b2;
                    break;
                case 13:
                    i = i3 * 53;
                    b2 = eyjj.d(obj, w);
                    i3 = i + b2;
                    break;
                case 14:
                    i = i3 * 53;
                    b2 = eygs.b(eyjj.f(obj, w));
                    i3 = i + b2;
                    break;
                case 15:
                    i = i3 * 53;
                    b2 = eyjj.d(obj, w);
                    i3 = i + b2;
                    break;
                case 16:
                    i = i3 * 53;
                    b2 = eygs.b(eyjj.f(obj, w));
                    i3 = i + b2;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object h2 = eyjj.h(obj, w);
                    if (h2 != null) {
                        i5 = h2.hashCode();
                    }
                    i3 = i2 + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i = i3 * 53;
                    b2 = eyjj.h(obj, w).hashCode();
                    i3 = i + b2;
                    break;
                case 50:
                    i = i3 * 53;
                    b2 = eyjj.h(obj, w).hashCode();
                    i3 = i + b2;
                    break;
                case 51:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eygs.b(Double.doubleToLongBits(n(obj, w)));
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = Float.floatToIntBits(o(obj, w));
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eygs.b(x(obj, w));
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eygs.b(x(obj, w));
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = q(obj, w);
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eygs.b(x(obj, w));
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = q(obj, w);
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eygs.a(T(obj, w));
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = ((String) eyjj.h(obj, w)).hashCode();
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eyjj.h(obj, w).hashCode();
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eyjj.h(obj, w).hashCode();
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = q(obj, w);
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = q(obj, w);
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = q(obj, w);
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eygs.b(x(obj, w));
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = q(obj, w);
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eygs.b(x(obj, w));
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (S(obj, p, i4)) {
                        i = i3 * 53;
                        b2 = eyjj.h(obj, w).hashCode();
                        i3 = i + b2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + eyje.k(obj).hashCode();
        return this.h ? (hashCode * 53) + this.n.a(obj).hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0d91, code lost:
    
        if (r1 == r8) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0d93, code lost:
    
        r26.putInt(r14, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0d99, code lost:
    
        r8 = r0.k;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0d9f, code lost:
    
        if (r8 >= r0.l) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0da1, code lost:
    
        r3 = r0.A(r14, r0.j[r8], r3, r0.m, r33);
        r8 = r8 + 1;
        r0 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0db3, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0db4, code lost:
    
        if (r3 == null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0db6, code lost:
    
        defpackage.eyje.l(r1, (defpackage.eyjd) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0dbb, code lost:
    
        if (r10 != 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0dbd, code lost:
    
        if (r6 != r7) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0dc7, code lost:
    
        throw new defpackage.eygu(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0dce, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0dc8, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0dca, code lost:
    
        if (r6 > r7) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0dcc, code lost:
    
        if (r15 != r10) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0dd4, code lost:
    
        throw new defpackage.eygu(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0d52  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a99 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0aaa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0780 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x078f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0ab0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int c(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, defpackage.eydr r38) {
        /*
            Method dump skipped, instructions count: 3766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyhv.c(java.lang.Object, byte[], int, int, int, eydr):int");
    }

    @Override // defpackage.eyik
    public final Object e() {
        return ((eyfy) this.g).newMutableInstance();
    }

    @Override // defpackage.eyik
    public final void g(Object obj) {
        if (R(obj)) {
            if (obj instanceof eyfy) {
                eyfy eyfyVar = (eyfy) obj;
                eyfyVar.clearMemoizedSerializedSize();
                eyfyVar.clearMemoizedHashCode();
                eyfyVar.markImmutable();
            }
            int[] iArr = this.c;
            for (int i = 0; i < iArr.length; i += 3) {
                int v = v(i);
                long w = w(v);
                int u = u(v);
                if (u != 9) {
                    if (u != 60 && u != 68) {
                        switch (u) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                eyhc.a(obj, w).b();
                                break;
                            case 50:
                                Unsafe unsafe = b;
                                Object object = unsafe.getObject(obj, w);
                                if (object != null) {
                                    ((eyhm) object).c();
                                    unsafe.putObject(obj, w, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (S(obj, p(i), i)) {
                        z(i).g(b.getObject(obj, w));
                    }
                }
                if (O(obj, i)) {
                    z(i).g(b.getObject(obj, w));
                }
            }
            this.m.h(obj);
            if (this.h) {
                this.n.c(obj);
            }
        }
    }

    @Override // defpackage.eyik
    public final void h(Object obj, Object obj2) {
        E(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int v = v(i);
            long w = w(v);
            int p = p(i);
            switch (u(v)) {
                case 0:
                    if (O(obj2, i)) {
                        eyjj.q(obj, w, eyjj.b(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (O(obj2, i)) {
                        eyjj.r(obj, w, eyjj.c(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (O(obj2, i)) {
                        eyjj.t(obj, w, eyjj.f(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (O(obj2, i)) {
                        eyjj.t(obj, w, eyjj.f(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (O(obj2, i)) {
                        eyjj.s(obj, w, eyjj.d(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (O(obj2, i)) {
                        eyjj.t(obj, w, eyjj.f(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (O(obj2, i)) {
                        eyjj.s(obj, w, eyjj.d(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (O(obj2, i)) {
                        eyjj.m(obj, w, eyjj.w(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (O(obj2, i)) {
                        eyjj.u(obj, w, eyjj.h(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    F(obj, obj2, i);
                    break;
                case 10:
                    if (O(obj2, i)) {
                        eyjj.u(obj, w, eyjj.h(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (O(obj2, i)) {
                        eyjj.s(obj, w, eyjj.d(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (O(obj2, i)) {
                        eyjj.s(obj, w, eyjj.d(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (O(obj2, i)) {
                        eyjj.s(obj, w, eyjj.d(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (O(obj2, i)) {
                        eyjj.t(obj, w, eyjj.f(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (O(obj2, i)) {
                        eyjj.s(obj, w, eyjj.d(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (O(obj2, i)) {
                        eyjj.t(obj, w, eyjj.f(obj2, w));
                        I(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    F(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    eygr a2 = eyhc.a(obj, w);
                    eygr a3 = eyhc.a(obj2, w);
                    int size = a2.size();
                    int size2 = a3.size();
                    if (size > 0 && size2 > 0) {
                        if (!a2.c()) {
                            a2 = a2.e(size2 + size);
                        }
                        a2.addAll(a3);
                    }
                    if (size > 0) {
                        a3 = a2;
                    }
                    eyjj.u(obj, w, a3);
                    break;
                case 50:
                    eyjc eyjcVar = eyil.a;
                    eyjj.u(obj, w, eyhn.c(eyjj.h(obj, w), eyjj.h(obj2, w)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (S(obj2, p, i)) {
                        eyjj.u(obj, w, eyjj.h(obj2, w));
                        J(obj, p, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    G(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (S(obj2, p, i)) {
                        eyjj.u(obj, w, eyjj.h(obj2, w));
                        J(obj, p, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    G(obj, obj2, i);
                    break;
            }
        }
        eyil.J(obj, obj2);
        if (this.h) {
            eyil.n(this.n, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0942, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0979  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x026f A[Catch: all -> 0x0947, TryCatch #2 {all -> 0x0947, blocks: (B:343:0x0046, B:348:0x0056, B:349:0x005a, B:351:0x0064, B:353:0x0068, B:354:0x0072, B:372:0x0075, B:373:0x010f, B:374:0x0124, B:355:0x0079, B:357:0x0107, B:358:0x0083, B:359:0x008d, B:360:0x0097, B:361:0x00a0, B:362:0x00b6, B:363:0x00bf, B:364:0x00c8, B:365:0x00d1, B:366:0x00da, B:367:0x00e3, B:368:0x00ec, B:369:0x00f5, B:370:0x00fe, B:375:0x0125, B:377:0x012d, B:379:0x013b, B:380:0x0141, B:381:0x0269, B:383:0x026f, B:384:0x0276, B:389:0x02a1, B:390:0x0287, B:392:0x028f, B:393:0x0147, B:394:0x014f, B:396:0x0155, B:397:0x015f, B:398:0x0169, B:399:0x0173, B:430:0x017d, B:431:0x0184, B:400:0x0185, B:401:0x018f, B:402:0x0195, B:404:0x019b, B:406:0x01a5, B:408:0x01b4, B:409:0x01c1, B:410:0x01c6, B:411:0x01d2, B:413:0x01d8, B:415:0x01e2, B:417:0x01f1, B:418:0x01fe, B:419:0x0203, B:420:0x021d, B:421:0x0222, B:422:0x022b, B:423:0x0234, B:424:0x023d, B:425:0x0246, B:426:0x024f, B:427:0x0258, B:428:0x0261, B:433:0x02aa, B:434:0x02ae, B:442:0x004c, B:7:0x02d4, B:9:0x02d8, B:15:0x02e4, B:16:0x0922, B:137:0x02ea, B:140:0x02fc, B:142:0x0310, B:144:0x0324, B:146:0x0338, B:148:0x034b, B:150:0x0355, B:153:0x035c, B:154:0x0362, B:156:0x0371, B:158:0x0384, B:160:0x0393, B:162:0x03a4, B:164:0x03ad, B:166:0x03c0, B:168:0x03d3, B:170:0x03e6, B:172:0x03f9, B:174:0x040c, B:176:0x041f, B:178:0x0433, B:64:0x0459, B:129:0x0467, B:209:0x05cf, B:214:0x05e0, B:216:0x05ee, B:218:0x05fc, B:220:0x060a, B:222:0x0618, B:224:0x0626, B:226:0x0634, B:228:0x0642, B:230:0x0650, B:232:0x065e, B:234:0x066c, B:236:0x067a, B:238:0x0688, B:240:0x0696, B:242:0x06ac, B:244:0x06ba, B:246:0x06cf, B:248:0x06e4, B:251:0x06f4, B:255:0x06fb, B:256:0x0700, B:258:0x0701, B:260:0x071a, B:262:0x072f, B:264:0x0736, B:267:0x0741, B:272:0x0748, B:273:0x074d, B:275:0x074e, B:277:0x0755, B:278:0x0766, B:280:0x0777, B:282:0x0785, B:284:0x0793, B:286:0x07a1, B:288:0x07af, B:290:0x07bd, B:292:0x07cb, B:294:0x07d9, B:296:0x07e7, B:298:0x07fa, B:300:0x080b, B:302:0x081c, B:304:0x082d, B:306:0x083e, B:308:0x0849, B:311:0x0850, B:312:0x0856, B:314:0x0862, B:316:0x0873, B:318:0x0884, B:320:0x0897, B:322:0x08a0, B:324:0x08b0, B:326:0x08c0, B:328:0x08d0, B:330:0x08e0, B:332:0x08f0, B:334:0x0900, B:336:0x0910), top: B:342:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0276 A[Catch: all -> 0x0947, TryCatch #2 {all -> 0x0947, blocks: (B:343:0x0046, B:348:0x0056, B:349:0x005a, B:351:0x0064, B:353:0x0068, B:354:0x0072, B:372:0x0075, B:373:0x010f, B:374:0x0124, B:355:0x0079, B:357:0x0107, B:358:0x0083, B:359:0x008d, B:360:0x0097, B:361:0x00a0, B:362:0x00b6, B:363:0x00bf, B:364:0x00c8, B:365:0x00d1, B:366:0x00da, B:367:0x00e3, B:368:0x00ec, B:369:0x00f5, B:370:0x00fe, B:375:0x0125, B:377:0x012d, B:379:0x013b, B:380:0x0141, B:381:0x0269, B:383:0x026f, B:384:0x0276, B:389:0x02a1, B:390:0x0287, B:392:0x028f, B:393:0x0147, B:394:0x014f, B:396:0x0155, B:397:0x015f, B:398:0x0169, B:399:0x0173, B:430:0x017d, B:431:0x0184, B:400:0x0185, B:401:0x018f, B:402:0x0195, B:404:0x019b, B:406:0x01a5, B:408:0x01b4, B:409:0x01c1, B:410:0x01c6, B:411:0x01d2, B:413:0x01d8, B:415:0x01e2, B:417:0x01f1, B:418:0x01fe, B:419:0x0203, B:420:0x021d, B:421:0x0222, B:422:0x022b, B:423:0x0234, B:424:0x023d, B:425:0x0246, B:426:0x024f, B:427:0x0258, B:428:0x0261, B:433:0x02aa, B:434:0x02ae, B:442:0x004c, B:7:0x02d4, B:9:0x02d8, B:15:0x02e4, B:16:0x0922, B:137:0x02ea, B:140:0x02fc, B:142:0x0310, B:144:0x0324, B:146:0x0338, B:148:0x034b, B:150:0x0355, B:153:0x035c, B:154:0x0362, B:156:0x0371, B:158:0x0384, B:160:0x0393, B:162:0x03a4, B:164:0x03ad, B:166:0x03c0, B:168:0x03d3, B:170:0x03e6, B:172:0x03f9, B:174:0x040c, B:176:0x041f, B:178:0x0433, B:64:0x0459, B:129:0x0467, B:209:0x05cf, B:214:0x05e0, B:216:0x05ee, B:218:0x05fc, B:220:0x060a, B:222:0x0618, B:224:0x0626, B:226:0x0634, B:228:0x0642, B:230:0x0650, B:232:0x065e, B:234:0x066c, B:236:0x067a, B:238:0x0688, B:240:0x0696, B:242:0x06ac, B:244:0x06ba, B:246:0x06cf, B:248:0x06e4, B:251:0x06f4, B:255:0x06fb, B:256:0x0700, B:258:0x0701, B:260:0x071a, B:262:0x072f, B:264:0x0736, B:267:0x0741, B:272:0x0748, B:273:0x074d, B:275:0x074e, B:277:0x0755, B:278:0x0766, B:280:0x0777, B:282:0x0785, B:284:0x0793, B:286:0x07a1, B:288:0x07af, B:290:0x07bd, B:292:0x07cb, B:294:0x07d9, B:296:0x07e7, B:298:0x07fa, B:300:0x080b, B:302:0x081c, B:304:0x082d, B:306:0x083e, B:308:0x0849, B:311:0x0850, B:312:0x0856, B:314:0x0862, B:316:0x0873, B:318:0x0884, B:320:0x0897, B:322:0x08a0, B:324:0x08b0, B:326:0x08c0, B:328:0x08d0, B:330:0x08e0, B:332:0x08f0, B:334:0x0900, B:336:0x0910), top: B:342:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0961 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x098a A[LOOP:3: B:50:0x0986->B:52:0x098a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0952 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04f2 A[SYNTHETIC] */
    @Override // defpackage.eyik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r20, defpackage.eyie r21, defpackage.eyfc r22) {
        /*
            Method dump skipped, instructions count: 2692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyhv.i(java.lang.Object, eyie, eyfc):void");
    }

    @Override // defpackage.eyik
    public final void j(Object obj, byte[] bArr, int i, int i2, eydr eydrVar) {
        c(obj, bArr, i, i2, 0, eydrVar);
    }

    @Override // defpackage.eyik
    public final boolean k(Object obj, Object obj2) {
        boolean o;
        for (int i = 0; i < this.c.length; i += 3) {
            int v = v(i);
            long w = w(v);
            switch (u(v)) {
                case 0:
                    if (M(obj, obj2, i) && Double.doubleToLongBits(eyjj.b(obj, w)) == Double.doubleToLongBits(eyjj.b(obj2, w))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (M(obj, obj2, i) && Float.floatToIntBits(eyjj.c(obj, w)) == Float.floatToIntBits(eyjj.c(obj2, w))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (M(obj, obj2, i) && eyjj.f(obj, w) == eyjj.f(obj2, w)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (M(obj, obj2, i) && eyjj.f(obj, w) == eyjj.f(obj2, w)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (M(obj, obj2, i) && eyjj.d(obj, w) == eyjj.d(obj2, w)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (M(obj, obj2, i) && eyjj.f(obj, w) == eyjj.f(obj2, w)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (M(obj, obj2, i) && eyjj.d(obj, w) == eyjj.d(obj2, w)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (M(obj, obj2, i) && eyjj.w(obj, w) == eyjj.w(obj2, w)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (M(obj, obj2, i) && eyil.o(eyjj.h(obj, w), eyjj.h(obj2, w))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (M(obj, obj2, i) && eyil.o(eyjj.h(obj, w), eyjj.h(obj2, w))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (M(obj, obj2, i) && eyil.o(eyjj.h(obj, w), eyjj.h(obj2, w))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (M(obj, obj2, i) && eyjj.d(obj, w) == eyjj.d(obj2, w)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (M(obj, obj2, i) && eyjj.d(obj, w) == eyjj.d(obj2, w)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (M(obj, obj2, i) && eyjj.d(obj, w) == eyjj.d(obj2, w)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (M(obj, obj2, i) && eyjj.f(obj, w) == eyjj.f(obj2, w)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (M(obj, obj2, i) && eyjj.d(obj, w) == eyjj.d(obj2, w)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (M(obj, obj2, i) && eyjj.f(obj, w) == eyjj.f(obj2, w)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (M(obj, obj2, i) && eyil.o(eyjj.h(obj, w), eyjj.h(obj2, w))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    o = eyil.o(eyjj.h(obj, w), eyjj.h(obj2, w));
                    break;
                case 50:
                    o = eyil.o(eyjj.h(obj, w), eyjj.h(obj2, w));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long s = s(i) & 1048575;
                    if (eyjj.d(obj, s) == eyjj.d(obj2, s) && eyil.o(eyjj.h(obj, w), eyjj.h(obj2, w))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!o) {
                return false;
            }
        }
        if (!eyje.k(obj).equals(eyje.k(obj2))) {
            return false;
        }
        if (this.h) {
            return this.n.a(obj).equals(this.n.a(obj2));
        }
        return true;
    }

    @Override // defpackage.eyik
    public final boolean l(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.k) {
            int i6 = this.j[i3];
            int p = p(i6);
            int v = v(i6);
            int i7 = this.c[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = b.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            Object obj2 = obj;
            if ((268435456 & v) != 0 && !P(obj2, i6, i, i2, i9)) {
                return false;
            }
            int u = u(v);
            if (u != 9 && u != 17) {
                if (u != 27) {
                    if (u == 60 || u == 68) {
                        if (S(obj2, p, i6) && !Q(obj2, v, z(i6))) {
                            return false;
                        }
                    } else if (u != 49) {
                        if (u != 50) {
                            continue;
                        } else {
                            eyhm eyhmVar = (eyhm) eyjj.h(obj2, w(v));
                            if (!eyhmVar.isEmpty() && eyhn.a(B(i6)).c.s == eyjs.MESSAGE) {
                                eyik eyikVar = null;
                                for (Object obj3 : eyhmVar.values()) {
                                    if (eyikVar == null) {
                                        eyikVar = eyib.a.a(obj3.getClass());
                                    }
                                    if (!eyikVar.l(obj3)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
                List list = (List) eyjj.h(obj2, w(v));
                if (list.isEmpty()) {
                    continue;
                } else {
                    eyik z = z(i6);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!z.l(list.get(i10))) {
                            return false;
                        }
                    }
                }
            } else if (P(obj2, i6, i, i2, i9) && !Q(obj2, v, z(i6))) {
                return false;
            }
            i3++;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        return !this.h || this.n.a(obj).j();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // defpackage.eyik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.Object r20, defpackage.eyes r21) {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyhv.m(java.lang.Object, eyes):void");
    }
}
