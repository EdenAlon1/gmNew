package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibp {
    public static /* synthetic */ ibq a(List list, float f, float f2, int i) {
        return new icl(list, null, (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
    }

    public static /* synthetic */ ibq b(List list, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 9187343241974906880L;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            j = 0;
        }
        return new icl(list, null, j, j3);
    }

    public static /* synthetic */ ibq c(List list, long j, float f, int i) {
        if ((i & 4) != 0) {
            f = Float.POSITIVE_INFINITY;
        }
        if ((i & 2) != 0) {
            j = 9205357640488583168L;
        }
        return new icy(list, j, f);
    }

    public static /* synthetic */ ibq d(List list, float f, float f2, int i) {
        return new icl(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) & 4294967295L));
    }

    public static /* synthetic */ ibq e(ffcf[] ffcfVarArr) {
        ffcf[] ffcfVarArr2 = (ffcf[]) Arrays.copyOf(ffcfVarArr, ffcfVarArr.length);
        long floatToRawIntBits = Float.floatToRawIntBits(0.0f);
        long floatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
        long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
        long floatToRawIntBits4 = Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
        ArrayList arrayList = new ArrayList(ffcfVarArr2.length);
        for (ffcf ffcfVar : ffcfVarArr2) {
            arrayList.add(new ibw(((ibw) ffcfVar.b).i));
        }
        ArrayList arrayList2 = new ArrayList(ffcfVarArr2.length);
        for (ffcf ffcfVar2 : ffcfVarArr2) {
            arrayList2.add(Float.valueOf(((Number) ffcfVar2.a).floatValue()));
        }
        return new icl(arrayList, arrayList2, (floatToRawIntBits << 32) | (4294967295L & floatToRawIntBits2), (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L));
    }
}
