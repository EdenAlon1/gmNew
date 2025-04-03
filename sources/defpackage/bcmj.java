package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcmj implements bcjn {
    public static final bcmj a = new bcmj();

    private bcmj() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bcds.c.a;
    }

    @Override // defpackage.bcjn
    public final /* synthetic */ dtyx b() {
        return bcds.a();
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bcdp bcdpVar = (bcdp) dtyxVar;
        bccq[] bccqVarArr = (bccq[]) list.toArray(new bccq[0]);
        bccq[] bccqVarArr2 = (bccq[]) Arrays.copyOf(bccqVarArr, bccqVarArr.length);
        int intValue = bcds.c().intValue();
        for (bccq bccqVar : bccqVarArr2) {
            if (((Integer) bcds.b.getOrDefault(bccqVar.toString(), -1)).intValue() > intValue) {
                dtub.w("columnReference.toString()", intValue);
            }
        }
        bcdpVar.m(bccqVarArr2);
        return bcdpVar;
    }
}
