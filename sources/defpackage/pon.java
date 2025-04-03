package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pon {
    private final Map a = new LinkedHashMap();

    public final pot a() {
        pot potVar = new pot(this.a);
        poo.a(potVar);
        return potVar;
    }

    public final void b(pot potVar) {
        potVar.getClass();
        c(potVar.b);
    }

    public final void c(Map map) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            Map map2 = this.a;
            if (value == null) {
                value = null;
            } else {
                int i = fflc.a;
                ffkb ffkbVar = new ffkb(value.getClass());
                if (!ffkj.e(ffkbVar, new ffkb(Boolean.TYPE)) && !ffkj.e(ffkbVar, new ffkb(Byte.TYPE)) && !ffkj.e(ffkbVar, new ffkb(Integer.TYPE)) && !ffkj.e(ffkbVar, new ffkb(Long.TYPE)) && !ffkj.e(ffkbVar, new ffkb(Float.TYPE)) && !ffkj.e(ffkbVar, new ffkb(Double.TYPE)) && !ffkj.e(ffkbVar, new ffkb(String.class)) && !ffkj.e(ffkbVar, new ffkb(Boolean[].class)) && !ffkj.e(ffkbVar, new ffkb(Byte[].class)) && !ffkj.e(ffkbVar, new ffkb(Integer[].class)) && !ffkj.e(ffkbVar, new ffkb(Long[].class)) && !ffkj.e(ffkbVar, new ffkb(Float[].class)) && !ffkj.e(ffkbVar, new ffkb(Double[].class)) && !ffkj.e(ffkbVar, new ffkb(String[].class))) {
                    int i2 = 0;
                    if (ffkj.e(ffkbVar, new ffkb(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        String str2 = pou.a;
                        objArr = new Boolean[length];
                        while (i2 < length) {
                            objArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                    } else if (ffkj.e(ffkbVar, new ffkb(byte[].class))) {
                        value = pou.a((byte[]) value);
                    } else if (ffkj.e(ffkbVar, new ffkb(int[].class))) {
                        int[] iArr = (int[]) value;
                        int length2 = iArr.length;
                        String str3 = pou.a;
                        objArr = new Integer[length2];
                        while (i2 < length2) {
                            objArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                    } else if (ffkj.e(ffkbVar, new ffkb(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length3 = jArr.length;
                        String str4 = pou.a;
                        objArr = new Long[length3];
                        while (i2 < length3) {
                            objArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                    } else if (ffkj.e(ffkbVar, new ffkb(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length4 = fArr.length;
                        String str5 = pou.a;
                        objArr = new Float[length4];
                        while (i2 < length4) {
                            objArr[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                    } else {
                        if (!ffkj.e(ffkbVar, new ffkb(double[].class))) {
                            throw new IllegalArgumentException(a.o(ffkbVar, str, "Key ", " has invalid type "));
                        }
                        double[] dArr = (double[]) value;
                        int length5 = dArr.length;
                        String str6 = pou.a;
                        objArr = new Double[length5];
                        while (i2 < length5) {
                            objArr[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                    }
                    value = objArr;
                }
            }
            map2.put(str, value);
        }
    }

    public final void d(String str, byte[] bArr) {
        bArr.getClass();
        this.a.put(str, pou.a(bArr));
    }

    public final void e(String str, Object obj) {
        this.a.put(str, obj);
    }

    public final void f(String str, boolean z) {
        e(str, Boolean.valueOf(z));
    }

    public final void g(String str, int i) {
        e(str, Integer.valueOf(i));
    }

    public final void h(String str, long j) {
        e(str, Long.valueOf(j));
    }
}
