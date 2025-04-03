package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqp implements ffjm {
    final /* synthetic */ zql a;
    final /* synthetic */ dojh b;

    public zqp(zql zqlVar, dojh dojhVar) {
        this.a = zqlVar;
        this.b = dojhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        dojh dojhVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a.d == 1 || (dojhVar = this.b) == null || dojhVar.a.size() <= 5) {
            hfdVar.v(1016011547);
            dojr.a(this.b, null, null, hfdVar, 0, 6);
            hfdVar.o();
        } else {
            hfdVar.v(1016085451);
            dojh dojhVar2 = this.b;
            dojhVar2.getClass();
            dojr.a(new dojh(ffdx.ai(dojhVar2.a, dojhVar2.a.size() / 2)), null, null, hfdVar, 0, 6);
            dojh dojhVar3 = this.b;
            dojhVar3.getClass();
            int size = dojhVar3.a.size() / 2;
            List list = dojhVar3.a;
            dojr.a(new dojh(list.subList(size, list.size())), null, null, hfdVar, 0, 6);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
