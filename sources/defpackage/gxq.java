package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxq extends ffkk implements ffji {
    final /* synthetic */ gxe a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxq(gxe gxeVar, int i, int i2) {
        super(1);
        this.a = gxeVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        gxi gxiVar = (gxi) obj;
        List am = ffdx.am(this.a);
        int i = this.b;
        gxd gxdVar = (gxd) am.get(i);
        am.remove(i);
        am.add(this.c, gxdVar);
        int size = am.size();
        for (int i2 = 0; i2 < size; i2++) {
            gxd gxdVar2 = (gxd) am.get(i2);
            gxiVar.b(gxdVar2.a, gxdVar2.e);
        }
        return ffcu.a;
    }
}
