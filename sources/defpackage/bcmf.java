package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcmf implements bcjn {
    public static final bcmf a = new bcmf();

    private bcmf() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bbtp.c.a;
    }

    @Override // defpackage.bcjn
    public final /* synthetic */ dtyx b() {
        String[] strArr = bbtp.a;
        return new bbtm(bbtp.a);
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bbtm bbtmVar = (bbtm) dtyxVar;
        bbsw[] bbswVarArr = (bbsw[]) list.toArray(new bbsw[0]);
        bbsw[] bbswVarArr2 = (bbsw[]) Arrays.copyOf(bbswVarArr, bbswVarArr.length);
        int a2 = bbtp.b().a();
        Integer.valueOf(a2).getClass();
        for (bbsw bbswVar : bbswVarArr2) {
            if (((Integer) bbtp.b.getOrDefault(bbswVar.toString(), -1)).intValue() > a2) {
                dtub.w("columnReference.toString()", a2);
            }
        }
        bbtmVar.m(bbswVarArr2);
        return bbtmVar;
    }
}
