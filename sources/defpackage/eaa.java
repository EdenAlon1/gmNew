package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eaa extends ffkk implements ffji {
    final /* synthetic */ int[] a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ iqk[] e;
    final /* synthetic */ eab f;
    final /* synthetic */ int g;
    final /* synthetic */ kah h;
    final /* synthetic */ int[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaa(int[] iArr, int i, int i2, int i3, iqk[] iqkVarArr, eab eabVar, int i4, kah kahVar, int[] iArr2) {
        super(1);
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iqkVarArr;
        this.f = eabVar;
        this.g = i4;
        this.h = kahVar;
        this.i = iArr2;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        dza dzaVar;
        int[] iArr = this.a;
        iqj iqjVar = (iqj) obj;
        int i = iArr != null ? iArr[this.b] : 0;
        for (int i2 = this.c; i2 < this.d; i2++) {
            iqk iqkVar = this.e[i2];
            iqkVar.getClass();
            eab eabVar = this.f;
            int i3 = this.g;
            kah kahVar = this.h;
            ebl c = ebi.c(iqkVar);
            if (c == null || (dzaVar = c.c) == null) {
                dzaVar = ((eae) eabVar).b;
            }
            iqjVar.e(iqkVar, this.i[i2 - this.c], dzaVar.a(i3 - iqkVar.v(), kahVar) + i, 0.0f);
        }
        return ffcu.a;
    }
}
