package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nyd extends ffkk implements ffji {
    final /* synthetic */ nzh a;
    final /* synthetic */ nyj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyd(nzh nzhVar, nyj nyjVar) {
        super(1);
        this.a = nzhVar;
        this.b = nyjVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        nzs nzsVar = (nzs) obj;
        nzsVar.getClass();
        nyb nybVar = nyb.a;
        nwp nwpVar = new nwp();
        nybVar.invoke(nwpVar);
        int i = nwpVar.a;
        nzq nzqVar = nzsVar.a;
        nzqVar.c = i;
        nzqVar.d = nwpVar.b;
        nzqVar.e = -1;
        nzqVar.f = -1;
        nzh nzhVar = this.a;
        if (nzhVar instanceof nzl) {
            ffnl b = nzb.b(nzhVar);
            nyj nyjVar = this.b;
            Iterator a = b.a();
            while (true) {
                if (!a.hasNext()) {
                    nyj nyjVar2 = this.b;
                    int i2 = nzl.n;
                    int i3 = nzj.b(nyjVar2.f()).j;
                    nyc nycVar = nyc.a;
                    nzsVar.d = i3;
                    oan oanVar = new oan();
                    nycVar.invoke(oanVar);
                    nzsVar.e = oanVar.a;
                    break;
                }
                nzh nzhVar2 = (nzh) a.next();
                nzh e = nyjVar.e();
                if (ffkj.e(nzhVar2, e != null ? e.d : null)) {
                    break;
                }
            }
        }
        return ffcu.a;
    }
}
