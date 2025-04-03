package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcmi implements bcjn {
    public static final bcmi a = new bcmi();

    private bcmi() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bcba.c.a;
    }

    @Override // defpackage.bcjn
    public final /* synthetic */ dtyx b() {
        return bcba.a();
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bcax bcaxVar = (bcax) dtyxVar;
        bbzh[] bbzhVarArr = (bbzh[]) list.toArray(new bbzh[0]);
        bcaxVar.c((bbzh[]) Arrays.copyOf(bbzhVarArr, bbzhVarArr.length));
        return bcaxVar;
    }
}
