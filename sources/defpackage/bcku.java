package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcku implements bcjn {
    public static final bcku a = new bcku();

    private bcku() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bbov.c.a;
    }

    @Override // defpackage.bcjn
    public final /* synthetic */ dtyx b() {
        return bbov.a();
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bbos bbosVar = (bbos) dtyxVar;
        bbno[] bbnoVarArr = (bbno[]) list.toArray(new bbno[0]);
        bbosVar.c((bbno[]) Arrays.copyOf(bbnoVarArr, bbnoVarArr.length));
        return bbosVar;
    }
}
