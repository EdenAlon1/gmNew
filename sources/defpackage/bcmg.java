package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcmg implements bcjn {
    public static final bcmg a = new bcmg();

    private bcmg() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bbvc.c.a;
    }

    @Override // defpackage.bcjn
    public final /* synthetic */ dtyx b() {
        String[] strArr = bbvc.a;
        return new bbuz(bbvc.a);
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bbuz bbuzVar = (bbuz) dtyxVar;
        bbul[] bbulVarArr = (bbul[]) list.toArray(new bbul[0]);
        bbul[] bbulVarArr2 = (bbul[]) Arrays.copyOf(bbulVarArr, bbulVarArr.length);
        int a2 = bbvc.b().a();
        Integer.valueOf(a2).getClass();
        for (bbul bbulVar : bbulVarArr2) {
            if (((Integer) bbvc.b.getOrDefault(bbulVar.toString(), -1)).intValue() > a2) {
                dtub.w("columnReference.toString()", a2);
            }
        }
        bbuzVar.m(bbulVarArr2);
        return bbuzVar;
    }
}
