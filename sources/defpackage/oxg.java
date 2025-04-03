package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxg {
    public static final void a(oxo oxoVar, Object[] objArr) {
        if (objArr != null) {
            int i = 0;
            while (i < objArr.length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    oxoVar.f(i);
                } else if (obj instanceof byte[]) {
                    oxoVar.c(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    oxoVar.d(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    oxoVar.d(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    oxoVar.e(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    oxoVar.e(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    oxoVar.e(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    oxoVar.e(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    oxoVar.g(i, (String) obj);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    oxoVar.e(i, true != ((Boolean) obj).booleanValue() ? 0L : 1L);
                }
            }
        }
    }
}
