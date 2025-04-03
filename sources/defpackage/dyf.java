package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyf extends ffkk implements ffji {
    final /* synthetic */ iqk[] a;
    final /* synthetic */ List b;
    final /* synthetic */ ipq c;
    final /* synthetic */ ffkz d;
    final /* synthetic */ ffkz e;
    final /* synthetic */ dyg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyf(iqk[] iqkVarArr, List list, ipq ipqVar, ffkz ffkzVar, ffkz ffkzVar2, dyg dygVar) {
        super(1);
        this.a = iqkVarArr;
        this.b = list;
        this.c = ipqVar;
        this.d = ffkzVar;
        this.e = ffkzVar2;
        this.f = dygVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            iqk[] iqkVarArr = this.a;
            if (i >= iqkVarArr.length) {
                return ffcu.a;
            }
            dyg dygVar = this.f;
            ffkz ffkzVar = this.e;
            ffkz ffkzVar2 = this.d;
            ipq ipqVar = this.c;
            List list = this.b;
            iqk iqkVar = iqkVarArr[i];
            iqkVar.getClass();
            dyc.c(iqjVar, iqkVar, (ipl) list.get(i2), ipqVar.q(), ffkzVar2.a, ffkzVar.a, dygVar.a);
            i++;
            i2++;
        }
    }
}
