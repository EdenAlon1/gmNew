package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dyp extends ffkk implements ffji {
    final /* synthetic */ iqk[] a;
    final /* synthetic */ dyq b;
    final /* synthetic */ int c;
    final /* synthetic */ ipq d;
    final /* synthetic */ int[] e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyp(iqk[] iqkVarArr, dyq dyqVar, int i, ipq ipqVar, int[] iArr) {
        super(1);
        this.a = iqkVarArr;
        this.b = dyqVar;
        this.c = i;
        this.d = ipqVar;
        this.e = iArr;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int a;
        iqj iqjVar = (iqj) obj;
        int i = 0;
        int i2 = 0;
        while (true) {
            iqk[] iqkVarArr = this.a;
            if (i >= iqkVarArr.length) {
                return ffcu.a;
            }
            ipq ipqVar = this.d;
            iqk iqkVar = iqkVarArr[i];
            int i3 = i2 + 1;
            iqkVar.getClass();
            ebl c = ebi.c(iqkVar);
            kah q = ipqVar.q();
            dza dzaVar = c != null ? c.c : null;
            int i4 = this.c;
            if (dzaVar != null) {
                a = dzaVar.a(i4 - iqkVar.a, q);
            } else {
                a = this.b.a.a(0, i4 - iqkVar.a, q);
            }
            iqjVar.e(iqkVar, a, this.e[i2], 0.0f);
            i++;
            i2 = i3;
        }
    }
}
