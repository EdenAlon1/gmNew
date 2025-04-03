package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermj extends ermk {
    public static int a(float f) {
        return Float.valueOf(f).hashCode();
    }

    public static int b(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List c(float... fArr) {
        int length = fArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new ermi(fArr, 0, length);
    }

    public static float[] d(Collection collection) {
        if (collection instanceof ermi) {
            ermi ermiVar = (ermi) collection;
            return Arrays.copyOfRange(ermiVar.a, ermiVar.b, ermiVar.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }
}
