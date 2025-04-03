package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcme implements bcjn {
    public static final bcme a = new bcme();

    private bcme() {
    }

    public static final bbru d() {
        String[] strArr = bbrx.a;
        bbru bbruVar = new bbru(bbrx.a);
        bbri bbriVar = bbrx.c;
        bbruVar.c(bbriVar.a, bbriVar.b);
        return bbruVar;
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtry a() {
        return bbrx.c.a;
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx b() {
        return d();
    }

    @Override // defpackage.bcjn
    public final /* bridge */ /* synthetic */ dtyx c(dtyx dtyxVar, List list) {
        bbru bbruVar = (bbru) dtyxVar;
        bbrj[] bbrjVarArr = (bbrj[]) list.toArray(new bbrj[0]);
        bbruVar.c((bbrj[]) Arrays.copyOf(bbrjVarArr, bbrjVarArr.length));
        return bbruVar;
    }
}
