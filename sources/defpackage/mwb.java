package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwb extends mwd {
    protected mwb(lrv lrvVar, int[] iArr, List list) {
        super(lrvVar, iArr);
        engw.n(list);
    }

    public static void h(List list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            engr engrVar = (engr) list.get(i);
            if (engrVar != null) {
                engrVar.h(new mwa(j, jArr[i]));
            }
        }
    }
}
