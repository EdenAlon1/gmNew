package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lph {
    public static final lph a = new lph(new lpg[0]);
    private static final lpg e;
    private final lpg[] f;
    public final long c = 0;
    public final int b = 0;
    public final int d = 0;

    static {
        lpg lpgVar = new lpg(-1, new int[0], new lqw[0], new long[0], new String[0]);
        int[] iArr = lpgVar.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = lpgVar.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        e = new lpg(0, copyOf, (lqw[]) Arrays.copyOf(lpgVar.d, 0), copyOf2, (String[]) Arrays.copyOf(lpgVar.g, 0));
        lvf.N(1);
        lvf.N(2);
        lvf.N(3);
        lvf.N(4);
    }

    private lph(lpg[] lpgVarArr) {
        this.f = lpgVarArr;
    }

    public final lpg a(int i) {
        return i < 0 ? e : this.f[i];
    }

    public final void b() {
        a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lph lphVar = (lph) obj;
            int i = lvf.a;
            if (Objects.equals(null, null) && Arrays.equals(this.f, lphVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[])";
    }
}
