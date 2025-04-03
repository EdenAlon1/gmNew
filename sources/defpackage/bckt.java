package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bckt implements bcjn {
    public static final bckt a = new bckt();

    private bckt() {
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bbke.c.a;
    }

    @Override // defpackage.bcjn
    public final /* synthetic */ dtyx b() {
        return bbke.a();
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bbkb bbkbVar = (bbkb) dtyxVar;
        bbjl[] bbjlVarArr = (bbjl[]) list.toArray(new bbjl[0]);
        bbkbVar.c((bbjl[]) Arrays.copyOf(bbjlVarArr, bbjlVarArr.length));
        return bbkbVar;
    }
}
