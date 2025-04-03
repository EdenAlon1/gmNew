package j$.util;

import java.util.Arrays;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public final class Objects {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static boolean deepEquals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((obj instanceof Object[]) && (obj2 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj, (Object[]) obj2) : ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : ((obj instanceof short[]) && (obj2 instanceof short[])) ? Arrays.equals((short[]) obj, (short[]) obj2) : ((obj instanceof int[]) && (obj2 instanceof int[])) ? Arrays.equals((int[]) obj, (int[]) obj2) : ((obj instanceof long[]) && (obj2 instanceof long[])) ? Arrays.equals((long[]) obj, (long[]) obj2) : ((obj instanceof char[]) && (obj2 instanceof char[])) ? Arrays.equals((char[]) obj, (char[]) obj2) : ((obj instanceof float[]) && (obj2 instanceof float[])) ? Arrays.equals((float[]) obj, (float[]) obj2) : ((obj instanceof double[]) && (obj2 instanceof double[])) ? Arrays.equals((double[]) obj, (double[]) obj2) : ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) ? Arrays.equals((boolean[]) obj, (boolean[]) obj2) : obj.equals(obj2);
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean nonNull(Object obj) {
        return obj != null;
    }

    public static <T> T requireNonNullElse(T t, T t2) {
        if (t != null) {
            return t;
        }
        a(t2, "defaultObj");
        return t2;
    }

    public static <T> T requireNonNullElseGet(T t, Supplier<? extends T> supplier) {
        if (t != null) {
            return t;
        }
        a(supplier, "supplier");
        T t2 = supplier.get();
        a(t2, "supplier.get()");
        return t2;
    }

    public static String toString(Object obj) {
        return String.valueOf(obj);
    }

    public static String toString(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
