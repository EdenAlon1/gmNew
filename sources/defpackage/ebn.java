package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ebn extends ffkk implements ffji {
    final /* synthetic */ iqk[] a;
    final /* synthetic */ ebo b;
    final /* synthetic */ int c;
    final /* synthetic */ int[] d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebn(iqk[] iqkVarArr, ebo eboVar, int i, int[] iArr) {
        super(1);
        this.a = iqkVarArr;
        this.b = eboVar;
        this.c = i;
        this.d = iArr;
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
            iqk iqkVar = iqkVarArr[i];
            int i3 = i2 + 1;
            iqkVar.getClass();
            ebl c = ebi.c(iqkVar);
            dza dzaVar = c != null ? c.c : null;
            int i4 = this.c;
            if (dzaVar != null) {
                a = dzaVar.a(i4 - iqkVar.b, kah.a);
            } else {
                a = this.b.a.a(0, i4 - iqkVar.b);
            }
            iqjVar.e(iqkVar, this.d[i2], a, 0.0f);
            i++;
            i2 = i3;
        }
    }
}
