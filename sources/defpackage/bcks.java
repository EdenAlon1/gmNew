package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcks implements bcjn {
    public static final bcks a = new bcks();

    private bcks() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bbln.c.a;
    }

    @Override // defpackage.bcjn
    public final /* synthetic */ dtyx b() {
        String[] strArr = bbln.a;
        return new bblk(bbln.a);
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bblk bblkVar = (bblk) dtyxVar;
        bbkx[] bbkxVarArr = (bbkx[]) list.toArray(new bbkx[0]);
        bbkx[] bbkxVarArr2 = (bbkx[]) Arrays.copyOf(bbkxVarArr, bbkxVarArr.length);
        int a2 = bbln.b().a();
        Integer.valueOf(a2).getClass();
        for (bbkx bbkxVar : bbkxVarArr2) {
            if (((Integer) bbln.b.getOrDefault(bbkxVar.toString(), -1)).intValue() > a2) {
                dtub.w("columnReference.toString()", a2);
            }
        }
        bblkVar.m(bbkxVarArr2);
        return bblkVar;
    }
}
