package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcpj implements bcjn {
    public static final bcpj a = new bcpj();

    private bcpj() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bcjh.c.a;
    }

    @Override // defpackage.bcjn
    public final /* synthetic */ dtyx b() {
        return bcjh.a();
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bcje bcjeVar = (bcje) dtyxVar;
        bcic[] bcicVarArr = (bcic[]) list.toArray(new bcic[0]);
        bcjeVar.c((bcic[]) Arrays.copyOf(bcicVarArr, bcicVarArr.length));
        return bcjeVar;
    }
}
