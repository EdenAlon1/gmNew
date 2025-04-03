package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcmh implements bcjn {
    public static final bcmh a = new bcmh();

    private bcmh() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bbwh.c.a;
    }

    @Override // defpackage.bcjn
    public final /* synthetic */ dtyx b() {
        String[] strArr = bbwh.a;
        return new bbwe(bbwh.a);
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bbwe bbweVar = (bbwe) dtyxVar;
        bbvs[] bbvsVarArr = (bbvs[]) list.toArray(new bbvs[0]);
        bbvs[] bbvsVarArr2 = (bbvs[]) Arrays.copyOf(bbvsVarArr, bbvsVarArr.length);
        int a2 = bbwh.b().a();
        Integer.valueOf(a2).getClass();
        for (bbvs bbvsVar : bbvsVarArr2) {
            if (((Integer) bbwh.b.getOrDefault(bbvsVar.toString(), -1)).intValue() > a2) {
                dtub.w("columnReference.toString()", a2);
            }
        }
        bbweVar.m(bbvsVarArr2);
        return bbweVar;
    }
}
